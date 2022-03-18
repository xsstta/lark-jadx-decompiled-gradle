package com.larksuite.component.openplatform.core.plugin.container.navigation;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67052p;
import com.tt.miniapphost.AppbrandContext;

public class ApiSetNavigationBarTitlePlugin extends OPPlugin {

    private static class ApiSetNavigationBarTitleRequest extends C25920a {
        @JSONField(name = "title")
        @LKRequiredParam
        public String title;

        private ApiSetNavigationBarTitleRequest() {
        }
    }

    private static class ApiSetNavigationBarTitleResponse extends C25921b {
        private ApiSetNavigationBarTitleResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    public boolean customNavigationBar() {
        IAppContext appContext = getAppContext();
        if (appContext != null) {
            return TextUtils.equals(C67052p.m261322a(appContext), "custom");
        }
        return false;
    }

    @LKPluginFunction(async = true, eventName = {"setNavigationBarTitle"})
    public void ApiSetNavigationBarTitleAsync(LKEvent lKEvent, ApiSetNavigationBarTitleRequest apiSetNavigationBarTitleRequest, AbstractC25905b bVar, final AbstractC25897h<ApiSetNavigationBarTitleResponse> hVar) {
        final ApiSetNavigationBarTitleResponse apiSetNavigationBarTitleResponse = new ApiSetNavigationBarTitleResponse();
        try {
            final String str = apiSetNavigationBarTitleRequest.title;
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.container.navigation.ApiSetNavigationBarTitlePlugin.RunnableC246781 */

                public void run() {
                    boolean customNavigationBar = ApiSetNavigationBarTitlePlugin.this.customNavigationBar();
                    AppBrandLogger.m52830i("tma_ApiSetNavigationBarTitle", "isCustomNavigationBar:" + customNavigationBar);
                    if (!customNavigationBar) {
                        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(ApiSetNavigationBarTitlePlugin.this.getAppContext()).getRenderViewManager();
                        if (renderViewManager != null) {
                            RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
                            if (currentIRender != null) {
                                currentIRender.setNavigationBarTitle(str);
                                return;
                            }
                            apiSetNavigationBarTitleResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                            apiSetNavigationBarTitleResponse.mErrorMessage = "current render is null";
                            hVar.callback(apiSetNavigationBarTitleResponse);
                            return;
                        }
                        apiSetNavigationBarTitleResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                        apiSetNavigationBarTitleResponse.mErrorMessage = "WebViewManager is null";
                        hVar.callback(apiSetNavigationBarTitleResponse);
                    }
                }
            });
            hVar.callback(apiSetNavigationBarTitleResponse);
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ApiSetNavigationBarTitle", e);
            apiSetNavigationBarTitleResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiSetNavigationBarTitleResponse.mErrorMessage = e.getMessage();
            hVar.callback(apiSetNavigationBarTitleResponse);
        }
    }
}
