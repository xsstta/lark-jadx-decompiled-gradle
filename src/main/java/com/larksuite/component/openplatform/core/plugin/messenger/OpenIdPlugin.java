package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.DebugUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.littleapp.EnvInfo;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.common.service.net.C67852a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class OpenIdPlugin extends OPPlugin {
    public long startTime;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @LKPluginFunction(async = true, eventName = {"openIdToChatId"})
    public void openOpenIdToChatId(Messenger.OpenIdToChatIdRequest openIdToChatIdRequest, final AbstractC25897h<Messenger.OpenIdToChatIdResponse> hVar, LKEvent lKEvent, AbstractC25895f fVar) {
        this.startTime = System.currentTimeMillis();
        final ILogger b = fVar.mo92190b();
        final Messenger.OpenIdToChatIdResponse openIdToChatIdResponse = new Messenger.OpenIdToChatIdResponse();
        if (openIdToChatIdRequest == null || TextUtils.isEmpty(openIdToChatIdRequest.mOpenId)) {
            b.mo92224i("OpenIdPlugin", "invalid params");
            fillFailedResponse(openIdToChatIdResponse, C25906a.f64072b, "openId is empty");
            hVar.callback(openIdToChatIdResponse);
            return;
        }
        final C67852a aVar = new C67852a();
        final HashMap hashMap = new HashMap();
        final IAppContext eventContext = getEventContext(lKEvent);
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, eventContext.getAppId());
        hashMap.put("openid", openIdToChatIdRequest.mOpenId);
        hashMap.put("ttcode", aVar.mo235486a(eventContext));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap2.put("domain_alias", "open");
        }
        final String str = C13047a.C13049b.m53532a() + "/v2/getChatIDByOpenID";
        DebugUtils.m54326a("event_request_get_chat_id", DebugUtils.m54323a(true, str));
        C12843b.m53039a(str, (Map<String, String>) hashMap2, new JSONObject(hashMap), eventContext, true).subscribe(new Consumer<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenIdPlugin.C250881 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                if (TextUtils.isEmpty(str)) {
                    b.mo92224i("OpenIdPlugin", " response is empty");
                    OpenIdPlugin.this.fillFailedResponse(openIdToChatIdResponse, C25906a.f64081k, "response is empty");
                    hVar.callback(openIdToChatIdResponse);
                    C13377u.m54422b("fail", System.currentTimeMillis() - OpenIdPlugin.this.startTime, "null_response", eventContext);
                    return;
                }
                String str2 = str;
                DebugUtils.m54326a("event_request_get_chat_id", DebugUtils.m54325a(false, str2, "params--" + hashMap.toString(), null));
                String a = aVar.mo235487a(new JSONObject(str).optString("encryptedData"));
                if (!TextUtils.isEmpty(a)) {
                    String optString = new JSONObject(a).optString("chatid");
                    if (!TextUtils.isEmpty(optString)) {
                        openIdToChatIdResponse.mChatId = optString;
                        hVar.callback(openIdToChatIdResponse);
                        C13377u.m54422b("success", System.currentTimeMillis() - OpenIdPlugin.this.startTime, null, eventContext);
                        return;
                    }
                    b.mo92224i("OpenIdPlugin", "have not chatId");
                }
                AppBrandLogger.m52829e("OpenIdPlugin", " encryptedData is empty!" + str);
                C13377u.m54422b("fail", System.currentTimeMillis() - OpenIdPlugin.this.startTime, "json_key_empty", eventContext);
                OpenIdPlugin.this.fillFailedResponse(openIdToChatIdResponse, C25906a.f64081k, "encryptedData is empty");
                hVar.callback(openIdToChatIdResponse);
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenIdPlugin.C250892 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                b.mo92223e("OpenIdPlugin", "throwable", th);
                OpenIdPlugin.this.fillFailedResponse(openIdToChatIdResponse, C25906a.f64079i, th.getMessage());
                hVar.callback(openIdToChatIdResponse);
                String str = str;
                DebugUtils.m54326a("event_request_get_chat_id", DebugUtils.m54324a(false, str, "request error--" + hashMap.toString()));
                C13377u.m54422b("fail", System.currentTimeMillis() - OpenIdPlugin.this.startTime, th.getMessage(), eventContext);
            }
        });
    }
}
