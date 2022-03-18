package com.larksuite.component.openplatform.core.plugin.device;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.IActivityLife;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;

public class SetKeepScreenOnPlugin extends OPPlugin {

    private static class SetKeepScreenOnRequest extends C25920a {
        @JSONField(name = "keepScreenOn")
        public boolean keepScreenOn;

        private SetKeepScreenOnRequest() {
        }
    }

    private static class SetKeepScreenOnResponse extends C25921b {
        private SetKeepScreenOnResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"setKeepScreenOn"})
    public void apiSetKeepScreenOnAsync(AbstractC25895f fVar, SetKeepScreenOnRequest setKeepScreenOnRequest, AbstractC25897h<SetKeepScreenOnResponse> hVar) {
        ILogger b = fVar.mo92190b();
        SetKeepScreenOnResponse setKeepScreenOnResponse = new SetKeepScreenOnResponse();
        try {
            final boolean z = setKeepScreenOnRequest.keepScreenOn;
            final IActivityLife activityLife = C67432a.m262319a(getAppContext()).getActivityLife();
            if (activityLife != null) {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.device.SetKeepScreenOnPlugin.RunnableC247231 */

                    public void run() {
                        AppBrandLogger.m52830i("ApisetKeepScreenOnCtrl", "setKeepScreenOn: " + z);
                        activityLife.setKeepScreenOn(z);
                    }
                });
                hVar.callback(setKeepScreenOnResponse);
                return;
            }
            b.mo92223e("ApisetKeepScreenOnCtrl", "activityLife is null");
            setKeepScreenOnResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            setKeepScreenOnResponse.mErrorMessage = ApiCallResultHelper.generateDataNullExtraInfo("iActivityLife");
            hVar.callback(setKeepScreenOnResponse);
        } catch (Exception e) {
            b.mo92223e("ApisetKeepScreenOnCtrl", e);
            setKeepScreenOnResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            setKeepScreenOnResponse.mErrorMessage = ApiCallResultHelper.generateThrowableExtraInfo(e);
            hVar.callback(setKeepScreenOnResponse);
        }
    }
}
