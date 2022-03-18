package com.bytedance.apm.p143i;

import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p192e.AbstractC3341a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.i.e */
public class C2984e {

    /* renamed from: a */
    private static volatile C2984e f9589a;

    private C2984e() {
    }

    /* renamed from: a */
    public static C2984e m12539a() {
        if (f9589a == null) {
            synchronized (C2984e.class) {
                if (f9589a == null) {
                    f9589a = new C2984e();
                }
            }
        }
        return f9589a;
    }

    /* renamed from: b */
    public JSONObject mo12726b() {
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC3341a aVar = (AbstractC3341a) C3336c.m13901a(AbstractC3341a.class);
            jSONObject.put("process_usage", aVar.mo13371b());
            jSONObject.put("stat_speed", aVar.mo13373c());
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }
}
