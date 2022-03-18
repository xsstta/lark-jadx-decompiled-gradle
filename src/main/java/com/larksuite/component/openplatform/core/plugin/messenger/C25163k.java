package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.service.net.C67852a;
import com.tt.refer.common.util.C67857a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@ApiSupportType(apiName = {"enterProfile"}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.k */
public class C25163k extends AbstractC65797c {
    public C25163k() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("enterProfile");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        String str = (String) bVar.mo234984a("openid");
        final String appId = mo230473f().getAppId();
        if (TextUtils.isEmpty(appId)) {
            AppBrandLogger.m52830i("EnterProfileAsyncHandler", "appid is empty");
            mo230493c(ApiCallResultHelper.generateDataNullExtraInfo("appId"));
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(appId)) {
            AppBrandLogger.m52830i("EnterProfileAsyncHandler", "openid is empty");
            mo230493c(ApiCallResultHelper.generateDataNullExtraInfo("openid"));
        } else {
            final C67852a aVar = new C67852a();
            HashMap hashMap = new HashMap();
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
            hashMap.put("openid", str);
            hashMap.put("ttcode", aVar.mo235486a(mo230473f()));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
            boolean a = C67857a.m263992a(mo230473f());
            int b = C67857a.m263993b(mo230473f());
            if (!a && b == 1) {
                hashMap2.put("domain_alias", "open");
            }
            mo230475h().mo235016a(C67857a.m263994c(mo230473f()) + "/v2/getUserIDByOpenID", (Map<String, String>) hashMap2, new JSONObject(hashMap), true).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.C25163k.C251641 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    if (TextUtils.isEmpty(str)) {
                        AppBrandLogger.m52829e("EnterProfileAsyncHandler", "EnterProfileAsyncHandler:response is empty!");
                        C25163k.this.mo230493c("EnterProfileAsyncHandler:response is empty!");
                        return;
                    }
                    String optString = new JSONObject(aVar.mo235487a(new JSONObject(str).optString("encryptedData"))).optString("userid");
                    if (!TextUtils.isEmpty(optString)) {
                        C25163k.this.mo230475h().mo235041b(optString, appId);
                        C25163k.this.mo230494j();
                        return;
                    }
                    C25163k.this.mo230493c(ApiCallResultHelper.generateDataNullExtraInfo("userId"));
                    AppBrandLogger.m52829e("EnterProfileAsyncHandler", "userid is empty!");
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.C25163k.C251652 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    AppBrandLogger.eWithThrowable("EnterProfileAsyncHandler", "EnterProfileAsyncHandler fail: ", th);
                    C25163k.this.mo230486a(th);
                }
            });
        }
    }

    public C25163k(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
