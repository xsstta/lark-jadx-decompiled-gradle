package com.bytedance.ee.bear.doc.follow.impl.rn;

import com.bytedance.ee.util.io.NonProguard;

public class RNParamRegisterEventHandler implements NonProguard {
    public String eventType;
    public String module;
    public String source;
    public String token;

    public RNParamRegisterEventHandler() {
    }

    public RNParamRegisterEventHandler(String str, String str2, String str3) {
        this.token = str;
        this.module = str2;
        this.eventType = str3;
        this.source = "";
    }

    public RNParamRegisterEventHandler(String str, String str2, String str3, boolean z) {
        String str4;
        this.token = str;
        this.module = str2;
        this.eventType = str3;
        if (z) {
            str4 = "outer";
        } else {
            str4 = "inner";
        }
        this.source = str4;
    }
}
