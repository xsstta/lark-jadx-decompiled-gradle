package com.bytedance.apm.p124a.p126b;

import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p150l.C3023c;
import com.bytedance.apm.util.C3121h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b.f */
public class C2753f implements AbstractC2747b {

    /* renamed from: a */
    public String f8846a;

    /* renamed from: b */
    public String f8847b;

    /* renamed from: c */
    public boolean f8848c;

    /* renamed from: d */
    public JSONObject f8849d;

    /* renamed from: e */
    public JSONObject f8850e;

    /* renamed from: f */
    public JSONObject f8851f;

    /* renamed from: g */
    public JSONObject f8852g;

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: b */
    public String mo11809b() {
        return "performance_monitor";
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: d */
    public boolean mo11811d() {
        return true;
    }

    public C2753f() {
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: c */
    public String mo11810c() {
        return this.f8846a;
    }

    /* renamed from: e */
    public boolean mo11823e() {
        return TextUtils.equals(this.f8846a, "memory");
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public JSONObject mo11807a() {
        try {
            if (this.f8852g == null) {
                this.f8852g = new JSONObject();
            }
            this.f8852g.put("log_type", "performance_monitor");
            this.f8852g.put("service", this.f8846a);
            if (!C3121h.m13003c(this.f8849d)) {
                this.f8852g.put("extra_values", this.f8849d);
            }
            if (TextUtils.equals("start", this.f8846a) && TextUtils.equals("from", this.f8852g.optString("monitor-plugin"))) {
                if (this.f8850e == null) {
                    this.f8850e = new JSONObject();
                }
                this.f8850e.put("start_mode", C2785b.m11768i());
            }
            if (!C3121h.m13003c(this.f8850e)) {
                this.f8852g.put("extra_status", this.f8850e);
            }
            if (!C3121h.m13003c(this.f8851f)) {
                this.f8852g.put("filters", this.f8851f);
            }
            return this.f8852g;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C2753f mo11818a(String str) {
        this.f8846a = str;
        return this;
    }

    /* renamed from: b */
    public C2753f mo11819b(JSONObject jSONObject) {
        this.f8849d = jSONObject;
        return this;
    }

    /* renamed from: c */
    public C2753f mo11820c(JSONObject jSONObject) {
        this.f8850e = jSONObject;
        return this;
    }

    /* renamed from: d */
    public C2753f mo11821d(JSONObject jSONObject) {
        this.f8851f = jSONObject;
        return this;
    }

    /* renamed from: e */
    public C2753f mo11822e(JSONObject jSONObject) {
        this.f8852g = jSONObject;
        return this;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public boolean mo11808a(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject;
        if ("fps".equals(this.f8846a) || "fps_drop".equals(this.f8846a)) {
            z = C3023c.m12693a(this.f8846a, this.f8847b);
        } else if ("temperature".equals(this.f8846a)) {
            z = C3023c.m12697e(this.f8846a);
        } else {
            if (!"battery".equals(this.f8846a)) {
                if ("start".equals(this.f8846a)) {
                    if (!C3023c.m12696d(this.f8846a) && !C3023c.m12695c(this.f8847b)) {
                        z = false;
                    }
                } else if ("start_trace".equals(this.f8846a)) {
                    if (jSONObject != null) {
                        if (!C3023c.m12697e("enable_perf_data_collect")) {
                            jSONObject.remove("perf_data");
                        }
                        if (!C3023c.m12696d(this.f8846a) && (optJSONObject = jSONObject.optJSONObject("trace")) != null) {
                            optJSONObject.remove("spans");
                        }
                    }
                    z = C3023c.m12696d(this.f8846a);
                } else {
                    z = C3023c.m12696d(this.f8846a);
                }
            }
            z = true;
        }
        if (this.f8848c || z) {
            return true;
        }
        return false;
    }

    public C2753f(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this(str, "", false, jSONObject, jSONObject2, jSONObject3);
    }

    public C2753f(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this(str, str2, false, jSONObject, jSONObject2, jSONObject3);
    }

    public C2753f(String str, String str2, boolean z, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f8846a = str;
        this.f8847b = str2;
        this.f8848c = z;
        this.f8849d = jSONObject;
        this.f8850e = jSONObject2;
        this.f8852g = jSONObject3;
    }
}
