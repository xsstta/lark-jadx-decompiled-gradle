package com.bytedance.ee.bear.sheet.exportimage.preview;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;

public class ShareOperationTypeModel implements NonProguard {
    private String data;
    private String type;

    public String getData() {
        return this.data;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "ShareOperationTypeModel{type='" + this.type + '\'' + ", data='" + C13598b.m55197d(this.data) + '\'' + '}';
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
