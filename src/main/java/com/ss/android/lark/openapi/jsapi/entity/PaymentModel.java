package com.ss.android.lark.openapi.jsapi.entity;

public class PaymentModel implements BaseJSModel {
    private String appid;
    private int code;

    public String getAppid() {
        return this.appid;
    }

    public int getCode() {
        return this.code;
    }

    public String toString() {
        return "PaymentModel{code=" + this.code + ", appid='" + this.appid + '\'' + '}';
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setCode(int i) {
        this.code = i;
    }
}
