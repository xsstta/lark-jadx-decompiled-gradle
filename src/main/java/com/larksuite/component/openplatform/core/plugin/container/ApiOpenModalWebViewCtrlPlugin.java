package com.larksuite.component.openplatform.core.plugin.container;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3295j.p3297b.C66211a;
import com.tt.miniapphost.p3371e.C67509b;
import org.json.JSONException;
import org.json.JSONObject;

public class ApiOpenModalWebViewCtrlPlugin extends OPPlugin {

    private static class ApiOpenModalWebViewCtrlRequest extends C25920a {
        private ApiOpenModalWebViewCtrlRequest() {
        }
    }

    private static class ApiOpenModalWebViewCtrlResponse extends C25921b {
        @JSONField(name = "id")
        public String mId;

        private ApiOpenModalWebViewCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"openModalWebview"})
    public void apiOpenModalWebViewCtrlAsync(LKEvent lKEvent, ApiOpenModalWebViewCtrlRequest apiOpenModalWebViewCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<ApiOpenModalWebViewCtrlResponse> hVar) {
        final ApiOpenModalWebViewCtrlResponse apiOpenModalWebViewCtrlResponse = new ApiOpenModalWebViewCtrlResponse();
        C66211a.m259198a().mo231557a(getAppContext(), lKEvent.mo92147n().toString(), new C66211a.AbstractC66219b() {
            /* class com.larksuite.component.openplatform.core.plugin.container.ApiOpenModalWebViewCtrlPlugin.C246241 */

            @Override // com.tt.miniapp.p3295j.p3297b.C66211a.AbstractC66219b
            /* renamed from: a */
            public void mo87617a(boolean z, int i, String str, int i2) {
                JSONObject jSONObject = null;
                if (z) {
                    apiOpenModalWebViewCtrlResponse.mId = String.valueOf(i2);
                    AppBrandLogger.m52830i("ApiOpenModalWebViewCtrl", "onOpenModalWebView success , id = " + i2);
                    hVar.callback(apiOpenModalWebViewCtrlResponse);
                    C67509b.m262587a("mp_modal_webview_load", 0, (JSONObject) null, ApiOpenModalWebViewCtrlPlugin.this.getAppContext());
                    return;
                }
                C66211a.m259198a().mo231559a(ApiOpenModalWebViewCtrlPlugin.this.getAppContext(), i2);
                apiOpenModalWebViewCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                hVar.callback(apiOpenModalWebViewCtrlResponse);
                try {
                    jSONObject = new JSONObject(JSON.toJSONString(apiOpenModalWebViewCtrlResponse));
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("ApiOpenModalWebViewCtrl", ApiHandler.API_CALLBACK_EXCEPTION, e);
                }
                C67509b.m262587a("mp_modal_webview_load", 9300, jSONObject, ApiOpenModalWebViewCtrlPlugin.this.getAppContext());
            }
        });
    }
}
