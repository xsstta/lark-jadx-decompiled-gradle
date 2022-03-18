package com.larksuite.component.openplatform.core.plugin.vc.audio.sync;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.larksuite.component.openplatform.core.plugin.authorization.C24588a;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.audio.C65754b;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.sync.c */
public class C25516c extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "operateRecorder";
    }

    public C25516c() {
    }

    /* renamed from: i */
    private void m91077i() {
        C65754b.m257769a(mo232455f()).mo230390a(new C65754b.AbstractC65760d() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.C25516c.C255235 */

            @Override // com.tt.miniapp.audio.C65754b.AbstractC65760d
            /* renamed from: a */
            public void mo88645a(String str, String str2) {
                AppBrandLogger.m52828d("tma_OperateAudioRecorderSyncCtrl", "onRecorderStateChange state = ", str, " , args = ", str2);
                C25516c.this.mo88650a(str, str2);
            }

            @Override // com.tt.miniapp.audio.C65754b.AbstractC65760d
            /* renamed from: a */
            public void mo88646a(byte[] bArr, boolean z) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("state", "frameRecorded");
                    jSONObject.put("frameBuffer", Base64.encodeToString(bArr, 0));
                    jSONObject.put("isLastFrame", z);
                    C25516c.this.mo232454e().mo235028a(C67706e.C67708a.m263377a("onRecorderStateChange", jSONObject).mo235009a());
                } catch (Exception e) {
                    AppBrandLogger.eWithThrowable("tma_OperateAudioRecorderSyncCtrl", "onFrameRecorded", e);
                }
            }
        });
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        final Activity currentActivity = mo232455f().getCurrentActivity();
        if (currentActivity == null) {
            AppBrandLogger.m52829e("tma_OperateAudioRecorderSyncCtrl", "activity is null");
            return mo232451b("activity is null");
        }
        final boolean b = ((AbstractC67733a) mo232455f().findServiceByInterface(AbstractC67733a.class)).mo50184b(13);
        Observable.create(new Function<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.C25516c.C255182 */

            /* renamed from: a */
            public Boolean fun() {
                return C24588a.m89632c();
            }
        }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.C25516c.C255171 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    C25516c.this.mo88649a(currentActivity, b);
                } else {
                    C25516c.this.mo88651b(currentActivity, b);
                }
            }

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                C25516c.this.mo88651b(currentActivity, b);
                AppBrandLogger.eWithThrowable("tma_OperateAudioRecorderSyncCtrl", "onError", th);
            }
        });
        return mo232456g();
    }

    /* renamed from: c */
    public void mo88652c() {
        m91077i();
        try {
            JSONObject jSONObject = new JSONObject(this.f168426a);
            AppBrandLogger.m52828d("tma_OperateAudioRecorderSyncCtrl", "mParams = ", this.f168426a);
            String optString = jSONObject.optString("operationType");
            if ("start".equals(optString)) {
                C65754b.m257769a(mo232455f()).mo230389a(new C65754b.C65759c((long) jSONObject.optInt("duration"), jSONObject.optInt("sampleRate"), jSONObject.optInt("encodeBitRate"), (short) jSONObject.optInt("numberOfChannels"), jSONObject.optString("format"), jSONObject.optInt("frameSize")));
            } else if ("pause".endsWith(optString)) {
                C65754b.m257769a(mo232455f()).mo230392b();
            } else if ("resume".endsWith(optString)) {
                C65754b.m257769a(mo232455f()).mo230388a();
            } else if ("stop".endsWith(optString)) {
                C65754b.m257769a(mo232455f()).mo230393c();
            } else {
                mo88650a("error", ApiCallResultHelper.generateIllegalParamExtraInfo("operationType"));
            }
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_OperateAudioRecorderSyncCtrl", "runApi", e);
            mo88650a("error", "parse error");
        }
    }

    public C25516c(String str) {
        super(str);
    }

    /* renamed from: a */
    public void mo88649a(final Activity activity, final boolean z) {
        HashSet hashSet = new HashSet();
        hashSet.add(C66578b.C66579a.m260118d(mo232455f()));
        final AbstractC67733a aVar = (AbstractC67733a) mo232455f().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235101a(activity, mo87633a(), hashSet, new LinkedHashMap<>(), new AbstractC67539a() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.C25516c.C255193 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: a */
            public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.RECORD_AUDIO");
                C25516c.this.mo232454e().mo235022a(activity, C25516c.this.mo87633a(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.C25516c.C255193.C255201 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25516c.this.mo232455f()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "success").mo231092a();
                        }
                        C25516c.this.mo88652c();
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25516c.this.mo232455f()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        C25516c.this.mo88650a("error", "system auth deny");
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: b */
            public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", C25516c.this.mo232455f()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                C25516c.this.mo88650a("error", "auth deny");
            }
        }, null);
    }

    /* renamed from: b */
    public void mo88651b(final Activity activity, final boolean z) {
        final AbstractC67733a aVar = (AbstractC67733a) mo232455f().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235103a(activity, mo87633a(), C66578b.C66579a.m260118d(mo232455f()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.C25516c.C255214 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.RECORD_AUDIO");
                C25516c.this.mo232454e().mo235022a(activity, C25516c.this.mo87633a(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.C25516c.C255214.C255221 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25516c.this.mo232455f()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "success").mo231092a();
                        }
                        C25516c.this.mo88652c();
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", C25516c.this.mo232455f()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        C25516c.this.mo88650a("error", "system auth deny");
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", C25516c.this.mo232455f()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                C25516c.this.mo88650a("error", "auth deny");
            }
        });
    }

    /* renamed from: a */
    public void mo88650a(String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", str);
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3540994) {
                if (hashCode == 96784904) {
                    if (str.equals("error")) {
                        c = 1;
                    }
                }
            } else if (str.equals("stop")) {
                c = 0;
            }
            if (c == 0) {
                jSONObject.put("tempFilePath", mo232454e().mo235048d(str2));
            } else if (c == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("operateRecorder:fail");
                if (TextUtils.isEmpty(str2)) {
                    str3 = "";
                } else {
                    str3 = " " + str2;
                }
                sb.append(str3);
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, sb.toString());
            }
            AppBrandLogger.m52828d("tma_OperateAudioRecorderSyncCtrl", "setState ", jSONObject);
            mo232454e().mo235028a(C67706e.C67708a.m263377a("onRecorderStateChange", jSONObject).mo235009a());
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_OperateAudioRecorderSyncCtrl", "setState", e);
        }
    }
}
