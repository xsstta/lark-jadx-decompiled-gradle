package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.DebugUtils;
import com.bytedance.ee.larkbrand.utils.IdTransformer;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.C67432a;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.common.service.net.C67852a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.r */
public class C25240r extends ApiHandler {

    /* renamed from: a */
    public long f61611a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "enterChat";
    }

    public C25240r() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        JSONObject jSONObject;
        this.f61611a = System.currentTimeMillis();
        String appId = getAppContext().getAppId();
        if (TextUtils.isEmpty(appId)) {
            appId = C67432a.m262319a(getAppContext()).getAppInfo().appId;
        }
        String g = getApiDependency().mo235054g(appId);
        if (TextUtils.isEmpty(g)) {
            g = C66612a.m260219a(appId);
        }
        AppBrandLogger.m52830i("LarkApiEnterChatCtrl", "enterChat args:" + this.mArgs + " appId:" + getAppContext().getAppId());
        if (TextUtils.isEmpty(g) || TextUtils.isEmpty(appId)) {
            if (TextUtils.isEmpty(g)) {
                AppBrandLogger.m52830i("LarkApiEnterChatCtrl", "session is empty!");
            }
            if (TextUtils.isEmpty(appId)) {
                AppBrandLogger.m52830i("LarkApiEnterChatCtrl", " appId is empty!");
            }
            C13377u.m54422b("fail", System.currentTimeMillis() - this.f61611a, "appid_empty", getAppContext());
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "appId or session is empty");
            return;
        }
        try {
            jSONObject = new JSONObject(this.mArgs);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("LarkApiEnterChatCtrl", "jsonException mArgs:" + this.mArgs, e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            String optString = jSONObject.optString("openChatId");
            boolean optBoolean = jSONObject.optBoolean("needBadge");
            String optString2 = jSONObject.optString("openid");
            if (!TextUtils.isEmpty(optString2)) {
                AppBrandLogger.m52830i("LarkApiEnterChatCtrl", "enter chat by openId");
                m90670a(appId, optString2);
            } else if (!TextUtils.isEmpty(optString)) {
                AppBrandLogger.m52830i("LarkApiEnterChatCtrl", "enter chat by openChatId");
                C13377u.m54422b("success", System.currentTimeMillis() - this.f61611a, null, getAppContext());
                m90671a(optString, optBoolean);
            } else {
                AppBrandLogger.m52829e("LarkApiEnterChatCtrl", "openChatId and opemId is empty, args:" + this.mArgs);
                C13377u.m54422b("fail", System.currentTimeMillis() - this.f61611a, "openid_empty", getAppContext());
                callbackFail(ApiCode.ENTERCHAT_ID_EMPTY);
            }
        } else {
            AppBrandLogger.m52829e("LarkApiEnterChatCtrl", "jsonObject is exception, because  Args is not json. args:" + this.mArgs);
            C13377u.m54422b("fail", System.currentTimeMillis() - this.f61611a, "args_empty", getAppContext());
            callbackFail(ApiCode.GENERAL_JSON_ERROR);
        }
    }

    /* renamed from: a */
    private void m90671a(final String str, final boolean z) {
        IdTransformer.f35273a.mo49669a(str, getAppContext(), C12805d.m52894a(C12805d.m52893a(getAppContext()), true, getAppContext()), getActionName(), new Function1<String, Unit>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25240r.C252411 */

            /* renamed from: a */
            public Unit invoke(String str) {
                try {
                    String string = new JSONObject(str).optJSONObject("chatids").getString(str);
                    C25240r rVar = C25240r.this;
                    rVar.mo88344a(rVar.getAppContext().getAppId(), string, z);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("LarkApiEnterChatCtrl", "JSONException invoke result:" + str, e);
                }
                return Unit.INSTANCE;
            }
        }, new Function1<Throwable, Unit>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25240r.C252422 */

            /* renamed from: a */
            public Unit invoke(Throwable th) {
                return null;
            }
        });
    }

    /* renamed from: a */
    private void m90670a(final String str, String str2) {
        AppBrandLogger.m52830i("LarkApiEnterChatCtrl", "gotoChatByOpenId appId:" + str + " openId:" + str2);
        final C67852a aVar = new C67852a();
        final HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str);
        hashMap.put("openid", str2);
        hashMap.put("ttcode", aVar.mo235486a(getAppContext()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap2.put("domain_alias", "open");
        }
        final String str3 = C13047a.C13049b.m53532a() + "/v2/getChatIDByOpenID";
        DebugUtils.m54326a("event_request_get_chat_id", DebugUtils.m54323a(true, str3));
        C12843b.m53039a(str3, (Map<String, String>) hashMap2, new JSONObject(hashMap), getAppContext(), true).subscribe(new Consumer<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25240r.C252433 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52830i("LarkApiEnterChatCtrl", " response is empty");
                    C25240r.this.callbackFail(ApiCode.ENTERCHAT_GET_CHATID_FAIL);
                    C13377u.m54422b("fail", System.currentTimeMillis() - C25240r.this.f61611a, "null_response", C25240r.this.getAppContext());
                    return;
                }
                String str2 = str3;
                DebugUtils.m54326a("event_request_get_chat_id", DebugUtils.m54325a(false, str2, "params--" + hashMap.toString(), null));
                String optString = new JSONObject(aVar.mo235487a(new JSONObject(str).optString("encryptedData"))).optString("chatid");
                if (!TextUtils.isEmpty(optString)) {
                    C25240r.this.mo88344a(str, optString, false);
                    C13377u.m54422b("success", System.currentTimeMillis() - C25240r.this.f61611a, null, C25240r.this.getAppContext());
                    return;
                }
                AppBrandLogger.m52829e("LarkApiEnterChatCtrl", " chatId is empty!");
                C13377u.m54422b("fail", System.currentTimeMillis() - C25240r.this.f61611a, "json_key_empty", C25240r.this.getAppContext());
                C25240r.this.callbackFail(ApiCode.ENTERCHAT_GET_CHATID_FAIL);
                AppBrandLogger.m52828d("LarkApiEnterChatCtrl", "chatid is empty!");
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25240r.C252444 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C25240r.this.callbackFail(ApiCode.ENTERCHAT_GET_CHATID_FAIL);
                String str = str3;
                DebugUtils.m54326a("event_request_get_chat_id", DebugUtils.m54324a(false, str, "request error--" + hashMap.toString()));
                C13377u.m54422b("fail", System.currentTimeMillis() - C25240r.this.f61611a, th.getMessage(), C25240r.this.getAppContext());
            }
        });
    }

    public C25240r(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    /* renamed from: a */
    public void mo88344a(String str, String str2, boolean z) {
        if (LarkExtensionManager.getInstance().getExtension().mo49607a(str2, str, z)) {
            callbackOk();
        } else {
            callbackFail("open chat fail");
        }
    }
}
