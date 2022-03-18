package com.ss.android.lark.passport.signinsdk_api.entity;

import java.io.Serializable;

public class LoginSourceInfo implements Serializable {
    private int loginSource;
    private String url;

    public LoginSourceInfo() {
    }

    public int getLoginSource() {
        return this.loginSource;
    }

    public String getUrl() {
        return this.url;
    }

    public void setLoginSource(int i) {
        this.loginSource = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public LoginSourceInfo(int i, String str) {
        this.loginSource = i;
        this.url = str;
    }
}
