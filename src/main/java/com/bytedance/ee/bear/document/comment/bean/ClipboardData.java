package com.bytedance.ee.bear.document.comment.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class ClipboardData implements BaseJSModel {
    private String text;

    public String getText() {
        return this.text;
    }

    public String toString() {
        return "ClipboardData{text='" + this.text + '\'' + '}';
    }

    public void setText(String str) {
        this.text = str;
    }
}
