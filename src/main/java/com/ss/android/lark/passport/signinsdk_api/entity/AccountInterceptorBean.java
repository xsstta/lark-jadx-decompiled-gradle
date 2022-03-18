package com.ss.android.lark.passport.signinsdk_api.entity;

import java.io.Serializable;

public class AccountInterceptorBean implements Serializable {
    private String cancelText;
    private String confirmText;
    private String desc;
    private String title;

    public String getCancelText() {
        return this.cancelText;
    }

    public String getConfirmText() {
        return this.confirmText;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCancelText(String str) {
        this.cancelText = str;
    }

    public void setConfirmText(String str) {
        this.confirmText = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public AccountInterceptorBean(String str, String str2, String str3, String str4) {
        this.title = str;
        this.desc = str2;
        this.confirmText = str3;
        this.cancelText = str4;
    }
}
