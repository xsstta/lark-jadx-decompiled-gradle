package com.larksuite.component.openplatform.core.plugin.messenger.sendmsg;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.larkbrand.utils.C13362n;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.littleapp.entity.ChatModel;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GetTriggerContextHandlerPlugin extends OPPlugin {

    private static class GetTriggerContextHandlerRequest extends C25920a {
        @JSONField(name = "triggerCode")
        @LKRequiredParam
        public String triggerCode;

        private GetTriggerContextHandlerRequest() {
        }
    }

    private static class GetTriggerContextHandlerResponse extends C25921b {
        @JSONField(name = "bizType")
        public String bizType;
        @JSONField(name = "openChatId")
        public String openChatId;

        private GetTriggerContextHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getTriggerContext"})
    public void GetTriggerContextHandlerAsync(GetTriggerContextHandlerRequest getTriggerContextHandlerRequest, AbstractC25895f fVar, final AbstractC25897h<GetTriggerContextHandlerResponse> hVar) {
        final GetTriggerContextHandlerResponse getTriggerContextHandlerResponse = new GetTriggerContextHandlerResponse();
        final ILogger b = fVar.mo92190b();
        b.mo92224i("GetTriggerContextHandlerPlugin", "invoke api");
        if (TextUtils.isEmpty(getTriggerContextHandlerRequest.triggerCode)) {
            getTriggerContextHandlerResponse.mErrorCode = ApiCode.GENERAL_PARAM.code;
            getTriggerContextHandlerResponse.mErrorMessage = ApiCode.GENERAL_PARAM.msg;
            hVar.callback(getTriggerContextHandlerResponse);
            b.mo92223e("GetTriggerContextHandlerPlugin", "triggerCode is null");
            return;
        }
        final ChatModel a = getApiDependency().mo235014a().mo235063a(getTriggerContextHandlerRequest.triggerCode);
        if (TextUtils.isEmpty(a.mo148774a())) {
            getTriggerContextHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            getTriggerContextHandlerResponse.mErrorMessage = ApiCode.GENERAL_UNKONW_ERROR.msg;
            b.mo92223e("GetTriggerContextHandlerPlugin", "chatId is null");
            hVar.callback(getTriggerContextHandlerResponse);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(new JSONObject().put("id", a.mo148774a()));
            C13362n.m54361a(jSONArray.toString(), new C13362n.AbstractC13365a() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.GetTriggerContextHandlerPlugin.C252481 */

                @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                /* renamed from: a */
                public void mo49668a(HashMap<String, Object> hashMap) {
                    if (hashMap.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == null) {
                        getTriggerContextHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                        getTriggerContextHandlerResponse.mErrorMessage = "get openChatId error";
                        b.mo92223e("GetTriggerContextHandlerPlugin", "get openChatId is null");
                        hVar.callback(getTriggerContextHandlerResponse);
                        return;
                    }
                    try {
                        JSONArray jSONArray = (JSONArray) hashMap.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        b.mo92224i("GetTriggerContextHandlerPlugin", jSONArray.toString());
                        if (jSONArray.length() == 1) {
                            getTriggerContextHandlerResponse.openChatId = (String) jSONArray.getJSONObject(0).opt("id");
                            getTriggerContextHandlerResponse.bizType = a.mo148776c();
                            ILogger aVar = b;
                            aVar.mo92224i("GetTriggerContextHandlerPlugin", "success. bizType:" + a.mo148776c());
                            hVar.callback(getTriggerContextHandlerResponse);
                            return;
                        }
                        getTriggerContextHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                        getTriggerContextHandlerResponse.mErrorMessage = "get openChatId error";
                        hVar.callback(getTriggerContextHandlerResponse);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        b.mo92223e("GetTriggerContextHandlerPlugin", "json error", e);
                        getTriggerContextHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                        getTriggerContextHandlerResponse.mErrorMessage = "get openChatId error";
                        hVar.callback(getTriggerContextHandlerResponse);
                    }
                }

                @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                /* renamed from: a */
                public void mo49667a(String str, Throwable th) {
                    getTriggerContextHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    getTriggerContextHandlerResponse.mErrorMessage = "get openChatId error";
                    hVar.callback(getTriggerContextHandlerResponse);
                    b.mo92223e("GetTriggerContextHandlerPlugin", "get openChatId error", th);
                }
            }, false, getAppContext());
        } catch (Exception e) {
            e.printStackTrace();
            b.mo92223e("GetTriggerContextHandlerPlugin", "json error: ", e);
            getTriggerContextHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            getTriggerContextHandlerResponse.mErrorMessage = "get openChatId error";
            hVar.callback(getTriggerContextHandlerResponse);
        }
    }
}
