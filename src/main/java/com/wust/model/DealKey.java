package com.wust.model;

public class DealKey {
    private Integer userid;

    private Integer dealid;

    public DealKey(Integer userid, Integer dealid) {
        this.userid = userid;
        this.dealid = dealid;
    }

    public DealKey() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDealid() {
        return dealid;
    }

    public void setDealid(Integer dealid) {
        this.dealid = dealid;
    }
}