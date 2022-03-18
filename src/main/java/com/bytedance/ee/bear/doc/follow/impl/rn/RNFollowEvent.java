package com.bytedance.ee.bear.doc.follow.impl.rn;

import com.bytedance.ee.util.io.NonProguard;

public class RNFollowEvent implements NonProguard {
    public String dataJson;
    public String eventType;
    public String module;
    public String token;

    public RNFollowEvent() {
    }

    public String toString() {
        return "RNFollowEvent{token='" + this.token + '\'' + ", module='" + this.module + '\'' + ", eventType='" + this.eventType + '\'' + ", dataJson='" + this.dataJson + '\'' + '}';
    }

    public RNFollowEvent(String str, String str2, String str3, String str4) {
        this.token = str;
        this.module = str2;
        this.eventType = str3;
        this.dataJson = str4;
    }
}
