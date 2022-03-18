package com.bytedance.push.p883e;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.e.a */
public class C20403a {

    /* renamed from: a */
    public long f49862a;

    /* renamed from: b */
    public long f49863b;

    /* renamed from: c */
    public long f49864c;

    /* renamed from: d */
    public int f49865d;

    /* renamed from: a */
    public JSONObject mo68807a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ts", this.f49864c);
            jSONObject.put("rid", this.f49862a);
            jSONObject.put("revoke_id", this.f49863b);
            jSONObject.put("sender", this.f49865d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C20403a m74324a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C20403a aVar = new C20403a();
        aVar.f49864c = jSONObject.optLong("ts");
        aVar.f49862a = jSONObject.optLong("rid");
        aVar.f49863b = jSONObject.optLong("revoke_id");
        aVar.f49865d = jSONObject.optInt("sender");
        return aVar;
    }
}
