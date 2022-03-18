package com.bytedance.ee.bear.doc.follow.impl.rn;

import com.bytedance.ee.util.io.NonProguard;

public class RNParamSendEvent implements NonProguard {
    public String dataJson;
    public String eventType;
    public String module;
    public String token;

    public RNParamSendEvent() {
    }

    public RNParamSendEvent(String str, String str2, String str3, String str4) {
        this.token = str;
        this.module = str2;
        this.eventType = str3;
        this.dataJson = str4;
    }
}
