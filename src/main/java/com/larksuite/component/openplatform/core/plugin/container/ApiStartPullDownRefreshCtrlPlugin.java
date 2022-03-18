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

public class ApiStartPullDownRefreshCtrlPlugin extends OPPlugin {

    private static class ApiStartPullDownRefreshCtrlRequest extends C25920a {
        private ApiStartPullDownRefreshCtrlRequest() {
        }
    }

    private static class ApiStartPullDownRefreshCtrlResponse extends C25921b {
        private ApiStartPullDownRefreshCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"startPullDownRefresh"})
    public void apiStartPullDownRefreshCtrlAsync(LKEvent lKEvent, ApiStartPullDownRefreshCtrlRequest apiStartPullDownRefreshCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<ApiStartPullDownRefreshCtrlResponse> hVar) {
        final ApiStartPullDownRefreshCtrlResponse apiStartPullDownRefreshCtrlResponse = new ApiStartPullDownRefreshCtrlResponse();
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager();
        if (renderViewManager == null) {
            apiStartPullDownRefreshCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiStartPullDownRefreshCtrlResponse.mErrorMessage = "WebViewManager is null";
            hVar.callback(apiStartPullDownRefreshCtrlResponse);
            return;
        }
        final RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
        if (currentIRender == null) {
            apiStartPullDownRefreshCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiStartPullDownRefreshCtrlResponse.mErrorMessage = "current render is null";
            hVar.callback(apiStartPullDownRefreshCtrlResponse);
            return;
        }
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.container.ApiStartPullDownRefreshCtrlPlugin.RunnableC246291 */

            public void run() {
                currentIRender.onStartPullDownRefresh();
                hVar.callback(apiStartPullDownRefreshCtrlResponse);
            }
        });
    }
}
