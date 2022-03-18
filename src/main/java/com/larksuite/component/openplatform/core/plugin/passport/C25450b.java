package com.larksuite.component.openplatform.core.plugin.passport;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67857a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@ApiSupportType(apiName = {"getUserInfo"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.passport.b */
public class C25450b extends AbstractC65797c {
    public C25450b() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getUserInfo");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        boolean z;
        Object a = bVar.mo234984a("withCredentials");
        if (a == null || (a instanceof Boolean)) {
            if (a == null || !((Boolean) a).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            final String g = mo230475h().mo235053g();
            String g2 = mo230475h().mo235054g(mo230473f().getAppId());
            if (TextUtils.isEmpty(g)) {
                AppBrandLogger.m52829e("GetUserInfoAsyncHandler", "session id is empty!");
                mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "not login");
                return;
            }
            String str = C67857a.m263995d(mo230473f()) + "/getUserInfo";
            if (TextUtils.isEmpty(g2)) {
                AppBrandLogger.m52829e("GetUserInfoAsyncHandler", "platformSession is empty!");
                mo230481a(ApiCode.GETUSERINFO_NOT_LOGIN);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, mo230473f().getAppId());
            if (z) {
                hashMap.put("withCredentials", "true");
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
            boolean a2 = C67857a.m263992a(mo230473f());
            int b = C67857a.m263993b(mo230473f());
            if (!a2 && b == 1) {
                hashMap2.put("domain_alias", "open");
            }
            AppBrandLogger.m52830i("GetUserInfoAsyncHandler", "Request userInfo");
            mo230475h().mo235016a(str, (Map<String, String>) hashMap2, new JSONObject(hashMap), true).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.passport.C25450b.C254511 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    if (TextUtils.isEmpty(str)) {
                        AppBrandLogger.m52830i("GetUserInfoAsyncHandler", "GetUserInfoAsyncHandler:response is empty!");
                        C25450b.this.mo230482a(ApiCode.GETUSERINFO_GET_USER_INFO_FAIL, "response is empty");
                        return;
                    }
                    AppBrandLogger.m52830i("GetUserInfoAsyncHandler", "GetUserInfoAsyncHandler:success!");
                    C25450b.this.mo88583a(g, str);
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.passport.C25450b.C254522 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    AppBrandLogger.m52830i("GetUserInfoAsyncHandler", "GetUserInfoAsyncHandler fail:" + th.getMessage());
                    C25450b.this.mo230486a(th);
                }
            });
            return;
        }
        AppBrandLogger.m52829e("GetUserInfoAsyncHandler", "param type is Illegal");
        mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "param type is Illegal");
    }

    public C25450b(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    public void mo88583a(String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            boolean i = mo230475h().mo235058i();
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.optInt("error", -1) == 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject("userInfo");
                if (i) {
                    optJSONObject.put("sessionId", str);
                }
                hashMap.put("userInfo", optJSONObject);
                hashMap.put("rawData", jSONObject.optString("rawData"));
                if (jSONObject.has("encryptedData")) {
                    hashMap.put("encryptedData", jSONObject.optString("encryptedData"));
                }
                if (jSONObject.has("iv")) {
                    hashMap.put("iv", jSONObject.optString("iv"));
                }
                if (jSONObject.has("signature")) {
                    hashMap.put("signature", jSONObject.optString("signature"));
                }
                mo230487a(hashMap);
                return;
            }
            mo230482a(ApiCode.GETUSERINFO_GET_USER_INFO_FAIL, jSONObject.optString("message"));
        } catch (Exception e) {
            mo230486a(e);
        }
    }
}
