package com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.littleapp.EnvInfo;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.option.ext.AbstractC67619e;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.a */
public class C25170a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "startFaceIdentify";
    }

    public C25170a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "invoke api");
        m90541a();
    }

    /* renamed from: a */
    private void m90541a() {
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
            AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "check has authorized, json parse error");
        }
        AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "send has_authed request, url: " + str + " app_id: " + appId);
        C12843b.m53038a(str, hashMap, jSONObject, getAppContext()).subscribe(new Consumer<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.C25170a.C251711 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "has_authed onResult");
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52829e("ApiFaceIdentifyCtrl", "response is null");
                    new C67500a(C67501b.aX, C25170a.this.getAppContext()).setErrorMessage("response is null").flush();
                    C25170a.this.callbackDefaultMsg(false);
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("code") || jSONObject.getInt("code") != 0 || !jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("errCode", Integer.valueOf(jSONObject.optInt("code", -1)));
                    C25170a.this.callbackMsg(false, hashMap, jSONObject.optString("msg", "fail"));
                    new C67500a(C67501b.aX, C25170a.this.getAppContext()).setErrorMessage(jSONObject.optString("")).setErrorCode(String.valueOf(jSONObject.optInt("code", -1))).flush();
                    AppBrandLogger.m52829e("ApiFaceIdentifyCtrl", "callback fail. result:" + str);
                    return;
                }
                String string = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("verifyUid");
                if (TextUtils.isEmpty(string)) {
                    AppBrandLogger.m52829e("ApiFaceIdentifyCtrl", "getTicket. uid is null");
                    C25170a.this.callbackDefaultMsg(false);
                    new C67500a(C67501b.aX, C25170a.this.getAppContext()).setErrorMessage("uid is null").flush();
                    return;
                }
                new C67500a(C67501b.aM, C25170a.this.getAppContext()).flush();
                C25170a.this.mo88273a(string);
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.C25170a.C251722 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C25170a.this.callbackDefaultMsg(false);
                AppBrandLogger.m52829e("ApiFaceIdentifyCtrl", "callback fail.", th);
                new C67500a(C67501b.aX, C25170a.this.getAppContext()).setErrorMessage(th.getMessage()).flush();
            }
        });
    }

    /* renamed from: a */
    public void mo88273a(String str) {
        AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "getTicket.");
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
            callbackDefaultMsg(false);
            AppBrandLogger.m52829e("ApiFaceIdentifyCtrl", "build json error", e);
        }
        AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "send getTicket request, url" + str2);
        C12843b.m53038a(str2, hashMap, jSONObject, getAppContext()).subscribe(new Consumer<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.C25170a.C251733 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "getTicket onResult");
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52829e("ApiFaceIdentifyCtrl", "response is null");
                    C25170a.this.callbackDefaultMsg(false);
                    new C67500a(C67501b.aY, C25170a.this.getAppContext()).setErrorMessage("response is null").flush();
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("code") || jSONObject.getInt("code") != 0 || !jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("errCode", Integer.valueOf(jSONObject.optInt("code", -1)));
                    C25170a.this.callbackMsg(false, hashMap, jSONObject.optString("msg", "fail"));
                    AppBrandLogger.m52829e("ApiFaceIdentifyCtrl", "callback fail. result:" + str);
                    new C67500a(C67501b.aY, C25170a.this.getAppContext()).setErrorMessage(jSONObject.optString("msg", "")).setErrorCode(String.valueOf(jSONObject.optInt("code", -1))).flush();
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                String optString = optJSONObject.optString("ticket", null);
                String optString2 = optJSONObject.optString("scene", null);
                int optInt = optJSONObject.optInt("appId", -1);
                int optInt2 = optJSONObject.optInt("mode", -1);
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || optInt == -1 || optInt2 == -1) {
                    AppBrandLogger.m52829e("ApiFaceIdentifyCtrl", String.format("getTicket. params error. ticket is null:%b. scene is null:%b. aid=%d. mode=%d", optString, optString2, Integer.valueOf(optInt), Integer.valueOf(optInt2)));
                    C25170a.this.callbackDefaultMsg(false);
                    new C67500a(C67501b.aY, C25170a.this.getAppContext()).setErrorMessage("param is error").flush();
                    return;
                }
                C25170a.this.mo88275a(optString2, optString, optInt, optInt2);
                new C67500a(C67501b.aO, C25170a.this.getAppContext()).flush();
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.C25170a.C251744 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C25170a.this.callbackDefaultMsg(false);
                AppBrandLogger.m52829e("ApiFaceIdentifyCtrl", "callback fail.", th);
                new C67500a(C67501b.aY, C25170a.this.getAppContext()).setErrorMessage(th.getMessage()).flush();
            }
        });
    }

    public C25170a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    /* renamed from: a */
    public void mo88274a(String str, int i, String str2) {
        String str3 = str + " ticket:" + str2;
        if (i == -3006 || i == -3005 || i == -3003 || i == -3002) {
            new C67500a(C67501b.aV, getAppContext()).setErrorMessage(str3).setErrorCode(String.valueOf(i)).flush();
        } else if (i != -1006) {
            new C67500a(C67501b.aW, getAppContext()).setErrorMessage(str3).setErrorCode(String.valueOf(i)).flush();
        } else {
            new C67500a(C67501b.aT, getAppContext()).setErrorMessage(str3).setErrorCode(String.valueOf(i)).flush();
        }
    }

    /* renamed from: a */
    public void mo88275a(String str, final String str2, int i, int i2) {
        Log.m165389i("ApiFaceIdentifyCtrl", "doFaceLive. start ticket:" + str2);
        C67560a.m262959a("lark_live_check", CrossProcessDataEntity.C67574a.m263013a().mo234760a("scene", (Object) str).mo234760a("ticket", (Object) str2).mo234760a("aid", (Object) Integer.valueOf(i)).mo234760a("mode", (Object) Integer.valueOf(i2)).mo234760a("app_id", (Object) C67432a.m262319a(getAppContext()).getAppInfo().appId).mo234763b(), new AbstractC67565b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.C25170a.C251755 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "onIpcCallback back to miniapp");
                if (crossProcessDataEntity == null) {
                    C25170a.this.callbackDefaultMsg(false);
                    new C67500a(C67501b.aW, C25170a.this.getAppContext()).setErrorMessage("ipc callback data is null").flush();
                    AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "onIpcCallback callback data is null");
                    return;
                }
                String b = crossProcessDataEntity.mo234744b("reqNo");
                if (!TextUtils.isEmpty(b)) {
                    AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "face verify success");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("reqNo", b);
                    } catch (JSONException unused) {
                        AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "build success result JSONException");
                    }
                    C25170a.this.callbackOk(jSONObject);
                    new C67500a(C67501b.aS, C25170a.this.getAppContext()).flush();
                    return;
                }
                int a = crossProcessDataEntity.mo234737a("errorCode", -1);
                if (a == -1) {
                    C25170a.this.callbackDefaultMsg(false);
                } else {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("errCode", Integer.valueOf(a));
                    C25170a.this.callbackMsg(false, hashMap, crossProcessDataEntity.mo234744b("errorMsg"));
                }
                String a2 = crossProcessDataEntity.mo234740a("errorMsg", "");
                C25170a.this.mo88274a(a2, a, str2);
                AppBrandLogger.m52830i("ApiFaceIdentifyCtrl", "onIpcCallback error, code:" + a + " errMsg:" + a2 + " ticket:" + str2);
            }
        });
    }
}
