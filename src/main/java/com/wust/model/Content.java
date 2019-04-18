package com.wust.model;

public class Content extends ContentKey {
    private String paraCon;

    public Content(Integer contentid, Integer paraId, String paraCon) {
        super(contentid, paraId);
        this.paraCon = paraCon;
    }

    public Content() {
        super();
    }

    public String getParaCon() {
        return paraCon;
    }

    public void setParaCon(String paraCon) {
        this.paraCon = paraCon == null ? null : paraCon.trim();
    }
}