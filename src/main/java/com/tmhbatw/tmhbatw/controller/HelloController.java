package com.tmhbatw.tmhbatw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    protected final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String Hello(){
        logger.info("hello world!");
        return "hello world!";
    }

}
