package com.larksuite.component.openplatform.core.plugin.container.p1128a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.C67556a;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.a.a */
public class C24636a extends ApiHandler {

    /* renamed from: a */
    String f60671a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "addToFavorites";
    }

    public C24636a() {
    }

    /* renamed from: a */
    private void m89712a() throws JSONException {
        JSONObject jSONObject = new JSONObject(this.mArgs);
        AppBrandLogger.m52828d("ApiHandler", "mArgs == ", this.mArgs);
        this.f60671a = jSONObject.optString("appId", null);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            m89712a();
            Observable.create(new Function<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24636a.C246382 */

                /* renamed from: a */
                public String fun() {
                    return C24636a.m89711a(C24636a.this.f60671a, C24636a.this.getAppContext());
                }
            }).subscribe(new Subscriber.ResultableSubscriber<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24636a.C246371 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("response", new JSONObject(str));
                        C24636a.this.callbackOk(jSONObject);
                    } catch (JSONException unused) {
                        C24636a.this.callbackFail("Server callback result not json!");
                    }
                }

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    AppBrandLogger.m52828d("ApiHandler", th);
                    C24636a.this.callbackFail(th);
                }
            });
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiHandler", e);
            callbackFail(e);
        }
    }

    /* renamed from: a */
    public static String m89711a(String str, IAppContext iAppContext) {
        boolean z;
        StringBuilder sb = new StringBuilder(AppbrandConstant.C65701b.m257612c().mo230159x());
        sb.append("?aid=" + AppbrandContext.getInst().getInitParams().mo234510j());
        sb.append("&appid=" + str);
        AppBrandLogger.m52828d("ApiHandler", "addMiniappToCurrentUserFavoritesOfNet", "url == ", sb.toString());
        C12827e eVar = new C12827e(sb.toString(), "GET");
        eVar.mo48434a("X-Tma-Host-Sessionid", C66467o.m259788a(iAppContext).f167782h);
        String d = C66434g.m259707a().mo231984a(eVar, iAppContext).mo48466d();
        AppBrandLogger.m52828d("ApiHandler", "addMiniappToCurrentUserFavoritesOfNet", "respData == ", d);
        if (d != null) {
            try {
                if (new JSONObject(d).optInt("error", 1) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C67556a.m262942b(str);
                    C66612a.m260238d(str);
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiHandler", e);
            }
        }
        return d;
    }

    public C24636a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
