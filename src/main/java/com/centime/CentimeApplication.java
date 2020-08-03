package com.centime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CentimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentimeApplication.class, args);
	}

    public static interface UserService {
    }
}
