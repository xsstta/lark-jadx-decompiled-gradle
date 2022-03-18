package com.bytedance.apm.p124a.p126b;

import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p150l.C3023c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b.b */
public class C2749b implements AbstractC2747b {

    /* renamed from: a */
    public String f8829a;

    /* renamed from: b */
    public JSONObject f8830b;

    /* renamed from: c */
    public boolean f8831c;

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: b */
    public String mo11809b() {
        return "common_log";
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: d */
    public boolean mo11811d() {
        return true;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: c */
    public String mo11810c() {
        return this.f8829a;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public JSONObject mo11807a() {
        JSONObject jSONObject = this.f8830b;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put("log_type", this.f8829a);
        } catch (JSONException unused) {
        }
        return this.f8830b;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public boolean mo11808a(JSONObject jSONObject) {
        return C3023c.m12692a(this.f8829a);
    }

    public C2749b(String str, JSONObject jSONObject, boolean z) {
        this.f8829a = str;
        this.f8830b = jSONObject;
        this.f8831c = z;
    }
}
