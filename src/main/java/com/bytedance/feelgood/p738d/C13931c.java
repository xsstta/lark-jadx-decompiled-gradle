package com.bytedance.feelgood.p738d;

import org.json.JSONObject;

/* renamed from: com.bytedance.feelgood.d.c */
public final class C13931c {

    /* renamed from: a */
    public String f36412a;

    /* renamed from: b */
    public String f36413b;

    /* renamed from: c */
    public JSONObject f36414c;

    /* renamed from: d */
    public String f36415d;

    private C13931c() {
    }

    /* renamed from: a */
    public static C13931c m56385a(String str) {
        try {
            C13931c cVar = new C13931c();
            JSONObject jSONObject = new JSONObject(str);
            cVar.f36412a = jSONObject.optString("__callback_id");
            cVar.f36413b = jSONObject.optString("func");
            cVar.f36414c = jSONObject.optJSONObject("__params");
            cVar.f36415d = jSONObject.optString("JSSDK");
            return cVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
