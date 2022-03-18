package com.larksuite.component.openplatform.core.plugin.vc.audio.sync;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.entity.C67522b;

public class GetAudioStateSyncCtrlPlugin extends OPPlugin {

    private static class GetAudioStateSyncCtrlRequest extends C25920a {
        @JSONField(name = "audioId")
        @LKRequiredParam
        public int mAudioId;

        private GetAudioStateSyncCtrlRequest() {
        }
    }

    private static class GetAudioStateSyncCtrlResponse extends C25921b {
        @JSONField(name = "buffered")
        public int mBuffered;
        @JSONField(name = "currentTime")
        public long mCurrentTime;
        @JSONField(name = "duration")
        public long mDuration;
        @JSONField(name = "obeyMuteSwitch")
        public boolean mObeyMuteSwitch;
        @JSONField(name = "paused")
        public boolean mPaused;
        @JSONField(name = "src")
        public String mSrc;
        @JSONField(name = "startTime")
        public long mStartTime;

        private GetAudioStateSyncCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(eventName = {"getAudioStateSync"})
    public GetAudioStateSyncCtrlResponse getAudioStateSync(AbstractC25895f fVar, GetAudioStateSyncCtrlRequest getAudioStateSyncCtrlRequest) {
        GetAudioStateSyncCtrlResponse getAudioStateSyncCtrlResponse = new GetAudioStateSyncCtrlResponse();
        ILogger b = fVar.mo92190b();
        try {
            int i = getAudioStateSyncCtrlRequest.mAudioId;
            C67522b bVar = new C67522b();
            AbstractC65746a.C65747a a = AbstractC65746a.m257747a(getAppContext()).mo230375a(i, bVar);
            if (a != null) {
                if (a.f165657e >= 0) {
                    b.mo92222d("tma_GetAudioStateSyncCtrlPlugin", "audioState.duration ", Long.valueOf(a.f165657e));
                    String str = a.f165653a;
                    String d = getApiDependency().mo235048d(str);
                    b.mo92222d("tma_GetAudioStateSyncCtrlPlugin", "schemaUrl ", d, " ", str);
                    getAudioStateSyncCtrlResponse.mSrc = d;
                    getAudioStateSyncCtrlResponse.mStartTime = a.f165654b;
                    getAudioStateSyncCtrlResponse.mPaused = a.f165655c;
                    getAudioStateSyncCtrlResponse.mCurrentTime = a.f165656d;
                    getAudioStateSyncCtrlResponse.mDuration = a.f165657e;
                    getAudioStateSyncCtrlResponse.mObeyMuteSwitch = a.f165658f;
                    getAudioStateSyncCtrlResponse.mBuffered = a.f165659g;
                    return getAudioStateSyncCtrlResponse;
                }
            }
            if (a != null) {
                AppBrandLogger.m52828d("tma_GetAudioStateSyncCtrlPlugin", "audioState.duration < 0 ", Long.valueOf(a.f165657e));
                bVar.mo234467a("audioState.duration == ").mo234467a(Long.valueOf(a.f165657e));
            }
            b.mo92223e("tma_GetAudioStateSyncCtrlPlugin", bVar.mo234470b());
            getAudioStateSyncCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            getAudioStateSyncCtrlResponse.mErrorMessage = bVar.mo234468a();
            return getAudioStateSyncCtrlResponse;
        } catch (Exception e) {
            b.mo92223e("tma_GetAudioStateSyncCtrlPlugin", "act", e);
            getAudioStateSyncCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            getAudioStateSyncCtrlResponse.mErrorMessage = e.getMessage();
            return getAudioStateSyncCtrlResponse;
        }
    }
}
