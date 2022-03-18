package com.larksuite.component.openplatform.core.plugin.container;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AppbrandContext;

public class ApiStopPullDownRefreshCtrlPlugin extends OPPlugin {

    private static class ApiStopPullDownRefreshCtrlRequest extends C25920a {
        private ApiStopPullDownRefreshCtrlRequest() {
        }
    }

    private static class ApiStopPullDownRefreshCtrlResponse extends C25921b {
        private ApiStopPullDownRefreshCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"stopPullDownRefresh"})
    public void apiStopPullDownRefreshCtrlAsync(LKEvent lKEvent, ApiStopPullDownRefreshCtrlRequest apiStopPullDownRefreshCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<ApiStopPullDownRefreshCtrlResponse> hVar) {
        final ApiStopPullDownRefreshCtrlResponse apiStopPullDownRefreshCtrlResponse = new ApiStopPullDownRefreshCtrlResponse();
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.container.ApiStopPullDownRefreshCtrlPlugin.RunnableC246301 */

            public void run() {
                RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(ApiStopPullDownRefreshCtrlPlugin.this.getAppContext()).getRenderViewManager();
                if (renderViewManager == null) {
                    apiStopPullDownRefreshCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    apiStopPullDownRefreshCtrlResponse.mErrorMessage = "WebViewManager is null";
                    hVar.callback(apiStopPullDownRefreshCtrlResponse);
                    return;
                }
                RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
                if (currentIRender == null) {
                    apiStopPullDownRefreshCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    apiStopPullDownRefreshCtrlResponse.mErrorMessage = "current render is null";
                    hVar.callback(apiStopPullDownRefreshCtrlResponse);
                    return;
                }
                currentIRender.onStopPullDownRefresh();
                hVar.callback(apiStopPullDownRefreshCtrlResponse);
            }
        });
    }
}
