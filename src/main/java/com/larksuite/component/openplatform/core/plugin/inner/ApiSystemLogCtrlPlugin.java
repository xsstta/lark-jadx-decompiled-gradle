package com.larksuite.component.openplatform.core.plugin.inner;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.C66020b;

public class ApiSystemLogCtrlPlugin extends OPPlugin {

    private static class ApiSystemLogCtrlRequest extends C25920a {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public JSONObject mData;
        @JSONField(name = "tag")
        public String mTag;

        private ApiSystemLogCtrlRequest() {
        }
    }

    private static class ApiSystemLogCtrlResponse extends C25921b {
        private ApiSystemLogCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"systemLog"})
    public void systemLog(ApiSystemLogCtrlRequest apiSystemLogCtrlRequest, AbstractC25895f fVar, AbstractC25897h<ApiSystemLogCtrlResponse> hVar) {
        org.json.JSONObject jSONObject;
        ApiSystemLogCtrlResponse apiSystemLogCtrlResponse = new ApiSystemLogCtrlResponse();
        try {
            String str = apiSystemLogCtrlRequest.mTag;
            if (apiSystemLogCtrlRequest.mData != null) {
                jSONObject = new org.json.JSONObject(apiSystemLogCtrlRequest.mData.toJSONString());
            } else {
                jSONObject = new org.json.JSONObject();
            }
            ILogger b = fVar.mo92190b();
            b.mo92222d("tma_SystemLogCtrl", "event" + str + Constants.ScionAnalytics.MessageType.DATA_MESSAGE + jSONObject);
            C66020b.m258530a(str, getAppContext()).mo231091a(jSONObject).mo231092a();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_SystemLogCtrl", "Exception", e);
            apiSystemLogCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiSystemLogCtrlResponse.mErrorMessage = e.getMessage();
        }
        hVar.callback(apiSystemLogCtrlResponse);
    }
}
