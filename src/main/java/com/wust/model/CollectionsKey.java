package com.wust.model;

public class CollectionsKey {
    private Integer userid;

    private Integer collectionid;

    public CollectionsKey(Integer userid, Integer collectionid) {
        this.userid = userid;
        this.collectionid = collectionid;
    }

    public CollectionsKey() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCollectionid() {
        return collectionid;
    }

    public void setCollectionid(Integer collectionid) {
        this.collectionid = collectionid;
    }
}