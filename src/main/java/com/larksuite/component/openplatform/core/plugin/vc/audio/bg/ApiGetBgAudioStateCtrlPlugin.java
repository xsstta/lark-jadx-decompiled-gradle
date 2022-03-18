package com.larksuite.component.openplatform.core.plugin.vc.audio.bg;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.audio.background.BgAudioState;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.miniapp.errorcode.ApiCode;

public class ApiGetBgAudioStateCtrlPlugin extends OPPlugin {

    private static class ApiGetBgAudioStateCtrlResponse extends C25921b {
        @JSONField(name = "buffered")
        public int mBuffered;
        @JSONField(name = "currentTime")
        public int mCurrentTime;
        @JSONField(name = "duration")
        public int mDuration;
        @JSONField(name = "paused")
        public boolean mPaused;
        @JSONField(name = "volume")
        public int mVolume;

        private ApiGetBgAudioStateCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getBgAudioState"})
    public void getBgAudioStateCtrlAsync(ILogger aVar, AbstractC25897h<ApiGetBgAudioStateCtrlResponse> hVar) {
        ApiGetBgAudioStateCtrlResponse apiGetBgAudioStateCtrlResponse = new ApiGetBgAudioStateCtrlResponse();
        try {
            BgAudioState b = C65764a.m257802a().mo230428b();
            if (b == null) {
                apiGetBgAudioStateCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiGetBgAudioStateCtrlResponse.mErrorMessage = "audio state is null";
                hVar.callback(apiGetBgAudioStateCtrlResponse);
            } else if (b.f165736a < 0) {
                apiGetBgAudioStateCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiGetBgAudioStateCtrlResponse.mErrorMessage = "audio duration < 0";
                hVar.callback(apiGetBgAudioStateCtrlResponse);
            } else {
                apiGetBgAudioStateCtrlResponse.mPaused = b.f165738c;
                apiGetBgAudioStateCtrlResponse.mCurrentTime = b.f165737b;
                apiGetBgAudioStateCtrlResponse.mDuration = b.f165736a;
                apiGetBgAudioStateCtrlResponse.mBuffered = b.f165739d;
                apiGetBgAudioStateCtrlResponse.mVolume = b.f165740e;
                hVar.callback(apiGetBgAudioStateCtrlResponse);
            }
        } catch (Exception e) {
            aVar.mo92223e("tma_ApiGetBgAudioStateCtrl", "Exception", e);
            AppBrandLogger.eWithThrowable("tma_ApiGetBgAudioStateCtrl", "act", e);
            apiGetBgAudioStateCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetBgAudioStateCtrlResponse.mErrorMessage = e.getMessage();
            hVar.callback(apiGetBgAudioStateCtrlResponse);
        }
    }
}
