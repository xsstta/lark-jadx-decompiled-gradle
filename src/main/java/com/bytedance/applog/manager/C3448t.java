package com.bytedance.applog.manager;

import android.content.Context;
import android.telephony.TelephonyManager;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.t */
public class C3448t extends AbstractC3431c {

    /* renamed from: e */
    private final Context f10952e;

    C3448t(Context context) {
        super(true, false);
        this.f10952e = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException {
        C3436h.m14500a(jSONObject, "sim_region", ((TelephonyManager) this.f10952e.getSystemService("phone")).getSimCountryIso());
        return true;
    }
}
