package com.ss.android.ttve.monitor;

import com.bytedance.ies.common.IESAppLogger;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.vesdk.C63929ab;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.a */
public class C60215a {
    /* renamed from: a */
    public static void m234037a(String str, final C60217b.AbstractC60218a aVar, boolean z) {
        IESAppLogger.sharedInstance().setAppLogCallback(str, new IESAppLogger.AbstractC14428a() {
            /* class com.ss.android.ttve.monitor.C60215a.C602161 */

            @Override // com.bytedance.ies.common.IESAppLogger.AbstractC14428a
            /* renamed from: a */
            public void mo52922a(String str, JSONObject jSONObject, String str2) {
                C60217b.AbstractC60218a aVar = aVar;
                if (aVar != null) {
                    aVar.mo205706a(str, jSONObject, null, null, str2);
                }
            }
        }, z);
    }

    /* renamed from: a */
    public static void m234038a(String str, JSONObject jSONObject, String str2, boolean z) {
        IESAppLogger.sharedInstance().appLogOnEvent(str, jSONObject, str2, z);
        try {
            jSONObject.put("ApiName", str);
            jSONObject.put("ApiParam", jSONObject.toString());
            jSONObject.put("ApiResult", jSONObject.opt("resultCode"));
            IESAppLogger.sharedInstance().appLogOnEvent("vesdk_api", jSONObject, "behavior", z);
        } catch (JSONException e) {
            C63929ab.m250971a(C60215a.class, "JSON error", e);
        }
    }
}
