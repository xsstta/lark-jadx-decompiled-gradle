package com.bytedance.applog.manager;

import android.content.Context;
import android.telephony.TelephonyManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.manager.i */
public class C3437i extends AbstractC3431c {

    /* renamed from: e */
    private final Context f10936e;

    /* renamed from: f */
    private final C3436h f10937f;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException, SecurityException {
        TelephonyManager telephonyManager = (TelephonyManager) this.f10936e.getSystemService("phone");
        if (telephonyManager != null) {
            C3436h.m14500a(jSONObject, "carrier", telephonyManager.getNetworkOperatorName());
            C3436h.m14500a(jSONObject, "mcc_mnc", telephonyManager.getNetworkOperator());
        }
        C3436h.m14500a(jSONObject, "clientudid", this.f10937f.mo13848a().mo13899a());
        C3436h.m14500a(jSONObject, "openudid", this.f10937f.mo13848a().mo13900a(true));
        if (DeviceRegisterParameterFactory.isNewUserMode(this.f10936e)) {
            jSONObject.remove("google_aid");
        }
        return true;
    }

    public C3437i(Context context, C3436h hVar) {
        super(false, false);
        this.f10936e = context;
        this.f10937f = hVar;
    }
}
