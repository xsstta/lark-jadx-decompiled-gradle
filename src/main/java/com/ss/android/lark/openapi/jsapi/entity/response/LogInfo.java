package com.ss.android.lark.openapi.jsapi.entity.response;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class LogInfo implements BaseJSModel {
    private int level;
    private String message;
    private String tag;

    public int getLevel() {
        return this.level;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTag() {
        return this.tag;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }
}
