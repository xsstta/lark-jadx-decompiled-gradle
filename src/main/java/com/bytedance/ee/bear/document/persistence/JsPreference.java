package com.bytedance.ee.bear.document.persistence;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class JsPreference implements BaseJSModel {
    private String key;
    private String value;

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "JsPreference{key='" + this.key + '\'' + ", value='" + this.value + '\'' + '}';
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
