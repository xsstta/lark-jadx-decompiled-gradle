package com.bytedance.apm6.p174e.p175a;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p172d.C3268a;
import com.bytedance.apm6.p172d.p173a.AbstractC3272b;
import com.bytedance.apm6.p172d.p173a.C3271a;
import com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b;
import com.bytedance.apm6.p174e.p175a.p176a.C3286a;
import com.bytedance.apm6.util.p195b.C3350b;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.e.a.d */
public class C3295d implements AbstractC3272b {

    /* renamed from: a */
    private C3271a f10513a;

    @Override // com.bytedance.apm6.p172d.p173a.AbstractC3272b
    /* renamed from: a */
    public C3271a mo13478a() {
        return this.f10513a;
    }

    public C3295d() {
        if (C3318a.m13915u()) {
            C3350b.m13932a("APM-FD", "FdConfigManager:");
        }
        C3286a.m13719a().mo13501b();
        C3286a.m13719a().mo13499a(new AbstractC3290b() {
            /* class com.bytedance.apm6.p174e.p175a.C3295d.C32961 */

            @Override // com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b
            /* renamed from: a */
            public void mo13498a(JSONObject jSONObject, boolean z) {
                C3295d.this.mo13509a(jSONObject, z);
            }
        });
    }

    /* renamed from: a */
    public void mo13509a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        boolean z2;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (C3318a.m13915u()) {
            C3350b.m13932a("APM-FD", "parseConfig:" + optJSONObject2);
        }
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("fd")) != null) {
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-FD", "parseConfig:" + optJSONObject);
            }
            if (optJSONObject.optInt("enable_upload", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            long optInt = (long) optJSONObject.optInt("fd_count_threshold", 800);
            long optLong = optJSONObject.optLong("collect_interval", 10) * 60000;
            if (optLong < 10) {
                optLong = 600000;
            }
            C3271a aVar = new C3271a(optInt, optLong, z2);
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-FD", "parseConfig:" + aVar);
            }
            this.f10513a = aVar;
            C3268a.m13662a().mo13468a(aVar);
        }
    }
}
