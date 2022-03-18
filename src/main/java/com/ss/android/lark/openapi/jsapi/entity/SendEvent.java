package com.ss.android.lark.openapi.jsapi.entity;

public class SendEvent implements BaseJSModel {
    private String action;
    private String category;
    private String params;

    public String getAction() {
        return this.action;
    }

    public String getCategory() {
        return this.category;
    }

    public String getParams() {
        return this.params;
    }

    public String toString() {
        return "action:" + this.action + "," + "parems:" + this.params + "," + "category:" + this.category;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setParams(String str) {
        this.params = str;
    }
}
