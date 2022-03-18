package com.bytedance.ee.bear.middleground.comment.widget;

import com.bytedance.ee.util.io.NonProguard;

public class Info implements NonProguard {
    public int code;
    public boolean readAble;
    public String token;

    public String getToken() {
        return this.token;
    }

    public boolean isReadAble() {
        return this.readAble;
    }

    public void setReadAble(boolean z) {
        this.readAble = z;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
