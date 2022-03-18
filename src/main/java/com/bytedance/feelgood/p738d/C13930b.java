package com.bytedance.feelgood.p738d;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.bytedance.feelgood.d.b */
public final class C13930b {

    /* renamed from: a */
    public int f36409a;

    /* renamed from: b */
    public String f36410b;

    /* renamed from: c */
    public JSONObject f36411c;

    private C13930b() {
    }

    /* renamed from: a */
    public static C13930b m56381a() {
        return new C13930b();
    }

    /* renamed from: b */
    public String mo51281b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.f36409a);
            jSONObject.put("__callback_id", this.f36410b);
            jSONObject.put("__params", this.f36411c);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C13930b mo51279a(String str) {
        this.f36410b = str;
        return this;
    }

    /* renamed from: a */
    public C13930b mo51280a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (this.f36411c == null) {
                this.f36411c = new JSONObject();
            }
            try {
                this.f36411c.putOpt(str, obj);
            } catch (Throwable unused) {
            }
        }
        return this;
    }
}
