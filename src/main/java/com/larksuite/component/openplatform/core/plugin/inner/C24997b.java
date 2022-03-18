package com.larksuite.component.openplatform.core.plugin.inner;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.process.p3320e.C66625a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67549i;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.b */
public class C24997b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "sentryReport";
    }

    public C24997b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AbstractC67550j a = C67549i.m262706a(getAppContext()).mo234573a("createInnerRequestTask");
        if (a == null) {
            callbackAppUnSupportFeature();
            return;
        }
        try {
            C66625a.m260272a(a, this.mArgs, new AbstractC67550j.AbstractC67551a<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.inner.C24997b.C249981 */

                /* renamed from: a */
                public void onNativeModuleCall(String str) {
                    C24997b.this.callbackOk();
                }
            });
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ApiErrorLogCtrl", e);
            callbackFail(e);
        }
    }

    public C24997b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
