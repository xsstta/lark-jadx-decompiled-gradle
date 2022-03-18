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

public class ApiHideNavigationBarLoadingCtrlPlugin extends OPPlugin {

    private static class ApiHideNavigationBarLoadingCtrlRequest extends C25920a {
        private ApiHideNavigationBarLoadingCtrlRequest() {
        }
    }

    private static class ApiHideNavigationBarLoadingCtrlResponse extends C25921b {
        private ApiHideNavigationBarLoadingCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"hideNavigationBarLoading"})
    public void ApiHideNavigationBarLoadingCtrlAsync(LKEvent lKEvent, ApiHideNavigationBarLoadingCtrlRequest apiHideNavigationBarLoadingCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<ApiHideNavigationBarLoadingCtrlResponse> hVar) {
        final ApiHideNavigationBarLoadingCtrlResponse apiHideNavigationBarLoadingCtrlResponse = new ApiHideNavigationBarLoadingCtrlResponse();
        if (TextUtils.equals("custom", C67052p.m261322a(getAppContext()))) {
            hVar.callback(apiHideNavigationBarLoadingCtrlResponse);
            return;
        }
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager();
        if (renderViewManager == null) {
            apiHideNavigationBarLoadingCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiHideNavigationBarLoadingCtrlResponse.mErrorMessage = "webview manager is null";
            hVar.callback(apiHideNavigationBarLoadingCtrlResponse);
            return;
        }
        final RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
        if (currentIRender == null) {
            apiHideNavigationBarLoadingCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiHideNavigationBarLoadingCtrlResponse.mErrorMessage = "current render is null";
            hVar.callback(apiHideNavigationBarLoadingCtrlResponse);
            return;
        }
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.container.navigation.ApiHideNavigationBarLoadingCtrlPlugin.RunnableC246761 */

            public void run() {
                try {
                    currentIRender.setNavigationBarLoading(false);
                    hVar.callback(apiHideNavigationBarLoadingCtrlResponse);
                } catch (Throwable th) {
                    AppBrandLogger.m52829e("ApiHideNavigationBarLoadingCtrl", th);
                    apiHideNavigationBarLoadingCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    apiHideNavigationBarLoadingCtrlResponse.mErrorMessage = th.getMessage();
                    hVar.callback(apiHideNavigationBarLoadingCtrlResponse);
                }
            }
        });
    }
}
