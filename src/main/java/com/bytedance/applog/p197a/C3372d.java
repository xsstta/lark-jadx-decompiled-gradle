package com.bytedance.applog.p197a;

import com.bytedance.applog.C3368a;
import com.bytedance.applog.manager.C3435g;
import com.bytedance.applog.manager.C3436h;
import com.bytedance.applog.p198b.AbstractC3384a;
import com.bytedance.applog.p200d.C3396a;
import com.bytedance.applog.p200d.C3398b;
import com.bytedance.applog.util.C3452b;
import com.bytedance.applog.util.C3458g;
import com.bytedance.applog.util.C3470s;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.a.d */
public class C3372d extends AbstractC3371c {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: a */
    public boolean mo13590a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: e */
    public String mo13594e() {
        return "configer";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: c */
    public long[] mo13592c() {
        return C3376g.f10708c;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: b */
    public long mo13591b() {
        return this.f10672a.mo13614h().mo13808T();
    }

    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: d */
    public boolean mo13593d() throws JSONException {
        boolean z;
        String[] a;
        C3436h d = this.f10672a.mo13610d();
        JSONObject b = d.mo13857b();
        if (!(d.mo13873n() == 0 || b == null)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("magic_tag", "ss_app_log");
            jSONObject.put("header", b);
            jSONObject.put("_gen_time", System.currentTimeMillis());
            if (this.f10672a.mo13614h().mo13816b().mo13734N()) {
                jSONObject.put("event_filter", 1);
            }
            if (C3368a.m14043f() && (a = C3458g.m14606a()) != null) {
                jSONObject.put("key", a[0]);
                jSONObject.put("iv", a[1]);
            }
            JSONObject c = C3396a.m14186c(C3396a.m14178a(C3398b.m14189a(this.f10672a.mo13607b(), d.mo13857b(), new StringBuilder(this.f10672a.mo13612f().mo13777e()), true), C3396a.f10763c), jSONObject);
            C3435g h = this.f10672a.mo13614h();
            C3452b.m14578a().mo13632a(!C3470s.m14679a(c, h.mo13833l()), c);
            if (c != null) {
                int optInt = c.optInt("forbid_report_phone_detail_info", -1);
                if (optInt >= 0) {
                    if (optInt > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C3368a.m14037b(z);
                }
                h.mo13813a(c);
                d.mo13854a(h.mo13831j().getBoolean("forbid_report_phone_detail_info", false));
                this.f10672a.mo13613g();
                if (this.f10672a.mo13614h().mo13816b().mo13734N()) {
                    this.f10672a.mo13601a(AbstractC3384a.m14148a(this.f10672a.mo13607b(), c));
                }
                return true;
            }
        }
        return false;
    }

    C3372d(C3373e eVar) {
        super(eVar, eVar.mo13614h().mo13834m());
    }
}
