package com.larksuite.component.openplatform.core.plugin.op;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.authorization.C24588a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.maplocate.TMALocation;
import com.tt.miniapp.p3311o.C66543b;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.miniapphost.util.C67583a;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.k */
public class C25398k extends ApiHandler {

    /* renamed from: b */
    private static final String f61928b = AppbrandConstant.C65701b.m257612c().mo230157v();

    /* renamed from: a */
    private C66543b f61929a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getCloudStorageByLocation";
    }

    public C25398k() {
    }

    /* renamed from: a */
    public static String m90902a() {
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams != null) {
            return initParams.mo234510j();
        }
        AppBrandLogger.m52829e("tma_getCloudStorageByLocation", "getApplicationId initParams is null");
        return "";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        final Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail("activity is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            final String jSONArray = jSONObject.getJSONArray("keyList").toString();
            final String string = jSONObject.getString(ShareHitPoint.f121869d);
            final boolean b = ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50184b(12);
            Observable.create(new Function<Boolean>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25398k.C254002 */

                /* renamed from: a */
                public Boolean fun() {
                    return C24588a.m89632c();
                }
            }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25398k.C253991 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    C25398k.this.mo88537b(currentActivity, jSONArray, string, b);
                    AppBrandLogger.m52829e("tma_getCloudStorageByLocation", th);
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    if (bool.booleanValue()) {
                        C25398k.this.mo88534a(currentActivity, jSONArray, string, b);
                    } else {
                        C25398k.this.mo88537b(currentActivity, jSONArray, string, b);
                    }
                }
            });
        } catch (Exception e) {
            callbackFail("invoke params error");
            AppBrandLogger.stacktrace(6, "tma_getCloudStorageByLocation", e.getStackTrace());
        }
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void setAppContext(IAppContext iAppContext) {
        super.setAppContext(iAppContext);
        this.f61929a = new C66543b(getActionName(), iAppContext);
    }

    /* renamed from: a */
    public void mo88535a(final String str, final String str2) {
        AppBrandLogger.m52828d("tma_getCloudStorageByLocation", "getAndReportLocation:", str, str2);
        TMALocation a = this.f61929a.mo232103a();
        if (a == null || System.currentTimeMillis() - a.getTime() >= 86400000) {
            this.f61929a.mo232104a(5000, new C66543b.AbstractC66545a() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25398k.C254055 */

                @Override // com.tt.miniapp.p3311o.C66543b.AbstractC66545a
                /* renamed from: a */
                public void mo88311a(String str) {
                    C25398k.this.callbackFail(str);
                }

                @Override // com.tt.miniapp.p3311o.C66543b.AbstractC66545a
                /* renamed from: a */
                public void mo88310a(TMALocation tMALocation) {
                    C25398k.this.mo88536a(str2, str, tMALocation);
                }
            });
        } else {
            mo88536a(str2, str, a);
        }
    }

    public C25398k(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    /* renamed from: a */
    public void mo88536a(String str, String str2, TMALocation tMALocation) {
        AppBrandLogger.m52828d("tma_getCloudStorageByLocation", "startGetNearRankRequest");
        double[] b = C67583a.m263038b(tMALocation.getLongitude(), tMALocation.getLatitude());
        double d = b[0];
        double d2 = b[1];
        Uri.Builder buildUpon = Uri.parse(f61928b).buildUpon();
        buildUpon.appendQueryParameter("session", C66612a.m260219a(C67432a.m262319a(getAppContext()).getAppInfo().appId));
        buildUpon.appendQueryParameter(HiAnalyticsConstant.HaKey.BI_KEY_APPID, AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().appId);
        buildUpon.appendQueryParameter("aid", m90902a());
        buildUpon.appendQueryParameter("keyList", str2);
        buildUpon.appendQueryParameter(ShareHitPoint.f121869d, str);
        buildUpon.appendQueryParameter("longitude", String.valueOf(d));
        buildUpon.appendQueryParameter("latitude", String.valueOf(d2));
        final String uri = buildUpon.build().toString();
        AppBrandLogger.m52828d("tma_getCloudStorageByLocation", "completeUrl:" + uri);
        Observable.create(new Function<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25398k.C254077 */

            /* renamed from: a */
            public String fun() {
                return C66434g.m259707a().mo231985a(uri, C25398k.this.getAppContext()).mo48466d();
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25398k.C254066 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                C25398k.this.callbackFail(th);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    C25398k.this.callbackFail("requestResult is null");
                    return;
                }
                AppBrandLogger.m52828d("tma_getCloudStorageByLocation", "response s:" + str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int i = jSONObject.getInt("error");
                    if (i != 0) {
                        String optString = jSONObject.optString("message");
                        C25398k.this.callbackFail(String.format("%s errorCode = %s", optString, Integer.valueOf(i)));
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    HashMap<String, Object> hashMap = new HashMap<>();
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.opt(next));
                    }
                    C25398k.this.callbackOk(hashMap);
                } catch (JSONException e) {
                    AppBrandLogger.eWithThrowable("tma_getCloudStorageByLocation", "jsonerror", e);
                    C25398k.this.callbackFail(e);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo88534a(final Activity activity, final String str, final String str2, final boolean z) {
        HashSet hashSet = new HashSet();
        hashSet.add(C66578b.C66579a.m260113b(getAppContext()));
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235101a(activity, getActionName(), hashSet, new LinkedHashMap<>(), new AbstractC67539a() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25398k.C254013 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: a */
            public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                AppBrandLogger.m52828d("tma_getCloudStorageByLocation", "onGranted LOCATION");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
                    /* class com.larksuite.component.openplatform.core.plugin.op.C25398k.C254013.C254021 */

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48890a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25398k.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        AppBrandLogger.m52828d("tma_getCloudStorageByLocation", "onGranted ACCESS_FINE_LOCATION");
                        C25398k.this.mo88535a(str, str2);
                    }

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48891a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25398k.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        AppBrandLogger.m52829e("tma_getCloudStorageByLocation", "onGranted onDenied");
                        C25398k.this.callbackFail("system auth deny");
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: b */
            public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", C25398k.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                AppBrandLogger.m52829e("tma_getCloudStorageByLocation", "onDenied LOCATION");
                C25398k.this.callbackFail("auth deny");
            }
        }, null);
    }

    /* renamed from: b */
    public void mo88537b(final Activity activity, final String str, final String str2, final boolean z) {
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235103a(activity, getActionName(), C66578b.C66579a.m260113b(getAppContext()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25398k.C254034 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                AppBrandLogger.m52828d("tma_getCloudStorageByLocation", "onGranted LOCATION");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
                    /* class com.larksuite.component.openplatform.core.plugin.op.C25398k.C254034.C254041 */

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48890a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25398k.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        AppBrandLogger.m52828d("tma_getCloudStorageByLocation", "onGranted ACCESS_FINE_LOCATION");
                        C25398k.this.mo88535a(str, str2);
                    }

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48891a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25398k.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        AppBrandLogger.m52829e("tma_getCloudStorageByLocation", "onGranted onDenied");
                        C25398k.this.callbackFail("system auth deny");
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", C25398k.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                AppBrandLogger.m52829e("tma_getCloudStorageByLocation", "onDenied LOCATION");
                C25398k.this.callbackFail("auth deny");
            }
        });
    }
}
