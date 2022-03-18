package com.bytedance.apm6.p157a.p159b;

import android.text.TextUtils;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p183g.AbstractC3326b;
import com.bytedance.apm6.util.p195b.C3350b;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.a.b.c */
public final class C3156c implements AbstractC3326b {

    /* renamed from: a */
    private String f10107a;

    /* renamed from: b */
    private JSONObject f10108b;

    /* renamed from: a */
    public JSONObject mo13111a() {
        return this.f10108b;
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: g */
    public String mo13105g() {
        return this.f10107a;
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: h */
    public boolean mo13106h() {
        return !TextUtils.isEmpty(this.f10107a);
    }

    public String toString() {
        return "Apm5LegacyEvent{logType='" + this.f10107a + '\'' + '}';
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: i */
    public JSONObject mo13107i() {
        try {
            JSONObject a = mo13111a();
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

    public C3156c(String str, JSONObject jSONObject) {
        this.f10107a = str;
        this.f10108b = jSONObject;
    }
}
