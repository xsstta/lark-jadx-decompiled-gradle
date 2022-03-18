package com.larksuite.component.openplatform.core.plugin.messenger.sendmsg;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.messenger.chat.C25133a;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h;
import com.tt.miniapphost.C67432a;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"sendMessageCard"}, support = {AppType.WebAPP, AppType.GadgetAPP})
public class SendMsgCardHandler extends AbstractC65797c {

    public enum Error {
        NO_PARAMS(-1, "triggerCode or openChatIDs is required"),
        EXCEED_IDS(-2, "openChatIDs count exceed 10"),
        CARD_CONTENT_NULL(-3, "cardContent is null"),
        CARD_CONTENT_PARSE_FAILED(-4, "card json convert to pb error"),
        SEND_FAILED(-5, "System Error"),
        USER_CANCEL(-6, "user cancel send"),
        TRIGGER_CODE_INVALID(-7, "triggerCode is invalid"),
        NOT_SUPPORT_SCENE(-7, "need open app from chat keyborad"),
        SOME_IDS_INVALID(-8, "some part of openChatIDs are invalid"),
        UNKNOWN_ERROR(-9, "Unknown Error"),
        CHOOSE_CHAT_ERROR(-10, "choose chat error");
        
        private int code;
        private String msg;

        public int getCode() {
            return this.code;
        }

        public String getMsg() {
            return this.msg;
        }

        private Error(int i, String str) {
            this.code = i;
            this.msg = str;
        }
    }

    public SendMsgCardHandler() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("sendMessageCard");
    }

    /* renamed from: b */
    private void m90683b() {
        String str;
        JSONObject jSONObject = (JSONObject) this.f165820j.mo234984a("cardContent");
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "cardContent is null");
            mo230493c(C25252b.m90692a(Error.CARD_CONTENT_NULL.getCode(), Error.CARD_CONTENT_NULL.getMsg()));
            return;
        }
        JSONObject jSONObject2 = (JSONObject) this.f165820j.mo234984a("chooseChatParams");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put("cardJSON", str);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("GADGET_SENG_MSG", "JSONException", e);
        }
        new C25133a("chooseChat", mo230473f()).mo230470b(C67701b.C67703a.m263358a("chooseChat", new C67704c(jSONObject2)).mo234993a(this.f165820j.mo234989e()).mo234992a(new AbstractC65805h() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.SendMsgCardHandler.C252491 */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h
            public void callback(ApiCallResult apiCallResult) {
                if (!apiCallResult.isFail()) {
                    JSONObject json = apiCallResult.getJson();
                    int optInt = json.optInt("sendErrorCode", -1);
                    String optString = json.optString("sendErrorMsg");
                    if (!TextUtils.isEmpty(optString)) {
                        SendMsgCardHandler.this.mo230493c(C25252b.m90692a(optInt, optString));
                        return;
                    }
                    JSONObject optJSONObject = json.optJSONObject("send_card_infos_resp");
                    if (optJSONObject == null) {
                        SendMsgCardHandler.this.mo230494j();
                        return;
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("failedChatIds");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            try {
                                arrayList.add(optJSONArray.getString(i));
                            } catch (JSONException e) {
                                AppBrandLogger.m52829e("GADGET_SENG_MSG", "JSONException", e);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        SendMsgCardHandler.this.mo230494j();
                    } else {
                        SendMsgCardHandler.this.mo230493c(C25252b.m90693a(Error.SEND_FAILED.getCode(), Error.SEND_FAILED.getMsg(), new HashSet(arrayList)));
                    }
                } else {
                    SendMsgCardHandler.this.mo230493c(C25252b.m90692a(Error.CHOOSE_CHAT_ERROR.getCode(), apiCallResult.getJson().toString()));
                }
            }
        }).mo234994a(mo230473f().getAppType()).mo234996a());
    }

    /* renamed from: d */
    private String m90685d(C67701b bVar) {
        JSONObject jSONObject = (JSONObject) bVar.mo234984a("cardContent");
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    private List<String> m90684c(C67701b bVar) {
        JSONArray jSONArray = (JSONArray) bVar.mo234984a("openChatIDs");
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                    arrayList.add(jSONArray.optString(i));
                }
            }
        }
        return arrayList;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "invoke api.");
        C25252b.m90696a(C67432a.m262319a(mo230473f()).getAppInfo().appId, C67432a.m262319a(mo230473f()).getAppInfo().scene);
        if (((Boolean) this.f165820j.mo234985a("shouldChooseChat", false)).booleanValue()) {
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "handle send message card with chooseChat");
            m90683b();
            return;
        }
        List<String> c = m90684c(bVar);
        String d = m90685d(bVar);
        String str = (String) bVar.mo234984a("triggerCode");
        String appId = mo230473f().getAppId();
        if (m90682a(c, str, d)) {
            if (!c.isEmpty()) {
                new C25254c().mo88366a(c, appId, d, this, mo230475h());
            } else {
                new C25263e().mo88377a(str, appId, d, this, mo230475h());
            }
        }
    }

    public SendMsgCardHandler(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    private boolean m90682a(List<String> list, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "cardContent is null");
            mo230493c(C25252b.m90692a(Error.CARD_CONTENT_NULL.getCode(), Error.CARD_CONTENT_NULL.getMsg()));
            return false;
        } else if (list.size() > 10) {
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "openChatIDs count exceed 10");
            mo230493c(C25252b.m90692a(Error.EXCEED_IDS.getCode(), Error.EXCEED_IDS.getMsg()));
            return false;
        } else if (!list.isEmpty() || !TextUtils.isEmpty(str)) {
            return true;
        } else {
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "openChatIDs and triggerCode are both empty");
            mo230493c(C25252b.m90692a(Error.NO_PARAMS.getCode(), Error.NO_PARAMS.getMsg()));
            return false;
        }
    }
}
