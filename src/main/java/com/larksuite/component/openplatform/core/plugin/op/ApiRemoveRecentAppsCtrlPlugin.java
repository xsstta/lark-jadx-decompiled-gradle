package com.larksuite.component.openplatform.core.plugin.op;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.data.C67494g;
import com.tt.miniapphost.data.ContextSingletonInstance;

public class ApiRemoveRecentAppsCtrlPlugin extends OPPlugin {

    private static class ApiRemoveRecentAppsCtrlRequest extends C25920a {
        @JSONField(name = "app_id")
        @LKRequiredParam
        public String mAppId;

        private ApiRemoveRecentAppsCtrlRequest() {
        }
    }

    private static class ApiRemoveRecentAppsCtrlResponse extends C25921b {
        private ApiRemoveRecentAppsCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"removeFromRecentAppList"})
    public void apiRemoveRecentAppsCtrlAsync(LKEvent lKEvent, ApiRemoveRecentAppsCtrlRequest apiRemoveRecentAppsCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<ApiRemoveRecentAppsCtrlResponse> hVar) {
        final ApiRemoveRecentAppsCtrlResponse apiRemoveRecentAppsCtrlResponse = new ApiRemoveRecentAppsCtrlResponse();
        try {
            if (apiRemoveRecentAppsCtrlRequest.mAppId.isEmpty()) {
                apiRemoveRecentAppsCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiRemoveRecentAppsCtrlResponse.mErrorMessage = ApiCallResultHelper.generateIllegalParamExtraInfo("app_id");
                hVar.callback(apiRemoveRecentAppsCtrlResponse);
                return;
            }
            ContextSingletonInstance.getInstance().getRecentAppsManager().deleteRecentApp(apiRemoveRecentAppsCtrlRequest.mAppId, new C67494g.AbstractC67495a() {
                /* class com.larksuite.component.openplatform.core.plugin.op.ApiRemoveRecentAppsCtrlPlugin.C253161 */
            }, getAppContext());
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiRemoveRecentAppsCtrlPlugin", e);
            apiRemoveRecentAppsCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiRemoveRecentAppsCtrlResponse.mErrorMessage = ApiCallResultHelper.generateThrowableExtraInfo(e);
            hVar.callback(apiRemoveRecentAppsCtrlResponse);
        }
    }
}
