package com.tmhbatw.tmhbatw.dal;

import com.tmhbatw.tmhbatw.bean.UserInfo;
import com.tmhbatw.tmhbatw.bean.UserInfoExample;
import com.tmhbatw.tmhbatw.dao.UserInfoMapper;
import com.tmhbatw.tmhbatw.util.Encryption;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.dom.java.Interface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestUserInfo {
    @Autowired(required = false)
    UserInfoMapper userInfoMapper;

    protected static final Logger logger = LoggerFactory.
            getLogger(TestUserInfo.class);

    @Test
    public void TestUpdate() {
        UserInfo user=new UserInfo();
        user.setName("tmhbatw");
        user.setPasswd(Encryption.getSHA256Str("liuruihongshuai"));

        logger.error(userInfoMapper.selectByPrimaryKey(1).toString());
    }
}
