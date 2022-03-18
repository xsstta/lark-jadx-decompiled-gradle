package com.bytedance.ee.bear.document.comment.bean;

import com.bytedance.ee.util.io.NonProguard;

public class CopyResult implements NonProguard {
    private int code;

    public CopyResult() {
    }

    public int getCode() {
        return this.code;
    }

    public String toString() {
        return "CopyResult{code=" + this.code + '}';
    }

    public void setCode(int i) {
        this.code = i;
    }

    public CopyResult(int i) {
        this.code = i;
    }
}
