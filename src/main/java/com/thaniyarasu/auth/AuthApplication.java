package com.thaniyarasu.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class AuthApplication {
    
    @Value("${USER:World}")
    String name;

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

}
