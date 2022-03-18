package com.larksuite.component.openplatform.core.plugin.vc.audio.async;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.entity.C67522b;

public class ApiDestroyAudioInstanceCtrlPlugin extends OPPlugin {

    private static class ApiDestroyAudioInstanceCtrlRequest extends C25920a {
        @JSONField(name = "audioId")
        public int mAudioId;

        private ApiDestroyAudioInstanceCtrlRequest() {
        }
    }

    private static class ApiDestroyAudioInstanceCtrlResponse extends C25921b {
        private ApiDestroyAudioInstanceCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"destroyAudioInstance"})
    public void destroyAudioInstanceCtrlAsync(ApiDestroyAudioInstanceCtrlRequest apiDestroyAudioInstanceCtrlRequest, AbstractC25897h<ApiDestroyAudioInstanceCtrlResponse> hVar, ILogger aVar) {
        ApiDestroyAudioInstanceCtrlResponse apiDestroyAudioInstanceCtrlResponse = new ApiDestroyAudioInstanceCtrlResponse();
        try {
            int i = apiDestroyAudioInstanceCtrlRequest.mAudioId;
            C67522b bVar = new C67522b();
            if (!AbstractC65746a.m257747a(getAppContext()).mo230381b(i, bVar)) {
                aVar.mo92223e("tma_ApiDestroyAudioInstanceCtrl", "Exception", bVar.mo234470b());
                apiDestroyAudioInstanceCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiDestroyAudioInstanceCtrlResponse.mErrorMessage = bVar.mo234468a();
            }
        } catch (Exception e) {
            aVar.mo92223e("tma_ApiDestroyAudioInstanceCtrl", "Exception", e);
            AppBrandLogger.eWithThrowable("tma_ApiDestroyAudioInstanceCtrl", "act", e);
            apiDestroyAudioInstanceCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiDestroyAudioInstanceCtrlResponse.mErrorMessage = e.getMessage();
        }
        hVar.callback(apiDestroyAudioInstanceCtrlResponse);
    }
}
