package com.bytedance.ee.bear.list.makecopy;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.util.io.NonProguard;

public class CanCopyEvent implements NonProguard {
    private boolean isCanCopy;

    public CanCopyEvent() {
    }

    public boolean isCanCopy() {
        return this.isCanCopy;
    }

    public void setCanCopy(boolean z) {
        this.isCanCopy = z;
    }

    public CanCopyEvent(boolean z) {
        this.isCanCopy = z;
    }

    public static String toJson(CanCopyEvent canCopyEvent) {
        return JSONObject.toJSONString(canCopyEvent);
    }

    public static CanCopyEvent fromJson(String str) {
        return (CanCopyEvent) JSONObject.parseObject(str, CanCopyEvent.class);
    }
}
