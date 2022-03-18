package com.bytedance.tracing.p908a;

import com.bytedance.apm.util.C3121h;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.slardar.config.AbstractC20704a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.tracing.a.c */
public class C20715c implements AbstractC20704a {

    /* renamed from: e */
    private static volatile C20715c f50679e;

    /* renamed from: a */
    private boolean f50680a;

    /* renamed from: b */
    private boolean f50681b = true;

    /* renamed from: c */
    private JSONObject f50682c;

    /* renamed from: d */
    private JSONObject f50683d;

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onReady() {
    }

    private C20715c() {
    }

    /* renamed from: a */
    public static C20715c m75506a() {
        if (f50679e == null) {
            synchronized (C20715c.class) {
                if (f50679e == null) {
                    f50679e = new C20715c();
                    ((IConfigManager) C20216d.m73783a(IConfigManager.class)).registerConfigListener(f50679e);
                }
            }
        }
        return f50679e;
    }

    /* renamed from: a */
    public double mo69950a(String str) {
        JSONObject jSONObject = this.f50682c;
        if (jSONObject == null) {
            return 0.0d;
        }
        double optDouble = jSONObject.optDouble(str);
        if (Double.isNaN(optDouble)) {
            return 0.0d;
        }
        return optDouble;
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        this.f50681b = C3121h.m13000a(jSONObject, "tracing", "enable_open", true);
        if (!this.f50680a) {
            this.f50682c = C3121h.m12998a(jSONObject, "tracing", "allow_service_list");
            this.f50683d = C3121h.m12998a(jSONObject, "tracing", "allow_error_list");
            this.f50680a = true;
        }
    }

    /* renamed from: a */
    public int mo69951a(boolean z, String str) {
        JSONObject jSONObject;
        int i = 0;
        if (!this.f50681b) {
            return 0;
        }
        if (z && ((jSONObject = this.f50683d) == null || jSONObject.optDouble(str, -1.0d) > 0.0d)) {
            i = 16;
        }
        JSONObject jSONObject2 = this.f50682c;
        if (jSONObject2 == null || jSONObject2.optDouble(str, -1.0d) <= 0.0d) {
            return i;
        }
        return i | 1;
    }
}
