package com.bytedance.apm.p124a.p126b;

import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p150l.C3023c;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b.c */
public class C2750c implements AbstractC2747b {

    /* renamed from: a */
    public String f8832a;

    /* renamed from: b */
    public int f8833b;

    /* renamed from: c */
    public JSONObject f8834c;

    /* renamed from: d */
    public JSONObject f8835d;

    /* renamed from: e */
    public JSONObject f8836e;

    /* renamed from: f */
    public JSONObject f8837f;

    /* renamed from: g */
    public boolean f8838g;

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: b */
    public String mo11809b() {
        return "service_monitor";
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: c */
    public String mo11810c() {
        return "service_monitor";
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: d */
    public boolean mo11811d() {
        return true;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public JSONObject mo11807a() {
        if (this.f8837f == null) {
            this.f8837f = new JSONObject();
        }
        try {
            this.f8837f.put("log_type", "service_monitor");
            this.f8837f.put("service", this.f8832a);
            this.f8837f.put(UpdateKey.STATUS, this.f8833b);
            JSONObject jSONObject = this.f8834c;
            if (jSONObject != null) {
                this.f8837f.put("value", jSONObject);
            }
            JSONObject jSONObject2 = this.f8835d;
            if (jSONObject2 != null) {
                this.f8837f.put("category", jSONObject2);
            }
            JSONObject jSONObject3 = this.f8836e;
            if (jSONObject3 != null) {
                this.f8837f.put("metric", jSONObject3);
            }
            return this.f8837f;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public boolean mo11808a(JSONObject jSONObject) {
        return C3023c.m12694b(this.f8832a);
    }

    public C2750c(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f8832a = str;
        this.f8833b = i;
        this.f8834c = jSONObject;
        this.f8835d = jSONObject2;
        this.f8836e = jSONObject3;
        this.f8837f = jSONObject4;
    }

    public C2750c(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        this.f8832a = str;
        this.f8833b = i;
        this.f8834c = jSONObject;
        this.f8835d = jSONObject2;
        this.f8836e = jSONObject3;
        this.f8837f = jSONObject4;
        this.f8838g = z;
    }
}
