package com.ss.android.lark.openapi.jsapi.entity;

public class NavigationRight implements BaseJSModel {
    private boolean control;
    private boolean show = true;
    private String text;

    public String getText() {
        return this.text;
    }

    public boolean isControl() {
        return this.control;
    }

    public boolean isShow() {
        return this.show;
    }

    public String toString() {
        return "show:" + this.show + "," + "control:" + this.control + "," + "text:" + this.text;
    }

    public void setControl(boolean z) {
        this.control = z;
    }

    public void setShow(boolean z) {
        this.show = z;
    }

    public void setText(String str) {
        this.text = str;
    }
}
