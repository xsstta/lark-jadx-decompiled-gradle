package com.bytedance.sdk.bridge.lynx;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.bridge.lynx.d */
public class C20676d {

    /* renamed from: a */
    private JSONObject f50519a = new JSONObject();

    /* renamed from: a */
    public JSONObject mo69747a() {
        return this.f50519a;
    }

    /* renamed from: a */
    public C20676d mo69746a(String str, Object obj) {
        try {
            this.f50519a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f50519a.remove(str);
        }
        return this;
    }
}
