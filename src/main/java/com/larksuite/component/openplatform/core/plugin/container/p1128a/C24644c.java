package com.larksuite.component.openplatform.core.plugin.container.p1128a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.C67556a;
import com.tt.option.ext.AbstractC67619e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.a.c */
public class C24644c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getFavoritesList";
    }

    public C24644c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        Observable.create(new Function<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24644c.C246462 */

            /* renamed from: a */
            public String fun() {
                return C24644c.m89720a(C24644c.this.getAppContext());
            }
        }).subscribe(new Subscriber.ResultableSubscriber<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24644c.C246451 */

            /* renamed from: a */
            public void onSuccess(String str) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", new JSONObject(str));
                    C24644c.this.callbackOk(jSONObject);
                } catch (JSONException unused) {
                    C24644c.this.callbackFail("Server callback result not json!");
                }
            }

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                AppBrandLogger.m52829e("ApiHandler", th);
                C24644c.this.callbackFail(th);
            }
        });
    }

    /* renamed from: a */
    public static String m89720a(IAppContext iAppContext) {
        StringBuilder sb = new StringBuilder(AppbrandConstant.C65701b.m257612c().mo230158w());
        sb.append("?aid=" + AppbrandContext.getInst().getInitParams().mo234510j());
        AppBrandLogger.m52829e("ApiHandler", "getCurrentUserMiniAppFavoritesFromNet", "url == ", sb.toString());
        C12827e eVar = new C12827e(sb.toString(), "GET");
        eVar.mo48434a("X-Tma-Host-Sessionid", C66467o.m259788a(iAppContext).f167782h);
        String d = C66434g.m259707a().mo231984a(eVar, iAppContext).mo48466d();
        AppBrandLogger.m52829e("ApiHandler", "getCurrentUserMiniAppFavoritesFromNet", "respData == ", d);
        List<String> a = m89721a(d);
        if (a != null) {
            C67556a.m262939a(a);
            C66612a.m260230a(a);
        }
        return d;
    }

    /* renamed from: a */
    public static List<String> m89721a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("error", 1);
            AppBrandLogger.m52828d("ApiHandler", "favoriteJsonToFavoriteSet", "error == ", Integer.valueOf(optInt));
            if (optInt == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                AppBrandLogger.m52829e("ApiHandler", "favoriteJsonToFavoriteSet", jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "not errMsg"));
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject == null) {
                return null;
            }
            AppBrandLogger.m52828d("ApiHandler", "favoriteJsonToFavoriteSet", "data == ", optJSONObject.toString());
            JSONArray optJSONArray = optJSONObject.optJSONArray("list");
            if (optJSONArray == null) {
                return null;
            }
            AppBrandLogger.m52828d("ApiHandler", "favoriteJsonToFavoriteSet", "list == ", optJSONArray.toString());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiHandler", "favoriteJsonToFavoriteSet", e);
        }
    }

    public C24644c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
