package com.bytedance.apm6.p157a.p159b;

import android.text.TextUtils;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p183g.AbstractC3326b;
import com.bytedance.apm6.util.p195b.C3350b;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.a.b.a */
public final class C3154a implements AbstractC3326b {

    /* renamed from: a */
    private String f10099a;

    /* renamed from: b */
    private int f10100b;

    /* renamed from: c */
    private JSONObject f10101c;

    /* renamed from: d */
    private JSONObject f10102d;

    /* renamed from: e */
    private JSONObject f10103e;

    /* renamed from: f */
    private JSONObject f10104f;

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: g */
    public String mo13105g() {
        return "service_monitor";
    }

    /* renamed from: a */
    public String mo13099a() {
        return this.f10099a;
    }

    /* renamed from: b */
    public int mo13100b() {
        return this.f10100b;
    }

    /* renamed from: c */
    public JSONObject mo13101c() {
        return this.f10101c;
    }

    /* renamed from: d */
    public JSONObject mo13102d() {
        return this.f10102d;
    }

    /* renamed from: e */
    public JSONObject mo13103e() {
        return this.f10103e;
    }

    /* renamed from: f */
    public JSONObject mo13104f() {
        return this.f10104f;
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: h */
    public boolean mo13106h() {
        return !TextUtils.isEmpty(this.f10099a);
    }

    public String toString() {
        return "CommonEvent{serviceName='" + this.f10099a + '\'' + '}';
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: i */
    public JSONObject mo13107i() {
        try {
            JSONObject f = mo13104f();
            if (f == null) {
                f = new JSONObject();
            }
            f.put("log_type", "service_monitor");
            f.put("service", mo13099a());
            f.put(UpdateKey.STATUS, mo13100b());
            if (mo13101c() != null) {
                f.put("value", mo13101c());
            }
            if (mo13102d() != null) {
                f.put("category", mo13102d());
            }
            if (mo13103e() != null) {
                f.put("metric", mo13103e());
            }
            return f;
        } catch (Exception e) {
            if (!C3318a.m13915u()) {
                return null;
            }
            C3350b.m13933a("APM-CommonEvent", "toJsonObject Error.", e);
            return null;
        }
    }

    public C3154a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f10099a = str;
        this.f10100b = i;
        this.f10101c = jSONObject;
        this.f10102d = jSONObject2;
        this.f10103e = jSONObject3;
        this.f10104f = jSONObject4;
    }
}
