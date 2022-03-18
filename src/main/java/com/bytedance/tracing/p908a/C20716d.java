package com.bytedance.tracing.p908a;

import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p150l.C3023c;
import org.json.JSONObject;

/* renamed from: com.bytedance.tracing.a.d */
public class C20716d implements AbstractC2747b {

    /* renamed from: a */
    private final JSONObject f50684a;

    /* renamed from: b */
    private final String f50685b;

    /* renamed from: c */
    private final boolean f50686c;

    /* renamed from: d */
    private final String f50687d;

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: b */
    public String mo11809b() {
        return "tracing";
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: d */
    public boolean mo11811d() {
        return false;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public JSONObject mo11807a() {
        return this.f50684a;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: c */
    public String mo11810c() {
        return this.f50687d;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public boolean mo11808a(JSONObject jSONObject) {
        if ("app_launch_trace".equals(this.f50685b)) {
            return C3023c.m12696d("start_trace");
        }
        if (C20715c.m75506a().mo69951a(this.f50686c, this.f50685b) != 0) {
            return true;
        }
        return false;
    }

    public C20716d(JSONObject jSONObject, String str, boolean z, String str2) {
        this.f50684a = jSONObject;
        this.f50685b = str;
        this.f50686c = z;
        this.f50687d = str2;
    }
}
