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

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestUserInfo {
    @Autowired(required = false)
    UserInfoMapper userInfoMapper;

    protected static final Logger logger = LoggerFactory.
            getLogger(TestUserInfo.class);

    @Test
    public void testInsertUserInfo() {
        UserInfo userInfo =new UserInfo();
        userInfo.setName("tmhbatw");
        userInfo.setPasswd("liuruihong199856");
        int result=userInfoMapper.insert(userInfo);
        Assert.assertEquals(result,1);
    }

    @Test
    public void testUpdateUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setName("tmhbatw");
        userInfo.setPasswd(Encryption.getSHA256Str("liuruihong199856"));
        int result = userInfoMapper.updateByPrimaryKey(userInfo);
        Assert.assertEquals(result,1);
    }

    @Test
    public void testSelectByPrimaryKey() {
        int primaryKey = 1;
        UserInfo user = userInfoMapper.selectByPrimaryKey(primaryKey);
        Assert.assertEquals(user.getName(),"tmhbatw");
        Assert.assertNull(user.getEmail());
    }
    @Test
    public void testSelectByName() {
        UserInfoExample select = new UserInfoExample();
        UserInfoExample.Criteria criteria = select.createCriteria();
        String testName = "tmhbatw";
        criteria.andNameEqualTo(testName);
        List<UserInfo> result=userInfoMapper.selectByExample(select);
        Assert.assertEquals(result.size(),1);
    }
    @Test
    public void testSelectUserInfoByName() {
        String testName = "tmhbatw";
        UserInfo result=userInfoMapper.selectUserInfoByName(testName);

        logger.error(result.getPasswd());
        Assert.assertEquals(result.getPasswd().length(),64);
    }
}
