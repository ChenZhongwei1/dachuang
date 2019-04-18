package com.wust.model;

public class Collections extends CollectionsKey {
    private Integer moduleid;

    private Integer contentid;

    public Collections(Integer userid, Integer collectionid, Integer moduleid, Integer contentid) {
        super(userid, collectionid);
        this.moduleid = moduleid;
        this.contentid = contentid;
    }

    public Collections() {
        super();
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public Integer getContentid() {
        return contentid;
    }

    public void setContentid(Integer contentid) {
        this.contentid = contentid;
    }
}