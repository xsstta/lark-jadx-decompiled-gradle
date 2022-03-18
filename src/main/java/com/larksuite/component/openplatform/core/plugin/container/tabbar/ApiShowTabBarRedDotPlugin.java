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

public class ApiShowTabBarRedDotPlugin extends OPPlugin {

    private static class ApiShowTabBarRedDotRequest extends C25920a {
        @JSONField(name = "index")
        @LKRequiredParam
        public int mIndex;

        private ApiShowTabBarRedDotRequest() {
        }
    }

    private static class ApiShowTabBarRedDotResponse extends C25921b {
        private ApiShowTabBarRedDotResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"showTabBarRedDot"})
    public void showTabBarRedDotAsync(LKEvent lKEvent, ApiShowTabBarRedDotRequest apiShowTabBarRedDotRequest, AbstractC25895f fVar, AbstractC25897h<ApiShowTabBarRedDotResponse> hVar) {
        ApiShowTabBarRedDotResponse apiShowTabBarRedDotResponse = new ApiShowTabBarRedDotResponse();
        if (!C67054r.m261338a(getAppContext())) {
            fVar.mo92190b().mo92223e("tma_ApiShowTabbarRedDot", ApiCode.HIDETABBAR_NO_TAB.msg);
            fillFailedResponse(apiShowTabBarRedDotResponse, C25914i.f64197a, C25914i.f64197a.f64117J);
            hVar.callback(apiShowTabBarRedDotResponse);
            return;
        }
        int i = apiShowTabBarRedDotRequest.mIndex;
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity instanceof MiniappHostBase) {
            MiniappHostBase miniappHostBase = (MiniappHostBase) currentActivity;
            if (!(miniappHostBase.getActivityProxy() == null || !(miniappHostBase.getActivityProxy() instanceof C66546p) || ((C66546p) miniappHostBase.getActivityProxy()).mo232112D() == null)) {
                C66661q D = ((C66546p) miniappHostBase.getActivityProxy()).mo232112D();
                if (D == null) {
                    fVar.mo92190b().mo92223e("tma_ApiShowTabbarRedDot", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    fillFailedResponse(apiShowTabBarRedDotResponse, C25906a.f64080j, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    hVar.callback(apiShowTabBarRedDotResponse);
                    return;
                }
                final C66661q.C66665a a = D.mo232382a(i);
                if (a == null) {
                    ILogger b = fVar.mo92190b();
                    b.mo92223e("tma_ApiShowTabbarRedDot", "TabController is null pageIndex " + i);
                    fillFailedResponse(apiShowTabBarRedDotResponse, C25906a.f64072b, "tab item index out of bounds");
                    hVar.callback(apiShowTabBarRedDotResponse);
                    return;
                }
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.ApiShowTabBarRedDotPlugin.RunnableC247041 */

                    public void run() {
                        a.mo232407a(true);
                    }
                });
                hVar.callback(apiShowTabBarRedDotResponse);
                return;
            }
        }
        fVar.mo92190b().mo92223e("tma_ApiShowTabbarRedDot", "environment not available");
        fillFailedResponse(apiShowTabBarRedDotResponse, C25906a.f64080j, "environment not available");
        hVar.callback(apiShowTabBarRedDotResponse);
    }
}
