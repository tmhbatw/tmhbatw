package com.tmhbatw.tmhbatw.controller;


import com.tmhbatw.tmhbatw.service.UserInfoService;
import com.tmhbatw.tmhbatw.util.Check;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private UserInfoService userInfoService;

    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    @GetMapping("/login")
    public ResponseEntity<Map<String,Boolean>> login(@RequestParam Map<String,String> map) {
        String name =  map.getOrDefault("name","");
        String password = map.getOrDefault("password", "");

        logger.info(map.toString());

        Map<String,Boolean> result=new HashMap<>();
        result.put("result", userInfoService.login(name,password));
        return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("register")
    public Map<String,Boolean> register(@RequestBody Map<String, Object> map){
        logger.info(map.toString());
        String name = (String) map.getOrDefault("name","");
        String passwd = (String) map.getOrDefault("passwd","");

        Map<String,Boolean> result=new HashMap<>();
        if (!Check.CheckUsername(name)||!Check.CheckPassword(passwd))
            result.put("result", false);

        //数据库保存
        else
            result.put("result",userInfoService.insertUserInfo(name,passwd));

        return result;
    }
}
