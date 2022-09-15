package com.tmhbatw.tmhbatw.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-09-15 13:56:03
 */
public class User implements Serializable {
    private static final long serialVersionUID = 947821567975781472L;
    
    private String name;
    
    private String passwd;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}

