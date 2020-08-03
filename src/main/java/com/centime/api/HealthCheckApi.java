package com.centime.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@Slf4j
public class HealthCheckApi {
    private static final String UP = "UP";

    @GetMapping("/up")
    public String healthCheck() {
        return UP;
    }
}
