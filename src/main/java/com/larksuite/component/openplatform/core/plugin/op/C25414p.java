package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.p */
public class C25414p extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getHostLaunchQuery";
    }

    public C25414p() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        String b = getApiDependency().mo235039b();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("launchQuery", b);
        AppBrandLogger.m52830i("ApiGetHostLaunchQueryCtrl", "getHostLaunchQuery " + hashMap);
        callbackMsg(true, hashMap, null);
    }

    public C25414p(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
