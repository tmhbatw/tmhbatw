package com.tmhbatw.tmhbatw.service;

import com.tmhbatw.tmhbatw.bean.UserInfo;
import com.tmhbatw.tmhbatw.bean.UserInfoExample;
import com.tmhbatw.tmhbatw.dao.UserInfoMapper;
import com.tmhbatw.tmhbatw.util.Encryption;
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

    public boolean insertUserInfo(String name,String passwd) {
        UserInfoExample select =new UserInfoExample();
        UserInfoExample.Criteria search =select.createCriteria();
        search.andNameEqualTo(name);
        List<UserInfo> result = userInfoMapper.selectByExample(select);

        if (result.size() == 1){
            logger.warn("insert userInfo err!, repeat name is "+name);
            return false;
        }

        UserInfo save=new UserInfo();
        save.setName(name);
        save.setPasswd(Encryption.getSHA256Str(passwd));
        return userInfoMapper.insertSelective(save)==1;
    }

    public boolean login(String name, String passwd){
        UserInfo user = userInfoMapper.selectUserInfoByName(name);
        if (user==null||!user.getPasswd().equals(Encryption.getSHA256Str(passwd))){
            return false;
        }

        //set cookie

        return true;
    }
}
