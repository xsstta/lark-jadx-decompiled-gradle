package com.bytedance.ee.bear.doc.follow;

import com.bytedance.ee.util.io.NonProguard;

public class FollowInvokeResult implements NonProguard {
    public String callbackId;
    public String funcName;
    public String resultJson;
    public String token;

    public FollowInvokeResult() {
    }

    public FollowInvokeResult(String str, String str2, String str3) {
        this.token = str;
        this.resultJson = str2;
        this.callbackId = str3;
    }
}
