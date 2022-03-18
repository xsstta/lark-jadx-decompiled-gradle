package com.bytedance.apm.p124a.p126b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p124a.AbstractC2747b;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b.a */
public class C2748a implements AbstractC2747b {

    /* renamed from: a */
    public String f8821a;

    /* renamed from: b */
    public long f8822b;

    /* renamed from: c */
    public long f8823c;

    /* renamed from: d */
    public String f8824d;

    /* renamed from: e */
    public String f8825e;

    /* renamed from: f */
    public String f8826f;

    /* renamed from: g */
    public int f8827g;

    /* renamed from: h */
    public JSONObject f8828h;

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public boolean mo11808a(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: b */
    public String mo11809b() {
        return null;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: c */
    public String mo11810c() {
        return null;
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: d */
    public boolean mo11811d() {
        return true;
    }

    /* renamed from: e */
    public void mo11814e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trace_base", C2785b.m11778s());
            this.f8828h.put("relate_start_trace", jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.apm.p124a.AbstractC2747b
    /* renamed from: a */
    public JSONObject mo11807a() {
        if (TextUtils.isEmpty(this.f8821a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.f8821a);
            jSONObject.put("duration", this.f8822b);
            jSONObject.put("uri", Uri.parse(this.f8824d));
            long j = this.f8823c;
            if (j > 0) {
                jSONObject.put("timestamp", j);
            }
            jSONObject.put(UpdateKey.STATUS, this.f8827g);
            if (!TextUtils.isEmpty(this.f8825e)) {
                jSONObject.put("ip", this.f8825e);
            }
            if (!TextUtils.isEmpty(this.f8826f)) {
                jSONObject.put("trace_code", this.f8826f);
            } else {
                jSONObject.put("trace_code", "");
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo11812a(String str) throws JSONException {
        if (this.f8828h.isNull("net_consume_type")) {
            this.f8828h.put("net_consume_type", str);
        }
    }

    /* renamed from: a */
    public void mo11813a(boolean z) throws JSONException {
        if (this.f8828h.isNull("front")) {
            this.f8828h.put("front", z ? 1 : 0);
        }
    }

    public C2748a(String str, long j, long j2, String str2, String str3, String str4, int i, JSONObject jSONObject) {
        this.f8821a = str;
        this.f8822b = j;
        this.f8823c = j2;
        this.f8824d = str2;
        this.f8825e = str3;
        this.f8826f = str4;
        this.f8827g = i;
        if (jSONObject == null) {
            this.f8828h = new JSONObject();
        } else {
            this.f8828h = jSONObject;
        }
    }
}
