package com.ss.android.lark.share.impl.entity;

import java.io.Serializable;

public class ShareResponse implements Serializable {
    private int mResponseCode;

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public void setResponseCode(int i) {
        this.mResponseCode = i;
    }

    public ShareResponse(int i) {
        this.mResponseCode = i;
    }
}
