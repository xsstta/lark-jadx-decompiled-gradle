package com.larksuite.component.openplatform.core.plugin.vc.audio.async;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.data.ContextSingletonInstance;

public class ApiCreateAudioInstanceCtrlPlugin extends OPPlugin {

    private static class ApiCreateAudioInstanceCtrlResponse extends C25921b {
        @JSONField(name = "audioId")
        public int mAudioId;

        private ApiCreateAudioInstanceCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"createAudioInstance"})
    public void createAudioInstanceAsync(ILogger aVar, AbstractC25897h<ApiCreateAudioInstanceCtrlResponse> hVar) {
        ApiCreateAudioInstanceCtrlResponse apiCreateAudioInstanceCtrlResponse = new ApiCreateAudioInstanceCtrlResponse();
        try {
            apiCreateAudioInstanceCtrlResponse.mAudioId = ContextSingletonInstance.getInstance().audioId.getAndIncrement();
        } catch (Exception e) {
            aVar.mo92223e("ApiCreateAudioInstanceC", "Exception", e);
            apiCreateAudioInstanceCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiCreateAudioInstanceCtrlResponse.mErrorMessage = e.getMessage();
        }
        hVar.callback(apiCreateAudioInstanceCtrlResponse);
    }
}
