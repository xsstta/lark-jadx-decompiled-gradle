package com.larksuite.component.openplatform.core.plugin.container;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AbstractC66202i;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.MiniappHostBase;

public class ApiShowMorePanelCtrlPlugin extends OPPlugin {

    private static class ApiShowMorePanelCtrlRequest extends C25920a {
        private ApiShowMorePanelCtrlRequest() {
        }
    }

    private static class ApiShowMorePanelCtrlResponse extends C25921b {
        private ApiShowMorePanelCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"showMorePanel"})
    public void apiShowMorePanelCtrlAsync(LKEvent lKEvent, ApiShowMorePanelCtrlRequest apiShowMorePanelCtrlRequest, AbstractC25905b bVar, AbstractC25897h<ApiShowMorePanelCtrlResponse> hVar) {
        ApiShowMorePanelCtrlResponse apiShowMorePanelCtrlResponse = new ApiShowMorePanelCtrlResponse();
        AbstractC67497e activityProxy = ((MiniappHostBase) getAppContext().getCurrentActivity()).getActivityProxy();
        if (activityProxy == null) {
            AppBrandLogger.m52829e("ApiShowMorePanelCtrlPlugin", "iActivityProxy is null");
            apiShowMorePanelCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiShowMorePanelCtrlResponse.mErrorMessage = ApiCallResultHelper.generateDataNullExtraInfo("IActivityProxy");
            hVar.callback(apiShowMorePanelCtrlResponse);
            return;
        }
        AbstractC66202i A = activityProxy.mo232109A();
        if (A == null) {
            AppBrandLogger.m52829e("ApiShowMorePanelCtrlPlugin", "iTitleBar is null");
            apiShowMorePanelCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiShowMorePanelCtrlResponse.mErrorMessage = ApiCallResultHelper.generateDataNullExtraInfo("ITitleBar");
            hVar.callback(apiShowMorePanelCtrlResponse);
            return;
        }
        A.mo230950k();
        hVar.callback(apiShowMorePanelCtrlResponse);
    }
}
