package com.centime.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@Slf4j
public class HelloApi {
    @GetMapping("/hello")
    public ResponseEntity<String> findHello() {
        return ResponseEntity.ok().body("Hello");
    }

}
