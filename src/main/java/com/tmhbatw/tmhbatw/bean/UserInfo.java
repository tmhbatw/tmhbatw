package com.tmhbatw.tmhbatw.bean;

public class UserInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userInfo.id
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userInfo.name
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userInfo.passwd
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    private String passwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userInfo.phone
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    private Integer phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userInfo.email
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    private String email;

    public UserInfo(String name, String passwd) {
        this.setName(name);
        this.setPasswd(passwd);
    }

    public UserInfo() {
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userInfo.id
     *
     * @return the value of userInfo.id
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userInfo.id
     *
     * @param id the value for userInfo.id
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userInfo.name
     *
     * @return the value of userInfo.name
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userInfo.name
     *
     * @param name the value for userInfo.name
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userInfo.passwd
     *
     * @return the value of userInfo.passwd
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userInfo.passwd
     *
     * @param passwd the value for userInfo.passwd
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userInfo.phone
     *
     * @return the value of userInfo.phone
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userInfo.phone
     *
     * @param phone the value for userInfo.phone
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userInfo.email
     *
     * @return the value of userInfo.email
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userInfo.email
     *
     * @param email the value for userInfo.email
     *
     * @mbg.generated Sat Sep 17 02:50:06 CST 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}