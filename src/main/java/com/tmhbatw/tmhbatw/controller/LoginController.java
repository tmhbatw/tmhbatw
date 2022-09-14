package com.tmhbatw.tmhbatw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.BufferPoolMXBean;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @GetMapping("login")
    public Map<String,Boolean> Login(@RequestParam("name") String name,
                                     @RequestParam("password") String password){
        Map<String, Boolean> result=new HashMap<>();
        if (name.equals("tmhbatw")&&password.equals("liuruihong199856")){
            result.put("result",true);
        }else{
            result.put("result",false);
        }
        return result;
    }
}
