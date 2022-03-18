package com.larksuite.component.openplatform.core.plugin.vc.audio.bg;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.miniapp.errorcode.ApiCode;

public class ApiGetBgAudioContextCtrlPlugin extends OPPlugin {

    private static class ApiGetBgAudioContextCtrlResponse extends C25921b {
        private ApiGetBgAudioContextCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getBackgroundAudioContext"})
    public void getBgAudioContextCtrlAsync(final ILogger aVar, final AbstractC25897h<ApiGetBgAudioContextCtrlResponse> hVar) {
        final ApiGetBgAudioContextCtrlResponse apiGetBgAudioContextCtrlResponse = new ApiGetBgAudioContextCtrlResponse();
        C65764a.m257802a().mo230426a(new C65764a.AbstractC65773b() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.bg.ApiGetBgAudioContextCtrlPlugin.C254941 */

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65773b
            /* renamed from: a */
            public void mo88631a(int i) {
                if (i == -1) {
                    apiGetBgAudioContextCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    apiGetBgAudioContextCtrlResponse.mErrorMessage = "bind fail";
                    aVar.mo92223e("tma_ApiGetBgAudioContextCtrl", "bind fail");
                }
                hVar.callback(apiGetBgAudioContextCtrlResponse);
            }
        }, getAppContext());
    }
}
