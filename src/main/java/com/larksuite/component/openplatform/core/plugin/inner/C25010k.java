package com.larksuite.component.openplatform.core.plugin.inner;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.event.C66020b;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.k */
public class C25010k extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "systemLog";
    }

    public C25010k() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("tag");
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            AppBrandLogger.m52828d("tma_SystemLogCtrl", "event" + optString + Constants.ScionAnalytics.MessageType.DATA_MESSAGE + optJSONObject);
            C66020b.m258530a(optString, getAppContext()).mo231091a(optJSONObject).mo231092a();
            callbackOk();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_SystemLogCtrl", "Exception", e);
            callbackFail(e);
        }
    }

    public C25010k(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
