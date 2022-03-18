package com.bytedance.ee.bear.drive.biz.permission.model;

import java.io.Serializable;

public class PushPayLoad<DATA> implements Serializable {
    private String business;
    private DATA data;

    public String getBusiness() {
        return this.business;
    }

    public DATA getData() {
        return this.data;
    }

    public void setBusiness(String str) {
        this.business = str;
    }

    public void setData(DATA data2) {
        this.data = data2;
    }
}
