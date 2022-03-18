package com.ss.lark.android.passport.biz.entity;

import java.io.Serializable;

public class LoginUserInputV2 implements Serializable {
    private String content;
    private String countryCode;
    private String cp;
    private int mode;

    public String getContent() {
        return this.content;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCp() {
        return this.cp;
    }

    public int getMode() {
        return this.mode;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setCp(String str) {
        this.cp = str;
    }

    public void setMode(int i) {
        this.mode = i;
    }
}
