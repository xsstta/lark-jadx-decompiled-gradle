package com.larksuite.component.openplatform.core.plugin.device;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IActivityLife;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.g */
public class C24835g extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setKeepScreenOn";
    }

    public C24835g() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            final boolean optBoolean = new JSONObject(this.mArgs).optBoolean("keepScreenOn");
            final IActivityLife activityLife = C67432a.m262319a(getAppContext()).getActivityLife();
            if (activityLife != null) {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.device.C24835g.RunnableC248361 */

                    public void run() {
                        AppBrandLogger.m52830i("ApisetKeepScreenOnCtrl", "setKeepScreenOn: " + optBoolean);
                        activityLife.setKeepScreenOn(optBoolean);
                    }
                });
                callbackOk();
                return;
            }
            AppBrandLogger.m52829e("ApisetKeepScreenOnCtrl", "activityLife is null");
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("iActivityLife"));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("ApisetKeepScreenOnCtrl", e.getMessage(), e);
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateThrowableExtraInfo(e));
        }
    }

    public C24835g(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
