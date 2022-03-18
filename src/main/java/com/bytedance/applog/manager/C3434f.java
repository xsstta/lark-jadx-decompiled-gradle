package com.bytedance.applog.manager;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.util.C3461j;
import com.bytedance.applog.util.C3469r;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.f */
public class C3434f extends AbstractC3431c {

    /* renamed from: e */
    private final Context f10911e;

    /* renamed from: f */
    private final C3435g f10912f;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("sdk_version", 50301453);
        jSONObject.put("sdk_version_code", C3469r.f10991b);
        jSONObject.put("sdk_version_name", "5.3.1-rc.4.3-bugfix");
        jSONObject.put("channel", this.f10912f.mo13836o());
        jSONObject.put("not_request_sender", this.f10912f.mo13795G() ? 1 : 0);
        C3436h.m14500a(jSONObject, "aid", this.f10912f.mo13835n());
        C3436h.m14500a(jSONObject, "release_build", this.f10912f.mo13794F());
        C3436h.m14500a(jSONObject, "user_agent", this.f10912f.mo13796H());
        C3436h.m14500a(jSONObject, "ab_sdk_version", this.f10912f.mo13841t());
        String p = this.f10912f.mo13837p();
        if (TextUtils.isEmpty(p)) {
            p = C3461j.m14620a(this.f10911e, this.f10912f);
        }
        C3436h.m14500a(jSONObject, "google_aid", p);
        String q = this.f10912f.mo13838q();
        if (TextUtils.isEmpty(q)) {
            q = this.f10912f.mo13797I();
        }
        C3436h.m14500a(jSONObject, "app_language", q);
        String r = this.f10912f.mo13839r();
        if (TextUtils.isEmpty(r)) {
            r = this.f10912f.mo13798J();
        }
        C3436h.m14500a(jSONObject, "app_region", r);
        String E = this.f10912f.mo13793E();
        if (!TextUtils.isEmpty(E)) {
            try {
                jSONObject.put("app_track", new JSONObject(E));
            } catch (Throwable th) {
                C3469r.m14667a(th);
            }
        }
        String s = this.f10912f.mo13840s();
        if (s != null && s.length() > 0) {
            try {
                JSONObject jSONObject2 = new JSONObject(s);
                jSONObject2.remove("_debug_flag");
                jSONObject.put("custom", jSONObject2);
            } catch (Throwable th2) {
                C3469r.m14667a(th2);
            }
        }
        C3436h.m14500a(jSONObject, "user_unique_id", this.f10912f.mo13842u());
        return true;
    }

    C3434f(Context context, C3435g gVar) {
        super(false, false);
        this.f10911e = context;
        this.f10912f = gVar;
    }
}
