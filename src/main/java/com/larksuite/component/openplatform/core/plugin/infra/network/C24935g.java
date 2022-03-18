package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.process.p3320e.C66625a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67549i;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.g */
public class C24935g extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "operateUploadTask";
    }

    public C24935g() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AbstractC67550j a = C67549i.m262706a(getAppContext()).mo234573a("operateUploadTask");
        if (a == null) {
            AppBrandLogger.m52830i("ApiHandler", "operate upload task native module is null!");
            callbackAppUnSupportFeature();
            return;
        }
        try {
            C66625a.m260272a(a, this.mArgs, (AbstractC67550j.AbstractC67551a) null);
            callbackDefaultMsg(true);
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ApiHandler", e.getStackTrace());
            callbackDefaultMsg(false);
        }
    }

    public C24935g(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
