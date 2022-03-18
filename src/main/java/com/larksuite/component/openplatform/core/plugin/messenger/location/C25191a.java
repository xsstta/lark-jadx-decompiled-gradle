package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.larksuite.component.openplatform.core.plugin.authorization.C24588a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.maplocate.TMALocation;
import com.tt.miniapp.p3311o.C66543b;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.miniapphost.util.C67583a;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.location.a */
public class C25191a extends ApiHandler {

    /* renamed from: a */
    boolean f61506a;

    /* renamed from: b */
    public C66543b f61507b;

    /* renamed from: c */
    private int f61508c = 1;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getLocation";
    }

    public C25191a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (this.f61507b == null) {
            this.f61507b = new C66543b(getActionName(), getAppContext());
        }
        final Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail("activity is null");
            return;
        }
        String str = null;
        if (HostDependManager.getInst().createMapInstance() == null) {
            callbackAppUnSupportFeature();
            return;
        }
        try {
            str = new JSONObject(this.mArgs).optString(ShareHitPoint.f121869d);
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("tma_ApiGetLocationCtrl", "locate type", e);
        }
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str.toLowerCase(), "gcj02")) {
            this.f61508c = 2;
        }
        final boolean b = ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50184b(12);
        Observable.create(new Function<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25191a.C251932 */

            /* renamed from: a */
            public Boolean fun() {
                return C24588a.m89632c();
            }
        }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25191a.C251921 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    C25191a.this.mo88303a(currentActivity, b);
                } else {
                    C25191a.this.mo88306b(currentActivity, b);
                }
            }

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                C25191a.this.mo88306b(currentActivity, b);
                AppBrandLogger.m52829e("tma_ApiGetLocationCtrl", th);
            }
        });
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void setAppContext(IAppContext iAppContext) {
        super.setAppContext(iAppContext);
    }

    /* renamed from: a */
    public void mo88305a(String str) {
        if (!this.f61506a) {
            callbackFail(str);
            this.f61506a = true;
        }
    }

    /* renamed from: c */
    private TMALocation m90573c(TMALocation tMALocation) {
        if (this.f61508c == 1) {
            double[] b = C67583a.m263038b(tMALocation.getLongitude(), tMALocation.getLatitude());
            tMALocation.setLongitude(b[0]);
            tMALocation.setLatitude(b[1]);
        }
        return tMALocation;
    }

    /* renamed from: a */
    public void mo88304a(TMALocation tMALocation) {
        if (!this.f61506a) {
            TMALocation tMALocation2 = new TMALocation(tMALocation);
            m90573c(tMALocation2);
            m90572b(tMALocation2);
            this.f61506a = true;
        }
    }

    /* renamed from: b */
    private void m90572b(TMALocation tMALocation) {
        if (tMALocation == null || !C67583a.m263037a(tMALocation.getLatitude(), tMALocation.getLongitude())) {
            callbackFail("invalid latitude and longitude");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("longitude", tMALocation.getLongitude());
            jSONObject.put("latitude", tMALocation.getLatitude());
            jSONObject.put("speed", (double) tMALocation.getSpeed());
            jSONObject.put("accuracy", (double) tMALocation.getAccuracy());
            jSONObject.put("altitude", tMALocation.getAltitude());
            if (Build.VERSION.SDK_INT >= 26) {
                jSONObject.put(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, (double) tMALocation.getVerticalAccuracyMeters());
            } else {
                jSONObject.put(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, 0);
            }
            jSONObject.put("horizontalAccuracy", (double) tMALocation.mo232050f());
            jSONObject.put("city", tMALocation.mo232051g());
            callbackOk(jSONObject);
            AppBrandLogger.m52828d("tma_ApiGetLocationCtrl", "locate success:from" + tMALocation.mo232053i() + " result:" + jSONObject.toString());
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_ApiGetLocationCtrl", e);
            callbackFail(e);
        }
    }

    /* renamed from: a */
    public void mo88303a(final Activity activity, final boolean z) {
        HashSet hashSet = new HashSet();
        hashSet.add(C66578b.C66579a.m260113b(getAppContext()));
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235101a(activity, getActionName(), hashSet, new LinkedHashMap<>(), new AbstractC67539a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25191a.C251943 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: a */
            public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                AppBrandLogger.m52828d("tma_ApiGetLocationCtrl", "onGranted LOCATION");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25191a.C251943.C251951 */

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48890a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25191a.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        AppBrandLogger.m52828d("tma_ApiGetLocationCtrl", "onGranted ACCESS_FINE_LOCATION");
                        TMALocation a = C25191a.this.f61507b.mo232103a();
                        if (a == null || System.currentTimeMillis() - a.getTime() >= 60000) {
                            C25191a.this.f61507b.mo232104a(6000, new C66543b.AbstractC66545a() {
                                /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25191a.C251943.C251951.C251961 */

                                @Override // com.tt.miniapp.p3311o.C66543b.AbstractC66545a
                                /* renamed from: a */
                                public void mo88310a(TMALocation tMALocation) {
                                    C25191a.this.mo88304a(tMALocation);
                                }

                                @Override // com.tt.miniapp.p3311o.C66543b.AbstractC66545a
                                /* renamed from: a */
                                public void mo88311a(String str) {
                                    C25191a.this.mo88305a(str);
                                }
                            });
                        } else {
                            C25191a.this.mo88304a(a);
                        }
                    }

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48891a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25191a.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        AppBrandLogger.m52829e("tma_ApiGetLocationCtrl", "onGranted onDenied");
                        C25191a.this.mApiHandlerCallback.callback(C25191a.this.mCallBackId, C66578b.m260107b(C25191a.this.getActionName()));
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: b */
            public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", C25191a.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                AppBrandLogger.m52829e("tma_ApiGetLocationCtrl", "onDenied LOCATION");
                C25191a.this.mApiHandlerCallback.callback(C25191a.this.mCallBackId, C66578b.m260105a(C25191a.this.getActionName()));
            }
        }, null);
    }

    /* renamed from: b */
    public void mo88306b(final Activity activity, final boolean z) {
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235103a(activity, getActionName(), C66578b.C66579a.m260113b(getAppContext()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25191a.C251974 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                AppBrandLogger.m52828d("tma_ApiGetLocationCtrl", "onGranted LOCATION");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25191a.C251974.C251981 */

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48890a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25191a.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        AppBrandLogger.m52828d("tma_ApiGetLocationCtrl", "onGranted ACCESS_FINE_LOCATION");
                        TMALocation a = C25191a.this.f61507b.mo232103a();
                        if (a == null || System.currentTimeMillis() - a.getTime() >= 60000) {
                            C25191a.this.f61507b.mo232104a(6000, new C66543b.AbstractC66545a() {
                                /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25191a.C251974.C251981.C251991 */

                                @Override // com.tt.miniapp.p3311o.C66543b.AbstractC66545a
                                /* renamed from: a */
                                public void mo88310a(TMALocation tMALocation) {
                                    C25191a.this.mo88304a(tMALocation);
                                }

                                @Override // com.tt.miniapp.p3311o.C66543b.AbstractC66545a
                                /* renamed from: a */
                                public void mo88311a(String str) {
                                    C25191a.this.mo88305a(str);
                                }
                            });
                        } else {
                            C25191a.this.mo88304a(a);
                        }
                    }

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48891a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25191a.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        AppBrandLogger.m52829e("tma_ApiGetLocationCtrl", "onGranted onDenied");
                        C25191a.this.mApiHandlerCallback.callback(C25191a.this.mCallBackId, C66578b.m260107b(C25191a.this.getActionName()));
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", C25191a.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                AppBrandLogger.m52829e("tma_ApiGetLocationCtrl", "onDenied LOCATION");
                C25191a.this.mApiHandlerCallback.callback(C25191a.this.mCallBackId, C66578b.m260105a(C25191a.this.getActionName()));
            }
        });
    }

    public C25191a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
