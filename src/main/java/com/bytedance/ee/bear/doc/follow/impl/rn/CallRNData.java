package com.bytedance.ee.bear.doc.follow.impl.rn;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.util.io.NonProguard;

public class CallRNData implements NonProguard {
    public String business = "base";
    public Data data;

    public static class Data implements NonProguard {
        public NonProguard body;
        public String operation;
    }

    public static String buildJson(String str, NonProguard nonProguard) {
        CallRNData callRNData = new CallRNData();
        Data data2 = new Data();
        callRNData.data = data2;
        data2.operation = str;
        callRNData.data.body = nonProguard;
        return JSONObject.toJSONString(callRNData);
    }
}
