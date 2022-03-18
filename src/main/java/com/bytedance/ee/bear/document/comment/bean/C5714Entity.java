package com.bytedance.ee.bear.document.comment.bean;

import com.bytedance.ee.util.io.NonProguard;

/* renamed from: com.bytedance.ee.bear.document.comment.bean.Entity */
public class C5714Entity implements NonProguard {
    public String appId;
    public int bizType;
    public String token;
    public int type;

    public String getAppId() {
        return this.appId;
    }

    public int getBizType() {
        return this.bizType;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setBizType(int i) {
        this.bizType = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
