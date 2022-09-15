package com.tmhbatw.tmhbatw.controller;


import com.tmhbatw.tmhbatw.util.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class LoginController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

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

        String sql = "select * from user";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map1 : list) {
            Set<Map.Entry<String, Object>> entries = map1.entrySet( );
            for (Map.Entry<String, Object> entry : entries) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                System.out.println(key + ":" + value);
            }
        }
        System.out.println(list.size());
        return result;
    }

    @PostMapping("register")
    public Boolean register(@RequestBody Map<String, Object> map){
        System.out.println(map);
        String name = (String) map.getOrDefault("name","");
        String passwd = (String) map.getOrDefault("passwd","");

        if (!Check.CheckUsername(name)||!Check.CheckPassword(passwd))
            return false;

        //数据库保存
        return true;
    }
}
