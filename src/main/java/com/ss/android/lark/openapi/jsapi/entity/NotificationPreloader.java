package com.ss.android.lark.openapi.jsapi.entity;

public class NotificationPreloader implements BaseJSModel {
    private boolean showIcon = true;
    private String text;

    public String getText() {
        return this.text;
    }

    public boolean isShowIcon() {
        return this.showIcon;
    }

    public String toString() {
        return "text:" + this.text + "," + "showIcon:" + this.showIcon;
    }

    public void setShowIcon(boolean z) {
        this.showIcon = z;
    }

    public void setText(String str) {
        this.text = str;
    }
}
