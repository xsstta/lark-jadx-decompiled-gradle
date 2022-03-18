package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.larksuite.component.openplatform.core.plugin.authorization.C24588a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.b */
public class C25116b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "chooseAddress";
    }

    public C25116b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        final String str;
        try {
            str = new JSONObject(this.mArgs).optString("addressId");
        } catch (Exception e) {
            callbackFail(e);
            AppBrandLogger.m52829e("tma_ApiChooseAddressCtrl", e);
            str = "";
        }
        final Activity currentActivity = getAppContext().getCurrentActivity();
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        final boolean b = aVar.mo50184b(15);
        Observable.create(new Function<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25116b.C251212 */

            /* renamed from: a */
            public Boolean fun() {
                return C24588a.m89632c();
            }
        }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25116b.C251171 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                aVar.mo235103a(currentActivity, C25116b.this.getActionName(), C66578b.C66579a.m260122g(C25116b.this.getAppContext()), new AbstractC67540b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25116b.C251171.C251203 */

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87199a() {
                        if (!b) {
                            C66020b.m258530a("mp_auth_alert_result", C25116b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(15)).mo231090a("result", "success").mo231092a();
                        }
                        C25116b.this.mo88222a(str);
                    }

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87200a(String str) {
                        if (!b) {
                            C66020b.m258530a("mp_auth_alert_result", C25116b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(15)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                        }
                        C25116b.this.callbackFail("auth deny");
                    }
                });
                AppBrandLogger.m52829e("tma_ApiChooseAddressCtrl", th);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(C66578b.C66579a.m260122g(C25116b.this.getAppContext()));
                    aVar.mo235101a(currentActivity, C25116b.this.getActionName(), hashSet, new LinkedHashMap<>(), new AbstractC67539a() {
                        /* class com.larksuite.component.openplatform.core.plugin.messenger.C25116b.C251171.C251181 */

                        @Override // com.tt.miniapphost.p3373f.AbstractC67539a
                        /* renamed from: a */
                        public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                            C25116b.this.mo88222a(str);
                            if (!b) {
                                C66020b.m258530a("mp_auth_alert_result", C25116b.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(15)).mo231090a("result", "success").mo231092a();
                            }
                        }

                        @Override // com.tt.miniapphost.p3373f.AbstractC67539a
                        /* renamed from: b */
                        public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                            if (!b) {
                                C66020b.m258530a("mp_auth_alert_result", C25116b.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(15)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                            }
                            C25116b.this.callbackFail("auth deny");
                        }
                    }, null);
                    return;
                }
                aVar.mo235103a(currentActivity, C25116b.this.getActionName(), C66578b.C66579a.m260122g(C25116b.this.getAppContext()), new AbstractC67540b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25116b.C251171.C251192 */

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87199a() {
                        if (!b) {
                            C66020b.m258530a("mp_auth_alert_result", C25116b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(15)).mo231090a("result", "success").mo231092a();
                        }
                        C25116b.this.mo88222a(str);
                    }

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87200a(String str) {
                        if (!b) {
                            C66020b.m258530a("mp_auth_alert_result", C25116b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(15)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                        }
                        C25116b.this.callbackFail("auth deny");
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo88222a(String str) {
        callbackAppUnSupportFeature();
    }

    public C25116b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
