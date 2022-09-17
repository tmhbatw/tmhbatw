package com.tmhbatw.tmhbatw.util;

public class Check {
    public static boolean CheckPassword(String password){
        if(password.length()>16||password.length()<6)
            return false;
        boolean countFlag=false;
        boolean letterFlag = false;

        for(char c:password.toCharArray()){
            if(c<='9'&&c>='0')
                countFlag=true;
            if(c<='Z'&&c>='A'||c<='z'&&c>='a')
                letterFlag=true;
        }

        return countFlag&&letterFlag;
    }

    public static boolean CheckUsername(String name){
        return name.length() <= 16 && name.length() >= 6;
    }
}
