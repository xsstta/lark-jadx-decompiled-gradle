package com.ss.android.lark.littleapp.entity;

import java.io.Serializable;

public class ShareAppModel implements Serializable {
    private String androidHref;
    private String appId;
    private String href;
    private String imgKey;
    private String iosHref;
    private boolean isAppPage;
    private String pcHref;
    private String title;

    public String getAndroidHref() {
        return this.androidHref;
    }

    public String getAppId() {
        return this.appId;
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

    public boolean isAppPage() {
        return this.isAppPage;
    }

    public void setAndroidHref(String str) {
        this.androidHref = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppPage(boolean z) {
        this.isAppPage = z;
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
}
