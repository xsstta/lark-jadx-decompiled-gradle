package com.bytedance.ee.larkbrand.hostbridge.p655a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67570a;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.f */
public abstract class AbstractC13088f implements AbstractC67570a {
    /* renamed from: a */
    public CrossProcessDataEntity mo49156a(JSONObject jSONObject) {
        int i;
        boolean z;
        Exception e;
        String str = "";
        try {
            z = jSONObject.optBoolean("success", false);
            try {
                i = jSONObject.optInt("errorCode", 0);
                try {
                    str = jSONObject.optString("errorMsg", str);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                i = 0;
                AppBrandLogger.m52829e("OfflineBaseHostDataHandler", "get response object error", e);
                AppBrandLogger.m52830i("OfflineBaseHostDataHandler", "success = " + z + " ,  errorCode = " + i + " , errorMsg = " + str);
                return new CrossProcessDataEntity.C67574a().mo234760a("success", (Object) Boolean.valueOf(z)).mo234760a("errorCode", (Object) Integer.valueOf(i)).mo234760a("errorMsg", (Object) str).mo234763b();
            }
        } catch (Exception e4) {
            e = e4;
            z = false;
            i = 0;
            AppBrandLogger.m52829e("OfflineBaseHostDataHandler", "get response object error", e);
            AppBrandLogger.m52830i("OfflineBaseHostDataHandler", "success = " + z + " ,  errorCode = " + i + " , errorMsg = " + str);
            return new CrossProcessDataEntity.C67574a().mo234760a("success", (Object) Boolean.valueOf(z)).mo234760a("errorCode", (Object) Integer.valueOf(i)).mo234760a("errorMsg", (Object) str).mo234763b();
        }
        AppBrandLogger.m52830i("OfflineBaseHostDataHandler", "success = " + z + " ,  errorCode = " + i + " , errorMsg = " + str);
        return new CrossProcessDataEntity.C67574a().mo234760a("success", (Object) Boolean.valueOf(z)).mo234760a("errorCode", (Object) Integer.valueOf(i)).mo234760a("errorMsg", (Object) str).mo234763b();
    }
}
