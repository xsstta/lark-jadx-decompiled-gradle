package com.larksuite.component.openplatform.core.plugin.messenger.sendmsg;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.messenger.chat.C25133a;
import com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.ApiSendMsgCardPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i;
import com.tt.miniapphost.C67432a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;

public class ApiSendMsgCardPlugin extends OPPlugin {

    public static class ApiSendMsgCardResponse extends C25921b {
        @JSONField(name = "additionalMessageInfo")
        public JSONArray additionalMessageInfo;
        @JSONField(name = "failedOpenChatIDs")
        public HashSet<String> failedOpenChatIDs;
        @JSONField(name = "sendCardInfo")
        public JSONArray sendCardInfo;
    }

    private static class ApiSendMsgCardHandlerRequest extends C25920a {
        @JSONField(name = "cardContent")
        public JSONObject cardContent;
        @JSONField(name = "chooseChatParams")
        public JSONObject chooseChatParams;
        @JSONField(name = "openChatIDs")
        public JSONArray openChatIDs;
        @JSONField(name = "shouldChooseChat")
        public boolean shouldChooseChat;
        @JSONField(name = "triggerCode")
        public String triggerCode;
        @JSONField(name = "withAdditionalMessage")
        public boolean withAdditionalMessage;

        private ApiSendMsgCardHandlerRequest() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private String getCardContent(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    private org.json.JSONObject transOrgJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new org.json.JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
            return null;
        }
    }

