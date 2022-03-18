package com.bytedance.apm.p124a.p126b;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p150l.C3023c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b.d */
public class C2751d implements AbstractC2747b {

    /* renamed from: a */
    private String f8839a;

    /* renamed from: b */
    private JSONObject f8840b;

    /* renamed from: c */
    private boolean f8841c;

    /* renamed from: d */
    private long f8842d;

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: d */
    public boolean mo11811d() {
        return true;
    }

    /* renamed from: e */
    public void mo11815e() {
        this.f8841c = true;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: b */
    public String mo11809b() {
        return this.f8839a;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: c */
    public String mo11810c() {
        return this.f8839a;
    }

    /* renamed from: f */
    public long mo11816f() {
        return this.f8842d;
    }

    public String toString() {
        return "ExceptionLogData{eventType='" + this.f8839a + '\'' + ", logJson=" + this.f8840b + ", forceSampled=" + this.f8841c + ", time=" + this.f8842d + '}';
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public JSONObject mo11807a() {
        JSONObject jSONObject = this.f8840b;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put("timestamp", this.f8842d);
            this.f8840b.put("crash_time", this.f8842d);
            this.f8840b.put("is_main_process", C2785b.m11761e());
            this.f8840b.put("process_name", C2785b.m11756d());
            this.f8840b.put("log_type", this.f8839a);
            if (C2785b.m11778s() > C2785b.m11767h() || C2785b.m11778s() == 0) {
                this.f8840b.put("app_launch_start_time", C2785b.m11767h());
            } else {
                this.f8840b.put("app_launch_start_time", C2785b.m11778s());
            }
        } catch (JSONException unused) {
        }
        return this.f8840b;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public boolean mo11808a(JSONObject jSONObject) {
        if (this.f8841c || C3023c.m12697e(this.f8839a)) {
            return true;
        }
        return false;
    }

    public C2751d(String str, JSONObject jSONObject) {
        this(str, jSONObject, System.currentTimeMillis());
    }

    public C2751d(String str, JSONObject jSONObject, long j) {
        this.f8839a = str;
        this.f8840b = jSONObject;
        this.f8842d = j;
    }
}
