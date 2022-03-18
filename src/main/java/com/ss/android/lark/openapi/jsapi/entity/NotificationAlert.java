package com.ss.android.lark.openapi.jsapi.entity;

public class NotificationAlert extends NotificationBase {
    private String buttonName;

    public String getButtonName() {
        return this.buttonName;
    }

    public String toString() {
        return "title:" + getTitle() + "," + "message:" + getMessage() + "," + "buttonName:" + this.buttonName;
    }

    public void setButtonName(String str) {
        this.buttonName = str;
    }
}
