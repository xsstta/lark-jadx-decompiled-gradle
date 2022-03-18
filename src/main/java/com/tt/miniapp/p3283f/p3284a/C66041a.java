package com.tt.miniapp.p3283f.p3284a;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p633e.C12835b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.host.HostDependManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.f.a.a */
public class C66041a {

    /* renamed from: a */
    public String f166702a;

    /* renamed from: b */
    public IAppContext f166703b;

    /* renamed from: c */
    private AbstractC66044a f166704c;

    /* renamed from: d */
    private boolean f166705d = true;

    /* renamed from: com.tt.miniapp.f.a.a$a */
    public interface AbstractC66044a {
        /* renamed from: a */
        void mo231132a();

        /* renamed from: a */
        void mo231133a(String str);
    }

    /* renamed from: c */
    private void m258633c() {
        AbstractC66044a aVar = this.f166704c;
        if (aVar != null) {
            aVar.mo231132a();
        }
    }

    /* renamed from: a */
    private boolean m258631a() {
        if (!this.f166705d || TextUtils.isEmpty(this.f166702a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m258632b() {
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(this.f166703b).getAppInfo();
        if (appInfo == null || TextUtils.isEmpty(appInfo.appId)) {
            mo231129b("app info is null");
            return;
        }
        String str = appInfo.appId;
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams == null || TextUtils.isEmpty(initParams.mo234510j())) {
            mo231129b("host init param is null");
            return;
        }
        String j = initParams.mo234510j();
        String str2 = C66467o.m259788a(this.f166703b).f167781g;
        if (TextUtils.isEmpty(str2)) {
            mo231129b("get uid params error");
            return;
        }
        String e = C67043j.m261282e();
        if (!C12835b.m53005a(AppbrandContext.getInst().getApplicationContext())) {
            mo231129b("network unavailable");
            return;
        }
        final C12827e eVar = new C12827e(new C66045b(str, j, str2, e).mo231134a(AppbrandConstant.C65701b.m257612c().mo230135A()), "GET");
        Observable.create(new Function<String>() {
            /* class com.tt.miniapp.p3283f.p3284a.C66041a.C660432 */

            /* renamed from: a */
            public String fun() {
                return C66434g.m259707a().mo231984a(eVar, C66041a.this.f166703b).mo48466d();
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<String>() {
            /* class com.tt.miniapp.p3283f.p3284a.C66041a.C660421 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                AppBrandLogger.m52829e("CustomerServiceManager", "requestCustomerServiceURL fail", th);
                C66041a.this.mo231129b(ApiCallResultHelper.generateThrowableExtraInfo(th));
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    C66041a.this.mo231129b("requestResult is null");
                    return;
                }
                AppBrandLogger.m52829e("CustomerServiceManager", str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int i = jSONObject.getInt("error");
                    if (i != 0) {
                        String optString = jSONObject.optString("message");
                        C66041a.this.mo231129b(String.format("%s errorCode = %s", optString, Integer.valueOf(i)));
                        return;
                    }
                    String optString2 = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    AppBrandLogger.m52829e("CustomerServiceManager", "customerServiceURL", optString2);
                    if (TextUtils.isEmpty(optString2)) {
                        C66041a.this.mo231129b("service return empty url");
                        return;
                    }
                    C66041a.this.f166702a = optString2;
                    C66041a.this.mo231128a(optString2);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("CustomerServiceManager", e);
                    C66041a.this.mo231129b("response data error");
                } catch (Exception e2) {
                    AppBrandLogger.m52829e("CustomerServiceManager", e2);
                    C66041a.this.mo231129b(ApiCallResultHelper.generateThrowableExtraInfo(e2));
                }
            }
        });
    }

    /* renamed from: b */
    public void mo231129b(String str) {
        AbstractC66044a aVar = this.f166704c;
        if (aVar != null) {
            aVar.mo231133a(str);
        }
    }

    public C66041a(IAppContext iAppContext) {
        this.f166703b = iAppContext;
    }

    /* renamed from: a */
    public static C66041a m258630a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234305z();
    }

    /* renamed from: a */
    public void mo231127a(AbstractC66044a aVar) {
        this.f166704c = aVar;
        if (m258631a()) {
            mo231128a(this.f166702a);
        } else {
            m258632b();
        }
    }

    /* renamed from: a */
    public void mo231128a(String str) {
        Activity currentActivity = this.f166703b.getCurrentActivity();
        if (currentActivity == null) {
            mo231129b("activity is null");
        } else if (HostDependManager.getInst().openCustomerService(currentActivity, str)) {
            m258633c();
        } else {
            mo231129b("feature is not supported in app");
        }
    }
}
