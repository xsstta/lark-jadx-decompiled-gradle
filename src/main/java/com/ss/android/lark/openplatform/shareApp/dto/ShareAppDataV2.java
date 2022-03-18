package com.ss.android.lark.openplatform.shareApp.dto;

import java.io.Serializable;

public class ShareAppDataV2 implements Serializable {
    private String androidHref;
    private String appId;
    private String desc;
    private String href;
    private String imgKey;
    private String iosHref;
    private String pcHref;
    private String title;

    public String getAndroidHref() {
        return this.androidHref;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getHref() {
        return this.href;
    }

    public String getImgKey() {
        return this.imgKey;
    }

    public String getIosHref() {
        return this.iosHref;
    }

    public String getPcHref() {
        return this.pcHref;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAndroidHref(String str) {
        this.androidHref = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setHref(String str) {
        this.href = str;
    }

    public void setImgKey(String str) {
        this.imgKey = str;
    }

    public void setIosHref(String str) {
        this.iosHref = str;
    }

    public void setPcHref(String str) {
        this.pcHref = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setCardLink(String str, String str2, String str3, String str4) {
        this.href = str;
        this.androidHref = str2;
        this.iosHref = str3;
        this.pcHref = str4;
    }
}
