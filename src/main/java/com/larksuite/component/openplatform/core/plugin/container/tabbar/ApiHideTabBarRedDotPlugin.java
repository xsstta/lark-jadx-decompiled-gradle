package com.larksuite.component.openplatform.core.plugin.container.tabbar;

import android.app.Activity;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
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

public class ApiHideTabBarRedDotPlugin extends OPPlugin {

    private static class ApiHideTabBarRedDotRequest extends C25920a {
        @JSONField(name = "index")
        @LKRequiredParam
        public int mIndex;

        private ApiHideTabBarRedDotRequest() {
        }
    }

    private static class ApiHideTabBarRedDotResponse extends C25921b {
        private ApiHideTabBarRedDotResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"hideTabBarRedDot"})
    public void hideTabBarRedDotAsync(LKEvent lKEvent, ApiHideTabBarRedDotRequest apiHideTabBarRedDotRequest, AbstractC25895f fVar, AbstractC25897h<ApiHideTabBarRedDotResponse> hVar) {
        ApiHideTabBarRedDotResponse apiHideTabBarRedDotResponse = new ApiHideTabBarRedDotResponse();
        if (!C67054r.m261338a(getAppContext())) {
            fVar.mo92190b().mo92223e("ApiHideTabbarBadge", ApiCode.HIDETABBAR_NO_TAB.msg);
            fillFailedResponse(apiHideTabBarRedDotResponse, C25914i.f64197a, C25914i.f64197a.f64117J);
            hVar.callback(apiHideTabBarRedDotResponse);
            return;
        }
        int i = apiHideTabBarRedDotRequest.mIndex;
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity instanceof MiniappHostBase) {
            MiniappHostBase miniappHostBase = (MiniappHostBase) currentActivity;
            if (!(miniappHostBase.getActivityProxy() == null || !(miniappHostBase.getActivityProxy() instanceof C66546p) || ((C66546p) miniappHostBase.getActivityProxy()).mo232112D() == null)) {
                C66661q D = ((C66546p) miniappHostBase.getActivityProxy()).mo232112D();
                if (D == null) {
                    fVar.mo92190b().mo92223e("ApiHideTabbarBadge", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    fillFailedResponse(apiHideTabBarRedDotResponse, C25906a.f64080j, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    hVar.callback(apiHideTabBarRedDotResponse);
                    return;
                }
                final C66661q.C66665a a = D.mo232382a(i);
                if (a == null) {
                    ILogger b = fVar.mo92190b();
                    b.mo92223e("ApiHideTabbarBadge", "TabController is null pageIndex " + i);
                    fillFailedResponse(apiHideTabBarRedDotResponse, C25906a.f64072b, "tab item index out of bounds");
                    hVar.callback(apiHideTabBarRedDotResponse);
                    return;
                }
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.ApiHideTabBarRedDotPlugin.RunnableC246971 */

                    public void run() {
                        a.mo232407a(false);
                    }
                });
                hVar.callback(apiHideTabBarRedDotResponse);
                return;
            }
        }
        fVar.mo92190b().mo92223e("ApiHideTabbarBadge", "environment not available");
        fillFailedResponse(apiHideTabBarRedDotResponse, C25906a.f64080j, "environment not available");
        hVar.callback(apiHideTabBarRedDotResponse);
    }
}
