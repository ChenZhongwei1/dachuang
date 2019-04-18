package com.wust.model;

public class HomePage {
    private Integer contentid;

    private String title;

    private String summary;

    private String picture;

    private Integer paraNum;

    public HomePage(Integer contentid, String title, String summary, String picture, Integer paraNum) {
        this.contentid = contentid;
        this.title = title;
        this.summary = summary;
        this.picture = picture;
        this.paraNum = paraNum;
    }

    public HomePage() {
        super();
    }

    public Integer getContentid() {
        return contentid;
    }

    public void setContentid(Integer contentid) {
        this.contentid = contentid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getParaNum() {
        return paraNum;
    }

    public void setParaNum(Integer paraNum) {
        this.paraNum = paraNum;
    }
}