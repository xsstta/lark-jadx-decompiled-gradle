package com.larksuite.component.openplatform.core.plugin.vc.audio.async;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.audio.C65783c;
import com.tt.miniapp.errorcode.ApiCode;

public class ApiSetAudioStatePlugin extends OPPlugin {

    private static class ApiSetAudioStateResponse extends C25921b {
        private ApiSetAudioStateResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"setAudioState"})
    public void setAudioStateAsync(LKEvent lKEvent, final ILogger aVar, final AbstractC25897h<ApiSetAudioStateResponse> hVar) {
        String str;
        final ApiSetAudioStateResponse apiSetAudioStateResponse = new ApiSetAudioStateResponse();
        try {
            if (lKEvent.mo92147n() != null) {
                str = lKEvent.mo92147n().toString();
            } else {
                str = "";
            }
            AbstractC65746a.m257747a(getAppContext()).mo230378a(C65783c.m257855a(str, getAppContext()), new AbstractC65746a.AbstractC65751e() {
                /* class com.larksuite.component.openplatform.core.plugin.vc.audio.async.ApiSetAudioStatePlugin.C254861 */

                @Override // com.tt.miniapp.audio.AbstractC65746a.AbstractC65751e
                /* renamed from: a */
                public void mo88627a() {
                    hVar.callback(apiSetAudioStateResponse);
                }

                @Override // com.tt.miniapp.audio.AbstractC65746a.AbstractC65751e
                /* renamed from: a */
                public void mo88628a(String str, Throwable th) {
                    aVar.mo92223e("tma_ApiSetAudioState", "onFail", th);
                    apiSetAudioStateResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    apiSetAudioStateResponse.mErrorMessage = str;
                    hVar.callback(apiSetAudioStateResponse);
                }
            });
        } catch (Exception e) {
            aVar.mo92223e("tma_ApiSetAudioState", "Exception", e);
            apiSetAudioStateResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiSetAudioStateResponse.mErrorMessage = e.getMessage();
            hVar.callback(apiSetAudioStateResponse);
        }
    }
}
