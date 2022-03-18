package com.larksuite.component.openplatform.core.plugin.container.navigation;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
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
import com.tt.miniapp.util.C67052p;
import com.tt.miniapphost.AppbrandContext;

public class ApiShowNavigationBarLoadingCtrlPlugin extends OPPlugin {

    private static class ApiShowNavigationBarLoadingCtrlRequest extends C25920a {
        private ApiShowNavigationBarLoadingCtrlRequest() {
        }
    }

    private static class ApiShowNavigationBarLoadingCtrlResponse extends C25921b {
        private ApiShowNavigationBarLoadingCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"showNavigationBarLoading"})
    public void ApiShowNavigationBarLoadingCtrlAsync(LKEvent lKEvent, ApiShowNavigationBarLoadingCtrlRequest apiShowNavigationBarLoadingCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<ApiShowNavigationBarLoadingCtrlResponse> hVar) {
        final ApiShowNavigationBarLoadingCtrlResponse apiShowNavigationBarLoadingCtrlResponse = new ApiShowNavigationBarLoadingCtrlResponse();
        if (TextUtils.equals("custom", C67052p.m261322a(getAppContext()))) {
            hVar.callback(apiShowNavigationBarLoadingCtrlResponse);
            return;
        }
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager();
        if (renderViewManager == null) {
            apiShowNavigationBarLoadingCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiShowNavigationBarLoadingCtrlResponse.mErrorMessage = "webview manager is null";
            hVar.callback(apiShowNavigationBarLoadingCtrlResponse);
            return;
        }
        final RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
        if (currentIRender == null) {
            apiShowNavigationBarLoadingCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiShowNavigationBarLoadingCtrlResponse.mErrorMessage = "current render is null";
            hVar.callback(apiShowNavigationBarLoadingCtrlResponse);
            return;
        }
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.container.navigation.ApiShowNavigationBarLoadingCtrlPlugin.RunnableC246791 */

            public void run() {
                try {
                    currentIRender.setNavigationBarLoading(true);
                    hVar.callback(apiShowNavigationBarLoadingCtrlResponse);
                } catch (Throwable th) {
                    AppBrandLogger.m52829e("ApiShowNavigationBarLoadingCtrl", th);
                    apiShowNavigationBarLoadingCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    apiShowNavigationBarLoadingCtrlResponse.mErrorMessage = th.getMessage();
                    hVar.callback(apiShowNavigationBarLoadingCtrlResponse);
                }
            }
        });
    }
}
