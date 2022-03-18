package com.larksuite.component.openplatform.core.plugin.container;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.p3295j.p3297b.C66211a;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.b */
public class C24656b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "closeModalWebview";
    }

    public C24656b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            int optInt = new JSONObject(this.mArgs).optInt("id", -1);
            if (C66211a.m259198a().mo231559a(getAppContext(), optInt)) {
                AppBrandLogger.m52830i("ApiCloseModalWebViewCtrl", "closeModalWebView success " + optInt);
                callbackOk();
                return;
            }
            m89735a(1002, "invalid webview id");
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiCloseModalWebViewCtrl", e);
            m89735a(1003, ApiCallResultHelper.generateThrowableExtraInfo(e));
        }
    }

    /* renamed from: a */
    private void m89735a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiCloseModalWebViewCtrl", e);
        }
        callbackFail(str, jSONObject);
    }

    public C24656b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
