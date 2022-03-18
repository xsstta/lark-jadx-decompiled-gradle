package com.larksuite.component.openplatform.core.plugin.container;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AbstractC66202i;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.MiniappHostBase;

public class ApiSetMenuButtonVisibilityCtrlPlugin extends OPPlugin {

    private static class ApiSetMenuButtonVisibilityCtrlResponse extends C25921b {
        private ApiSetMenuButtonVisibilityCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private static class ApiSetMenuButtonVisibilityCtrlRequest extends C25920a {
        @JSONField(name = "visible")
        public boolean mVisible = true;

        private ApiSetMenuButtonVisibilityCtrlRequest() {
        }
    }

    @LKPluginFunction(async = true, eventName = {"setMenuButtonVisibility"})
    public void setMenuButtonVisibility(ApiSetMenuButtonVisibilityCtrlRequest apiSetMenuButtonVisibilityCtrlRequest, AbstractC25895f fVar, AbstractC25897h<ApiSetMenuButtonVisibilityCtrlResponse> hVar) {
        ILogger b = fVar.mo92190b();
        ApiSetMenuButtonVisibilityCtrlResponse apiSetMenuButtonVisibilityCtrlResponse = new ApiSetMenuButtonVisibilityCtrlResponse();
        AbstractC67497e activityProxy = ((MiniappHostBase) getAppContext().getCurrentActivity()).getActivityProxy();
        if (activityProxy == null) {
            b.mo92223e("ApiSetMenuButtonVisibilityCtrl", "iActivityProxy is null");
            apiSetMenuButtonVisibilityCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiSetMenuButtonVisibilityCtrlResponse.mErrorMessage = ApiCallResultHelper.generateDataNullExtraInfo("IActivityProxy");
            hVar.callback(apiSetMenuButtonVisibilityCtrlResponse);
            return;
        }
        AbstractC66202i A = activityProxy.mo232109A();
        if (A == null) {
            b.mo92223e("ApiSetMenuButtonVisibilityCtrl", "iTitleBar is null");
            apiSetMenuButtonVisibilityCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiSetMenuButtonVisibilityCtrlResponse.mErrorMessage = ApiCallResultHelper.generateDataNullExtraInfo("ITitleBar");
            hVar.callback(apiSetMenuButtonVisibilityCtrlResponse);
            return;
        }
        boolean z = apiSetMenuButtonVisibilityCtrlRequest.mVisible;
        b.mo92224i("ApiSetMenuButtonVisibilityCtrl", " set visible " + z);
        A.mo230940b(z, getAppContext());
        hVar.callback(apiSetMenuButtonVisibilityCtrlResponse);
    }
}