    private List<String> getOpenChatIds(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                if (!TextUtils.isEmpty(jSONArray.getString(i))) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
        }
        return arrayList;
    }

    public /* synthetic */ void lambda$doHandleSendMsgCardWithChooseChat$1$ApiSendMsgCardPlugin(ILogger aVar, ApiSendMsgCardResponse apiSendMsgCardResponse, AbstractC25897h hVar, ApiCallResult apiCallResult) {
        if (!apiCallResult.isFail()) {
            String optString = apiCallResult.getJson().optString("send_card_infos_resp");
            org.json.JSONObject jSONObject = null;
            boolean z = false;
            try {
                if (!TextUtils.isEmpty(optString)) {
                    jSONObject = new org.json.JSONObject(optString);
                }
            } catch (JSONException e) {
                aVar.mo92223e("GADGET_SEND_MSG", e);
                fillFailedResponse(apiSendMsgCardResponse, C25906a.f64080j, e.getMessage());
            }
            int optInt = apiCallResult.getJson().optInt("sendErrorCode", -1);
            String optString2 = apiCallResult.getJson().optString("sendErrorMsg");
            if (!TextUtils.isEmpty(optString2)) {
                apiSendMsgCardResponse.mErrorCode = optInt;
                apiSendMsgCardResponse.mErrorMessage = optString2;
            } else if (jSONObject != null) {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("failedChatIds");
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (optJSONArray != null && i < optJSONArray.length()) {
                    try {
                        arrayList.add(optJSONArray.getString(i));
                    } catch (JSONException e2) {
                        aVar.mo92223e("GADGET_SEND_MSG", "JSONException", e2);
                    }
                    i++;
                }
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("sendCardInfo");
                if (optJSONArray2 != null) {
                    apiSendMsgCardResponse.sendCardInfo = JSON.parseArray(optJSONArray2.toString());
                }
                org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("additionalMessageInfo");
                if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                    apiSendMsgCardResponse.additionalMessageInfo = JSON.parseArray(optJSONArray3.toString());
                }
                org.json.JSONArray optJSONArray4 = jSONObject.optJSONArray("failedLeaveMessageChatIds");
                if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                    z = true;
                }
                if (!arrayList.isEmpty()) {
                    fillFailedResponse(apiSendMsgCardResponse, C25913h.f64193w, C25913h.f64193w.f64117J);
                    apiSendMsgCardResponse.failedOpenChatIDs = new HashSet<>(arrayList);
                } else if (z) {
                    apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.SEND_LEAVE_MESSAGE_FAILED.getCode();
                    apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.SEND_LEAVE_MESSAGE_FAILED.getMsg();
                }
            }
        } else {
            fillFailedResponse(apiSendMsgCardResponse, C25913h.f64149B, C25913h.f64149B.f64117J);
        }
        hVar.callback(apiSendMsgCardResponse);
    }

    @LKPluginFunction(async = true, eventName = {"sendMessageCard"})
    public void sendMsgCardAsync(LKEvent lKEvent, ApiSendMsgCardHandlerRequest apiSendMsgCardHandlerRequest, AbstractC25905b bVar, AbstractC25895f fVar, AbstractC25897h<ApiSendMsgCardResponse> hVar) {
        org.json.JSONObject jSONObject;
        ApiSendMsgCardResponse apiSendMsgCardResponse = new ApiSendMsgCardResponse();
        ILogger b = lKEvent.mo92134c().mo92190b();
        b.mo92224i("GADGET_SENG_MSG", "invoke api. needLeaveMessage=" + apiSendMsgCardHandlerRequest.withAdditionalMessage);
        C25252b.m90696a(C67432a.m262319a(getAppContext()).getAppInfo().appId, C67432a.m262319a(getAppContext()).getAppInfo().scene);
        boolean z = apiSendMsgCardHandlerRequest.shouldChooseChat;
        String cardContent = getCardContent(apiSendMsgCardHandlerRequest.cardContent);
        boolean z2 = apiSendMsgCardHandlerRequest.withAdditionalMessage;
        if (z) {
            b.mo92224i("GADGET_SEND_MSG", "handle send message card with chooseChat");
            if (apiSendMsgCardHandlerRequest.chooseChatParams != null) {
                jSONObject = transOrgJson(apiSendMsgCardHandlerRequest.chooseChatParams);
            } else {
                jSONObject = null;
            }
            doHandleSendMsgCardWithChooseChat(cardContent, jSONObject, hVar, apiSendMsgCardResponse, lKEvent, z2);
            return;
        }
        List<String> openChatIds = getOpenChatIds(apiSendMsgCardHandlerRequest.openChatIDs);
        String str = apiSendMsgCardHandlerRequest.triggerCode;
        String appId = getAppContext().getAppId();
        if (checkParam(openChatIds, str, cardContent, b, hVar, apiSendMsgCardResponse)) {
            if (!openChatIds.isEmpty()) {
                OPTrace a = fVar.mo92188a();
                if (a != null) {
                    a.setRequestId(C12805d.m52897b(getEventContext(lKEvent)));
                }
                new C25261d().mo88372a(openChatIds, appId, cardContent, b, hVar, apiSendMsgCardResponse, getAppContext(), getApiDependency(), a, lKEvent.mo92146m(), z2);
                return;
            }
            new C25268f().mo88379a(str, appId, cardContent, b, hVar, apiSendMsgCardResponse, getAppContext(), z2, getApiDependency());
        }
    }

    private boolean checkParam(List<String> list, String str, String str2, ILogger aVar, AbstractC25897h<ApiSendMsgCardResponse> hVar, ApiSendMsgCardResponse apiSendMsgCardResponse) {
        if (TextUtils.isEmpty(str2)) {
            aVar.mo92224i("GADGET_SEND_MSG", "cardContent is null");
            fillFailedResponse(apiSendMsgCardResponse, C25913h.f64191u, C25913h.f64191u.f64117J);
            hVar.callback(apiSendMsgCardResponse);
            return false;
        } else if (list.size() > 10) {
            aVar.mo92224i("GADGET_SEND_MSG", "openChatIDs count exceed 10");
            fillFailedResponse(apiSendMsgCardResponse, C25913h.f64190t, C25913h.f64190t.f64117J);
            hVar.callback(apiSendMsgCardResponse);
            return false;
        } else if (!list.isEmpty() || !TextUtils.isEmpty(str)) {
            return true;
        } else {
            aVar.mo92224i("GADGET_SEND_MSG", "openChatIDs and triggerCode are both empty");
            fillFailedResponse(apiSendMsgCardResponse, C25913h.f64189s, C25913h.f64189s.f64117J);
            hVar.callback(apiSendMsgCardResponse);
            return false;
        }
    }

    private void doHandleSendMsgCardWithChooseChat(String str, org.json.JSONObject jSONObject, AbstractC25897h<ApiSendMsgCardResponse> hVar, ApiSendMsgCardResponse apiSendMsgCardResponse, LKEvent lKEvent, boolean z) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        if (TextUtils.isEmpty(str)) {
            b.mo92224i("GADGET_SEND_MSG", "cardContent is null");
            fillFailedResponse(apiSendMsgCardResponse, C25913h.f64191u, "cardContent is null");
            hVar.callback(apiSendMsgCardResponse);
            return;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("cardJSON", str);
            jSONObject.put("needLeaveMessage", z);
        } catch (JSONException e) {
            b.mo92223e("GADGET_SEND_MSG", "JSONException", e);
        }
        new C25133a("chooseChat", getAppContext()).mo230470b(C67701b.C67703a.m263358a("chooseChat", new C67704c(jSONObject)).mo234993a(new AbstractC65806i() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$ApiSendMsgCardPlugin$BHLnmrxhLw0hqmrrRjPkf9J83jM */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i
            public final void executeAsyncApiHandle(String str, Runnable runnable) {
                LKEvent.this.mo92142i().executeAsyncApiHandle(str, runnable);
            }
        }).mo234992a(new AbstractC65805h(b, apiSendMsgCardResponse, hVar) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$ApiSendMsgCardPlugin$wo7uJudlNHd50BQVaFvYupv7Sc */
            public final /* synthetic */ ILogger f$1;
            public final /* synthetic */ ApiSendMsgCardPlugin.ApiSendMsgCardResponse f$2;
            public final /* synthetic */ AbstractC25897h f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h
            public final void callback(ApiCallResult apiCallResult) {
                ApiSendMsgCardPlugin.this.lambda$doHandleSendMsgCardWithChooseChat$1$ApiSendMsgCardPlugin(this.f$1, this.f$2, this.f$3, apiCallResult);
            }
        }).mo234994a(getAppContext().getAppType()).mo234996a());
    }
}
