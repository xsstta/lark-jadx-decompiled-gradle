package com.larksuite.component.openplatform.core.plugin.vc.audio.bg;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.audio.background.BgAudioModel;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.entity.C67522b;

public class ApiSetBgAudioCtrlPlugin extends OPPlugin {

    private static class ApiSetBgAudioCtrlResponse extends C25921b {
        private ApiSetBgAudioCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"setBgAudioState"})
    public void setBgAudioCtrlAsync(LKEvent lKEvent, final ILogger aVar, final AbstractC25897h<ApiSetBgAudioCtrlResponse> hVar) {
        String str;
        final ApiSetBgAudioCtrlResponse apiSetBgAudioCtrlResponse = new ApiSetBgAudioCtrlResponse();
        C67522b bVar = new C67522b();
        if (lKEvent.mo92147n() != null) {
            str = lKEvent.mo92147n().toString();
        } else {
            str = "";
        }
        BgAudioModel a = BgAudioModel.m257794a(str, bVar, getAppContext());
        if (a == null) {
            aVar.mo92223e("tma_SetBgAudioModelCtrl", "model == null", bVar.mo234470b());
            apiSetBgAudioCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiSetBgAudioCtrlResponse.mErrorMessage = bVar.mo234468a();
            hVar.callback(apiSetBgAudioCtrlResponse);
            return;
        }
        C65764a.m257802a().mo230425a(a, new C65764a.AbstractC65774c() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.bg.ApiSetBgAudioCtrlPlugin.C254971 */

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65774c
            /* renamed from: a */
            public void mo88634a() {
                hVar.callback(apiSetBgAudioCtrlResponse);
            }

            @Override // com.tt.miniapp.audio.background.C65764a.AbstractC65774c
            /* renamed from: a */
            public void mo88635a(String str, Throwable th) {
                aVar.mo92223e("tma_SetBgAudioModelCtrl", "setAudioModel fail", th);
                apiSetBgAudioCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiSetBgAudioCtrlResponse.mErrorMessage = str;
                hVar.callback(apiSetBgAudioCtrlResponse);
            }
        }, getAppContext());
    }
}
