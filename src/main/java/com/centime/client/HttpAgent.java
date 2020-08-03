package com.centime.client;

import com.centime.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpAgent {
    @Autowired
    private RestTemplate restTemplate;

    public String get(String url) {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        String res = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
        return res;
    }

    public String post(String url, User body) {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<User> entityConcat = new HttpEntity<>(body, headers);
        String res = restTemplate.exchange(url, HttpMethod.POST, entityConcat, String.class).getBody();
        return res;
    }
}
