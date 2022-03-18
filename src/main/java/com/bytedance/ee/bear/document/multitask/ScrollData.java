package com.bytedance.ee.bear.document.multitask;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class ScrollData implements BaseJSModel {
    private String token;

    /* renamed from: x */
    private int f16473x;

    /* renamed from: y */
    private int f16474y;

    public String getToken() {
        return this.token;
    }

    public int getX() {
        return this.f16473x;
    }

    public int getY() {
        return this.f16474y;
    }

    public String toString() {
        return "ScrollData{, x=" + this.f16473x + ", y=" + this.f16474y + '}';
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setX(int i) {
        this.f16473x = i;
    }

    public void setY(int i) {
        this.f16474y = i;
    }
}
