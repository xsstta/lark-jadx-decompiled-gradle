package com.bytedance.ee.bear.todocenter.parser;

import android.text.TextUtils;

public class AtDocumentBlock extends AbsBlock {
    private String href;
    private String objType;
    private String token;

    public String getHref() {
        return this.href;
    }

    public String getObjType() {
        return this.objType;
    }

    public String getToken() {
        return this.token;
    }

    public AtDocumentBlock() {
        setType("1");
    }

    public int getDocType() {
        try {
            return Integer.valueOf(this.objType).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.ee.bear.todocenter.parser.AbsBlock
    public boolean isValid() {
        if (TextUtils.isEmpty(this.token) || TextUtils.isEmpty(this.objType)) {
            return false;
        }
        return true;
    }

    public AtDocumentBlock setHref(String str) {
        this.href = str;
        return this;
    }

    public AtDocumentBlock setObjType(String str) {
        this.objType = str;
        return this;
    }

    public AtDocumentBlock setToken(String str) {
        this.token = str;
        return this;
    }
}
