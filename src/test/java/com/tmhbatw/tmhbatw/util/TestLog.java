package com.tmhbatw.tmhbatw.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@SpringBootTest
public class TestLog {

    protected static final Logger logger = LoggerFactory.getLogger(TestLog.class);

    @Test
    public void testLog(){
        logger.info("test world");
    }

}
