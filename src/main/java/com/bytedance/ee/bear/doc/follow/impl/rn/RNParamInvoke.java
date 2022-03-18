package com.bytedance.ee.bear.doc.follow.impl.rn;

import com.bytedance.ee.util.io.NonProguard;

public class RNParamInvoke implements NonProguard {
    public String callbackId;
    public String funcName;
    public String metaJson;
    public String paramJson;
    public String token;

    public RNParamInvoke() {
    }

    public RNParamInvoke(String str, String str2, String str3, String str4, String str5) {
        this.token = str;
        this.funcName = str2;
        this.paramJson = str3;
        this.metaJson = str4;
        this.callbackId = str5;
    }
}
