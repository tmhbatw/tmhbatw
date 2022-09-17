package com.tmhbatw.tmhbatw.util;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class TestEncryption {

    @Test
    public void testGetSHA256Str(){
        String test ="liuruihong199856";
        String reverse1=Encryption.getSHA256Str(test);
        String reverse2=Encryption.getSHA256Str(test);
        System.out.println(reverse1);

        assertEquals(reverse1, reverse2);
        assertEquals(reverse1.length(),64);
    }

}
