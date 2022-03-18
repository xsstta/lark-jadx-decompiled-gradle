package com.larksuite.component.openplatform.core.plugin.vc.audio.async;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.entity.C67522b;
import com.tt.refer.impl.business.file.TTFileHelper;

public class ApiGetAudioStateCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiGetAudioStateCtrlRequest extends C25920a {
        @JSONField(name = "audioId")
        public int mAudioId;

        private ApiGetAudioStateCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiGetAudioStateCtrlResponse extends C25921b {
        @JSONField(name = "autoplay")
        public boolean mAutoPlay;
        @JSONField(name = "buffered")
        public int mBuffered;
        @JSONField(name = "currentTime")
        public long mCurrentTime;
        @JSONField(name = "duration")
        public long mDuration;
        @JSONField(name = "loop")
        public boolean mLoop;
        @JSONField(name = "obeyMuteSwitch")
        public boolean mObeyMuteSwitch;
        @JSONField(name = "paused")
        public boolean mPaused;
        @JSONField(name = "src")
        public String mSrc;
        @JSONField(name = "startTime")
        public long mStartTime;
        @JSONField(name = "volume")
        public float mVolume;

        private ApiGetAudioStateCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private ApiGetAudioStateCtrlResponse standardGetAudioStateCtrlAsync(LKEvent lKEvent, ApiGetAudioStateCtrlRequest apiGetAudioStateCtrlRequest, ILogger aVar) {
        ApiGetAudioStateCtrlResponse apiGetAudioStateCtrlResponse = new ApiGetAudioStateCtrlResponse();
        try {
            int i = apiGetAudioStateCtrlRequest.mAudioId;
            AppBrandLogger.m52830i("tma_ApiGetAudioStateCtrl", "standardGetAudioStateCtrlAsync audioId ", Integer.valueOf(i));
            C67522b bVar = new C67522b();
            AbstractC65746a.C65747a a = AbstractC65746a.m257747a(getAppContext()).mo230375a(i, bVar);
            if (a != null) {
                if (a.f165657e >= 0) {
                    aVar.mo92222d("tma_ApiGetAudioStateCtrl", "audioState.currentTime ", Long.valueOf(a.f165656d));
                    aVar.mo92224i("tma_ApiGetAudioStateCtrl", "src ", a.f165653a, " ", a.f165653a);
                    apiGetAudioStateCtrlResponse.mSrc = a.f165653a;
                    apiGetAudioStateCtrlResponse.mStartTime = a.f165654b;
                    apiGetAudioStateCtrlResponse.mPaused = a.f165655c;
                    apiGetAudioStateCtrlResponse.mCurrentTime = a.f165656d;
                    apiGetAudioStateCtrlResponse.mDuration = a.f165657e;
                    apiGetAudioStateCtrlResponse.mObeyMuteSwitch = a.f165658f;
                    apiGetAudioStateCtrlResponse.mBuffered = a.f165659g;
                    apiGetAudioStateCtrlResponse.mLoop = a.f165661i;
                    apiGetAudioStateCtrlResponse.mAutoPlay = a.f165660h;
                    apiGetAudioStateCtrlResponse.mVolume = a.f165662j;
                    return apiGetAudioStateCtrlResponse;
                }
            }
            if (a != null) {
                aVar.mo92222d("tma_ApiGetAudioStateCtrl", "audioState.duration < 0 ", Long.valueOf(a.f165657e));
                bVar.mo234467a("audioState.duration == ").mo234467a(Long.valueOf(a.f165657e));
            }
            apiGetAudioStateCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetAudioStateCtrlResponse.mErrorMessage = bVar.mo234468a();
            return apiGetAudioStateCtrlResponse;
        } catch (Exception e) {
            aVar.mo92223e("tma_ApiGetAudioStateCtrl", "Exception", e);
            apiGetAudioStateCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetAudioStateCtrlResponse.mErrorMessage = e.getMessage();
            return apiGetAudioStateCtrlResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getAudioState"})
    public void getAudioStateCtrlAsync(LKEvent lKEvent, ApiGetAudioStateCtrlRequest apiGetAudioStateCtrlRequest, ILogger aVar, AbstractC25897h<ApiGetAudioStateCtrlResponse> hVar) {
        if (TTFileHelper.m264259a("audio", getAppContext())) {
            hVar.callback(standardGetAudioStateCtrlAsync(lKEvent, apiGetAudioStateCtrlRequest, aVar));
            return;
        }
        ApiGetAudioStateCtrlResponse apiGetAudioStateCtrlResponse = new ApiGetAudioStateCtrlResponse();
        try {
            int i = apiGetAudioStateCtrlRequest.mAudioId;
            AppBrandLogger.m52828d("tma_ApiGetAudioStateCtrl", "audioId ", Integer.valueOf(i));
            C67522b bVar = new C67522b();
            AbstractC65746a.C65747a a = AbstractC65746a.m257747a(getAppContext()).mo230375a(i, bVar);
            if (a != null) {
                if (a.f165657e >= 0) {
                    aVar.mo92222d("tma_ApiGetAudioStateCtrl", "audioState.currentTime ", Long.valueOf(a.f165656d));
                    String str = a.f165653a;
                    String d = getApiDependency().mo235048d(str);
                    aVar.mo92222d("tma_ApiGetAudioStateCtrl", "schemaUrl ", d, " ", str);
                    apiGetAudioStateCtrlResponse.mSrc = d;
                    apiGetAudioStateCtrlResponse.mStartTime = a.f165654b;
                    apiGetAudioStateCtrlResponse.mPaused = a.f165655c;
                    apiGetAudioStateCtrlResponse.mCurrentTime = a.f165656d;
                    apiGetAudioStateCtrlResponse.mDuration = a.f165657e;
                    apiGetAudioStateCtrlResponse.mObeyMuteSwitch = a.f165658f;
                    apiGetAudioStateCtrlResponse.mBuffered = a.f165659g;
                    apiGetAudioStateCtrlResponse.mLoop = a.f165661i;
                    apiGetAudioStateCtrlResponse.mAutoPlay = a.f165660h;
                    apiGetAudioStateCtrlResponse.mVolume = a.f165662j;
                    hVar.callback(apiGetAudioStateCtrlResponse);
                    return;
                }
            }
            if (a != null) {
                aVar.mo92222d("tma_ApiGetAudioStateCtrl", "audioState.duration < 0 ", Long.valueOf(a.f165657e));
                bVar.mo234467a("audioState.duration == ").mo234467a(Long.valueOf(a.f165657e));
            }
            apiGetAudioStateCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetAudioStateCtrlResponse.mErrorMessage = bVar.mo234468a();
            hVar.callback(apiGetAudioStateCtrlResponse);
        } catch (Exception e) {
            aVar.mo92223e("tma_ApiGetAudioStateCtrl", "Exception", e);
            apiGetAudioStateCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetAudioStateCtrlResponse.mErrorMessage = e.getMessage();
            hVar.callback(apiGetAudioStateCtrlResponse);
        }
    }
}
