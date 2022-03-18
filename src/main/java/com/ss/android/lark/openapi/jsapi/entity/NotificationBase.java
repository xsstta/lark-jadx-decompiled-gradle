package com.ss.android.lark.openapi.jsapi.entity;

public class NotificationBase implements BaseJSModel {
    private String message;
    private String title;

    public String getMessage() {
        return this.message;
    }

    public String getTitle() {
        return this.title;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
