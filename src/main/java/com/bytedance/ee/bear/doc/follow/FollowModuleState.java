package com.bytedance.ee.bear.doc.follow;

import com.bytedance.ee.util.io.NonProguard;

public class FollowModuleState implements NonProguard {
    public String actionType;
    public String data;
    public String module;

    public FollowModuleState() {
    }

    public String toString() {
        return "FollowModuleState{module='" + this.module + '\'' + ", actionType='" + this.actionType + '\'' + '}';
    }

    public FollowModuleState(String str, String str2, String str3) {
        this.module = str;
        this.actionType = str2;
        this.data = str3;
    }
}
