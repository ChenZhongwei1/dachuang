package com.wust.model;

public class User {
    private Integer userid;

    private String username;

    private String sex;

    private String userimage;

    private String phonenum;

    private String eMail;

    private String address;

    private Integer wallet;

    private Integer myCollection;

    private String password;

    public User(Integer userid, String username, String sex, String userimage, String phonenum, String eMail, String address, Integer wallet, Integer myCollection, String password) {
        this.userid = userid;
        this.username = username;
        this.sex = sex;
        this.userimage = userimage;
        this.phonenum = phonenum;
        this.eMail = eMail;
        this.address = address;
        this.wallet = wallet;
        this.myCollection = myCollection;
        this.password = password;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage == null ? null : userimage.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getWallet() {
        return wallet;
    }

    public void setWallet(Integer wallet) {
        this.wallet = wallet;
    }

    public Integer getMyCollection() {
        return myCollection;
    }

    public void setMyCollection(Integer myCollection) {
        this.myCollection = myCollection;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}