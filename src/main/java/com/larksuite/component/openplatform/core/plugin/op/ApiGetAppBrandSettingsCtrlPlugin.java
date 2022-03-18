package com.larksuite.component.openplatform.core.plugin.op;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONArray;
import org.json.JSONObject;

public class ApiGetAppBrandSettingsCtrlPlugin extends OPPlugin {
    private IAppContext mAppContext;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    private static class ApiGetAppBrandSettingsCtrlResponse extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public String mData;

        private ApiGetAppBrandSettingsCtrlResponse() {
        }
    }

    @LKPluginFunction(eventName = {"getAppbrandSettingsSync"})
    public ApiGetAppBrandSettingsCtrlResponse apiGetAppBrandSettingsCtrlAsync(LKEvent lKEvent, AbstractC25895f fVar) {
        this.mAppContext = getEventContext(lKEvent);
        ApiGetAppBrandSettingsCtrlResponse apiGetAppBrandSettingsCtrlResponse = new ApiGetAppBrandSettingsCtrlResponse();
        JSONArray optJSONArray = lKEvent.mo92147n().optJSONArray("fields");
        if (optJSONArray == null) {
            apiGetAppBrandSettingsCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetAppBrandSettingsCtrlResponse.mErrorMessage = ApiCallResultHelper.generateDataNullExtraInfo("fields");
            return apiGetAppBrandSettingsCtrlResponse;
        }
        String optString = optJSONArray.optString(0);
        JSONObject a = C12738a.m52725a(AppbrandContext.getInst().getApplicationContext());
        if (a == null) {
            fVar.mo92190b().mo92223e("ApiGetAppBrandSettingsCtrl", "settings is null");
            apiGetAppBrandSettingsCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetAppBrandSettingsCtrlResponse.mErrorMessage = ApiCallResultHelper.generateDataNullExtraInfo("settings");
            return apiGetAppBrandSettingsCtrlResponse;
        }
        JSONObject optJSONObject = a.optJSONObject(optString);
        if (optJSONObject == null) {
            fVar.mo92190b().mo92223e("ApiGetAppBrandSettingsCtrl", "targetModule is null");
            apiGetAppBrandSettingsCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetAppBrandSettingsCtrlResponse.mErrorMessage = ApiCallResultHelper.generateDataNullExtraInfo("targetModule");
            return apiGetAppBrandSettingsCtrlResponse;
        }
        apiGetAppBrandSettingsCtrlResponse.mData = optJSONObject.toString();
        return apiGetAppBrandSettingsCtrlResponse;
    }
}
