package com.centime.api;

import com.centime.models.User;
import com.centime.service.ConcatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@Slf4j
public class ConcatApi {
    @Autowired
    private ConcatService concatService;

    @PostMapping("/concat")
    public ResponseEntity<String> findHello(@RequestBody User user) {
        String resp = concatService.append(user);
        return new ResponseEntity<String>(resp, HttpStatus.CREATED);
    }
}
