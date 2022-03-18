package com.bytedance.ee.bear.document.selection;

import com.bytedance.ee.util.io.NonProguard;

public class ContextMenuItem implements NonProguard {
    public Object data;
    public String id;
    public String text;

    public Object getData() {
        return this.data;
    }

    public String getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setText(String str) {
        this.text = str;
    }
}
