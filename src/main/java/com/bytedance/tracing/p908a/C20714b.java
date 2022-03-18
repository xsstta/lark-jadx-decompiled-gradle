package com.bytedance.tracing.p908a;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.tracing.a.b */
public final class C20714b {

    /* renamed from: a */
    private final long f50676a;

    /* renamed from: b */
    private final String f50677b;

    /* renamed from: c */
    private final Map<String, String> f50678c;

    /* renamed from: a */
    public JSONObject mo69949a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", this.f50676a);
            jSONObject.put("message", this.f50677b);
            Map<String, String> map = this.f50678c;
            if (map != null && map.size() > 0) {
                jSONObject.put("fields", new JSONObject(this.f50678c));
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C20714b(long j, String str, Map<String, String> map) {
        this.f50676a = j;
        this.f50677b = str;
        this.f50678c = map;
    }
}
