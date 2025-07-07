package com.cognizant.spring_web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Hello.class);

    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("Start Log - sayHello()");
        String message = "Hello World!!";
        LOGGER.info("End Log - sayHello()");
        return message;
    }
}
