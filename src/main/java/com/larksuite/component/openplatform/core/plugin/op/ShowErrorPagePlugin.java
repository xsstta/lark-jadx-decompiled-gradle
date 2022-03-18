package com.larksuite.component.openplatform.core.plugin.op;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.view.swipeback.C67224a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.C67478b;

public class ShowErrorPagePlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    private static class ShowErrorPageRequest extends C25920a {
        @JSONField(name = "closeApp")
        public boolean mCloseApp;
        @JSONField(name = ShareHitPoint.f121869d)
        @LKRequiredParam
        public String mType;

        private ShowErrorPageRequest() {
        }
    }

    private static class ShowErrorPageResponse extends C25921b {
        private ShowErrorPageResponse() {
        }
    }

    private String appendURL(String str) {
        return AppbrandConstant.C65701b.m257612c().mo230139d() + "/" + str + "?" + C67478b.m262466b();
    }

    @LKPluginFunction(async = true, eventName = {"showErrorPage"})
    public void showErrorPage(LKEvent lKEvent, ShowErrorPageRequest showErrorPageRequest, AbstractC25897h<ShowErrorPageResponse> hVar) {
        IAppContext eventContext = getEventContext(lKEvent);
        if (eventContext == null) {
            lKEvent.mo92134c().mo92190b().mo92223e("ApiShowErrorPageCtrl", "appContext is null");
            ShowErrorPageResponse showErrorPageResponse = new ShowErrorPageResponse();
            fillFailedResponse(showErrorPageResponse, C25906a.f64080j, "appContext is null");
            hVar.callback(showErrorPageResponse);
            return;
        }
        ShowErrorPageResponse showErrorPageResponse2 = new ShowErrorPageResponse();
        Activity currentActivity = eventContext.getCurrentActivity();
        if (currentActivity == null) {
            showErrorPageResponse2.mErrorCode = C25906a.f64080j.f64115H;
            showErrorPageResponse2.mErrorMessage = "activity is null";
            hVar.callback(showErrorPageResponse2);
            return;
        }
        String str = showErrorPageRequest.mType;
        C67224a.f169674a = "others";
        C67224a.f169675b = true;
        String schema = AppbrandApplicationImpl.getInst(eventContext).getSchema();
        if (TextUtils.isEmpty(schema) || !HostDependManager.getInst().handleAppbrandDisablePage(currentActivity, schema)) {
            HostDependManager.getInst().jumpToWebView(currentActivity, appendURL(str), null, true);
        }
        hVar.callback(showErrorPageResponse2);
        if (showErrorPageRequest.mCloseApp) {
            C67070z.m261391a(currentActivity, 14, eventContext);
        } else {
            C67070z.m261391a(currentActivity, 9, eventContext);
        }
    }
}
