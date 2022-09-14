package com.tmhbatw.tmhbatw.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @GetMapping("/login")
    public Map<String,Boolean> login(@RequestParam Map<String,String> map) {
        String name =  map.getOrDefault("name","");
        String password = map.getOrDefault("password", "");

        System.out.println(map);

        Map<String,Boolean> result=new HashMap<>();
        if(name.equals("tmhbatw")&&password.equals("shuai")){
            result.put("result",true);
        }else{
            result.put("result",false);
        }
        return result;
    }
}
