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

public class ApiHideHomeButtonCtrlPlugin extends OPPlugin {

    private static class ApiHideHomeButtonCtrlRequest extends C25920a {
        private ApiHideHomeButtonCtrlRequest() {
        }
    }

    private static class ApiHideHomeButtonCtrlResponse extends C25921b {
        private ApiHideHomeButtonCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"hideHomeButton"})
    public void ApiHideHomeButtonCtrlAsync(LKEvent lKEvent, ApiHideHomeButtonCtrlRequest apiHideHomeButtonCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<ApiHideHomeButtonCtrlResponse> hVar) {
        final ApiHideHomeButtonCtrlResponse apiHideHomeButtonCtrlResponse = new ApiHideHomeButtonCtrlResponse();
        if (TextUtils.equals("custom", C67052p.m261322a(getAppContext()))) {
            hVar.callback(apiHideHomeButtonCtrlResponse);
            return;
        }
        final RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager();
        if (renderViewManager == null) {
            apiHideHomeButtonCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiHideHomeButtonCtrlResponse.mErrorMessage = "webview manager is null";
            hVar.callback(apiHideHomeButtonCtrlResponse);
            return;
        }
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.container.navigation.ApiHideHomeButtonCtrlPlugin.RunnableC246751 */

            public void run() {
                try {
                    RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
                    if (currentIRender == null) {
                        apiHideHomeButtonCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                        apiHideHomeButtonCtrlResponse.mErrorMessage = "current render is null";
                    } else {
                        currentIRender.hideNavigationBarHomeButton();
                    }
                    hVar.callback(apiHideHomeButtonCtrlResponse);
                } catch (Throwable th) {
                    AppBrandLogger.m52829e("ApiHideHomeButtonCtrl", th);
                    apiHideHomeButtonCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    apiHideHomeButtonCtrlResponse.mErrorMessage = th.getMessage();
                    hVar.callback(apiHideHomeButtonCtrlResponse);
                }
            }
        });
    }
}
