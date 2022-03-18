package com.larksuite.component.openplatform.core.plugin.inner;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67051o;

public class ApiReportJsRuntimeErrorCtrlPlugin extends OPPlugin {

    private static class ReportJSRuntimeResponse extends C25921b {
        private ReportJSRuntimeResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"reportJsRuntimeError"})
    public void reportJSRuntimeAsync(LKEvent lKEvent, AbstractC25895f fVar, AbstractC25897h<ReportJSRuntimeResponse> hVar) {
        ReportJSRuntimeResponse reportJSRuntimeResponse = new ReportJSRuntimeResponse();
        ILogger b = fVar.mo92190b();
        try {
            b.mo92224i("ApiReportJsRuntimeErrorCtrl", "reportJsRuntimeError do act");
            C67051o.m261319a().mo233157a(lKEvent.mo92147n(), getAppContext());
            hVar.callback(reportJSRuntimeResponse);
        } catch (Exception e) {
            b.mo92223e("ApiReportJsRuntimeErrorCtrl", ApiHandler.API_CALLBACK_EXCEPTION, e);
            reportJSRuntimeResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            reportJSRuntimeResponse.mErrorMessage = e.getMessage();
            hVar.callback(reportJSRuntimeResponse);
        }
    }
}
