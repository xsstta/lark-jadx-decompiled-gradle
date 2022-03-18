package com.bytedance.ee.bear.document.record;

import com.bytedance.ee.util.io.NonProguard;

public class RecordModel implements NonProguard {
    private String data;
    private String token;
    private String type;

    public String getData() {
        return this.data;
    }

    public String getToken() {
        return this.token;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "RecordModel{token='" + this.token + '\'' + ", type='" + this.type + '\'' + ", data='" + this.data + '\'' + '}';
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
