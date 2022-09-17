package com.tmhbatw.tmhbatw.service;

import com.tmhbatw.tmhbatw.bean.UserInfo;
import com.tmhbatw.tmhbatw.dao.UserInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {
    protected static final Logger logger = LoggerFactory.
            getLogger(UserInfoService.class);
    @Autowired(required = false)
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> getUserInfoList(){
        return null;
    }

    public boolean insertUserInfo(String name,String passwd) {
       // UserInfo userInfo =new UserInfo(name,passwd);
        int result =  userInfoMapper.insert(null);

        if (result == 0){
            logger.error("insert userInfo err!, name is "+name);
        }
        return result == 1;
    }
}
