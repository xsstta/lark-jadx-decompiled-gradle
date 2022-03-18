package com.bytedance.crash.p218b;

import com.bytedance.crash.p218b.C3693b;
import com.bytedance.crash.runtime.C3864m;
import com.bytedance.crash.util.C3955q;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.b.i */
public class C3707i {
    /* renamed from: a */
    static void m15294a(C3693b.C3695a aVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (aVar.f11383l) {
            C3955q.m16447a(jSONObject, "from_signal", "1");
        }
        if (aVar.f11381j >= 0) {
            C3955q.m16447a(jSONObject2, "trace_cost", Long.valueOf(aVar.f11381j));
        }
        C3864m.m16007a("anr_event", jSONObject, jSONObject2);
    }
}
