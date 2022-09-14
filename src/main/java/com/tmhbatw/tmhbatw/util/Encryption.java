package com.tmhbatw.tmhbatw.util;

import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {

    private static volatile MessageDigest messageDigest;

    public static String getSHA256Str(String str) {
        String encdeStr = "";
        try {
            if(messageDigest == null){
                synchronized (MessageDigest.class) {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                }
            }
            byte[] hash = messageDigest.digest(str.getBytes("UTF-8"));
            encdeStr = Hex.encodeHexString(hash);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encdeStr;
    }
}
