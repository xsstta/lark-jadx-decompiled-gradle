package com.bytedance.ee.bear.document.toast;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class ToastModel implements BaseJSModel {
    public String buttonMessage;
    public int duration;
    public String message;
    public int type;

    public ToastModel() {
    }

    public String toString() {
        return "ToastModel{message='" + this.message + '\'' + ", type=" + this.type + ", duration=" + this.duration + '}';
    }

    public ToastModel(String str, int i, int i2) {
        this.message = str;
        this.type = i;
        this.duration = i2;
    }
}
