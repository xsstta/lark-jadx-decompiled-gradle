package com.bytedance.apm6.p174e.p175a;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p157a.C3150a;
import com.bytedance.apm6.p157a.p158a.AbstractC3153b;
import com.bytedance.apm6.p157a.p158a.C3152a;
import com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b;
import com.bytedance.apm6.p174e.p175a.p176a.C3286a;
import com.bytedance.apm6.util.p195b.C3350b;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.e.a.a */
public class C3284a implements AbstractC3153b {

    /* renamed from: a */
    private volatile C3152a f10492a;

    @Override // com.bytedance.apm6.p157a.p158a.AbstractC3153b
    /* renamed from: a */
    public C3152a mo13098a() {
        return this.f10492a;
    }

    public C3284a() {
        C3286a.m13719a().mo13501b();
        C3286a.m13719a().mo13499a(new AbstractC3290b() {
            /* class com.bytedance.apm6.p174e.p175a.C3284a.C32851 */

            @Override // com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b
            /* renamed from: a */
            public void mo13498a(JSONObject jSONObject, boolean z) {
                C3284a.this.mo13497a(jSONObject, z);
            }
        });
    }

    /* renamed from: a */
    public void mo13497a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("custom_event_settings");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("allow_service_name");
            HashSet hashSet = new HashSet();
            if (optJSONObject2 != null) {
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    hashSet.add(keys.next());
                }
            }
            HashSet hashSet2 = new HashSet();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("allow_log_type");
            if (optJSONObject3 != null) {
                Iterator<String> keys2 = optJSONObject3.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    if (optJSONObject3.optInt(next) == 1) {
                        hashSet2.add(next);
                    }
                }
            }
            this.f10492a = new C3152a(hashSet, hashSet2);
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Config", "received customEventSettings=" + optJSONObject);
                C3350b.m13932a("APM-Config", "parsed CommonEventConfig=" + this.f10492a);
            }
            C3150a.m13121a(mo13098a());
        }
    }
}
