package com.larksuite.component.openplatform.core.plugin.inner;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;

public class ApiPreloadMiniProgramCtrlPlugin extends OPPlugin {

    private static class ApiPreloadMiniProgramCtrlRequest extends C25920a {
        private ApiPreloadMiniProgramCtrlRequest() {
        }
    }

    private static class ApiPreloadMiniProgramCtrlResponse extends C25921b {
        private ApiPreloadMiniProgramCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"preloadMiniProgram"})
    public void apiPreloadMiniProgramCtrlAsync(LKEvent lKEvent, ApiPreloadMiniProgramCtrlRequest apiPreloadMiniProgramCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<ApiPreloadMiniProgramCtrlResponse> hVar) {
        final ApiPreloadMiniProgramCtrlResponse apiPreloadMiniProgramCtrlResponse = new ApiPreloadMiniProgramCtrlResponse();
        AppBrandLogger.m52828d("tma_ApiPreloadMiniappCtrl", lKEvent.mo92147n().toString());
        C67556a.m262943b(lKEvent.mo92147n().toString(), new AbstractC67565b() {
            /* class com.larksuite.component.openplatform.core.plugin.inner.ApiPreloadMiniProgramCtrlPlugin.C249891 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                String str;
                if (crossProcessDataEntity != null) {
                    boolean d = crossProcessDataEntity.mo234746d("preload_app_result");
                    if (d) {
                        hVar.callback(apiPreloadMiniProgramCtrlResponse);
                    } else {
                        apiPreloadMiniProgramCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                        apiPreloadMiniProgramCtrlResponse.mErrorMessage = crossProcessDataEntity.mo234744b("preload_app_failed_message");
                        hVar.callback(apiPreloadMiniProgramCtrlResponse);
                    }
                    Object[] objArr = new Object[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("preloadMiniProgram result = ");
                    if (d) {
                        str = "success";
                    } else {
                        str = "failed , reason : ";
                    }
                    sb.append(str);
                    objArr[0] = sb.toString();
                    AppBrandLogger.m52830i("tma_ApiPreloadMiniappCtrl", objArr);
                    return;
                }
                apiPreloadMiniProgramCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiPreloadMiniProgramCtrlResponse.mErrorMessage = "ipc fail";
                hVar.callback(apiPreloadMiniProgramCtrlResponse);
            }
        });
    }
}
