package com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.ApiStartFaceVerifyPlugin;
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

public class ApiStartFaceVerifyPlugin extends OPPlugin {
    public AbstractC25897h<ApiFaceVerifyResponse> invokeCallback;
    public ILogger logger;

    private static class ApiFaceVerifyRequest extends C25920a {
        @JSONField(name = "userId")
        public String userId;

        private ApiFaceVerifyRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiFaceVerifyResponse extends C25921b {
        @JSONField(name = "reqNo")
        public String reqNo;

        private ApiFaceVerifyResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    public void callbackOk(String str) {
        ApiFaceVerifyResponse apiFaceVerifyResponse = new ApiFaceVerifyResponse();
        apiFaceVerifyResponse.reqNo = str;
        AbstractC25897h<ApiFaceVerifyResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiFaceVerifyResponse);
        }
    }

    private void getTicket(String str) {
        ApiFaceVerifyResponse apiFaceVerifyResponse = new ApiFaceVerifyResponse();
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92224i("ApiFaceVerifyPlugin", "getTicket.");
        }
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
            jSONObject.put("ticketType", "face_auth");
        } catch (JSONException e) {
            fillFailedResponse(apiFaceVerifyResponse, C25906a.f64080j, e.getMessage());
            this.invokeCallback.callback(apiFaceVerifyResponse);
            ILogger aVar2 = this.logger;
            if (aVar2 != null) {
                aVar2.mo92223e("ApiFaceVerifyPlugin", "build json error", e);
            }
        }
        ILogger aVar3 = this.logger;
        if (aVar3 != null) {
            aVar3.mo92224i("ApiFaceVerifyPlugin", "send getTicket request, url" + str2);
        }
        C12843b.m53038a(str2, hashMap, jSONObject, getAppContext()).subscribe(new Consumer(apiFaceVerifyResponse) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.$$Lambda$ApiStartFaceVerifyPlugin$kwbd_wY6g2DsI1r6qFpngxwbDmo */
            public final /* synthetic */ ApiStartFaceVerifyPlugin.ApiFaceVerifyResponse f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApiStartFaceVerifyPlugin.this.lambda$getTicket$0$ApiStartFaceVerifyPlugin(this.f$1, (String) obj);
            }
        }, new Consumer(apiFaceVerifyResponse) {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.$$Lambda$ApiStartFaceVerifyPlugin$9wBeKf0v0a8t9xYrMeA6tG7YtI */
            public final /* synthetic */ ApiStartFaceVerifyPlugin.ApiFaceVerifyResponse f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApiStartFaceVerifyPlugin.this.lambda$getTicket$1$ApiStartFaceVerifyPlugin(this.f$1, (Throwable) obj);
            }
        });
    }

    public void callbackFail(int i, String str) {
        ApiFaceVerifyResponse apiFaceVerifyResponse = new ApiFaceVerifyResponse();
        C25913h a = C25913h.m93822a(i);
        apiFaceVerifyResponse.mErrorCode = a.f64115H;
        apiFaceVerifyResponse.mErrorMessage = str;
        apiFaceVerifyResponse.mInnerCode = a.f64116I;
        apiFaceVerifyResponse.mInnerMsg = a.f64117J;
        AbstractC25897h<ApiFaceVerifyResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiFaceVerifyResponse);
        }
    }

    public /* synthetic */ void lambda$getTicket$1$ApiStartFaceVerifyPlugin(ApiFaceVerifyResponse apiFaceVerifyResponse, Throwable th) throws Exception {
        fillFailedResponse(apiFaceVerifyResponse, C25906a.f64079i, th.getMessage());
        this.invokeCallback.callback(apiFaceVerifyResponse);
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92223e("ApiFaceVerifyPlugin", "callback fail.", th);
        }
        new C67500a(C67501b.aY, getAppContext()).setErrorMessage(th.getMessage()).flush();
    }

    public /* synthetic */ void lambda$getTicket$0$ApiStartFaceVerifyPlugin(ApiFaceVerifyResponse apiFaceVerifyResponse, String str) throws Exception {
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92224i("ApiFaceVerifyPlugin", "getTicket onResult");
        }
        if (TextUtils.isEmpty(str)) {
            ILogger aVar2 = this.logger;
            if (aVar2 != null) {
                aVar2.mo92223e("ApiFaceVerifyPlugin", "response is null");
            }
            fillFailedResponse(apiFaceVerifyResponse, C25906a.f64080j, "response is null");
            this.invokeCallback.callback(apiFaceVerifyResponse);
            new C67500a(C67501b.aY, getAppContext()).setErrorMessage("response is null").flush();
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("code") || jSONObject.getInt("code") != 0 || !jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
            callbackFail(jSONObject.optInt("code", -1), jSONObject.optString("msg", "fail"));
            ILogger aVar3 = this.logger;
            if (aVar3 != null) {
                aVar3.mo92223e("ApiFaceVerifyPlugin", "callback fail. result:" + str);
            }
            new C67500a(C67501b.aY, getAppContext()).setErrorMessage(jSONObject.optString("msg", "")).setErrorCode(String.valueOf(jSONObject.optInt("code", -1))).flush();
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        String optString = optJSONObject.optString("ticket");
        String optString2 = optJSONObject.optString("scene");
        int optInt = optJSONObject.optInt("appId", -1);
        int optInt2 = optJSONObject.optInt("mode", -1);
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || optInt == -1 || optInt2 == -1) {
            ILogger aVar4 = this.logger;
            if (aVar4 != null) {
                aVar4.mo92223e("ApiFaceVerifyPlugin", String.format("getTicket. params error. ticket is null:%b. scene is null:%b. aid=%d. mode=%d", optString, optString2, Integer.valueOf(optInt), Integer.valueOf(optInt2)));
            }
            fillFailedResponse(apiFaceVerifyResponse, C25906a.f64080j, "getTicket. params error. ticket is null");
            this.invokeCallback.callback(apiFaceVerifyResponse);
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

    @LKPluginFunction(async = true, eventName = {"startFaceVerify"})
    public void startFaceVerifyAsync(LKEvent lKEvent, ApiFaceVerifyRequest apiFaceVerifyRequest, AbstractC25905b bVar, AbstractC25897h<ApiFaceVerifyResponse> hVar) {
        this.invokeCallback = hVar;
        ILogger b = lKEvent.mo92134c().mo92190b();
        this.logger = b;
        if (b != null) {
            b.mo92224i("ApiFaceVerifyPlugin", "invoke api");
        }
        getTicket(apiFaceVerifyRequest.userId);
    }

    private void doFaceLive(String str, final String str2, int i, int i2) {
        Log.m165389i("ApiFaceVerifyPlugin", "doFaceLive. start ticket:" + str2);
        C67560a.m262959a("lark_live_check", CrossProcessDataEntity.C67574a.m263013a().mo234760a("scene", (Object) str).mo234760a("ticket", (Object) str2).mo234760a("aid", (Object) Integer.valueOf(i)).mo234760a("mode", (Object) Integer.valueOf(i2)).mo234760a("app_id", (Object) C67432a.m262319a(getAppContext()).getAppInfo().appId).mo234763b(), new AbstractC67565b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.ApiStartFaceVerifyPlugin.C251691 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                ApiFaceVerifyResponse apiFaceVerifyResponse = new ApiFaceVerifyResponse();
                if (ApiStartFaceVerifyPlugin.this.logger != null) {
                    ApiStartFaceVerifyPlugin.this.logger.mo92224i("ApiFaceVerifyPlugin", "onIpcCallback back to miniapp");
                }
                if (crossProcessDataEntity == null) {
                    ApiStartFaceVerifyPlugin.this.fillFailedResponse(apiFaceVerifyResponse, C25906a.f64080j, "ipc callback data is null");
                    ApiStartFaceVerifyPlugin.this.invokeCallback.callback(apiFaceVerifyResponse);
                    new C67500a(C67501b.aW, ApiStartFaceVerifyPlugin.this.getAppContext()).setErrorMessage("ipc callback data is null").flush();
                    if (ApiStartFaceVerifyPlugin.this.logger != null) {
                        ApiStartFaceVerifyPlugin.this.logger.mo92224i("ApiFaceVerifyPlugin", "onIpcCallback callback data is null");
                        return;
                    }
                    return;
                }
                String b = crossProcessDataEntity.mo234744b("reqNo");
                if (!TextUtils.isEmpty(b)) {
                    if (ApiStartFaceVerifyPlugin.this.logger != null) {
                        ApiStartFaceVerifyPlugin.this.logger.mo92224i("ApiFaceVerifyPlugin", "face verify success");
                    }
                    ApiStartFaceVerifyPlugin.this.callbackOk(b);
                    new C67500a(C67501b.aS, ApiStartFaceVerifyPlugin.this.getAppContext()).flush();
                    return;
                }
                int a = crossProcessDataEntity.mo234737a("errorCode", -1);
                if (a == -1) {
                    ApiStartFaceVerifyPlugin.this.fillFailedResponse(apiFaceVerifyResponse, C25913h.f64156L, "unknown error");
                    ApiStartFaceVerifyPlugin.this.invokeCallback.callback(apiFaceVerifyResponse);
                } else {
                    ApiStartFaceVerifyPlugin.this.callbackFail(a, crossProcessDataEntity.mo234744b("errorMsg"));
                }
                String a2 = crossProcessDataEntity.mo234740a("errorMsg", "");
                ApiStartFaceVerifyPlugin.this.monitor(a2, a, str2);
                if (ApiStartFaceVerifyPlugin.this.logger != null) {
                    ILogger aVar = ApiStartFaceVerifyPlugin.this.logger;
                    aVar.mo92224i("ApiFaceVerifyPlugin", "onIpcCallback error, code:" + a + " errMsg:" + a2 + " ticket:" + str2);
                }
            }
        });
    }
}
