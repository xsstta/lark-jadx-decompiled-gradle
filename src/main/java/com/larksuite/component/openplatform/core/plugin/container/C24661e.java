package com.larksuite.component.openplatform.core.plugin.container;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.p3295j.p3297b.C66211a;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.e */
public class C24661e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "openModalWebview";
    }

    public C24661e() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        C66211a.m259198a().mo231557a(getAppContext(), this.mArgs, new C66211a.AbstractC66219b() {
            /* class com.larksuite.component.openplatform.core.plugin.container.C24661e.C246621 */

            @Override // com.tt.miniapp.p3295j.p3297b.C66211a.AbstractC66219b
            /* renamed from: a */
            public void mo87617a(boolean z, int i, String str, int i2) {
                if (z) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", String.valueOf(i2));
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("ApiOpenModalWebViewCtrl", e);
                    }
                    AppBrandLogger.m52830i("ApiOpenModalWebViewCtrl", "onOpenModalWebView success , id = " + i2);
                    C24661e.this.callbackOk(jSONObject);
                    C67509b.m262587a("mp_modal_webview_load", 0, (JSONObject) null, C24661e.this.getAppContext());
                    return;
                }
                C66211a.m259198a().mo231559a(C24661e.this.getAppContext(), i2);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errCode", i);
                } catch (JSONException e2) {
                    AppBrandLogger.m52829e("ApiOpenModalWebViewCtrl", e2);
                }
                C24661e.this.callbackFail(str, jSONObject2);
                C67509b.m262587a("mp_modal_webview_load", 9300, jSONObject2, C24661e.this.getAppContext());
            }
        });
    }

    public C24661e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
