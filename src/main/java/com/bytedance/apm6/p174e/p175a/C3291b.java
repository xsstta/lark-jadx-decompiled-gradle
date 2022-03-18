package com.bytedance.apm6.p174e.p175a;

import com.bytedance.apm6.cpu.collect.C3233a;
import com.bytedance.apm6.cpu.exception.C3259c;
import com.bytedance.apm6.cpu.p169a.AbstractC3228b;
import com.bytedance.apm6.cpu.p169a.C3227a;
import com.bytedance.apm6.cpu.p169a.C3229c;
import com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b;
import com.bytedance.apm6.p174e.p175a.p176a.C3286a;
import com.bytedance.apm6.p184h.p185a.C3328a;
import com.bytedance.apm6.util.p195b.C3350b;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.e.a.b */
public class C3291b implements AbstractC3228b {

    /* renamed from: a */
    private C3227a f10508a;

    /* renamed from: b */
    private C3229c f10509b;

    /* renamed from: a */
    public C3227a mo13505a() {
        return this.f10508a;
    }

    /* renamed from: b */
    public C3229c mo13507b() {
        return this.f10509b;
    }

    public C3291b() {
        C3286a.m13719a().mo13501b();
        C3286a.m13719a().mo13499a(new AbstractC3290b() {
            /* class com.bytedance.apm6.p174e.p175a.C3291b.C32921 */

            @Override // com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b
            /* renamed from: a */
            public void mo13498a(JSONObject jSONObject, boolean z) {
                C3291b.this.mo13506a(jSONObject, z);
            }
        });
    }

    /* renamed from: a */
    public void mo13506a(JSONObject jSONObject, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (jSONObject != null) {
            JSONObject a = C3328a.m13878a(jSONObject, "cpu");
            if (a != null) {
                this.f10508a = new C3227a();
                boolean z5 = false;
                if (a.optInt("enable_upload", 0) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f10508a.mo13345a(z2);
                long optLong = a.optLong("front_collect_interval", 0);
                if (optLong > 0) {
                    this.f10508a.mo13344a(optLong);
                }
                long optLong2 = a.optLong("back_collect_interval", 0);
                if (optLong2 > 0) {
                    this.f10508a.mo13347b(optLong2);
                }
                long optLong3 = a.optLong("monitor_interval", 0);
                if (optLong3 > 0) {
                    this.f10508a.mo13349c(optLong3);
                }
                this.f10509b = new C3229c();
                if (a.optInt("exception_switch", 0) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f10509b.mo13354a(z3);
                double optDouble = a.optDouble("exception_process_back_max_speed", 0.0d);
                int i = (optDouble > 0.0d ? 1 : (optDouble == 0.0d ? 0 : -1));
                if (i > 0) {
                    this.f10509b.mo13352a(optDouble);
                }
                double optDouble2 = a.optDouble("exception_process_fore_max_speed", 0.0d);
                if (i > 0) {
                    this.f10509b.mo13361c(optDouble2);
                }
                if (a.optInt("main_thread_collect_enabled", 0) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f10509b.mo13359b(z4);
                if (a.optInt("exception_collect_all_process", 0) == 1) {
                    z5 = true;
                }
                this.f10509b.mo13362c(z5);
                double optDouble3 = a.optDouble("exception_thread_max_usage", 0.0d);
                if (optDouble3 > 0.0d) {
                    this.f10509b.mo13357b(optDouble3);
                }
                JSONObject optJSONObject = a.optJSONObject("exception_fore_max_speed_scene");
                HashMap hashMap = new HashMap();
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        double optDouble4 = optJSONObject.optDouble(next, 0.0d);
                        if (optDouble4 > 0.0d) {
                            hashMap.put(next, Double.valueOf(optDouble4));
                        }
                    }
                }
                this.f10509b.mo13358b(hashMap);
                JSONObject optJSONObject2 = a.optJSONObject("exception_back_max_speed_scene");
                HashMap hashMap2 = new HashMap();
                if (optJSONObject2 != null) {
                    Iterator<String> keys2 = optJSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        double optDouble5 = optJSONObject2.optDouble(next2, 0.0d);
                        if (optDouble5 > 0.0d) {
                            hashMap2.put(next2, Double.valueOf(optDouble5));
                        }
                    }
                }
                this.f10509b.mo13353a(hashMap2);
            }
            C3350b.m13932a("APM-CPU", mo13505a() + " " + mo13507b());
            C3233a.m13533a().mo13388a(mo13505a());
            C3259c.m13617a().mo13435a(mo13507b());
        }
    }
}
