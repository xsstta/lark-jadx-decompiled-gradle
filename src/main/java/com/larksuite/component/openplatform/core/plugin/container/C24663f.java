package com.larksuite.component.openplatform.core.plugin.container;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.p3295j.p3297b.C66211a;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.f */
public class C24663f extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "operateModalWebviewState";
    }

    public C24663f() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            int optInt = jSONObject.optInt("id", -1);
            if (jSONObject.optInt("show") == 1) {
                z = true;
            } else {
                z = false;
            }
            AppBrandLogger.m52830i("operateModalWebviewState", "operateModalWebviewState id = " + optInt + " , show = " + z);
            C66211a.m259198a().mo231556a(optInt, z, new C66211a.AbstractC66220c() {
                /* class com.larksuite.component.openplatform.core.plugin.container.C24663f.C246641 */

                @Override // com.tt.miniapp.p3295j.p3297b.C66211a.AbstractC66220c
                /* renamed from: a */
                public void mo87619a(boolean z) {
                    AppBrandLogger.m52830i("operateModalWebviewState", "operateModalWebviewState operateResult = " + z);
                    if (z) {
                        C24663f.this.callbackOk();
                    } else {
                        C24663f.this.mo87650a(1002, "invalid webview id");
                    }
                }
            });
        } catch (Exception e) {
            AppBrandLogger.m52829e("operateModalWebviewState", e);
            mo87650a(1003, ApiCallResultHelper.generateThrowableExtraInfo(e));
        }
    }

    /* renamed from: a */
    public void mo87650a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("operateModalWebviewState", e);
        }
        callbackFail(str, jSONObject);
    }

    public C24663f(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
