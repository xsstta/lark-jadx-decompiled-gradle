package com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.ApiStartFaceIdentifyPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.littleapp.EnvInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ApiStartFaceIdentifyPlugin extends OPPlugin {
    public AbstractC25897h<ApiStartFaceIdentifyResponse> invokeCallback;
    private ILogger logger;

    private static class ApiStartFaceIdentifyRequest extends C25920a {
        private ApiStartFaceIdentifyRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiStartFaceIdentifyResponse extends C25921b {
        @JSONField(name = "reqNo")
        public String reqNo;

        private ApiStartFaceIdentifyResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private void hasAuthed() {
        ApiStartFaceIdentifyResponse apiStartFaceIdentifyResponse = new ApiStartFaceIdentifyResponse();
        HashMap hashMap = new HashMap();
        hashMap.put("session", LarkExtensionManager.getInstance().getExtension().mo49565b());
        hashMap.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap.put("domain_alias", "open");
        }
        String str = C13047a.C13049b.m53534c() + "/identity";
        String appId = getAppContext().getAppId();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", appId);
        } catch (JSONException unused) {
            logI("ApiFaceIdentifyCtrl", "check has authorized, json parse error");
        }
        logI("ApiFaceIdentifyCtrl", "send has_authed request, url: " + str + " app_id: " + appId);
        C12843b.m53038a(str, hashMap, jSONObject, getAppContext()).subscribe(new Consumer(apiStartFaceIdentifyResponse) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.$$Lambda$ApiStartFaceIdentifyPlugin$d6_pF4ek26T901nTEzghA31OoqI */
            public final /* synthetic */ ApiStartFaceIdentifyPlugin.ApiStartFaceIdentifyResponse f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApiStartFaceIdentifyPlugin.this.lambda$hasAuthed$0$ApiStartFaceIdentifyPlugin(this.f$1, (String) obj);
            }
        }, new Consumer(apiStartFaceIdentifyResponse) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.$$Lambda$ApiStartFaceIdentifyPlugin$smfPOKfU_pEzEgdtRCUZu6p96K8 */
            public final /* synthetic */ ApiStartFaceIdentifyPlugin.ApiStartFaceIdentifyResponse f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApiStartFaceIdentifyPlugin.this.lambda$hasAuthed$1$ApiStartFaceIdentifyPlugin(this.f$1, (Throwable) obj);
            }
        });
    }

    public void callbackOk(String str) {
        ApiStartFaceIdentifyResponse apiStartFaceIdentifyResponse = new ApiStartFaceIdentifyResponse();
        apiStartFaceIdentifyResponse.reqNo = str;
        AbstractC25897h<ApiStartFaceIdentifyResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiStartFaceIdentifyResponse);
        }
    }

    private void getTicket(String str) {
        ApiStartFaceIdentifyResponse apiStartFaceIdentifyResponse = new ApiStartFaceIdentifyResponse();
        logI("ApiFaceIdentifyCtrl", "getTicket.");
        HashMap hashMap = new HashMap();
        hashMap.put("session", LarkExtensionManager.getInstance().getExtension().mo49565b());
        hashMap.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap.put("domain_alias", "open");
        }
        String str2 = C13047a.C13049b.m53534c() + "/user_ticket";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", str);
            jSONObject.put("ticketType", "verify");
        } catch (JSONException e) {
            fillFailedResponse(apiStartFaceIdentifyResponse, C25906a.f64080j, e.getMessage());
            this.invokeCallback.callback(apiStartFaceIdentifyResponse);
            logE("ApiFaceIdentifyCtrl", "build json error", e);
        }
        logI("ApiFaceIdentifyCtrl", "send getTicket request, url" + str2);
        C12843b.m53038a(str2, hashMap, jSONObject, getAppContext()).subscribe(new Consumer(apiStartFaceIdentifyResponse) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.$$Lambda$ApiStartFaceIdentifyPlugin$eu_2hGdCp1PXfaYd4X7_mBux9Vo */
            public final /* synthetic */ ApiStartFaceIdentifyPlugin.ApiStartFaceIdentifyResponse f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApiStartFaceIdentifyPlugin.this.lambda$getTicket$2$ApiStartFaceIdentifyPlugin(this.f$1, (String) obj);
            }
        }, new Consumer(apiStartFaceIdentifyResponse) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.$$Lambda$ApiStartFaceIdentifyPlugin$_SQ38pl9xxQbAL919dQElTZGtc */
            public final /* synthetic */ ApiStartFaceIdentifyPlugin.ApiStartFaceIdentifyResponse f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApiStartFaceIdentifyPlugin.this.lambda$getTicket$3$ApiStartFaceIdentifyPlugin(this.f$1, (Throwable) obj);
            }
        });
    }

    private void logE(String str, Object... objArr) {
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92223e(str, objArr);
        }
    }

    public void logI(String str, Object... objArr) {
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92224i(str, objArr);
        }
    }

    public void callbackFail(int i, String str) {
        ApiStartFaceIdentifyResponse apiStartFaceIdentifyResponse = new ApiStartFaceIdentifyResponse();
        C25913h a = C25913h.m93822a(i);
        apiStartFaceIdentifyResponse.mErrorCode = a.f64115H;
        apiStartFaceIdentifyResponse.mErrorMessage = str;
        apiStartFaceIdentifyResponse.mInnerCode = a.f64116I;
        apiStartFaceIdentifyResponse.mInnerMsg = a.f64117J;
        AbstractC25897h<ApiStartFaceIdentifyResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiStartFaceIdentifyResponse);
        }
    }

    public /* synthetic */ void lambda$getTicket$3$ApiStartFaceIdentifyPlugin(ApiStartFaceIdentifyResponse apiStartFaceIdentifyResponse, Throwable th) throws Exception {
        fillFailedResponse(apiStartFaceIdentifyResponse, C25906a.f64079i, th.getMessage());
        this.invokeCallback.callback(apiStartFaceIdentifyResponse);
        logE("ApiFaceIdentifyCtrl", "callback fail.", th);
        new C67500a(C67501b.aY, getAppContext()).setErrorMessage(th.getMessage()).flush();
    }

    public /* synthetic */ void lambda$hasAuthed$1$ApiStartFaceIdentifyPlugin(ApiStartFaceIdentifyResponse apiStartFaceIdentifyResponse, Throwable th) throws Exception {
        fillFailedResponse(apiStartFaceIdentifyResponse, C25906a.f64079i, th.getMessage());
        this.invokeCallback.callback(apiStartFaceIdentifyResponse);
        logE("ApiFaceIdentifyCtrl", "callback fail.", th);
        new C67500a(C67501b.aX, getAppContext()).setErrorMessage(th.getMessage()).flush();
    }

    public /* synthetic */ void lambda$hasAuthed$0$ApiStartFaceIdentifyPlugin(ApiStartFaceIdentifyResponse apiStartFaceIdentifyResponse, String str) throws Exception {
        logI("ApiFaceIdentifyCtrl", "has_authed onResult");
        if (TextUtils.isEmpty(str)) {
            logE("ApiFaceIdentifyCtrl", "response is null");
            new C67500a(C67501b.aX, getAppContext()).setErrorMessage("response is null").flush();
            fillFailedResponse(apiStartFaceIdentifyResponse, C25906a.f64080j, "response is null");
            this.invokeCallback.callback(apiStartFaceIdentifyResponse);
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("code") || jSONObject.getInt("code") != 0 || !jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
            callbackFail(jSONObject.optInt("code", -1), jSONObject.optString("msg", "fail"));
            new C67500a(C67501b.aX, getAppContext()).setErrorMessage(jSONObject.optString("")).setErrorCode(String.valueOf(jSONObject.optInt("code", -1))).flush();
            logE("ApiFaceIdentifyCtrl", "callback fail. result:" + str);
            return;
        }
        String string = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("verifyUid");
        if (TextUtils.isEmpty(string)) {
            logE("ApiFaceIdentifyCtrl", "getTicket. uid is null");
            fillFailedResponse(apiStartFaceIdentifyResponse, C25906a.f64080j, "getTicket. uid is null");
            this.invokeCallback.callback(apiStartFaceIdentifyResponse);
            new C67500a(C67501b.aX, getAppContext()).setErrorMessage("uid is null").flush();
            return;
        }
        new C67500a(C67501b.aM, getAppContext()).flush();
        getTicket(string);
    }

    public /* synthetic */ void lambda$getTicket$2$ApiStartFaceIdentifyPlugin(ApiStartFaceIdentifyResponse apiStartFaceIdentifyResponse, String str) throws Exception {
        logI("ApiFaceIdentifyCtrl", "getTicket onResult");
        if (TextUtils.isEmpty(str)) {
            logE("ApiFaceIdentifyCtrl", "response is null");
            fillFailedResponse(apiStartFaceIdentifyResponse, C25906a.f64080j, "response is null");
            this.invokeCallback.callback(apiStartFaceIdentifyResponse);
            new C67500a(C67501b.aY, getAppContext()).setErrorMessage("response is null").flush();
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("code") || jSONObject.getInt("code") != 0 || !jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
            callbackFail(jSONObject.optInt("code", -1), jSONObject.optString("msg", "fail"));
            logE("ApiFaceIdentifyCtrl", "callback fail. result:" + str);
            new C67500a(C67501b.aY, getAppContext()).setErrorMessage(jSONObject.optString("msg", "")).setErrorCode(String.valueOf(jSONObject.optInt("code", -1))).flush();
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        String optString = optJSONObject.optString("ticket");
        String optString2 = optJSONObject.optString("scene");
        int optInt = optJSONObject.optInt("appId", -1);
        int optInt2 = optJSONObject.optInt("mode", -1);
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || optInt == -1 || optInt2 == -1) {
            logE("ApiFaceIdentifyCtrl", String.format("getTicket. params error. ticket is null:%b. scene is null:%b. aid=%d. mode=%d", optString, optString2, Integer.valueOf(optInt), Integer.valueOf(optInt2)));
            fillFailedResponse(apiStartFaceIdentifyResponse, C25906a.f64080j, "getTicket. params error. ticket is null");
            this.invokeCallback.callback(apiStartFaceIdentifyResponse);
            new C67500a(C67501b.aY, getAppContext()).setErrorMessage("param is error").flush();
            return;
        }
        doFaceLive(optString2, optString, optInt, optInt2);
        new C67500a(C67501b.aO, getAppContext()).flush();
    }

    public void monitor(String str, int i, String str2) {
        String str3 = str + " ticket:" + str2;
        if (i == -3006 || i == -3005 || i == -3003 || i == -3002) {
            new C67500a(C67501b.aV, getAppContext()).setErrorMessage(str3).setErrorCode(String.valueOf(i)).flush();
        } else if (i != -1006) {
            new C67500a(C67501b.aW, getAppContext()).setErrorMessage(str3).setErrorCode(String.valueOf(i)).flush();
        } else {
            new C67500a(C67501b.aT, getAppContext()).setErrorMessage(str3).setErrorCode(String.valueOf(i)).flush();
        }
    }

    @LKPluginFunction(async = true, eventName = {"startFaceIdentify"})
    public void startFaceIdentifyAsync(LKEvent lKEvent, ApiStartFaceIdentifyRequest apiStartFaceIdentifyRequest, AbstractC25905b bVar, AbstractC25897h<ApiStartFaceIdentifyResponse> hVar) {
        this.invokeCallback = hVar;
        this.logger = lKEvent.mo92134c().mo92190b();
        logI("ApiFaceIdentifyCtrl", "invoke api");
        hasAuthed();
    }

    private void doFaceLive(String str, final String str2, int i, int i2) {
        Log.m165389i("ApiFaceIdentifyCtrl", "doFaceLive. start ticket:" + str2);
        C67560a.m262959a("lark_live_check", CrossProcessDataEntity.C67574a.m263013a().mo234760a("scene", (Object) str).mo234760a("ticket", (Object) str2).mo234760a("aid", (Object) Integer.valueOf(i)).mo234760a("mode", (Object) Integer.valueOf(i2)).mo234760a("app_id", (Object) C67432a.m262319a(getAppContext()).getAppInfo().appId).mo234763b(), new AbstractC67565b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.ApiStartFaceIdentifyPlugin.C251681 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                ApiStartFaceIdentifyResponse apiStartFaceIdentifyResponse = new ApiStartFaceIdentifyResponse();
                ApiStartFaceIdentifyPlugin.this.logI("ApiFaceIdentifyCtrl", "onIpcCallback back to miniapp");
                if (crossProcessDataEntity == null) {
                    ApiStartFaceIdentifyPlugin.this.fillFailedResponse(apiStartFaceIdentifyResponse, C25906a.f64080j, "ipc callback data is null");
                    ApiStartFaceIdentifyPlugin.this.invokeCallback.callback(apiStartFaceIdentifyResponse);
                    new C67500a(C67501b.aW, ApiStartFaceIdentifyPlugin.this.getAppContext()).setErrorMessage("ipc callback data is null").flush();
                    ApiStartFaceIdentifyPlugin.this.logI("ApiFaceIdentifyCtrl", "onIpcCallback callback data is null");
                    return;
                }
                String b = crossProcessDataEntity.mo234744b("reqNo");
                if (!TextUtils.isEmpty(b)) {
                    ApiStartFaceIdentifyPlugin.this.logI("ApiFaceIdentifyCtrl", "face verify success");
                    ApiStartFaceIdentifyPlugin.this.callbackOk(b);
                    new C67500a(C67501b.aS, ApiStartFaceIdentifyPlugin.this.getAppContext()).flush();
                    return;
                }
                int a = crossProcessDataEntity.mo234737a("errorCode", -1);
                if (a == -1) {
                    ApiStartFaceIdentifyPlugin.this.fillFailedResponse(apiStartFaceIdentifyResponse, C25913h.f64156L, "unknown error");
                    ApiStartFaceIdentifyPlugin.this.invokeCallback.callback(apiStartFaceIdentifyResponse);
                } else {
                    ApiStartFaceIdentifyPlugin.this.callbackFail(a, crossProcessDataEntity.mo234744b("errorMsg"));
                }
                String a2 = crossProcessDataEntity.mo234740a("errorMsg", "");
                ApiStartFaceIdentifyPlugin.this.monitor(a2, a, str2);
                ApiStartFaceIdentifyPlugin apiStartFaceIdentifyPlugin = ApiStartFaceIdentifyPlugin.this;
                apiStartFaceIdentifyPlugin.logI("ApiFaceIdentifyCtrl", "onIpcCallback error, code:" + a + " errMsg:" + a2 + " ticket:" + str2);
            }
        });
    }
}
