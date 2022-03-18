package com.bytedance.ee.bear.bean;

import com.bytedance.ee.util.io.NonProguard;

public class Icon implements NonProguard {
    private String fs_unit;
    private String key;
    private int type;

    public Icon() {
    }

    public String getFs_unit() {
        return this.fs_unit;
    }

    public String getKey() {
        return this.key;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "Icon{type=" + this.type + ", key='" + this.key + '\'' + ", fs_unit='" + this.fs_unit + '\'' + '}';
    }

    public void setFs_unit(String str) {
        this.fs_unit = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public Icon(int i, String str, String str2) {
        this.type = i;
        this.key = str;
        this.fs_unit = str2;
    }
}
