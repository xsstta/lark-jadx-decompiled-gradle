package com.ss.android.lark.openapi.jsapi.entity;

public class SDKConfigData implements BaseJSModel {
    private String appId;
    private String title;

    public SDKConfigData() {
    }

    public String getAppId() {
        return this.appId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public SDKConfigData(String str, String str2) {
        this.title = str;
        this.appId = str2;
    }
}
