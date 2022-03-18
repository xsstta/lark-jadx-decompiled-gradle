package com.larksuite.component.openplatform.core.plugin.container;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AbstractC66202i;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.h */
public class C24666h extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "showMorePanel";
    }

    public C24666h() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AbstractC67497e activityProxy = ((MiniappHostBase) getAppContext().getCurrentActivity()).getActivityProxy();
        if (activityProxy == null) {
            AppBrandLogger.m52829e("ApiHandler", "iActivityProxy is null");
            callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("IActivityProxy"));
            return;
        }
        AbstractC66202i A = activityProxy.mo232109A();
        if (A == null) {
            AppBrandLogger.m52829e("ApiHandler", "iTitleBar is null");
            callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("ITitleBar"));
            return;
        }
        A.mo230950k();
        callbackOk();
    }

    public C24666h(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
