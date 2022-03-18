package com.bytedance.apm.p124a.p126b;

import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p150l.C3023c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b.g */
public class C2754g implements AbstractC2747b {

    /* renamed from: a */
    public String f8853a;

    /* renamed from: b */
    public String f8854b;

    /* renamed from: c */
    public JSONObject f8855c;

    /* renamed from: d */
    public JSONObject f8856d;

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: b */
    public String mo11809b() {
        return "ui_action";
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: c */
    public String mo11810c() {
        return "ui_action";
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: d */
    public boolean mo11811d() {
        return true;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public JSONObject mo11807a() {
        try {
            if (this.f8856d == null) {
                this.f8856d = new JSONObject();
            }
            this.f8856d.put("log_type", "ui_action");
            this.f8856d.put("action", this.f8853a);
            this.f8856d.put("page", this.f8854b);
            this.f8856d.put("context", this.f8855c);
            return this.f8856d;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public boolean mo11808a(JSONObject jSONObject) {
        return C3023c.m12696d("ui");
    }

    public C2754g(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f8853a = str;
        this.f8854b = str2;
        this.f8855c = jSONObject;
        this.f8856d = jSONObject2;
    }
}
