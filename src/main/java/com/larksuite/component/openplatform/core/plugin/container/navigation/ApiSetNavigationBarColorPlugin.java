package com.larksuite.component.openplatform.core.plugin.container.navigation;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapphost.AppbrandContext;

public class ApiSetNavigationBarColorPlugin extends OPPlugin {

    private static class ApiSetNavigationBarColorRequest extends C25920a {
        @JSONField(name = "backgroundColor")
        @LKRequiredParam
        public String backgroundColor;
        @JSONField(name = "frontColor")
        public String frontColor;

        private ApiSetNavigationBarColorRequest() {
        }
    }

    private static class ApiSetNavigationBarColorResponse extends C25921b {
        private ApiSetNavigationBarColorResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"setNavigationBarColor"})
    public void ApiSetNavigationBarColorAsync(LKEvent lKEvent, ApiSetNavigationBarColorRequest apiSetNavigationBarColorRequest, final AbstractC25897h<ApiSetNavigationBarColorResponse> hVar) {
        final ApiSetNavigationBarColorResponse apiSetNavigationBarColorResponse = new ApiSetNavigationBarColorResponse();
        try {
            final String str = apiSetNavigationBarColorRequest.frontColor;
            final String str2 = apiSetNavigationBarColorRequest.backgroundColor;
            AppBrandLogger.m52830i("ApiSetNavigationBarColor", "frontColor ", str, "backgroundColor", str2);
            if (!TextUtils.equals(str, "#ffffff") && !TextUtils.equals(str, "#000000")) {
                fillFailedResponse(apiSetNavigationBarColorResponse, C25906a.f64072b, "invalid front color param");
                hVar.callback(apiSetNavigationBarColorResponse);
            } else if (TextUtils.isEmpty(str2)) {
                fillFailedResponse(apiSetNavigationBarColorResponse, C25906a.f64072b, "invalid background color param");
                hVar.callback(apiSetNavigationBarColorResponse);
            } else {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.container.navigation.ApiSetNavigationBarColorPlugin.RunnableC246771 */

                    public void run() {
                        RenderViewManager.IRender currentIRender = AppbrandApplicationImpl.getInst(ApiSetNavigationBarColorPlugin.this.getAppContext()).getRenderViewManager().getCurrentIRender();
                        if (currentIRender != null) {
                            currentIRender.setNavigationBarColor(str, str2);
                            hVar.callback(apiSetNavigationBarColorResponse);
                            return;
                        }
                        ApiSetNavigationBarColorPlugin.this.fillFailedResponse(apiSetNavigationBarColorResponse, C25906a.f64080j, ApiCallResultHelper.generateDataNullExtraInfo("render"));
                        hVar.callback(apiSetNavigationBarColorResponse);
                    }
                });
            }
        } catch (IllegalArgumentException e) {
            AppBrandLogger.m52829e("ApiSetNavigationBarColor", e);
            fillFailedResponse(apiSetNavigationBarColorResponse, C25906a.f64072b, "");
            hVar.callback(apiSetNavigationBarColorResponse);
        } catch (Exception e2) {
            AppBrandLogger.m52829e("ApiSetNavigationBarColor", e2);
            fillFailedResponse(apiSetNavigationBarColorResponse, C25906a.f64080j, e2.getMessage());
            hVar.callback(apiSetNavigationBarColorResponse);
        }
    }
}
