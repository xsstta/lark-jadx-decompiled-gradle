package com.larksuite.component.openplatform.core.plugin.messenger.sendmsg;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.ApiSendMsgCardPlugin;
import com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.SendMsgCardHandler;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.util.C67044k;
import com.tt.miniapphost.C67432a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.AbstractC67712c;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.b */
public class C25252b {
    /* renamed from: a */
    public static void m90699a(boolean z, boolean z2, List<String> list, String str, final AbstractC65797c cVar, AbstractC67709b.AbstractC67710a aVar) {
        if (z) {
            cVar.mo230493c(m90692a(SendMsgCardHandler.Error.SEND_FAILED.getCode(), SendMsgCardHandler.Error.SEND_FAILED.getMsg()));
        } else if (z2) {
            cVar.mo230493c(m90692a(SendMsgCardHandler.Error.USER_CANCEL.getCode(), SendMsgCardHandler.Error.USER_CANCEL.getMsg()));
            m90697a(C67432a.m262319a(cVar.mo230473f()).getAppInfo().appId, C67432a.m262319a(cVar.mo230473f()).getAppInfo().scene, 0);
        } else {
            m90697a(C67432a.m262319a(cVar.mo230473f()).getAppInfo().appId, C67432a.m262319a(cVar.mo230473f()).getAppInfo().scene, 1);
            aVar.mo235014a().mo235068a(list, str, (String) null, new AbstractC67712c.AbstractC67715c() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25252b.C252531 */

                /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
                /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
                @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67715c
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onResult(java.lang.String r8) {
                    /*
                    // Method dump skipped, instructions count: 220
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25252b.C252531.onResult(java.lang.String):void");
                }
            });
        }
    }

    /* renamed from: a */
    public static void m90698a(boolean z, boolean z2, String str, List<String> list, String str2, AbstractC25897h<ApiSendMsgCardPlugin.ApiSendMsgCardResponse> hVar, ApiSendMsgCardPlugin.ApiSendMsgCardResponse apiSendMsgCardResponse, IAppContext iAppContext, AbstractC67709b.AbstractC67710a aVar) {
        if (z) {
            apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.SEND_FAILED.getCode();
            apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.SEND_FAILED.getMsg();
            hVar.callback(apiSendMsgCardResponse);
        } else if (z2) {
            apiSendMsgCardResponse.mErrorCode = ApiSendMsgCardError.USER_CANCEL.getCode();
            apiSendMsgCardResponse.mErrorMessage = ApiSendMsgCardError.USER_CANCEL.getMsg();
            hVar.callback(apiSendMsgCardResponse);
            m90697a(C67432a.m262319a(iAppContext).getAppInfo().appId, C67432a.m262319a(iAppContext).getAppInfo().scene, 0);
        } else {
            m90697a(C67432a.m262319a(iAppContext).getAppInfo().appId, C67432a.m262319a(iAppContext).getAppInfo().scene, 1);
            aVar.mo235014a().mo235068a(list, str2, str, new AbstractC67712c.AbstractC67715c(hVar, iAppContext) {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.$$Lambda$b$EZe8jBNYkH3c4godoFfTHkeQin4 */
                public final /* synthetic */ AbstractC25897h f$1;
                public final /* synthetic */ IAppContext f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c.AbstractC67715c
                public final void onResult(String str) {
                    C25252b.m90695a(ApiSendMsgCardPlugin.ApiSendMsgCardResponse.this, this.f$1, this.f$2, str);
                }
            });
        }
    }

    /* renamed from: b */
    private static String m90700b() {
        return C67044k.m261292a(LarkExtensionManager.getInstance().getExtension().mo49569f());
    }

    /* renamed from: c */
    private static String m90702c() {
        return C67044k.m261292a(LarkExtensionManager.getInstance().getExtension().mo49566c());
    }

    /* renamed from: a */
    private static JSONObject m90694a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tenant_id_enc", m90700b());
            jSONObject.put("user_id_enc", m90702c());
            return jSONObject;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("GADGET_SENG_MSG", "", e);
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static String m90692a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str);
            String jSONObject2 = jSONObject.toString();
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "getCallbackInfo result" + jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("GADGET_SENG_MSG", "", e);
            return "build errormsg error";
        }
    }

    /* renamed from: a */
    public static void m90696a(String str, String str2) {
        JSONObject a = m90694a();
        if (a != null) {
            try {
                a.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str);
                a.put("scene", str2);
                LarkExtensionManager.getInstance().getExtension().mo49574a("gadget_sendMessageCard_call", a);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("GADGET_SENG_MSG", "", e);
            }
        }
    }

    /* renamed from: b */
    public static void m90701b(String str, String str2, int i) {
        JSONObject a = m90694a();
        if (a != null) {
            try {
                a.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str);
                a.put("scene", str2);
                a.put("result", i);
                LarkExtensionManager.getInstance().getExtension().mo49574a("gadget_sendMessageCard_send", a);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("GADGET_SENG_MSG", "", e);
            }
        }
    }

    /* renamed from: a */
    public static String m90693a(int i, String str, Set<String> set) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str);
            JSONArray jSONArray = new JSONArray();
            for (String str2 : set) {
                jSONArray.put(str2);
            }
            jSONObject.put("failedOpenChatIDs", jSONArray);
            String jSONObject2 = jSONObject.toString();
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "getCallbackInfo result" + jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("GADGET_SENG_MSG", "", e);
            return "build errormsg error";
        }
    }

    /* renamed from: a */
    public static void m90697a(String str, String str2, int i) {
        JSONObject a = m90694a();
        if (a != null) {
            try {
                a.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str);
                a.put("scene", str2);
                a.put("action", i);
                LarkExtensionManager.getInstance().getExtension().mo49574a("gadget_sendMessageCard_preview_click", a);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("GADGET_SENG_MSG", "", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m90695a(com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.ApiSendMsgCardPlugin.ApiSendMsgCardResponse r7, com.larksuite.framework.apiplugin.p1175a.AbstractC25897h r8, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.C25252b.m90695a(com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.ApiSendMsgCardPlugin$ApiSendMsgCardResponse, com.larksuite.framework.apiplugin.a.h, com.bytedance.ee.lark.infra.sandbox.context.IAppContext, java.lang.String):void");
    }
}
