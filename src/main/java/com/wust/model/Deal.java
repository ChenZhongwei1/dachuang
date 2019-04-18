package com.wust.model;

import java.util.Date;

public class Deal extends DealKey {
    private Integer dealAmount;

    private String method;

    private Integer afterWallet;

    private Date dealtime;

    public Deal(Integer userid, Integer dealid, Integer dealAmount, String method, Integer afterWallet, Date dealtime) {
        super(userid, dealid);
        this.dealAmount = dealAmount;
        this.method = method;
        this.afterWallet = afterWallet;
        this.dealtime = dealtime;
    }

    public Deal() {
        super();
    }

    public Integer getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Integer dealAmount) {
        this.dealAmount = dealAmount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public Integer getAfterWallet() {
        return afterWallet;
    }

    public void setAfterWallet(Integer afterWallet) {
        this.afterWallet = afterWallet;
    }

    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }
}