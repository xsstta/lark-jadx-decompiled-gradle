package com.bytedance.apm6.p157a.p159b;

import android.text.TextUtils;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p183g.AbstractC3326b;
import com.bytedance.apm6.util.p195b.C3350b;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.a.b.b */
public final class C3155b implements AbstractC3326b {

    /* renamed from: a */
    private String f10105a;

    /* renamed from: b */
    private JSONObject f10106b;

    /* renamed from: a */
    public JSONObject mo13109a() {
        return this.f10106b;
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: g */
    public String mo13105g() {
        return this.f10105a;
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: h */
    public boolean mo13106h() {
        return !TextUtils.isEmpty(this.f10105a);
    }

    public String toString() {
        return "CommonLog{logType='" + this.f10105a + '\'' + '}';
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: i */
    public JSONObject mo13107i() {
        try {
            JSONObject a = mo13109a();
            if (a == null) {
                a = new JSONObject();
            }
            a.put("log_type", mo13105g());
            return a;
        } catch (Exception e) {
            if (!C3318a.m13915u()) {
                return null;
            }
            C3350b.m13933a("APM-CommonEvent", "toJsonObject Error.", e);
            return null;
        }
    }

    public C3155b(String str, JSONObject jSONObject) {
        this.f10105a = str;
        this.f10106b = jSONObject;
    }
}
