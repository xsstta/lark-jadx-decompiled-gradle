package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import java.util.HashMap;

public class GetHostLaunchQuerySyncPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = false, eventName = {"getHostLaunchQuerySync"})
    public LKPluginHandleResult getHostLaunchQuerySync(LKEvent lKEvent) {
        String b = getApiDependency().mo235039b();
        HashMap hashMap = new HashMap();
        hashMap.put("launchQuery", b);
        AppBrandLogger.m52830i("GetHostLaunchQuerySyncPlugin", "getHostLaunchQuerySync " + hashMap);
        return lKEvent.mo92131b(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
    }
}
