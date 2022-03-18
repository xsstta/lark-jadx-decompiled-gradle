package com.larksuite.component.openplatform.core.plugin.op.appscope;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13351i;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import com.p063a.p064a.p065a.p066a.C1713b;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"applyTenantAppScope"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.op.appscope.a */
public class C25361a extends AbstractC65797c {
    public C25361a() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("applyTenantAppScope");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.appscope.a$8 */
    public static /* synthetic */ class C253718 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61903a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253718.f61903a = r0
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.NOT_APPLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253718.f61903a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.APPLYING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253718.f61903a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.NO_APPLY_LIST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253718.f61903a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.APPLY_EXCEED_LIMIT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253718.f61903a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.UNAUTHORIZE_SENSITIVE_PERMISSION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253718.f61903a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253718.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo88510a(final boolean z) {
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.RunnableC253665 */

            public void run() {
                Activity currentActivity = C25361a.this.mo230473f().getCurrentActivity();
                if (z) {
                    HostDependManager.getInst().showToast(currentActivity, null, currentActivity.getString(R.string.OpenPlatform_gadgetRequestApplyToast), 0, "success");
                } else {
                    HostDependManager.getInst().showToast(currentActivity, null, currentActivity.getString(R.string.OpenPlatform_gadgetRequest_SendFailedToast), 0, null);
                }
            }
        });
    }

    /* renamed from: a */
    public String mo88507a(ApplyStatus applyStatus) {
        int i = C253718.f61903a[applyStatus.ordinal()];
        if (i == 1) {
            return "normal_apply";
        }
        if (i == 2) {
            return "repeat_apply";
        }
        if (i == 3) {
            return "granted";
        }
        if (i == 4) {
            return "exceeds_limit";
        }
        if (i != 5) {
            return "";
        }
        return "unauthorize_sensitive_permission";
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("ApiHandler", "params: " + bVar.mo234988d());
        m90856b(mo230473f().getAppId(), C67043j.m261283f(AppbrandContext.getInst().getApplicationContext()), C67043j.m261286g());
    }

    public C25361a(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    private void m90855a(final String str, final ApplyStatus applyStatus) {
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.RunnableC253697 */

            public void run() {
                Activity currentActivity = C25361a.this.mo230473f().getCurrentActivity();
                C13351i.m54345a(currentActivity, C25361a.this.mo88506a(currentActivity, applyStatus), C25361a.this.mo88511b(currentActivity, applyStatus), "", currentActivity.getString(R.string.microapp_m_health_op_btn_known), new C13351i.AbstractC13357a() {
                    /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.RunnableC253697.C253701 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: b */
                    public void mo49041b(View view) {
                    }

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: a */
                    public void mo49040a(View view) {
                        C25377d.m90883a(str, C25361a.this.mo88507a(applyStatus), "no_operation");
                        ApplyStatusResult a = C25375c.m90880a(applyStatus);
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(UpdateKey.STATUS, a.getStatus());
                            jSONObject2.put("msg", a.getMsg());
                            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
                            C25361a.this.mo230492b(jSONObject);
                        } catch (JSONException unused) {
                            AppBrandLogger.m52831w("ApiHandler", "no need apply, json parse error");
                        }
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public String mo88511b(Activity activity, ApplyStatus applyStatus) {
        if (applyStatus == ApplyStatus.APPLY_EXCEED_LIMIT || applyStatus == ApplyStatus.APPLYING) {
            return activity.getString(R.string.OpenPlatform_gadgetRequest_remindContent);
        }
        return "";
    }

    /* renamed from: a */
    public String mo88506a(Activity activity, ApplyStatus applyStatus) {
        int i = C253718.f61903a[applyStatus.ordinal()];
        if (i == 2) {
            return activity.getString(R.string.OpenPlatform_gadgetRequest_repeatApplication);
        }
        if (i == 3) {
            return activity.getString(R.string.OpenPlatform_gadgetRequest_allPermittedTitle);
        }
        if (i == 4) {
            return activity.getString(R.string.OpenPlatform_gadgetRequest_exceedLimitTitle);
        }
        if (i != 5) {
            return "";
        }
        return activity.getString(R.string.OpenPlatform_gadgetRequestTitle);
    }

    /* renamed from: c */
    private void m90857c(final String str, final String str2, final String str3) {
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.RunnableC253676 */

            public void run() {
                Activity currentActivity = C25361a.this.mo230473f().getCurrentActivity();
                C13351i.m54345a(currentActivity, currentActivity.getString(R.string.OpenPlatform_gadgetRequestTitle), currentActivity.getString(R.string.OpenPlatform_gadgetRequestContent), currentActivity.getString(R.string.OpenPlatform_gadgetRequestCancel), currentActivity.getString(R.string.OpenPlatform_gadgetRequestApply), new C13351i.AbstractC13357a() {
                    /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.RunnableC253676.C253681 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: a */
                    public void mo49040a(View view) {
                        C25377d.m90883a(str, "normal_apply", "apply");
                        C25361a.this.mo88508a(str, str2, str3);
                    }

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: b */
                    public void mo49041b(View view) {
                        C25377d.m90883a(str, "normal_apply", "cancel");
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(UpdateKey.STATUS, ApplyStatusResult.USER_CANCEL_APPY.getStatus());
                            jSONObject2.put("msg", ApplyStatusResult.USER_CANCEL_APPY.getMsg());
                            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
                            C25361a.this.mo230492b(jSONObject);
                        } catch (JSONException unused) {
                            AppBrandLogger.m52831w("ApiHandler", "cancel apply, json parse error");
                        }
                    }
                });
            }
        });
    }

    /* renamed from: b */
    private void m90856b(final String str, final String str2, final String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("AppID", str);
            jSONObject.put("LarkVersion", str2);
            jSONObject.put("Lang", str3);
            C12843b.m53038a(C13047a.C13049b.m53532a() + "/ApplyAppScopeStatus", new HashMap(), jSONObject, mo230473f()).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253621 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    if (TextUtils.isEmpty(str)) {
                        AppBrandLogger.m52829e("ApiHandler", "response is empty");
                        C25361a.this.mo230493c("response is empty");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    C1713b.m7632b("ApiHandler", "response:" + str);
                    int optInt = jSONObject.optInt("code");
                    if (optInt != 0) {
                        AppBrandLogger.m52829e("ApiHandler", "Request error");
                        C25361a.this.mo230481a(C25375c.m90881a(optInt));
                        return;
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optJSONObject == null) {
                        AppBrandLogger.m52831w("ApiHandler", "call light service, empty result");
                        C25361a.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                        return;
                    }
                    C25361a.this.mo88509a(str, str2, str3, ApplyStatus.forNumber(optJSONObject.optInt(UpdateKey.STATUS)));
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253632 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C25361a.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
        }
    }

    /* renamed from: a */
    public void mo88508a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("AppID", str);
            jSONObject.put("LarkVersion", str2);
            jSONObject.put("Lang", str3);
            C12843b.m53038a(C13047a.C13049b.m53532a() + "/ApplyAppScope", new HashMap(), jSONObject, mo230473f()).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253643 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    if (TextUtils.isEmpty(str)) {
                        AppBrandLogger.m52829e("ApiHandler", "response is empty");
                        C25361a.this.mo88510a(false);
                        C25361a.this.mo230493c("response is empty");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    C1713b.m7632b("ApiHandler", "response:" + str);
                    int optInt = jSONObject.optInt("code");
                    if (ScopeErrCode.forNumber(optInt) == ScopeErrCode.SERVER_INTERNAL_ERROR) {
                        AppBrandLogger.m52829e("ApiHandler", "Request error");
                        ApiCode a = C25375c.m90881a(optInt);
                        C25361a.this.mo88510a(false);
                        C25361a.this.mo230481a(a);
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put(UpdateKey.STATUS, ApplyStatusResult.USER_APPLY.getStatus());
                        jSONObject3.put("msg", ApplyStatusResult.USER_APPLY.getMsg());
                        jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject3);
                        C25361a.this.mo88510a(true);
                        C25361a.this.mo230492b(jSONObject2);
                    } catch (JSONException unused) {
                        AppBrandLogger.m52831w("ApiHandler", "apply success, but json parse error");
                    }
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25361a.C253654 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C25361a.this.mo88510a(false);
                    C25361a.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                }
            });
        } catch (JSONException unused) {
            AppBrandLogger.m52831w("ApiHandler", "apply not requested, json parse error");
            mo88510a(false);
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
        }
    }

    /* renamed from: a */
    public void mo88509a(String str, String str2, String str3, ApplyStatus applyStatus) {
        switch (C253718.f61903a[applyStatus.ordinal()]) {
            case 1:
                C25377d.m90882a(str, "normal_apply");
                m90857c(str, str2, str3);
                return;
            case 2:
                C25377d.m90882a(str, "repeat_apply");
                m90855a(str, applyStatus);
                return;
            case 3:
                C25377d.m90882a(str, "granted");
                m90855a(str, applyStatus);
                return;
            case 4:
                C25377d.m90882a(str, "exceeds_limit");
                m90855a(str, applyStatus);
                return;
            case 5:
                C25377d.m90882a(str, "unauthorize_sensitive_permission");
                m90855a(str, applyStatus);
                return;
            case 6:
                mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                return;
            default:
                return;
        }
    }
}
