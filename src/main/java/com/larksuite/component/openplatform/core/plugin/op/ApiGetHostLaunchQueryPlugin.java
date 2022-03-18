package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import java.util.HashMap;

public class ApiGetHostLaunchQueryPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getHostLaunchQuery"})
    public void getHostLaunchQuery(LKEvent lKEvent) {
        String b = getApiDependency().mo235039b();
        HashMap hashMap = new HashMap();
        hashMap.put("launchQuery", b);
        AppBrandLogger.m52830i("ApiGetHostLaunchQueryPlugin", "getHostLaunchQuery " + hashMap);
        lKEvent.mo92127a(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
    }
}
