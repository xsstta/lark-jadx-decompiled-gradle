package com.bytedance.applog.manager;

import android.content.Context;
import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.d */
public class C3432d extends AbstractC3431c {

    /* renamed from: e */
    private final Context f10909e;

    C3432d(Context context) {
        super(true, false);
        this.f10909e = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("os", "Android");
        jSONObject.put("os_version", Build.VERSION.RELEASE);
        jSONObject.put("os_api", Build.VERSION.SDK_INT);
        jSONObject.put("device_model", Build.MODEL);
        jSONObject.put("device_brand", Build.BRAND);
        jSONObject.put("device_manufacturer", Build.MANUFACTURER);
        jSONObject.put("cpu_abi", Build.CPU_ABI);
        return true;
    }
}
