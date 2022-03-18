package com.bytedance.apm6.p184h.p185a.p186a;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p183g.AbstractC3326b;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.apm6.util.C3355e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.h.a.a.a */
public abstract class AbstractC3329a implements AbstractC3326b {

    /* renamed from: a */
    protected final String f10612a = "log_type";

    /* renamed from: b */
    protected final String f10613b = "extra_status";

    /* renamed from: c */
    protected final String f10614c = "extra_values";

    /* renamed from: d */
    protected final String f10615d = "filters";

    /* renamed from: e */
    protected final String f10616e = "service";

    /* renamed from: f */
    protected final String f10617f = "scene";

    /* renamed from: g */
    private JSONObject f10618g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo13323a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract JSONObject mo13324b();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract JSONObject mo13326d();

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: g */
    public String mo13105g() {
        return "performance_monitor";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public JSONObject mo13327e() {
        return new JSONObject();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public JSONObject mo13325c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", C3331c.m13887a().mo13566b());
            jSONObject.put("process_name", C3318a.m13828f());
            jSONObject.put("is_main_process", C3318a.m13827e());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: i */
    public JSONObject mo13107i() {
        try {
            if (this.f10618g == null) {
                this.f10618g = mo13327e();
            }
            this.f10618g.put("log_type", "performance_monitor");
            this.f10618g.put("service", mo13323a());
            JSONObject b = mo13324b();
            if (!C3355e.m13956a(b)) {
                this.f10618g.put("extra_values", b);
            }
            JSONObject c = mo13325c();
            if (!C3355e.m13956a(c)) {
                this.f10618g.put("extra_status", c);
            }
            JSONObject d = mo13326d();
            if (!C3355e.m13956a(d)) {
                this.f10618g.put("filters", d);
            }
            return this.f10618g;
        } catch (JSONException unused) {
            return null;
        }
    }
}
