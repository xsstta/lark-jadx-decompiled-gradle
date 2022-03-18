package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.larksuite.component.openplatform.core.plugin.authorization.C24588a;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.entity.C67537k;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.option.ext.AbstractC67619e;
import com.tt.option.p3389j.AbstractC67643b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.e */
public class C25146e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "scanCode";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25146e() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        final Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("currentActivity"));
            return;
        }
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        final boolean b = aVar.mo50184b(14);
        Observable.create(new Function<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25146e.C251542 */

            /* renamed from: a */
            public Boolean fun() {
                return C24588a.m89632c();
            }
        }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25146e.C251471 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                aVar.mo235103a(currentActivity, C25146e.this.getActionName(), C66578b.C66579a.m260120e(C25146e.this.getAppContext()), new AbstractC67540b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25146e.C251471.C251523 */

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87199a() {
                        HashSet hashSet = new HashSet();
                        hashSet.add("android.permission.CAMERA");
                        C66588h.m260183a().mo232189a(currentActivity, hashSet, new AbstractC66590i() {
                            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25146e.C251471.C251523.C251531 */

                            @Override // com.tt.miniapp.permission.AbstractC66590i
                            /* renamed from: a */
                            public void mo48890a() {
                                if (!b) {
                                    C66020b.m258530a("mp_auth_alert_result", C25146e.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(14)).mo231090a("result", "success").mo231092a();
                                }
                                C25146e.this.mo88245a(currentActivity);
                            }

                            @Override // com.tt.miniapp.permission.AbstractC66590i
                            /* renamed from: a */
                            public void mo48891a(String str) {
                                if (!b) {
                                    C66020b.m258530a("mp_auth_alert_result", C25146e.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(14)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                                }
                                C25146e.this.mApiHandlerCallback.callback(C25146e.this.mCallBackId, C66578b.m260107b(C25146e.this.getActionName()));
                            }
                        });
                    }

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87200a(String str) {
                        if (!b) {
                            C66020b.m258530a("mp_auth_alert_result", C25146e.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(14)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                        }
                        C25146e.this.mApiHandlerCallback.callback(C25146e.this.mCallBackId, C66578b.m260105a(C25146e.this.getActionName()));
                    }
                });
                AppBrandLogger.m52829e("tma_ApiScanCodeCtrl", th);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(C66578b.C66579a.m260120e(C25146e.this.getAppContext()));
                    aVar.mo235101a(currentActivity, C25146e.this.getActionName(), hashSet, new LinkedHashMap<>(), new AbstractC67539a() {
                        /* class com.larksuite.component.openplatform.core.plugin.messenger.C25146e.C251471.C251481 */

                        @Override // com.tt.miniapphost.p3373f.AbstractC67539a
                        /* renamed from: a */
                        public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                            HashSet hashSet = new HashSet();
                            hashSet.add("android.permission.CAMERA");
                            C66588h.m260183a().mo232189a(currentActivity, hashSet, new AbstractC66590i() {
                                /* class com.larksuite.component.openplatform.core.plugin.messenger.C25146e.C251471.C251481.C251491 */

                                @Override // com.tt.miniapp.permission.AbstractC66590i
                                /* renamed from: a */
                                public void mo48890a() {
                                    if (!b) {
                                        C66020b.m258530a("mp_auth_alert_result", C25146e.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(14)).mo231090a("result", "success").mo231092a();
                                    }
                                    C25146e.this.mo88245a(currentActivity);
                                }

                                @Override // com.tt.miniapp.permission.AbstractC66590i
                                /* renamed from: a */
                                public void mo48891a(String str) {
                                    if (!b) {
                                        C66020b.m258530a("mp_auth_alert_result", C25146e.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(14)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                                    }
                                    C25146e.this.mApiHandlerCallback.callback(C25146e.this.mCallBackId, C66578b.m260107b(C25146e.this.getActionName()));
                                }
                            });
                        }

                        @Override // com.tt.miniapphost.p3373f.AbstractC67539a
                        /* renamed from: b */
                        public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                            if (!b) {
                                C66020b.m258530a("mp_auth_alert_result", C25146e.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(14)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                            }
                            C25146e.this.mApiHandlerCallback.callback(C25146e.this.mCallBackId, C66578b.m260105a(C25146e.this.getActionName()));
                        }
                    }, null);
                    return;
                }
                aVar.mo235103a(currentActivity, C25146e.this.getActionName(), C66578b.C66579a.m260120e(C25146e.this.getAppContext()), new AbstractC67540b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25146e.C251471.C251502 */

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87199a() {
                        HashSet hashSet = new HashSet();
                        hashSet.add("android.permission.CAMERA");
                        C66588h.m260183a().mo232189a(currentActivity, hashSet, new AbstractC66590i() {
                            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25146e.C251471.C251502.C251511 */

                            @Override // com.tt.miniapp.permission.AbstractC66590i
                            /* renamed from: a */
                            public void mo48890a() {
                                if (!b) {
                                    C66020b.m258530a("mp_auth_alert_result", C25146e.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(14)).mo231090a("result", "success").mo231092a();
                                }
                                C25146e.this.mo88245a(currentActivity);
                            }

                            @Override // com.tt.miniapp.permission.AbstractC66590i
                            /* renamed from: a */
                            public void mo48891a(String str) {
                                if (!b) {
                                    C66020b.m258530a("mp_auth_alert_result", C25146e.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(14)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                                }
                                C25146e.this.mApiHandlerCallback.callback(C25146e.this.mCallBackId, C66578b.m260107b(C25146e.this.getActionName()));
                            }
                        });
                    }

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87200a(String str) {
                        if (!b) {
                            C66020b.m258530a("mp_auth_alert_result", C25146e.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(14)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                        }
                        C25146e.this.mApiHandlerCallback.callback(C25146e.this.mCallBackId, C66578b.m260105a(C25146e.this.getActionName()));
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo88245a(Activity activity) {
        if (!HostDependManager.getInst().scanCode(activity, new AbstractC67643b.AbstractC67644a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25146e.C251553 */
        })) {
            callbackAppUnSupportFeature();
        }
    }

    public C25146e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        AppBrandLogger.m52828d("tma_ApiScanCodeCtrl", "scan code handleActivityResult");
        if (intent == null) {
            callbackFail("cancel");
        } else {
            C67537k handleActivityScanResult = HostDependManager.getInst().handleActivityScanResult(i, i2, intent);
            if (handleActivityScanResult.mo234537a()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", handleActivityScanResult.mo234538b());
                    jSONObject.put("scanType", handleActivityScanResult.mo234539c());
                    AppBrandLogger.m52828d("tma_ApiScanCodeCtrl", "result ", handleActivityScanResult.mo234538b(), " scanType ", handleActivityScanResult.mo234539c());
                    callbackOk(jSONObject);
                    return true;
                } catch (JSONException e) {
                    callbackFail(e);
                }
            }
        }
        return super.handleActivityResult(i, i2, intent);
    }
}
