package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class j0 implements m0 {

    /* renamed from: a */
    public Context f58232a = AbstractC23596b.m85619f();

    /* renamed from: b */
    public String f58233b;

    /* renamed from: c */
    public JSONObject f58234c;

    /* renamed from: d */
    public String f58235d;

    /* renamed from: e */
    public String f58236e;

    /* renamed from: f */
    public String f58237f;

    /* renamed from: g */
    public String f58238g;

    /* renamed from: h */
    public Boolean f58239h;

    public j0(String str, JSONObject jSONObject, String str2, String str3, long j) {
        this.f58233b = str;
        this.f58234c = jSONObject;
        this.f58235d = str2;
        this.f58236e = str3;
        this.f58237f = String.valueOf(j);
        if (AbstractC23594a.m85601i(str2, "oper")) {
            f0 a = e0.m85682a().mo82991a(str2, j);
            this.f58238g = a.mo82995a();
            this.f58239h = Boolean.valueOf(a.mo82997b());
        }
    }

    public void run() {
        JSONArray jSONArray;
        C23625y.m85977c("hmsSdk", "Begin to run EventRecordTask...");
        int e = AbstractC23596b.m85618e();
        int k = AbstractC23598c.m85641k(this.f58235d, this.f58236e);
        if (p0.m85879a(this.f58232a, "stat_v2_1", e * 1048576)) {
            C23625y.m85977c("hmsSdk", "stat sp file reach max limited size, discard new event");
            h0.m85735a().mo83012a("", "alltype");
            return;
        }
        C23615q qVar = new C23615q();
        qVar.mo83144b(this.f58233b);
        qVar.mo83141a(this.f58234c.toString());
        qVar.mo83148d(this.f58236e);
        qVar.mo83146c(this.f58237f);
        qVar.mo83150f(this.f58238g);
        Boolean bool = this.f58239h;
        qVar.mo83149e(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject d = qVar.mo83147d();
            String a = s0.m85914a(this.f58235d, this.f58236e);
            String a2 = g0.m85719a(this.f58232a, "stat_v2_1", a, "");
            try {
                jSONArray = !TextUtils.isEmpty(a2) ? new JSONArray(a2) : new JSONArray();
            } catch (JSONException unused) {
                C23625y.m85979d("hmsSdk", "Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(d);
            g0.m85724b(this.f58232a, "stat_v2_1", a, jSONArray.toString());
            if (jSONArray.toString().length() > k * 1024) {
                h0.m85735a().mo83012a(this.f58235d, this.f58236e);
            }
        } catch (JSONException unused2) {
            C23625y.m85981e("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
