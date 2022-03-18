package com.larksuite.component.openplatform.core.plugin.inner;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapphost.p3369c.C67472a;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.o */
public class C25013o extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "callHostMethodSync";
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f168426a);
            String optString = jSONObject.optString("method");
            JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            if (!C66236a.m259224a(optString, mo232455f())) {
                return mo232451b("platform auth deny");
            }
            Activity currentActivity = mo232455f().getCurrentActivity();
            if (currentActivity == null) {
                return mo232451b("activity is null");
            }
            String a = C67472a.m262437a(mo232455f()).mo234218a(currentActivity, optString, optJSONObject);
            if (a != null) {
                return a;
            }
            return mo232451b("result is null");
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_SyncCallHostMethodCtrl", e);
            return mo232445a(e);
        }
    }

    public C25013o(String str) {
        super(str);
    }
}
