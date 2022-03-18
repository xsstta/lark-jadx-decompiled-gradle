package com.bytedance.apm6.p174e.p175a;

import com.bytedance.apm.C2931f;
import com.bytedance.apm.config.AbstractC2896g;
import com.bytedance.apm.config.C2895f;
import com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b;
import com.bytedance.apm6.p174e.p175a.p176a.C3286a;
import com.bytedance.apm6.p184h.p185a.C3328a;
import com.huawei.hms.support.api.entity.core.CommonCode;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.e.a.e */
public class C3297e implements AbstractC2896g {

    /* renamed from: a */
    private C2895f f10515a;

    /* renamed from: a */
    public C2895f mo13510a() {
        return this.f10515a;
    }

    public C3297e() {
        C3286a.m13719a().mo13501b();
        C3286a.m13719a().mo13499a(new AbstractC3290b() {
            /* class com.bytedance.apm6.p174e.p175a.C3297e.C32981 */

            @Override // com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b
            /* renamed from: a */
            public void mo13498a(JSONObject jSONObject, boolean z) {
                C3297e.this.mo13511a(jSONObject, z);
            }
        });
    }

    /* renamed from: a */
    public void mo13511a(JSONObject jSONObject, boolean z) {
        JSONObject a;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        if (jSONObject != null && (a = C3328a.m13878a(jSONObject, "smooth")) != null) {
            this.f10515a = new C2895f();
            boolean z10 = false;
            if (a.optInt("enable_stack_sampling", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f10515a.mo12487a(z2);
            if (a.optInt("enable_trace", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f10515a.mo12490b(z3);
            this.f10515a.mo12485a(a.optLong("atrace_tag", 0));
            if (a.optInt("block_dump_stack_enable", 1) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f10515a.mo12494c(z4);
            if (a.optInt("enable_gfx_monitor", 0) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f10515a.mo12496d(z5);
            this.f10515a.mo12484a(a.optInt("block_monitor_mode", CommonCode.StatusCode.API_CLIENT_EXPIRED));
            if (a.optInt("serious_block_enable_upload", 1) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.f10515a.mo12499e(z6);
            this.f10515a.mo12489b(a.optLong("serious_block_threshold", 4000));
            if (a.optInt("slow_method_enable_upload", 1) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f10515a.mo12501f(z7);
            if (a.optInt("drop_enable_upload", 1) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f10515a.mo12503g(z8);
            if (a.optInt("enable_upload", 0) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f10515a.mo12504h(z9);
            this.f10515a.mo12493c(a.optLong("block_threshold", 2500));
            this.f10515a.mo12495d(a.optLong("drop_threshold", 1000));
            if (a.optInt("block_enable_upload", 0) == 1) {
                z10 = true;
            }
            this.f10515a.mo12506i(z10);
            this.f10515a.mo12508j(a.optBoolean("drop_slow_method_switch", true));
            this.f10515a.mo12486a(a.optJSONObject("scene_enable_upload"));
            C2931f.m12389a().mo12636a(mo13510a());
        }
    }
}
