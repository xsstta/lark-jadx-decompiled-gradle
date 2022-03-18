package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.common.service.net.entity.OpNetworkQualityType;
import com.tt.refer.common.util.C67860d;

public class GetNetworkQualityTypeAsyncPlugin extends OPPlugin {

    private static class NetworkQualityTypeResponse extends C25921b {
        @JSONField(name = "networkQualityType")
        public String mNetworkQualityType;

        private NetworkQualityTypeResponse() {
        }
    }

    @LKPluginFunction(async = true, eventName = {"getNetworkQualityType"})
    public void getNetworkType(ILogger aVar, AbstractC25897h<NetworkQualityTypeResponse> hVar) {
        NetworkQualityTypeResponse networkQualityTypeResponse = new NetworkQualityTypeResponse();
        OpNetworkQualityType a = C67860d.m263999a(getAppContext());
        if (a != null) {
            networkQualityTypeResponse.mNetworkQualityType = a.getNetworkQuality();
        } else {
            aVar.mo92223e("GetNetworkQualityTypeAsyncPlugin", " get network quality fail ");
            networkQualityTypeResponse.mErrorMessage = "get network quality fail";
        }
        hVar.callback(networkQualityTypeResponse);
    }
}
