package com.larksuite.component.openplatform.core.plugin.inner;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.util.C67051o;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.g */
public class C25006g extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "reportJsRuntimeError";
    }

    public C25006g() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            AppBrandLogger.m52830i("ApiReportJsRuntimeErrorCtrl", "reportJsRuntimeError do act");
            C67051o.m261319a().mo233157a(new JSONObject(this.mArgs), getAppContext());
            callbackOk();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("ApiReportJsRuntimeErrorCtrl", ApiHandler.API_CALLBACK_EXCEPTION, e);
            callbackFail(e);
        }
    }

    public C25006g(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
