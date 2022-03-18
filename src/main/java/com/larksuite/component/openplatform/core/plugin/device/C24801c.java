package com.larksuite.component.openplatform.core.plugin.device;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallbackHandler;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.process.p3320e.C66625a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67549i;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.c */
public class C24801c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "makePhoneCall";
    }

    public C24801c() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("tma_ApiMakePhoneCallCtrl", "start make phone call api");
        AbstractC67550j a = C67549i.m262706a(getAppContext()).mo234573a("makePhoneCall");
        if (a == null) {
            callbackAppUnSupportFeature();
            AppBrandLogger.m52829e("tma_ApiMakePhoneCallCtrl", "native module is null");
            return;
        }
        try {
            C66625a.m260272a(a, this.mArgs, new AbstractC67550j.AbstractC67551a<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.device.C24801c.C248021 */

                /* renamed from: a */
                public void onNativeModuleCall(String str) {
                    AppBrandLogger.m52830i("tma_ApiMakePhoneCallCtrl", "ApiMakePhoneCallCtrl invoke ");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, ApiCallbackHandler.buildErrorMsg("makePhoneCall", str));
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("tma_ApiMakePhoneCallCtrl", "act", e);
                    }
                    C24801c.this.doCallbackByApiHandler(jSONObject.toString());
                }
            });
        } catch (Exception e) {
            callbackFail(e);
            AppBrandLogger.m52829e("tma_ApiMakePhoneCallCtrl", e);
        }
    }

    public C24801c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
