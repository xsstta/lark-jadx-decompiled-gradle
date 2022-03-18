package com.bytedance.applog.manager;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.r */
public class C3446r extends AbstractC3431c {

    /* renamed from: e */
    private final C3435g f10949e;

    /* renamed from: f */
    private final C3436h f10950f;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException {
        SharedPreferences j = this.f10949e.mo13831j();
        String b = this.f10950f.mo13848a().mo13905b();
        C3436h.m14500a(jSONObject, "device_id", b);
        String string = j.getString("install_id", null);
        String string2 = j.getString("ssid", null);
        C3436h.m14500a(jSONObject, "install_id", string);
        C3436h.m14500a(jSONObject, "ssid", string2);
        long j2 = 0;
        long j3 = j.getLong("register_time", 0);
        if ((!C3436h.m14505d(string) || (!C3436h.m14505d(b) && !C3436h.m14505d(null))) && j3 != 0) {
            j.edit().putLong("register_time", 0).apply();
        } else {
            j2 = j3;
        }
        jSONObject.put("register_time", j2);
        return true;
    }

    C3446r(C3435g gVar, C3436h hVar) {
        super(true, false, false);
        this.f10949e = gVar;
        this.f10950f = hVar;
    }
}
