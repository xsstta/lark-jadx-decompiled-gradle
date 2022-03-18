package com.larksuite.component.openplatform.core.plugin.vc.audio.async;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.errorcode.ApiCode;

public class ApiOperateAudioCtrlPlugin extends OPPlugin {

    private static class ApiOperateAudioCtrlRequest extends C25920a {
        @JSONField(name = "audioId")
        public int mAudioId;
        @JSONField(name = "currentTime")
        public int mCurrentTime;
        @JSONField(name = "operationType")
        @LKRequiredParam
        public String mOperationType;

        private ApiOperateAudioCtrlRequest() {
        }
    }

    private static class ApiOperateAudioCtrlResponse extends C25921b {
        private ApiOperateAudioCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"operateAudio"})
    public void operateAudioCtrlAsync(final ILogger aVar, ApiOperateAudioCtrlRequest apiOperateAudioCtrlRequest, final AbstractC25897h<ApiOperateAudioCtrlResponse> hVar) {
        final ApiOperateAudioCtrlResponse apiOperateAudioCtrlResponse = new ApiOperateAudioCtrlResponse();
        try {
            int i = apiOperateAudioCtrlRequest.mAudioId;
            String str = apiOperateAudioCtrlRequest.mOperationType;
            C254851 r3 = new AbstractC65746a.AbstractC65751e() {
                /* class com.larksuite.component.openplatform.core.plugin.vc.audio.async.ApiOperateAudioCtrlPlugin.C254851 */

                @Override // com.tt.miniapp.audio.AbstractC65746a.AbstractC65751e
                /* renamed from: a */
                public void mo88627a() {
                    hVar.callback(apiOperateAudioCtrlResponse);
                }

                @Override // com.tt.miniapp.audio.AbstractC65746a.AbstractC65751e
                /* renamed from: a */
                public void mo88628a(String str, Throwable th) {
                    aVar.mo92223e("tma_ApiOperateAudioCtrl", "onFail", th);
                    apiOperateAudioCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    apiOperateAudioCtrlResponse.mErrorMessage = str;
                    hVar.callback(apiOperateAudioCtrlResponse);
                }
            };
            if (TextUtils.equals(str, "play")) {
                AbstractC65746a.m257747a(getAppContext()).mo230377a(i, r3);
            } else if (TextUtils.equals(str, "pause")) {
                AbstractC65746a.m257747a(getAppContext()).mo230380b(i, r3);
            } else if (TextUtils.equals(str, "stop")) {
                AbstractC65746a.m257747a(getAppContext()).mo230383c(i, r3);
            } else if (TextUtils.equals(str, "seek")) {
                AbstractC65746a.m257747a(getAppContext()).mo230376a(i, apiOperateAudioCtrlRequest.mCurrentTime, r3);
            } else {
                apiOperateAudioCtrlResponse.mErrorCode = ApiCode.GENERAL_PARAM.code;
                apiOperateAudioCtrlResponse.mErrorMessage = ApiCallResultHelper.generateIllegalParamExtraInfo("operationType");
                hVar.callback(apiOperateAudioCtrlResponse);
            }
        } catch (Exception e) {
            aVar.mo92223e("tma_ApiOperateAudioCtrl", "act", e);
            apiOperateAudioCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiOperateAudioCtrlResponse.mErrorMessage = e.getMessage();
            hVar.callback(apiOperateAudioCtrlResponse);
        }
    }
}
