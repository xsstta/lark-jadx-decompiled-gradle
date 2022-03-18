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

public class ApiSetTabbarBadgePlugin extends OPPlugin {

    private static class ApiSetTabbarBadgeRequest extends C25920a {
        @JSONField(name = "index")
        @LKRequiredParam
        public int mIndex;
        @JSONField(name = "text")
        @LKRequiredParam
        public String mText;

        private ApiSetTabbarBadgeRequest() {
        }
    }

    private static class ApiSetTabbarBadgeResponse extends C25921b {
        private ApiSetTabbarBadgeResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"setTabBarBadge"})
    public void setTabbarBadgeAsync(LKEvent lKEvent, ApiSetTabbarBadgeRequest apiSetTabbarBadgeRequest, AbstractC25895f fVar, AbstractC25897h<ApiSetTabbarBadgeResponse> hVar) {
        ApiSetTabbarBadgeResponse apiSetTabbarBadgeResponse = new ApiSetTabbarBadgeResponse();
        if (!C67054r.m261338a(getAppContext())) {
            fVar.mo92190b().mo92223e("ApiSetTabbarBadge", ApiCode.HIDETABBAR_NO_TAB.msg);
            fillFailedResponse(apiSetTabbarBadgeResponse, C25914i.f64197a, C25914i.f64197a.f64117J);
            hVar.callback(apiSetTabbarBadgeResponse);
            return;
        }
        int i = apiSetTabbarBadgeRequest.mIndex;
        final String str = apiSetTabbarBadgeRequest.mText;
        if (str == null || str.isEmpty()) {
            fVar.mo92190b().mo92223e("ApiSetTabbarBadge", ApiCode.SETTABBARBADGE_TEXT_EMPTY.msg);
            fillFailedResponse(apiSetTabbarBadgeResponse, C25906a.f64072b, "text is empty");
            hVar.callback(apiSetTabbarBadgeResponse);
            return;
        }
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity instanceof MiniappHostBase) {
            MiniappHostBase miniappHostBase = (MiniappHostBase) currentActivity;
            if (!(miniappHostBase.getActivityProxy() == null || !(miniappHostBase.getActivityProxy() instanceof C66546p) || ((C66546p) miniappHostBase.getActivityProxy()).mo232112D() == null)) {
                C66661q D = ((C66546p) miniappHostBase.getActivityProxy()).mo232112D();
                if (D == null) {
                    fVar.mo92190b().mo92223e("ApiSetTabbarBadge", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    fillFailedResponse(apiSetTabbarBadgeResponse, C25906a.f64080j, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                    hVar.callback(apiSetTabbarBadgeResponse);
                    return;
                }
                final C66661q.C66665a a = D.mo232382a(i);
                if (a == null) {
                    ILogger b = fVar.mo92190b();
                    b.mo92223e("ApiSetTabbarBadge", "TabController is null pageIndex " + i);
                    fillFailedResponse(apiSetTabbarBadgeResponse, C25906a.f64080j, "tabCtroller = null");
                    hVar.callback(apiSetTabbarBadgeResponse);
                    return;
                }
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.ApiSetTabbarBadgePlugin.RunnableC247021 */

                    public void run() {
                        a.mo232408a(true, str);
                    }
                });
                hVar.callback(apiSetTabbarBadgeResponse);
                return;
            }
        }
        fVar.mo92190b().mo92223e("ApiSetTabbarBadge", "environment not available");
        fillFailedResponse(apiSetTabbarBadgeResponse, C25906a.f64080j, "environment not available");
        hVar.callback(apiSetTabbarBadgeResponse);
    }
}
