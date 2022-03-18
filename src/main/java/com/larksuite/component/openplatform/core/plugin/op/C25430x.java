package com.larksuite.component.openplatform.core.plugin.op;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.data.C67494g;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.x */
public class C25430x extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "removeFromRecentAppList";
    }

    public C25430x() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            String optString = new JSONObject(this.mArgs).optString("app_id");
            if (TextUtils.isEmpty(optString)) {
                callbackFail(ApiCallResultHelper.generateIllegalParamExtraInfo("app_id"));
            } else {
                ContextSingletonInstance.getInstance().getRecentAppsManager().deleteRecentApp(optString, new C67494g.AbstractC67495a() {
                    /* class com.larksuite.component.openplatform.core.plugin.op.C25430x.C254311 */
                }, getAppContext());
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiHandler", e);
            callbackFail(e);
        }
    }

    public C25430x(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
