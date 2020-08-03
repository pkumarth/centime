package com.centime.api;

import com.centime.annot.LogMethodParam;
import com.centime.models.User;
import com.centime.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1")
@Api(value = "onlinestore", description = "Operations pertaining to Users in Centime")
@Slf4j
public class UserApi {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "Create User Api", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successfully User Created"),
            @ApiResponse(code = 400, message = "Name is mandatory"),
            @ApiResponse(code = 400, message = "SurName is mandatory")
    }
    )
    @PostMapping(value = "/user")
    @LogMethodParam
    public ResponseEntity<String> create(@RequestBody User user) {
        String reqId = UUID.randomUUID().toString();
        log.info("creating  user:{}", user.getName());
        String resp = userService.create(user);
        return new ResponseEntity<String>(resp, HttpStatus.CREATED);
    }
}
