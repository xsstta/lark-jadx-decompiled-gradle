package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.q */
public class C25239q extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "enterBot";
    }

    public C25239q() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("LarkApiEnterBot", "enter bot appId:" + getAppContext().getAppId());
        AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
        JSONObject jSONObject = new JSONObject();
        if (appInfo == null || TextUtils.isEmpty(appInfo.encryptextra)) {
            try {
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getActionName(), "failed"));
                this.mApiHandlerCallback.callback(this.mCallBackId, jSONObject.toString());
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("LarkApiEnterBot", "JSONException", e);
                this.mApiHandlerCallback.callback(this.mCallBackId, "");
            }
            AppBrandLogger.m52829e("LarkApiEnterBot", "extra info is empty!");
            return;
        }
        try {
            String optString = new JSONObject(appInfo.encryptextra).optString("botid");
            if (!TextUtils.isEmpty(optString)) {
                LarkExtensionManager.getInstance().getExtension().mo49609b(optString, C67432a.m262319a(getAppContext()).getAppInfo().appId, true);
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getActionName(), "ok"));
                this.mApiHandlerCallback.callback(this.mCallBackId, jSONObject.toString());
                return;
            }
            AppBrandLogger.m52829e("LarkApiEnterBot", "bot_id is empty!");
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getActionName(), "failed"));
            this.mApiHandlerCallback.callback(this.mCallBackId, jSONObject.toString());
        } catch (JSONException e2) {
            this.mApiHandlerCallback.callback(this.mCallBackId, "");
            AppBrandLogger.eWithThrowable("LarkApiEnterBot", "jsonException args:" + this.mArgs, e2);
        }
    }

    public C25239q(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
