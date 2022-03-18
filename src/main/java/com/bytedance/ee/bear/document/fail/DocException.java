package com.bytedance.ee.bear.document.fail;

public class DocException extends Exception {
    private int mCode;

    public int getCode() {
        return this.mCode;
    }

    public DocException(int i, String str) {
        super(str);
        this.mCode = i;
    }
}
