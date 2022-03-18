package com.larksuite.component.openplatform.core.plugin.router;

import android.app.Activity;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.util.C67070z;

public class ExitMiniProgramPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    private static class Request extends C25920a {
        @JSONField(name = "isFullExit")
        public boolean isFullExit;
        @JSONField(name = "noAnimation")
        public boolean noAnimation;

        private Request() {
        }
    }

    /* access modifiers changed from: private */
    public static class Response extends C25921b {
        @JSONField(name = "resultCode")
        public int resultCode;
        @JSONField(name = "resultMsg")
        public String resultMsg;

        private Response() {
        }
    }

    private void handleCallback(int i, String str, AbstractC25897h<Response> hVar) {
        Response response = new Response();
        if (i == 10000) {
            response.resultCode = i;
            response.resultMsg = str;
        } else {
            response.mErrorCode = i;
            response.mErrorMessage = str;
        }
        if (hVar != null) {
            hVar.callback(response);
            return;
        }
        AppBrandLogger.m52829e("ExitMiniProgramPlugin", "handle callback fail : invokeCallback is null");
    }

    @LKPluginFunction(async = true, eventName = {"exitMiniProgram"})
    public void exitMiniProgram(Request request, AbstractC25905b bVar, AbstractC25897h<Response> hVar) {
        if (hVar == null) {
            AppBrandLogger.m52829e("ExitMiniProgramPlugin", "no invokeCallback");
        } else if (request == null) {
            AppBrandLogger.m52829e("ExitMiniProgramPlugin", "api request is null");
            handleCallback(-10001, "api request is null", hVar);
        } else {
            IAppContext appContext = getAppContext();
            if (appContext == null) {
                AppBrandLogger.m52829e("ExitMiniProgramPlugin", "app context is null");
                handleCallback(-10002, "app context is null", hVar);
                return;
            }
            Activity currentActivity = appContext.getCurrentActivity();
            if (currentActivity == null) {
                AppBrandLogger.m52829e("ExitMiniProgramPlugin", "app activity is null");
                handleCallback(-10003, "app activity is null", hVar);
                return;
            }
            AppBrandLogger.m52830i("ExitMiniProgramPlugin", "exit mini program : isFullExit:" + request.isFullExit + " & request.noAnimation: " + request.noAnimation);
            if (request.isFullExit) {
                C67070z.m261391a(currentActivity, 1, appContext);
            } else if (request.noAnimation) {
                C67070z.m261391a(currentActivity, 15, appContext);
            } else {
                C67070z.m261391a(currentActivity, 9, appContext);
            }
            handleCallback(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, "ok", hVar);
        }
    }
}
