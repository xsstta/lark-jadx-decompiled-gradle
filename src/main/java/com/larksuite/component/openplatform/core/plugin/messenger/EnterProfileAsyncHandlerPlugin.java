package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.common.service.net.C67852a;
import com.tt.refer.common.util.C67857a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class EnterProfileAsyncHandlerPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"enterProfile"})
    public void enterProfile(Messenger.EnterProfileAsyncHandlerRequest enterProfileAsyncHandlerRequest, final AbstractC25895f fVar, final AbstractC25897h<Messenger.EnterProfileAsyncHandlerResponse> hVar) {
        final Messenger.EnterProfileAsyncHandlerResponse enterProfileAsyncHandlerResponse = new Messenger.EnterProfileAsyncHandlerResponse();
        String str = enterProfileAsyncHandlerRequest.mOpenId;
        final String appId = getAppContext().getAppId();
        if (TextUtils.isEmpty(appId)) {
            fVar.mo92190b().mo92224i("EnterProfileAsyncHandler", "appid is empty");
            fillFailedResponse(enterProfileAsyncHandlerResponse, C25906a.f64080j, "appId is empty");
            hVar.callback(enterProfileAsyncHandlerResponse);
            return;
        }
        String g = getApiDependency().mo235054g(appId);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(g) || TextUtils.isEmpty(appId)) {
            fVar.mo92190b().mo92224i("EnterProfileAsyncHandler", "openid is empty");
            fillFailedResponse(enterProfileAsyncHandlerResponse, C25906a.f64080j, "openId is empty");
            hVar.callback(enterProfileAsyncHandlerResponse);
            return;
        }
        final C67852a aVar = new C67852a();
        HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
        getApiDependency().mo235029a(hashMap);
        hashMap.put("session", g);
        hashMap.put("openid", str);
        hashMap.put("ttcode", aVar.mo235486a(getAppContext()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        boolean a = C67857a.m263992a(getAppContext());
        ILogger b = fVar.mo92190b();
        b.mo92224i("EnterProfileAsyncHandler", "over sea:" + a);
        int b2 = C67857a.m263993b(getAppContext());
        if (!a && b2 == 1) {
            hashMap2.put("domain_alias", "open");
        }
        getApiDependency().mo235016a(C67857a.m263994c(getAppContext()) + "/v2/getUserIDByOpenID", (Map<String, String>) hashMap2, new JSONObject(hashMap), true).subscribe(new Consumer<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.EnterProfileAsyncHandlerPlugin.C250571 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                if (TextUtils.isEmpty(str)) {
                    fVar.mo92190b().mo92223e("EnterProfileAsyncHandler", "EnterProfileAsyncHandler:response is empty!");
                    EnterProfileAsyncHandlerPlugin.this.fillFailedResponse(enterProfileAsyncHandlerResponse, C25906a.f64081k, "response is empty");
                    hVar.callback(enterProfileAsyncHandlerResponse);
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("encryptedData");
                if (!TextUtils.isEmpty(optString)) {
                    String optString2 = new JSONObject(aVar.mo235487a(optString)).optString("userid");
                    if (!TextUtils.isEmpty(optString2)) {
                        EnterProfileAsyncHandlerPlugin.this.getApiDependency().mo235041b(optString2, appId);
                        hVar.callback(enterProfileAsyncHandlerResponse);
                        return;
                    }
                    EnterProfileAsyncHandlerPlugin.this.fillFailedResponse(enterProfileAsyncHandlerResponse, C25906a.f64081k, "userId is empty");
                    hVar.callback(enterProfileAsyncHandlerResponse);
                    fVar.mo92190b().mo92223e("EnterProfileAsyncHandler", "userid is empty!");
                    return;
                }
                int optInt = jSONObject.optInt("error");
                String optString3 = jSONObject.optString("message");
                EnterProfileAsyncHandlerPlugin.this.fillFailedResponse(enterProfileAsyncHandlerResponse, C25906a.f64081k, optString3);
                hVar.callback(enterProfileAsyncHandlerResponse);
                ILogger b = fVar.mo92190b();
                b.mo92224i("EnterProfileAsyncHandler", "error:" + optInt + " message:" + optString3);
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.EnterProfileAsyncHandlerPlugin.C250582 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                fVar.mo92190b().mo92223e("EnterProfileAsyncHandler", "EnterProfileAsyncHandler fail: ", th);
                EnterProfileAsyncHandlerPlugin.this.fillFailedResponse(enterProfileAsyncHandlerResponse, C25906a.f64079i, th.getMessage());
                hVar.callback(enterProfileAsyncHandlerResponse);
            }
        });
    }
}
