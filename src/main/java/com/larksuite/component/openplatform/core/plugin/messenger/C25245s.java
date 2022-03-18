package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.DebugUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.common.service.net.C67852a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.s */
public class C25245s extends ApiHandler {

    /* renamed from: a */
    public long f61624a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "enterProfile";
    }

    public C25245s() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        this.f61624a = System.currentTimeMillis();
        try {
            String optString = new JSONObject(this.mArgs).optString("openid");
            final String appId = getAppContext().getAppId();
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(appId)) {
                AppBrandLogger.m52830i("LarkApiEnterProfileCtrl", "params has error, appID:" + appId);
                return;
            }
            final C67852a aVar = new C67852a();
            final HashMap hashMap = new HashMap();
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
            hashMap.put("openid", optString);
            hashMap.put("ttcode", aVar.mo235486a(getAppContext()));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
            EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
            if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
                hashMap2.put("domain_alias", "open");
            }
            final String str = C13047a.C13049b.m53532a() + "/v2/getUserIDByOpenID";
            DebugUtils.m54326a("event_request_get_user_by_open", DebugUtils.m54323a(true, str));
            C12843b.m53039a(str, (Map<String, String>) hashMap2, new JSONObject(hashMap), getAppContext(), true).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.C25245s.C252461 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    if (TextUtils.isEmpty(str)) {
                        AppBrandLogger.m52829e("LarkApiEnterProfileCtrl", "response is empty!");
                        C25245s.this.mApiHandlerCallback.callback(C25245s.this.mCallBackId, C25245s.this.mo88349a(false));
                        C13377u.m54415a("fail", System.currentTimeMillis() - C25245s.this.f61624a, "null_response", C25245s.this.getAppContext());
                        return;
                    }
                    String optString = new JSONObject(aVar.mo235487a(new JSONObject(str).optString("encryptedData"))).optString("userid");
                    String str2 = str;
                    DebugUtils.m54326a("event_request_get_user_by_open", DebugUtils.m54325a(false, str2, "params--" + hashMap.toString(), null));
                    if (!TextUtils.isEmpty(optString)) {
                        LarkExtensionManager.getInstance().getExtension().mo49606a(optString, appId, C25245s.this.getAppContext().getCurrentActivity());
                        C13377u.m54415a("success", System.currentTimeMillis() - C25245s.this.f61624a, (String) null, C25245s.this.getAppContext());
                        C25245s.this.mApiHandlerCallback.callback(C25245s.this.mCallBackId, C25245s.this.mo88349a(true));
                        return;
                    }
                    C13377u.m54415a("fail", System.currentTimeMillis() - C25245s.this.f61624a, "empty_user_id", C25245s.this.getAppContext());
                    C25245s.this.mApiHandlerCallback.callback(C25245s.this.mCallBackId, C25245s.this.mo88349a(false));
                    AppBrandLogger.m52830i("LarkApiEnterProfileCtrl", "userid is empty!");
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.C25245s.C252472 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    AppBrandLogger.eWithThrowable("LarkApiEnterProfileCtrl", "Exception", th);
                    String str = str;
                    DebugUtils.m54326a("event_request_get_user_by_open", DebugUtils.m54324a(false, str, "request error--" + hashMap.toString()));
                    C13377u.m54415a("fail", System.currentTimeMillis() - C25245s.this.f61624a, th.getMessage(), C25245s.this.getAppContext());
                    C25245s.this.mApiHandlerCallback.callback(C25245s.this.mCallBackId, C25245s.this.mo88349a(false));
                }
            });
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("LarkApiEnterProfileCtrl", "Exception", e);
            C13377u.m54415a("fail", System.currentTimeMillis() - this.f61624a, e.getMessage(), getAppContext());
            this.mApiHandlerCallback.callback(this.mCallBackId, mo88349a(false));
        }
    }

    /* renamed from: a */
    public String mo88349a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getActionName(), "ok"));
            } else {
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getActionName(), "fail"));
            }
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("LarkApiEnterProfileCtrl", "Exception", e);
            return CharacterUtils.empty();
        }
    }

    public C25245s(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
