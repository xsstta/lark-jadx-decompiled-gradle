package com.bytedance.ee.bear.doc.follow.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.doc.follow.impl.b */
public class C5437b {
    /* renamed from: a */
    static String[] m22044a(String str) {
        int i;
        JSONArray parseArray = JSONObject.parseArray(str);
        if (parseArray == null) {
            i = 0;
        } else {
            i = parseArray.size();
        }
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            try {
                strArr[i2] = JSONObject.toJSONString(parseArray.get(i2));
            } catch (Exception e) {
                C13479a.m54759a("CCMFollow_DataUtils", "objArray2StringArray", e);
            }
        }
        return strArr;
    }

    /* renamed from: a */
    public static <T> T m22043a(String str, Class<T> cls) {
        Object parse = JSONObject.parse(str);
        if (parse instanceof JSONObject) {
            return (T) JSONObject.parseObject(str, cls);
        }
        if (!(parse instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) parse;
        if (jSONArray.size() <= 0 || !(jSONArray.get(0) instanceof JSONObject)) {
            return null;
        }
        return (T) JSONObject.toJavaObject((JSONObject) jSONArray.get(0), cls);
    }
}
