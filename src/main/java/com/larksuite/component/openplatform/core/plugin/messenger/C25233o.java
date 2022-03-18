package com.larksuite.component.openplatform.core.plugin.messenger;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.o */
public class C25233o extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "checkWatermark";
    }

    public C25233o() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            boolean l = LarkExtensionManager.getInstance().getExtension().mo49618l();
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getActionName(), "ok"));
            if (!l) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("hasWatermark", z);
            AppBrandLogger.m52830i("LarkApiCheckShowWaterMarkCtrl", "checkShowWaterMark: " + l);
            this.mApiHandlerCallback.callback(this.mCallBackId, jSONObject.toString());
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("LarkApiCheckShowWaterMarkCtrl", "checkShowWaterMark error", e);
            this.mApiHandlerCallback.callback(this.mCallBackId, "");
        }
    }

    public C25233o(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
