package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.larksuite.component.openplatform.core.plugin.authorization.C24588a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.map.AppbrandMapActivity;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.location.b */
public class C25200b extends ApiHandler {

    /* renamed from: a */
    private String f61525a;

    /* renamed from: b */
    private String f61526b;

    /* renamed from: c */
    private double f61527c;

    /* renamed from: d */
    private double f61528d;

    /* renamed from: e */
    private int f61529e;

    /* renamed from: f */
    private String f61530f;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "openLocation";
    }

    public C25200b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        final Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            this.f61525a = jSONObject.optString("name", "");
            this.f61526b = jSONObject.optString("address", "");
            this.f61527c = jSONObject.optDouble("latitude", 0.0d);
            this.f61528d = jSONObject.optDouble("longitude", 0.0d);
            this.f61529e = jSONObject.optInt("scale", 18);
            this.f61530f = jSONObject.optString(ShareHitPoint.f121869d, "");
            double d = this.f61527c;
            if (d < -90.0d || d > 90.0d) {
                callbackFail(ApiCode.OPENLOCATION_INVALID_LATITUDE);
                return;
            }
            double d2 = this.f61528d;
            if (d2 < -180.0d || d2 > 180.0d) {
                callbackFail(ApiCode.OPENLOCATION_INVALID_LONGITUDE);
            } else if (HostDependManager.getInst().createMapInstance() == null) {
                callbackAppUnSupportFeature();
            } else {
                final boolean b = ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50184b(12);
                Observable.create(new Function<Boolean>() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25200b.C252022 */

                    /* renamed from: a */
                    public Boolean fun() {
                        return C24588a.m89632c();
                    }
                }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25200b.C252011 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        if (bool.booleanValue()) {
                            C25200b.this.mo88313a(currentActivity, b);
                        } else {
                            C25200b.this.mo88314b(currentActivity, b);
                        }
                    }

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                    public void onError(Throwable th) {
                        C25200b.this.mo88314b(currentActivity, b);
                        AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", th);
                    }
                });
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_ApiOpenLocationCtrl", e.getStackTrace());
            callbackFail(ApiCode.GENERAL_JSON_ERROR, ApiCallResultHelper.generateIllegalArgExtraInfo(this.mArgs));
        }
    }

    /* renamed from: a */
    public void mo88312a(Activity activity) {
        AppBrandLogger.m52828d("tma_ApiOpenLocationCtrl", "openMapActivity");
        if (!HostDependManager.getInst().openLocation(activity, this.f61525a, this.f61526b, this.f61527c, this.f61528d, this.f61529e, this.f61530f, this.mArgs)) {
            AppBrandLogger.m52828d("tma_ApiOpenLocationCtrl", "startActivity");
            Intent intent = new Intent(activity, AppbrandMapActivity.class);
            intent.putExtra("name", this.f61525a);
            intent.putExtra("address", this.f61526b);
            intent.putExtra("latitude", this.f61527c);
            intent.putExtra("longitude", this.f61528d);
            intent.putExtra("scale", this.f61529e);
            activity.startActivity(intent);
        }
    }

    /* renamed from: a */
    public void mo88313a(final Activity activity, final boolean z) {
        HashSet hashSet = new HashSet();
        hashSet.add(C66578b.C66579a.m260113b(getAppContext()));
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235101a(activity, getActionName(), hashSet, new LinkedHashMap<>(), new AbstractC67539a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25200b.C252033 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: a */
            public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                AppBrandLogger.m52828d("tma_ApiOpenLocationCtrl", "onGranted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25200b.C252033.C252041 */

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48890a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25200b.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        try {
                            AppBrandLogger.m52828d("tma_ApiOpenLocationCtrl", "onGranted2");
                            C25200b.this.mo88312a(activity);
                            C25200b.this.callbackOk();
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "", e);
                            C25200b.this.callbackFail(ApiCode.GENERAL_UNKONW_ERROR, e.getMessage());
                        }
                    }

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48891a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25200b.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "onDenied ", str);
                        C25200b.this.callbackFail(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: b */
            public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", C25200b.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                if (!linkedHashMap.isEmpty()) {
                    AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "onDenied2 ", HostDependManager.getInst().permissionTypeToPermission(linkedHashMap.keySet().iterator().next().intValue(), C25200b.this.getAppContext()).mo232179c());
                }
                C25200b.this.callbackFail(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        }, null);
    }

    /* renamed from: b */
    public void mo88314b(final Activity activity, final boolean z) {
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235103a(activity, getActionName(), C66578b.C66579a.m260113b(getAppContext()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25200b.C252054 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                AppBrandLogger.m52828d("tma_ApiOpenLocationCtrl", "onGranted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25200b.C252054.C252061 */

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48890a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25200b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        try {
                            AppBrandLogger.m52828d("tma_ApiOpenLocationCtrl", "onGranted2");
                            C25200b.this.mo88312a(activity);
                            C25200b.this.callbackOk();
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "", e);
                            C25200b.this.callbackFail(ApiCode.GENERAL_UNKONW_ERROR, e.getMessage());
                        }
                    }

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48891a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25200b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "onDenied ", str);
                        C25200b.this.callbackFail(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", C25200b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "onDenied2 ", str);
                C25200b.this.callbackFail(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }

    public C25200b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
