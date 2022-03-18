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

public class ApiRemoveTabBarBadgePlugin extends OPPlugin {

    private static class ApiRemoveTabBarBadgeRequest extends C25920a {
        @JSONField(name = "index")
        @LKRequiredParam
        public int mIndex;

        private ApiRemoveTabBarBadgeRequest() {
        }
    }

    private static class ApiRemoveTabBarBadgeResponse extends C25921b {
        private ApiRemoveTabBarBadgeResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"removeTabBarBadge"})
    public void removeTabBarBadgeAsync(LKEvent lKEvent, ApiRemoveTabBarBadgeRequest apiRemoveTabBarBadgeRequest, AbstractC25895f fVar, AbstractC25897h<ApiRemoveTabBarBadgeResponse> hVar) {
        ApiRemoveTabBarBadgeResponse apiRemoveTabBarBadgeResponse = new ApiRemoveTabBarBadgeResponse();
        if (!C67054r.m261338a(getAppContext())) {
            fVar.mo92190b().mo92223e("ApiRemoveTabbarBadge", ApiCode.HIDETABBAR_NO_TAB.msg);
            fillFailedResponse(apiRemoveTabBarBadgeResponse, C25914i.f64197a, C25914i.f64197a.f64117J);
            hVar.callback(apiRemoveTabBarBadgeResponse);
            return;
        }
        int i = apiRemoveTabBarBadgeRequest.mIndex;
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity instanceof MiniappHostBase) {
            MiniappHostBase miniappHostBase = (MiniappHostBase) currentActivity;
            if (!(miniappHostBase.getActivityProxy() == null || !(miniappHostBase.getActivityProxy() instanceof C66546p) || ((C66546p) miniappHostBase.getActivityProxy()).mo232112D() == null)) {
                C66661q D = ((C66546p) miniappHostBase.getActivityProxy()).mo232112D();
                if (D == null) {
                    fVar.mo92190b().mo92223e("ApiRemoveTabbarBadge", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    fillFailedResponse(apiRemoveTabBarBadgeResponse, C25906a.f64080j, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    hVar.callback(apiRemoveTabBarBadgeResponse);
                    return;
                }
                final C66661q.C66665a a = D.mo232382a(i);
                if (a == null) {
                    ILogger b = fVar.mo92190b();
                    b.mo92223e("ApiRemoveTabbarBadge", "TabController is null pageIndex " + i);
                    C25906a aVar = C25906a.f64072b;
                    fillFailedResponse(apiRemoveTabBarBadgeResponse, aVar, "TabController is null pageIndex " + i);
                    hVar.callback(apiRemoveTabBarBadgeResponse);
                    return;
                }
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.ApiRemoveTabBarBadgePlugin.RunnableC246981 */

                    public void run() {
                        a.mo232408a(false, "");
                    }
                });
                hVar.callback(apiRemoveTabBarBadgeResponse);
                return;
            }
        }
        fVar.mo92190b().mo92223e("ApiRemoveTabbarBadge", "environment not available");
        fillFailedResponse(apiRemoveTabBarBadgeResponse, C25906a.f64080j, "environment not available");
        hVar.callback(apiRemoveTabBarBadgeResponse);
    }
}
