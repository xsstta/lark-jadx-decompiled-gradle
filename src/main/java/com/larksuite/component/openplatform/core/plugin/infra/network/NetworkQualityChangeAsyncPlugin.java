package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;

public class NetworkQualityChangeAsyncPlugin extends OPPlugin {

    private static class NetworkQualityChangeTypeResponse extends C25921b {
        private NetworkQualityChangeTypeResponse() {
        }
    }

    @LKPluginFunction(async = true, eventName = {"onNetworkQualityChange"})
    public void registerNetworkQualityChange(ILogger aVar, AbstractC25897h<NetworkQualityChangeTypeResponse> hVar) {
        NetworkQualityChangeTypeResponse networkQualityChangeTypeResponse = new NetworkQualityChangeTypeResponse();
        IAppContext appContext = getAppContext();
        if (appContext == null) {
            aVar.mo92224i("NetworkQualityChangeAsyncPlugin", " on network quality change fail, appcontext is null");
            networkQualityChangeTypeResponse.mErrorMessage = " appcontext is null";
        } else {
            C24951s.m90208a().mo88037a(appContext);
        }
        hVar.callback(networkQualityChangeTypeResponse);
    }

    @LKPluginFunction(async = true, eventName = {"offNetworkQualityChange"})
    public void unRegisterNetworkQualityChange(ILogger aVar, AbstractC25897h<NetworkQualityChangeTypeResponse> hVar) {
        NetworkQualityChangeTypeResponse networkQualityChangeTypeResponse = new NetworkQualityChangeTypeResponse();
        IAppContext appContext = getAppContext();
        if (appContext == null) {
            aVar.mo92224i("NetworkQualityChangeAsyncPlugin", " off network quality change fail, appcontext is null");
            networkQualityChangeTypeResponse.mErrorMessage = " appcontext is null";
        } else {
            C24951s.m90208a().mo88038b(appContext);
        }
        hVar.callback(networkQualityChangeTypeResponse);
    }
}
