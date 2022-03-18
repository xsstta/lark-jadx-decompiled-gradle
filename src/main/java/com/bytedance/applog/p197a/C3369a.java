package com.bytedance.applog.p197a;

import com.bytedance.applog.manager.C3435g;
import com.bytedance.applog.manager.C3436h;
import com.bytedance.applog.p200d.C3396a;
import com.bytedance.applog.p200d.C3398b;
import com.bytedance.applog.util.C3452b;
import com.bytedance.applog.util.C3469r;
import com.bytedance.applog.util.C3470s;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.a.a */
public class C3369a extends AbstractC3371c {
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
        return "abconfiger";
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
        long w = this.f10672a.mo13614h().mo13844w();
        if (w < 600000) {
            return 600000;
        }
        return w;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: d */
    public boolean mo13593d() throws JSONException {
        C3435g h = this.f10672a.mo13614h();
        C3436h d = this.f10672a.mo13610d();
        JSONObject b = d.mo13857b();
        if (d.mo13873n() == 0 || b == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", d.mo13857b());
        jSONObject.put("magic_tag", "ss_app_log");
        jSONObject.put("_gen_time", currentTimeMillis);
        JSONObject d2 = C3396a.m14187d(C3396a.m14178a(C3398b.m14189a(this.f10672a.mo13607b(), d.mo13857b(), new StringBuilder(this.f10672a.mo13612f().mo13778f()), true), C3396a.f10763c), jSONObject);
        if (d2 == null) {
            return false;
        }
        boolean z = !C3470s.m14679a(h.mo13845x(), d2);
        if (C3469r.f10990a) {
            C3469r.m14666a("getAbConfig " + d2, (Throwable) null);
        } else {
            C3469r.m14666a("getAbConfig " + z, (Throwable) null);
        }
        d.mo13853a(d2);
        C3452b.m14578a().mo13633b(z, d2);
        return true;
    }

    C3369a(C3373e eVar) {
        super(eVar);
    }
}
