package com.bytedance.ee.bear.todocenter.push;

import com.bytedance.ee.util.io.NonProguard;

public class TodoPushIPCEntity implements NonProguard {
    public String json;

    public TodoPushIPCEntity() {
    }

    public String getJson() {
        return this.json;
    }

    public String toString() {
        return super.toString();
    }

    public void setJson(String str) {
        this.json = str;
    }

    public TodoPushIPCEntity(String str) {
        this.json = str;
    }
}
