package com.ss.android.lark.openapi.jsapi.entity;

import java.util.List;

public class ConfigData implements BaseJSModel {
    private String appId;
    private List<String> jsApiList;
    private String nonceStr;
    private String signature;
    private String timestamp;

    public ConfigData() {
    }

    public String getAppId() {
        return this.appId;
    }

    public List<String> getJsApiList() {
        return this.jsApiList;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setJsApiList(List<String> list) {
        this.jsApiList = list;
    }

    public void setNonceStr(String str) {
        this.nonceStr = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public ConfigData(String str, String str2, String str3, String str4, List<String> list) {
        this.appId = str;
        this.timestamp = str2;
        this.nonceStr = str3;
        this.signature = str4;
        this.jsApiList = list;
    }
}
