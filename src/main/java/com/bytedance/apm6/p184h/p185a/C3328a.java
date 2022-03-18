package com.bytedance.apm6.p184h.p185a;

import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.h.a.a */
public class C3328a {
    /* renamed from: a */
    public static JSONObject m13878a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.optJSONObject("performance_modules").optJSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
