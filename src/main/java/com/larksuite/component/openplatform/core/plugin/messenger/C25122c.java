package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
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
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.entity.C67525e;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.c */
public class C25122c extends ApiHandler {

    /* renamed from: a */
    private String f61378a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "chooseLocation";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25122c() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        final Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "activity is null");
            AppBrandLogger.m52829e("ApiChooseLocationCtrl", "activity is null");
            return;
        }
        try {
            this.f61378a = new JSONObject(this.mArgs).optString(ShareHitPoint.f121869d);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiChooseLocationCtrl", "param type parse exception", e);
        }
        if (TextUtils.isEmpty(this.f61378a)) {
            this.f61378a = "wgs84";
        }
        final boolean b = ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50184b(12);
        AppBrandLogger.m52830i("ApiChooseLocationCtrl", "chooseLocation start, has app permission:" + b);
        Observable.create(new Function<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25122c.C251242 */

            /* renamed from: a */
            public Boolean fun() {
                return C24588a.m89632c();
            }
        }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25122c.C251231 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                C25122c.this.mo88227b(currentActivity, b);
                AppBrandLogger.m52829e("ApiChooseLocationCtrl", th);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    AppBrandLogger.m52830i("ApiChooseLocationCtrl", "use new permission dialog");
                    C25122c.this.mo88226a(currentActivity, b);
                    return;
                }
                AppBrandLogger.m52830i("ApiChooseLocationCtrl", "use old permission dialog");
                C25122c.this.mo88227b(currentActivity, b);
            }
        });
    }

    /* renamed from: a */
    public void mo88225a(Activity activity) {
        if (!HostDependManager.getInst().chooseLocationActivity(getAppContext(), this.f61378a, 13)) {
            callbackAppUnSupportFeature();
            AppBrandLogger.m52829e("ApiChooseLocationCtrl", "chooelocation not support");
        }
    }

    /* renamed from: b */
    public void mo88227b(final Activity activity, final boolean z) {
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235103a(activity, getActionName(), C66578b.C66579a.m260113b(getAppContext()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25122c.C251274 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                AppBrandLogger.m52830i("ApiChooseLocationCtrl", "app permission granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C25122c.this.getApiDependency().mo235022a(activity, C25122c.this.getActionName(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25122c.C251274.C251281 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        AppBrandLogger.m52830i("ApiChooseLocationCtrl", "system permission granted");
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25122c.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        C25122c.this.mo88225a(activity);
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        AppBrandLogger.m52830i("ApiChooseLocationCtrl", "system permission denied");
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25122c.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        C25122c.this.unRegesterResultHandler();
                        C25122c.this.callbackFail(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                AppBrandLogger.m52830i("ApiChooseLocationCtrl", "app permission denied");
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", C25122c.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                C25122c.this.unRegesterResultHandler();
                C25122c.this.callbackFail(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }

    /* renamed from: a */
    public void mo88226a(final Activity activity, final boolean z) {
        HashSet hashSet = new HashSet();
        hashSet.add(C66578b.C66579a.m260113b(getAppContext()));
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235101a(activity, getActionName(), hashSet, new LinkedHashMap<>(), new AbstractC67539a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25122c.C251253 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: a */
            public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                AppBrandLogger.m52830i("ApiChooseLocationCtrl", "app permission granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C25122c.this.getApiDependency().mo235022a(activity, C25122c.this.getActionName(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25122c.C251253.C251261 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        AppBrandLogger.m52830i("ApiChooseLocationCtrl", "system permission granted");
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25122c.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        C25122c.this.mo88225a(activity);
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        AppBrandLogger.m52830i("ApiChooseLocationCtrl", "system permission denied:" + str);
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25122c.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        C25122c.this.unRegesterResultHandler();
                        C25122c.this.callbackFail(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: b */
            public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                AppBrandLogger.m52830i("ApiChooseLocationCtrl", "app permission denied");
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", C25122c.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                C25122c.this.unRegesterResultHandler();
                C25122c.this.callbackFail(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        }, null);
    }

    public C25122c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        C67525e handleChooseLocationResult = HostDependManager.getInst().handleChooseLocationResult(i, i2, intent);
        if (handleChooseLocationResult != null) {
            if (handleChooseLocationResult.mo234483a()) {
                AppBrandLogger.m52830i("ApiChooseLocationCtrl", "handle activity cancel");
                callbackFail(ApiCode.GENERAL_CANCEL);
            } else {
                HashMap hashMap = new HashMap();
                String d = handleChooseLocationResult.mo234486d();
                String e = handleChooseLocationResult.mo234487e();
                double b = handleChooseLocationResult.mo234484b();
                double c = handleChooseLocationResult.mo234485c();
                if (d != null) {
                    hashMap.put("name", d);
                }
                if (e != null) {
                    hashMap.put("address", e);
                }
                hashMap.put("latitude", Double.valueOf(b));
                hashMap.put("longitude", Double.valueOf(c));
                callbackOk(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
            }
        }
        return super.handleActivityResult(i, i2, intent);
    }
}
