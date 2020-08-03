package com.centime.service.impl;

import com.centime.client.HttpAgent;
import com.centime.config.PropertiesConfig;
import com.centime.models.User;
import com.centime.service.UserService;
import com.centime.valid.UserValidation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private HttpAgent httpAgent;

    @Autowired
    private PropertiesConfig propConfig;


    @Override
    public String create(User user) {
        log.info("validating  user:{}", user.getName());
        UserValidation.validate(user);
        log.info("invoking hello api for  user:{}", user.getName());
        String hello = httpAgent.get(propConfig.service2Url);
        log.info("invoking concat api for  user:{}", user.getName());
        String concat = httpAgent.post(propConfig.service3Url, user);
        return hello + " " + concat;
    }
}

