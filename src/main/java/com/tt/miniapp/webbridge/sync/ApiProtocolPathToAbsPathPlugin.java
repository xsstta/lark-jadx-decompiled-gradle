package com.tt.miniapp.webbridge.sync;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;

public class ApiProtocolPathToAbsPathPlugin extends OPPlugin {

    private static class ApiProtocolPathToAbsPathRequest extends C25920a {
        @JSONField(name = "protocolPath")
        public String protocolPath;

        private ApiProtocolPathToAbsPathRequest() {
        }
    }

    private static class ApiProtocolPathToAbsPathResponse extends C25921b {
        @JSONField(name = "absPath")
        public String absPath;

        private ApiProtocolPathToAbsPathResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"protocolPathToAbsPath"})
    public void protocolPathToAbsPathAsync(LKEvent lKEvent, ApiProtocolPathToAbsPathRequest apiProtocolPathToAbsPathRequest, AbstractC25905b bVar, AbstractC25897h<ApiProtocolPathToAbsPathResponse> hVar) {
        ApiProtocolPathToAbsPathResponse apiProtocolPathToAbsPathResponse = new ApiProtocolPathToAbsPathResponse();
        apiProtocolPathToAbsPathResponse.absPath = apiProtocolPathToAbsPathRequest.protocolPath;
        hVar.callback(apiProtocolPathToAbsPathResponse);
    }
}
