package com.ss.android.lark.openapi.jsapi.entity;

public class VerifyModel implements BaseJSModel {
    private String contactPoint;
    private String session;

    public String getContactPoint() {
        return this.contactPoint;
    }

    public String getSession() {
        return this.session;
    }

    public void setContactPoint(String str) {
        this.contactPoint = str;
    }

    public void setSession(String str) {
        this.session = str;
    }
}
