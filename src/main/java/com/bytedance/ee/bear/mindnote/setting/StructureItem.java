package com.bytedance.ee.bear.mindnote.setting;

import com.bytedance.ee.util.io.NonProguard;

/* access modifiers changed from: package-private */
public class StructureItem implements NonProguard {
    private String key = "";
    private String type = "";

    public String getKey() {
        return this.key;
    }

    public String getType() {
        return this.type;
    }

    StructureItem() {
    }

    public String toString() {
        return "StructureItem{key='" + this.key + '\'' + ", type='" + this.type + '\'' + '}';
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
