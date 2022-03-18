package com.larksuite.component.openplatform.core.plugin.container.p1128a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.a.g */
public class C24653g extends ApiHandler {

    /* renamed from: a */
    String f60687a;

    /* renamed from: b */
    String f60688b;

    /* renamed from: c */
    Boolean f60689c;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "sortFavorites";
    }

    public C24653g() {
    }

    /* renamed from: a */
    private void m89731a() throws JSONException {
        JSONObject jSONObject = new JSONObject(this.mArgs);
        AppBrandLogger.m52828d("ApiHandler", "mArgs == ", this.mArgs);
        this.f60687a = jSONObject.optString("appId", null);
        this.f60688b = jSONObject.optString("pivotAppId", null);
        if (jSONObject.has("isBefore")) {
            this.f60689c = Boolean.valueOf(jSONObject.optBoolean("isBefore"));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            m89731a();
            Observable.create(new Function<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24653g.C246552 */

                /* renamed from: a */
                public String fun() {
                    C24653g gVar = C24653g.this;
                    return gVar.mo87647a(gVar.f60687a, C24653g.this.f60688b, C24653g.this.f60689c.booleanValue());
                }
            }).subscribe(new Subscriber.ResultableSubscriber<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24653g.C246541 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("response", new JSONObject(str));
                        C24653g.this.callbackOk(jSONObject);
                    } catch (JSONException unused) {
                        C24653g.this.callbackFail("Server callback result not json!");
                    }
                }

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    AppBrandLogger.m52828d("ApiHandler", th);
                    C24653g.this.callbackFail(th);
                }
            });
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiHandler", e);
            callbackFail(e);
        }
    }

    public C24653g(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    /* renamed from: a */
    public String mo87647a(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder(AppbrandConstant.C65701b.m257612c().mo230161z());
        sb.append("?aid=" + AppbrandContext.getInst().getInitParams().mo234510j());
        sb.append("&appid=" + str);
        sb.append("&pivot_appid=" + str2);
        sb.append("&is_before=" + z);
        AppBrandLogger.m52828d("ApiHandler", "sortCurrentUserFavoriteSetOfNet", "url == ", sb.toString());
        C12827e eVar = new C12827e(sb.toString(), "GET");
        eVar.mo48434a("X-Tma-Host-Sessionid", C66467o.m259788a(getAppContext()).f167782h);
        String d = C66434g.m259707a().mo231984a(eVar, getAppContext()).mo48466d();
        AppBrandLogger.m52828d("ApiHandler", "sortCurrentUserFavoriteSetOfNet", "respData == ", d);
        return d;
    }
}
