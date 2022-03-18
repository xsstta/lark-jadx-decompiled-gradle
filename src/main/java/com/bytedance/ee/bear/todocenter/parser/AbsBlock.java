package com.bytedance.ee.bear.todocenter.parser;

import com.bytedance.ee.util.io.NonProguard;

public abstract class AbsBlock implements NonProguard, Cloneable {
    public String content = "";
    public int end;
    public int start;
    private String type;

    public abstract boolean isValid();

    public String getContent() {
        return this.content;
    }

    public String getType() {
        return this.type;
    }

    public AbsBlock setContent(String str) {
        this.content = str;
        return this;
    }

    /* access modifiers changed from: protected */
    public void setType(String str) {
        this.type = str;
    }
}
