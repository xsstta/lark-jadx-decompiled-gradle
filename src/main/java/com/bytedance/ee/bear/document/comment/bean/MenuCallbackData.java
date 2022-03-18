package com.bytedance.ee.bear.document.comment.bean;

import com.bytedance.ee.util.io.NonProguard;

public class MenuCallbackData implements NonProguard {
    private String id;
    private String value;

    public MenuCallbackData() {
    }

    public String getId() {
        return this.id;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "MenuCallbackData{id='" + this.id + '\'' + ", value='" + this.value + '\'' + '}';
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public MenuCallbackData(String str) {
        this.id = str;
    }

    public MenuCallbackData(String str, String str2) {
        this.id = str;
        this.value = str2;
    }
}
