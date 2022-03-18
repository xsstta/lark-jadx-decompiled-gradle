package com.bytedance.ee.bear.doc.follow;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.util.io.NonProguard;

public class FollowModuleStateAdapter implements NonProguard {
    public String actionType;
    public JSONObject data;
    public String module;

    public FollowModuleStateAdapter() {
    }

    public static String jsonString(FollowModuleState followModuleState) {
        return JSONObject.toJSONString(new FollowModuleStateAdapter(followModuleState.module, followModuleState.actionType, JSONObject.parseObject(followModuleState.data)));
    }

    public FollowModuleStateAdapter(String str, String str2, JSONObject jSONObject) {
        this.module = str;
        this.actionType = str2;
        this.data = jSONObject;
    }
}
