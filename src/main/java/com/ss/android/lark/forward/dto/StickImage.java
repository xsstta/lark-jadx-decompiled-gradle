package com.ss.android.lark.forward.dto;

import java.io.Serializable;

public class StickImage implements Serializable {
    private int mHeight;
    private String mKey;
    private int mWidth;

    public int getHeight() {
        return this.mHeight;
    }

    public String getKey() {
        return this.mKey;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }
}
