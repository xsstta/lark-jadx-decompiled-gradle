package com.bytedance.applog.p197a;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.applog.C3368a;
import com.bytedance.applog.manager.C3435g;
import com.bytedance.applog.manager.C3436h;
import com.bytedance.applog.p200d.C3396a;
import com.bytedance.applog.p200d.C3398b;
import com.bytedance.applog.util.C3451a;
import com.bytedance.applog.util.C3469r;
import com.bytedance.applog.util.C3470s;
import com.bytedance.dr.AbstractC4018m;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.a.g */
public class C3376g extends AbstractC3371c {

    /* renamed from: b */
    static final long[] f10707b = {60000, 60000, 60000, 120000, 120000, 180000, 180000, 360000, 360000, 540000, 540000};

    /* renamed from: c */
    static final long[] f10708c = {180000, 180000, 360000, 360000, 540000, 540000, 720000, 720000};

    /* renamed from: d */
    private static final long[] f10709d = {10000, 10000, 20000, 20000, 60000, 60000, 120000, 120000, 180000, 180000, 360000, 360000, 540000, 540000};

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
        return "register";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: b */
    public long mo13591b() {
        if (this.f10672a.mo13600a().mo13625c()) {
            return 21600000;
        }
        return 43200000;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: c */
    public long[] mo13592c() {
        int n = this.f10672a.mo13610d().mo13873n();
        if (n == 0) {
            return f10709d;
        }
        if (n == 1) {
            return f10708c;
        }
        if (n == 2) {
            return f10707b;
        }
        C3469r.m14667a((Throwable) null);
        return f10708c;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: d */
    public boolean mo13593d() throws JSONException {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        C3436h d = this.f10672a.mo13610d();
        C3435g h = this.f10672a.mo13614h();
        AbstractC4018m S = this.f10672a.mo13614h().mo13807S();
        JSONObject b = d.mo13857b();
        if (b != null) {
            Map<String, Object> e = h.mo13816b().mo13750e();
            if ((!h.mo13816b().mo13759n() || !C3368a.m14045h()) && e == null && S == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                JSONObject jSONObject2 = new JSONObject();
                C3470s.m14681b(jSONObject2, b);
                b = jSONObject2;
            }
            if (h.mo13816b().mo13759n() && C3368a.m14045h()) {
                C3451a.m14577a(b, this.f10672a.mo13607b(), d);
            }
            if (S != null) {
                m14112a(this.f10672a.mo13607b(), S, b);
            }
            if (e != null) {
                for (Map.Entry<String, Object> entry : e.entrySet()) {
                    if (entry.getValue() != null) {
                        b.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            jSONObject.put("header", b);
            jSONObject.put("magic_tag", "ss_app_log");
            jSONObject.put("_gen_time", System.currentTimeMillis());
            JSONObject a = C3396a.m14180a(C3398b.m14189a(this.f10672a.mo13607b(), d.mo13857b(), new StringBuilder(this.f10672a.mo13612f().mo13773a()), true), jSONObject);
            if (a != null) {
                return d.mo13855a(a, a.optString("device_id", ""), a.optString("install_id", ""), a.optString("ssid", ""), a.optString("bd_did", ""), a.optString("cd", ""));
            }
        } else {
            C3469r.m14667a((Throwable) null);
        }
        return false;
    }

    C3376g(C3373e eVar) {
        super(eVar, eVar.mo13610d().mo13874o());
    }

    /* renamed from: a */
    private void m14112a(Context context, AbstractC4018m mVar, JSONObject jSONObject) throws JSONException {
        boolean z;
        if (context != null && mVar != null && jSONObject != null) {
            jSONObject.put("pre_installed_channel", mVar.mo15755a(context));
            try {
                int i = 0;
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    jSONObject.put("apk_first_install_time", packageInfo.firstInstallTime);
                    if ((packageInfo.applicationInfo.flags & 1) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = 1;
                    }
                    jSONObject.put("is_system_app", i);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
