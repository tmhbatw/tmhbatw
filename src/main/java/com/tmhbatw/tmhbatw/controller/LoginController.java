package com.tmhbatw.tmhbatw.controller;


import com.tmhbatw.tmhbatw.service.UserInfoService;
import com.tmhbatw.tmhbatw.util.Check;
import com.tmhbatw.tmhbatw.util.Encryption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class LoginController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserInfoService userInfoService;

    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    @GetMapping("/login")
    public Map<String,Boolean> login(@RequestParam Map<String,String> map) {
        String name =  map.getOrDefault("name","");
        String password = map.getOrDefault("password", "");

        logger.info(map.toString());

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
                logger.info(key + ":" + value);
            }
        }
        logger.info(String.valueOf(list.size()));
        return result;
    }

    @PostMapping("register")
    public Boolean register(@RequestBody Map<String, Object> map){
        logger.info(map.toString());
        String name = (String) map.getOrDefault("name","");
        String passwd = (String) map.getOrDefault("passwd","");

        if (!Check.CheckUsername(name)||!Check.CheckPassword(passwd))
            return false;

        String savePasswd = Encryption.getSHA256Str(passwd);

        //数据库保存
        return userInfoService.insertUserInfo(name,savePasswd);
    }
}
