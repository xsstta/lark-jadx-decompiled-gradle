package com.larksuite.component.openplatform.core.plugin.container.tabbar;

import android.app.Activity;
import com.alibaba.fastjson.annotation.JSONField;
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
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.MiniappHostBase;

public class ApiShowTabBarPlugin extends OPPlugin {

    private static class ApiShowTabBarRequest extends C25920a {
        @JSONField(name = "animation")
        public boolean mIsAnimation;

        private ApiShowTabBarRequest() {
        }
    }

    private static class ApiShowTabBarResponse extends C25921b {
        private ApiShowTabBarResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"showTabBar"})
    public void showTabBarAsync(LKEvent lKEvent, ApiShowTabBarRequest apiShowTabBarRequest, AbstractC25895f fVar, final AbstractC25897h<ApiShowTabBarResponse> hVar) {
        final ApiShowTabBarResponse apiShowTabBarResponse = new ApiShowTabBarResponse();
        if (!C67054r.m261338a(getAppContext())) {
            fVar.mo92190b().mo92223e("ApiShowTabBar", ApiCode.HIDETABBAR_NO_TAB.msg);
            fillFailedResponse(apiShowTabBarResponse, C25914i.f64197a, C25914i.f64197a.f64117J);
            hVar.callback(apiShowTabBarResponse);
            return;
        }
        final boolean z = apiShowTabBarRequest.mIsAnimation;
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity instanceof MiniappHostBase) {
            MiniappHostBase miniappHostBase = (MiniappHostBase) currentActivity;
            if ((miniappHostBase.getActivityProxy() instanceof C66546p) && ((C66546p) miniappHostBase.getActivityProxy()).mo232112D() != null) {
                final C66661q D = ((C66546p) miniappHostBase.getActivityProxy()).mo232112D();
                if (D != null) {
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.ApiShowTabBarPlugin.RunnableC247031 */

                        public void run() {
                            if (z) {
                                D.mo232391b(true);
                            } else {
                                D.mo232387a(true);
                            }
                            hVar.callback(apiShowTabBarResponse);
                        }
                    });
                    return;
                }
                ILogger b = fVar.mo92190b();
                b.mo92223e("ApiShowTabBar", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment") + " needAnimation " + z);
                fillFailedResponse(apiShowTabBarResponse, C25906a.f64080j, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                hVar.callback(apiShowTabBarResponse);
                return;
            }
        }
        fVar.mo92190b().mo92223e("ApiShowTabBar", "environment not available");
        fillFailedResponse(apiShowTabBarResponse, C25906a.f64080j, "environment not available");
        hVar.callback(apiShowTabBarResponse);
    }
}
