package com.larksuite.component.openplatform.core.plugin.vc.audio.bg;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.miniapp.errorcode.ApiCode;

public class ApiOperateBgAudioCtrlPlugin extends OPPlugin {

    private static class ApiOperateBgAudioCtrlRequest extends C25920a {
        @JSONField(name = "currentTime")
        public int mCurrentTime;
        @JSONField(name = "operationType")
        @LKRequiredParam
        public String mOperationType;

        private ApiOperateBgAudioCtrlRequest() {
        }
    }

    private static class ApiOperateBgAudioCtrlResponse extends C25921b {
        private ApiOperateBgAudioCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        super.addEvents(gVar);
        gVar.mo92192a("killGadgetOnBackground");
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        if ("killGadgetOnBackground".equals(lKEvent.mo92146m())) {
            if (!C65764a.m257802a().mo230431c()) {
                return lKEvent.mo92155v();
            }
            lKEvent.mo92134c().mo92190b().mo92224i("ApiOperateBgAudioCtrlPl", "intercept kill gadget Event");
        }
        return super.handleEvent(lKEvent);
    }

    @LKPluginFunction(async = true, eventName = {"operateBgAudio"})
    public void operateBgAudioAsync(ApiOperateBgAudioCtrlRequest apiOperateBgAudioCtrlRequest, final ILogger aVar, final AbstractC25897h<ApiOperateBgAudioCtrlResponse> hVar) {
        final ApiOperateBgAudioCtrlResponse apiOperateBgAudioCtrlResponse = new ApiOperateBgAudioCtrlResponse();
        try {
            String str = apiOperateBgAudioCtrlRequest.mOperationType;
            C254961 r2 = new C65764a.AbstractC65774c() {
                /* class com.larksuite.component.openplatform.core.plugin.vc.audio.bg.ApiOperateBgAudioCtrlPlugin.C254961 */

                @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65774c
                /* renamed from: a */
                public void mo88634a() {
                    hVar.callback(apiOperateBgAudioCtrlResponse);
                }

                @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65774c
                /* renamed from: a */
                public void mo88635a(String str, Throwable th) {
                    aVar.mo92223e("ApiOperateBgAudioCtrlPl", "fail", th);
                    apiOperateBgAudioCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    apiOperateBgAudioCtrlResponse.mErrorMessage = str;
                    hVar.callback(apiOperateBgAudioCtrlResponse);
                }
            };
            if (TextUtils.equals(str, "play")) {
                C65764a.m257802a().mo230427a(r2, getAppContext());
            } else if (TextUtils.equals(str, "pause")) {
                C65764a.m257802a().mo230429b(r2, getAppContext());
            } else if (TextUtils.equals(str, "stop")) {
                C65764a.m257802a().mo230430c(r2, getAppContext());
            } else if (TextUtils.equals(str, "seek")) {
                C65764a.m257802a().mo230424a(apiOperateBgAudioCtrlRequest.mCurrentTime, r2, getAppContext());
            } else {
                apiOperateBgAudioCtrlResponse.mErrorCode = ApiCode.GENERAL_PARAM.code;
                apiOperateBgAudioCtrlResponse.mErrorMessage = ApiCallResultHelper.generateIllegalParamExtraInfo("operationType");
                hVar.callback(apiOperateBgAudioCtrlResponse);
            }
        } catch (Exception e) {
            aVar.mo92223e("ApiOperateBgAudioCtrlPl", "Exception", e);
            apiOperateBgAudioCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiOperateBgAudioCtrlResponse.mErrorMessage = e.getMessage();
            hVar.callback(apiOperateBgAudioCtrlResponse);
        }
    }
}
