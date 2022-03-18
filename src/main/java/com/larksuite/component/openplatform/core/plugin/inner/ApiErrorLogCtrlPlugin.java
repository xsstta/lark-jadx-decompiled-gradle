package com.larksuite.component.openplatform.core.plugin.inner;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.process.p3320e.C66625a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67549i;

public class ApiErrorLogCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiErrorLogCtrlResponse extends C25921b {
        private ApiErrorLogCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"sentryReport"})
    public void errorLog(LKEvent lKEvent, AbstractC25895f fVar, final AbstractC25897h<ApiErrorLogCtrlResponse> hVar) {
        final ApiErrorLogCtrlResponse apiErrorLogCtrlResponse = new ApiErrorLogCtrlResponse();
        final ILogger b = fVar.mo92190b();
        AbstractC67550j a = C67549i.m262706a(getAppContext()).mo234573a("createInnerRequestTask");
        if (a == null) {
            b.mo92224i("tma_ApiErrorLogCtrl", "not support");
            apiErrorLogCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiErrorLogCtrlResponse.mErrorMessage = "feature is not supported in app";
            hVar.callback(apiErrorLogCtrlResponse);
        } else if (lKEvent.mo92147n() == null) {
            b.mo92223e("tma_ApiErrorLogCtrl", "params is empty.");
            apiErrorLogCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiErrorLogCtrlResponse.mErrorMessage = "params is empty.";
            hVar.callback(apiErrorLogCtrlResponse);
        } else {
            try {
                C66625a.m260272a(a, lKEvent.mo92147n().toString(), new AbstractC67550j.AbstractC67551a<String>() {
                    /* class com.larksuite.component.openplatform.core.plugin.inner.ApiErrorLogCtrlPlugin.C249861 */

                    /* renamed from: a */
                    public void onNativeModuleCall(String str) {
                        b.mo92224i("tma_ApiErrorLogCtrl", "call success");
                        hVar.callback(apiErrorLogCtrlResponse);
                    }
                });
            } catch (Exception e) {
                b.mo92223e("tma_ApiErrorLogCtrl", e);
                apiErrorLogCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiErrorLogCtrlResponse.mErrorMessage = e.getMessage();
                hVar.callback(apiErrorLogCtrlResponse);
            }
        }
    }
}
