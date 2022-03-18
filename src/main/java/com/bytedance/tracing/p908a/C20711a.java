package com.bytedance.tracing.p908a;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.tracing.a.a */
public class C20711a {
    /* renamed from: a */
    public static JSONArray m75500a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("wrapper_array_data")) == null) {
            return null;
        }
        return optJSONArray;
    }

    /* renamed from: a */
    public static JSONObject m75501a(JSONArray jSONArray) throws JSONException {
        return new JSONObject().put("wrapper_array_data", jSONArray);
    }
}
