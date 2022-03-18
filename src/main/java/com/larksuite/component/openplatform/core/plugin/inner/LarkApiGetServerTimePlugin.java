package com.larksuite.component.openplatform.core.plugin.inner;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.errorcode.ApiCode;

public class LarkApiGetServerTimePlugin extends OPPlugin {

    private static class Response extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public long data;

        private Response() {
            this.data = -1;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getServerTime"})
    public void getServerTimeAsync(AbstractC25895f fVar, AbstractC25897h<Response> hVar) {
        long serverTime = LarkExtensionManager.getInstance().getExtension().getServerTime();
        Response response = new Response();
        if (serverTime < 0) {
            fVar.mo92190b().mo92223e("LarkApiGetServerTime", "getServerTimeFail");
            response.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
        } else {
            response.data = serverTime;
        }
        hVar.callback(response);
    }
}
