package com.larksuite.component.openplatform.core.plugin.infra;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.util.C67068y;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.a */
public class C24872a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getSystemInfo";
    }

    public C24872a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            callbackOk(C67068y.m261378a(AppbrandContext.getInst().getApplicationContext(), AppbrandContext.getInst().isGame(), getAppContext()));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_ApiGetSystemInfoCtrl", "Exception", e);
            callbackFail(e);
        }
    }

    public C24872a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
