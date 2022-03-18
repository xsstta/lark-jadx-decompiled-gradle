package com.ss.android.lark.openapi.jsapi.entity;

public class NavigationTitle implements BaseJSModel {
    private String title;

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "title:" + this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
