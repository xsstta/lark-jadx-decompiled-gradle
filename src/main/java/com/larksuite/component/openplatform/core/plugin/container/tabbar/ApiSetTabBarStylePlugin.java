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

public class ApiSetTabBarStylePlugin extends OPPlugin {

    private static class ApiSetTabBarStyleRequest extends C25920a {
        @JSONField(name = "backgroundColor")
        @LKRequiredParam
        public String mBackgroundColor;
        @JSONField(name = "borderColor")
        public String mBorderColor;
        @JSONField(name = "borderStyle")
        @LKRequiredParam
        public String mBorderStyle;
        @JSONField(name = "color")
        @LKRequiredParam
        public String mColor;
        @JSONField(name = "selectedColor")
        @LKRequiredParam
        public String mSelectedColor;

        private ApiSetTabBarStyleRequest() {
        }
    }

    private static class ApiSetTabBarStyleResponse extends C25921b {
        private ApiSetTabBarStyleResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"setTabBarStyle"})
    public void setTabBarStyleAsync(LKEvent lKEvent, ApiSetTabBarStyleRequest apiSetTabBarStyleRequest, AbstractC25895f fVar, final AbstractC25897h<ApiSetTabBarStyleResponse> hVar) {
        final ApiSetTabBarStyleResponse apiSetTabBarStyleResponse = new ApiSetTabBarStyleResponse();
        if (!C67054r.m261338a(getAppContext())) {
            fVar.mo92190b().mo92223e("ApiSetTabBarStyle", ApiCode.HIDETABBAR_NO_TAB.msg);
            fillFailedResponse(apiSetTabBarStyleResponse, C25914i.f64197a, C25914i.f64197a.f64117J);
            hVar.callback(apiSetTabBarStyleResponse);
            return;
        }
        final String str = apiSetTabBarStyleRequest.mColor;
        final String str2 = apiSetTabBarStyleRequest.mSelectedColor;
        final String str3 = apiSetTabBarStyleRequest.mBackgroundColor;
        final String str4 = apiSetTabBarStyleRequest.mBorderStyle;
        final String str5 = apiSetTabBarStyleRequest.mBorderColor;
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity instanceof MiniappHostBase) {
            MiniappHostBase miniappHostBase = (MiniappHostBase) currentActivity;
            if ((miniappHostBase.getActivityProxy() instanceof C66546p) && ((C66546p) miniappHostBase.getActivityProxy()).mo232112D() != null) {
                final C66661q D = ((C66546p) miniappHostBase.getActivityProxy()).mo232112D();
                if (D != null) {
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.ApiSetTabBarStylePlugin.RunnableC247011 */

                        public void run() {
                            D.mo232386a(str, str2, str3, str4, str5);
                            hVar.callback(apiSetTabBarStyleResponse);
                        }
                    });
                    return;
                }
                ILogger b = fVar.mo92190b();
                b.mo92223e("ApiSetTabBarStyle", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment") + " color " + str + " selectedColor " + str2 + " backgroundColor " + str3 + " borderStyle " + str4);
                fillFailedResponse(apiSetTabBarStyleResponse, C25906a.f64080j, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                hVar.callback(apiSetTabBarStyleResponse);
                return;
            }
        }
        fVar.mo92190b().mo92223e("ApiSetTabBarStyle", "environment not available");
        fillFailedResponse(apiSetTabBarStyleResponse, C25906a.f64080j, "environment not available");
        hVar.callback(apiSetTabBarStyleResponse);
    }
}
