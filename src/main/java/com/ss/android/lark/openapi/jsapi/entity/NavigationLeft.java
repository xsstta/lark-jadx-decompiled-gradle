package com.ss.android.lark.openapi.jsapi.entity;

public class NavigationLeft implements BaseJSModel {
    private boolean control;
    private boolean isShowIcon = true;
    private String text;

    public String getText() {
        return this.text;
    }

    public boolean isControl() {
        return this.control;
    }

    public boolean isShowIcon() {
        return this.isShowIcon;
    }

    public String toString() {
        return "isShowIcon:" + this.isShowIcon + "," + "control:" + this.control + "," + "text:" + this.text;
    }

    public void setControl(boolean z) {
        this.control = z;
    }

    public void setShowIcon(boolean z) {
        this.isShowIcon = z;
    }

    public void setText(String str) {
        this.text = str;
    }
}
