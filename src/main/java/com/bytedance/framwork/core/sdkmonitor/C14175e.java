package com.bytedance.framwork.core.sdkmonitor;

import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.e */
public class C14175e {
    /* renamed from: a */
    public static JSONObject m57265a(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str2);
    }
}
