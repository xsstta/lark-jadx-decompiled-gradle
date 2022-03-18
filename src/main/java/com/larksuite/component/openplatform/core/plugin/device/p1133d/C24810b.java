package com.larksuite.component.openplatform.core.plugin.device.p1133d;

import android.app.Activity;
import android.location.LocationManager;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.larksuite.component.openplatform.core.plugin.authorization.C24588a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.b */
public class C24810b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getWifiList";
    }

    public C24810b() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!C24819e.m89919a().mo87859b()) {
            callbackFail("wifi not turned on");
        } else if (!((LocationManager) AppbrandContext.getInst().getApplicationContext().getSystemService("location")).isProviderEnabled("gps")) {
            callbackFail("gps not turned on");
        } else {
            final Activity currentActivity = getAppContext().getCurrentActivity();
            if (currentActivity == null) {
                callbackFail("activity is null");
                return;
            }
            final boolean b = ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50184b(12);
            Observable.create(new Function<Boolean>() {
                /* class com.larksuite.component.openplatform.core.plugin.device.p1133d.C24810b.C248122 */

                /* renamed from: a */
                public Boolean fun() {
                    return C24588a.m89632c();
                }
            }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
                /* class com.larksuite.component.openplatform.core.plugin.device.p1133d.C24810b.C248111 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    C24810b.this.mo87850a(currentActivity, b);
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    if (bool.booleanValue()) {
                        C24810b.this.mo87851b(currentActivity, b);
                    } else {
                        C24810b.this.mo87850a(currentActivity, b);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo87850a(final Activity activity, final boolean z) {
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235103a(activity, getActionName(), C66578b.C66579a.m260113b(getAppContext()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.device.p1133d.C24810b.C248133 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
                    /* class com.larksuite.component.openplatform.core.plugin.device.p1133d.C24810b.C248133.C248141 */

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48890a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C24810b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        if (C24819e.m89919a().mo87861c()) {
                            C24810b.this.callbackOk();
                        } else {
                            C24810b.this.callbackFail("system internal error");
                        }
                    }

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48891a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C24810b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        C24810b.this.callbackFail("system auth deny");
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                C24810b.this.callbackFail("auth deny");
            }
        });
    }

    /* renamed from: b */
    public void mo87851b(final Activity activity, final boolean z) {
        HashSet hashSet = new HashSet();
        hashSet.add(C66578b.C66579a.m260113b(getAppContext()));
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235101a(activity, getActionName(), hashSet, new LinkedHashMap<>(), new AbstractC67539a() {
            /* class com.larksuite.component.openplatform.core.plugin.device.p1133d.C24810b.C248154 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: b */
            public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                C24810b.this.callbackFail("auth deny");
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: a */
            public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
                    /* class com.larksuite.component.openplatform.core.plugin.device.p1133d.C24810b.C248154.C248161 */

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48890a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C24810b.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        if (C24819e.m89919a().mo87861c()) {
                            C24810b.this.callbackOk();
                        } else {
                            C24810b.this.callbackFail("system internal error");
                        }
                    }

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48891a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C24810b.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        C24810b.this.callbackFail("system auth deny");
                    }
                });
            }
        }, null);
    }

    public C24810b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
