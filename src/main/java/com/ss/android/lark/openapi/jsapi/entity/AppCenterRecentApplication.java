package com.ss.android.lark.openapi.jsapi.entity;

public class AppCenterRecentApplication implements BaseJSModel {
    String appId;
    int appType;

    public String getAppId() {
        return this.appId;
    }

    public int getAppType() {
        return this.appType;
    }

    public String toString() {
        return "appId:" + this.appId + " appType:" + this.appType;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppType(int i) {
        this.appType = i;
    }
}
