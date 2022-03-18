package com.larksuite.component.openplatform.core.plugin.router;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.router.d */
public class C25474d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "navigateToMiniProgram";
    }

    public C25474d() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean z;
        try {
            String optString = new JSONObject(this.mArgs).optString("appId");
            AppBrandLogger.m52830i("navigateToMiniProgram", "navigateToMiniProgram , appId = " + optString);
            if (TextUtils.isEmpty(optString)) {
                callbackDefaultMsg(false);
                return;
            }
            try {
                CrossProcessDataEntity.C67574a a = CrossProcessDataEntity.C67574a.m263013a();
                CrossProcessDataEntity a2 = C67560a.m262955a("lark_navigate_to_app", a.mo234760a("app_url", (Object) ("sslocal://microapp?app_id=" + optString)).mo234763b());
                if (a2 == null) {
                    callbackDefaultMsg(false);
                } else {
                    callbackDefaultMsg(true);
                }
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("navigateToMiniProgram , result = ");
                if (a2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                objArr[0] = sb.toString();
                AppBrandLogger.m52830i("navigateToMiniProgram", objArr);
            } catch (Exception e) {
                AppBrandLogger.m52830i("navigateToMiniProgram", "navigateToMiniProgram , exec error by " + e.getMessage());
                callbackDefaultMsg(false);
            }
        } catch (JSONException e2) {
            AppBrandLogger.m52830i("navigateToMiniProgram", "navigateToMiniProgram , execute error by " + e2.getMessage());
            callbackDefaultMsg(false);
        }
    }

    public C25474d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
