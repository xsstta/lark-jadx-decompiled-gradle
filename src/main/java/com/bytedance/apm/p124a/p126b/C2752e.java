package com.bytedance.apm.p124a.p126b;

import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p150l.C3023c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b.e */
public class C2752e implements AbstractC2747b {

    /* renamed from: a */
    public String f8843a;

    /* renamed from: b */
    public String f8844b;

    /* renamed from: c */
    public float f8845c;

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: b */
    public String mo11809b() {
        return "timer";
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: c */
    public String mo11810c() {
        return "timer";
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: d */
    public boolean mo11811d() {
        return false;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public JSONObject mo11807a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ShareHitPoint.f121869d, this.f8843a);
            jSONObject.put("key", this.f8844b);
            jSONObject.put("value", (double) this.f8845c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public boolean mo11808a(JSONObject jSONObject) {
        return C3023c.m12695c(this.f8843a);
    }

    public C2752e(String str, String str2, float f) {
        this.f8843a = str;
        this.f8844b = str2;
        this.f8845c = f;
    }
}
