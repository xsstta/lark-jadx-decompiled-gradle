package com.larksuite.component.openplatform.core.plugin.container.tabbar;

import android.app.Activity;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.container.impl.C24491h;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25914i;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.C66661q;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67054r;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.MiniappHostBase;

public class ApiHideTabBarPlugin extends OPPlugin {

    private static class ApiHideTabBarRequest extends C25920a {
        @JSONField(name = "animation")
        public boolean mIsAnimation;

        private ApiHideTabBarRequest() {
        }
    }

    private static class ApiHideTabBarResponse extends C25921b {
        private ApiHideTabBarResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"hideTabBar"})
    public void hideTabBarAsync(LKEvent lKEvent, ApiHideTabBarRequest apiHideTabBarRequest, AbstractC25895f fVar, final AbstractC25897h<ApiHideTabBarResponse> hVar) {
        AbstractC67497e eVar = null;
        final ApiHideTabBarResponse apiHideTabBarResponse = new ApiHideTabBarResponse();
        if (!C67054r.m261338a(getAppContext())) {
            fVar.mo92190b().mo92223e("ApiHideTabBar", ApiCode.HIDETABBAR_NO_TAB.msg);
            fillFailedResponse(apiHideTabBarResponse, C25914i.f64197a, C25914i.f64197a.f64117J);
            hVar.callback(apiHideTabBarResponse);
            return;
        }
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity instanceof MiniappHostBase) {
            eVar = ((MiniappHostBase) currentActivity).getActivityProxy();
        } else if (getAppContext().getAppContainer() instanceof C24491h) {
            eVar = ((C24491h) getAppContext().getAppContainer()).mo87354s();
        } else {
            AppBrandLogger.m52829e("ApiHideTabBar", "app container can not cast to OPLegacyGadgetAppContainer");
        }
        if (eVar instanceof C66546p) {
            C66546p pVar = (C66546p) eVar;
            if (pVar.mo232112D() != null) {
                final C66661q D = pVar.mo232112D();
                if (D != null) {
                    final boolean z = apiHideTabBarRequest.mIsAnimation;
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.ApiHideTabBarPlugin.RunnableC246961 */

                        public void run() {
                            if (z) {
                                D.mo232391b(false);
                            } else {
                                D.mo232387a(false);
                            }
                            hVar.callback(apiHideTabBarResponse);
                        }
                    });
                    return;
                }
                ILogger b = fVar.mo92190b();
                b.mo92223e("ApiHideTabBar", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment") + " needAnimation " + apiHideTabBarRequest.mIsAnimation);
                fillFailedResponse(apiHideTabBarResponse, C25906a.f64080j, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                hVar.callback(apiHideTabBarResponse);
                return;
            }
        }
        fVar.mo92190b().mo92223e("ApiHideTabBar", "environment not available");
        fillFailedResponse(apiHideTabBarResponse, C25906a.f64080j, "environment not available");
        hVar.callback(apiHideTabBarResponse);
    }
}
