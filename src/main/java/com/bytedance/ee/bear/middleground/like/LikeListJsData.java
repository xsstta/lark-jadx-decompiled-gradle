package com.bytedance.ee.bear.middleground.like;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import com.bytedance.ee.util.p700c.C13598b;

public class LikeListJsData implements BaseJSModel {
    private int refer_type;
    private String token;

    public int getRefer_type() {
        return this.refer_type;
    }

    public String getToken() {
        return this.token;
    }

    public String toString() {
        return "LikeListOpenData{token='" + C13598b.m55197d(this.token) + '\'' + ", refer_type=" + this.refer_type + '}';
    }

    public void setRefer_type(int i) {
        this.refer_type = i;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
