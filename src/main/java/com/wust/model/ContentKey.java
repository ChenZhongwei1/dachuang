package com.wust.model;

public class ContentKey {
    private Integer contentid;

    private Integer paraId;

    public ContentKey(Integer contentid, Integer paraId) {
        this.contentid = contentid;
        this.paraId = paraId;
    }

    public ContentKey() {
        super();
    }

    public Integer getContentid() {
        return contentid;
    }

    public void setContentid(Integer contentid) {
        this.contentid = contentid;
    }

    public Integer getParaId() {
        return paraId;
    }

    public void setParaId(Integer paraId) {
        this.paraId = paraId;
    }
}