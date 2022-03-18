package com.ss.android.lark.openapi.jsapi.entity;

public class NotificationToast implements BaseJSModel {
    private int duration;
    private String text;

    public int getDuration() {
        return this.duration;
    }

    public String getText() {
        return this.text;
    }

    public String toString() {
        return "text:" + this.text + "," + "duration" + this.duration;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setText(String str) {
        this.text = str;
    }
}
