package com.bytedance.ee.bear.document.profile;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class ProfileModel implements BaseJSModel {
    private String userId;

    public String getUserId() {
        return this.userId;
    }

    public String toString() {
        return "{userId='" + this.userId + '\'' + '}';
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
