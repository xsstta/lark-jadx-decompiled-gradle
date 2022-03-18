package com.larksuite.component.openplatform.core.plugin.container;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.p3295j.p3297b.C66211a;

public class ApiOperateModalWebViewStateCtrlPlugin extends OPPlugin {

    private static class ApiOperateModalWebViewStateCtrlResponse extends C25921b {
        private ApiOperateModalWebViewStateCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private static class ApiOperateModalWebViewStateCtrlRequest extends C25920a {
        @JSONField(name = "id")
        public int mId = -1;
        @JSONField(name = "show")
        public int mShow;

        private ApiOperateModalWebViewStateCtrlRequest() {
        }
    }

    @LKPluginFunction(async = true, eventName = {"operateModalWebviewState"})
    public void apiOperateModalWebViewStateCtrlAsync(LKEvent lKEvent, ApiOperateModalWebViewStateCtrlRequest apiOperateModalWebViewStateCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<ApiOperateModalWebViewStateCtrlResponse> hVar) {
        boolean z;
        final ApiOperateModalWebViewStateCtrlResponse apiOperateModalWebViewStateCtrlResponse = new ApiOperateModalWebViewStateCtrlResponse();
        try {
            int i = apiOperateModalWebViewStateCtrlRequest.mId;
            if (apiOperateModalWebViewStateCtrlRequest.mShow == 1) {
                z = true;
            } else {
                z = false;
            }
            AppBrandLogger.m52830i("operateModalWebviewState", "operateModalWebviewState id = " + i + " , show = " + z);
            C66211a.m259198a().mo231556a(i, z, new C66211a.AbstractC66220c() {
                /* class com.larksuite.component.openplatform.core.plugin.container.ApiOperateModalWebViewStateCtrlPlugin.C246251 */

                @Override // com.tt.miniapp.p3295j.p3297b.C66211a.AbstractC66220c
                /* renamed from: a */
                public void mo87619a(boolean z) {
                    AppBrandLogger.m52830i("operateModalWebviewState", "operateModalWebviewState operateResult = " + z);
                    if (z) {
                        hVar.callback(apiOperateModalWebViewStateCtrlResponse);
                        return;
                    }
                    apiOperateModalWebViewStateCtrlResponse.mErrorMessage = "invalid webview id";
                    apiOperateModalWebViewStateCtrlResponse.mErrorCode = 1002;
                    hVar.callback(apiOperateModalWebViewStateCtrlResponse);
                }
            });
        } catch (Exception e) {
            AppBrandLogger.m52829e("operateModalWebviewState", e);
            apiOperateModalWebViewStateCtrlResponse.mErrorMessage = ApiCallResultHelper.generateThrowableExtraInfo(e);
            apiOperateModalWebViewStateCtrlResponse.mErrorCode = 1003;
            hVar.callback(apiOperateModalWebViewStateCtrlResponse);
        }
    }
}
