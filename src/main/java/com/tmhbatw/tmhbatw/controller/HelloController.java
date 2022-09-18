package com.tmhbatw.tmhbatw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    protected final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public ResponseEntity<String> Hello(){
        logger.info("hello world!");

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin","*");
        return new ResponseEntity<String>("hello world!",responseHeaders, HttpStatus.OK);
    }

}
