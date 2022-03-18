package com.bytedance.apm6.p174e.p175a;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b;
import com.bytedance.apm6.p174e.p175a.p176a.C3286a;
import com.bytedance.apm6.p177f.C3306b;
import com.bytedance.apm6.p177f.p179b.AbstractC3311b;
import com.bytedance.apm6.p177f.p179b.C3310a;
import com.bytedance.apm6.util.p195b.C3350b;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.e.a.f */
public class C3299f implements AbstractC3311b {

    /* renamed from: a */
    private C3310a f10517a;

    @Override // com.bytedance.apm6.p177f.p179b.AbstractC3311b
    /* renamed from: a */
    public C3310a mo13293a() {
        return this.f10517a;
    }

    public C3299f() {
        C3286a.m13719a().mo13501b();
        C3286a.m13719a().mo13499a(new AbstractC3290b() {
            /* class com.bytedance.apm6.p174e.p175a.C3299f.C33001 */

            @Override // com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b
            /* renamed from: a */
            public void mo13498a(JSONObject jSONObject, boolean z) {
                C3299f.this.mo13512a(jSONObject, z);
            }
        });
    }

    /* renamed from: a */
    public void mo13512a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        boolean z2;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("memory")) != null) {
            long optLong = optJSONObject.optLong("collect_interval", 120);
            double optDouble = optJSONObject.optDouble("reach_top_memory_rate", 0.8d);
            boolean z3 = true;
            if (optJSONObject.optInt("enable_upload", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (optJSONObject.optInt("close_memory_collect") == 1) {
                z3 = false;
            }
            this.f10517a = new C3310a(optLong, optDouble, false, false, z2, z3);
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Config", "parsed MemoryConfig=" + this.f10517a);
            }
            C3306b.m13762a().mo13521a(mo13293a());
        }
    }
}
