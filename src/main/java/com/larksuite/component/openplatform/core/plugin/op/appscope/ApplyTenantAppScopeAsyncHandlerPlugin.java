package com.larksuite.component.openplatform.core.plugin.op.appscope;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13351i;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.suite.R;
import com.p063a.p064a.p065a.p066a.C1713b;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.util.C67866g;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ApplyTenantAppScopeAsyncHandlerPlugin extends OPPlugin {
    public IAppContext mAppContext;
    public ILogger mILogger;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    private static class ApplyTenantAppScopeAsyncHandlerRequest extends C25920a {
        private ApplyTenantAppScopeAsyncHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApplyTenantAppScopeAsyncHandlerResponse extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public DataResult data;

        private ApplyTenantAppScopeAsyncHandlerResponse() {
        }
    }

    /* access modifiers changed from: private */
    public static class DataResult {
        @JSONField(name = "msg")
        public String msg;
        @JSONField(name = UpdateKey.STATUS)
        public int status;

        private DataResult() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin$8 */
    public static /* synthetic */ class C253578 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61876a;

        /* renamed from: b */
        static final /* synthetic */ int[] f61877b;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        static {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.C253578.<clinit>():void");
        }
    }

    public void showApplyResultToast(final boolean z) {
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.RunnableC253525 */

            public void run() {
                Activity currentActivity = ApplyTenantAppScopeAsyncHandlerPlugin.this.mAppContext.getCurrentActivity();
                if (z) {
                    HostDependManager.getInst().showToast(currentActivity, null, currentActivity.getString(R.string.OpenPlatform_gadgetRequestApplyToast), 0, "success");
                } else {
                    HostDependManager.getInst().showToast(currentActivity, null, currentActivity.getString(R.string.OpenPlatform_gadgetRequest_SendFailedToast), 0, null);
                }
            }
        });
    }

    public String getApplyTypeByStatus(ApplyStatus applyStatus) {
        int i = C253578.f61876a[applyStatus.ordinal()];
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

    public String getNoNeedApplyContent(Activity activity, ApplyStatus applyStatus) {
        if (applyStatus == ApplyStatus.APPLY_EXCEED_LIMIT || applyStatus == ApplyStatus.APPLYING) {
            return activity.getString(R.string.OpenPlatform_gadgetRequest_remindContent);
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 != 3) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.ApplyTenantAppScopeAsyncHandlerResponse convertResponse(int r2, com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.ApplyTenantAppScopeAsyncHandlerResponse r3) {
        /*
            r1 = this;
            com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode r2 = com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode.forNumber(r2)
            int[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.C253578.f61877b
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L_0x0016
            r0 = 2
            if (r2 == r0) goto L_0x001d
            r0 = 3
            if (r2 == r0) goto L_0x0026
            goto L_0x002f
        L_0x0016:
            com.larksuite.framework.apiplugin.b.a r2 = com.larksuite.framework.apiplugin.p1176b.C25906a.f64080j
            java.lang.String r0 = ""
            r1.fillFailedResponse(r3, r2, r0)
        L_0x001d:
            com.larksuite.framework.apiplugin.b.d r2 = com.larksuite.framework.apiplugin.p1176b.C25909d.f64121d
            com.larksuite.framework.apiplugin.b.d r0 = com.larksuite.framework.apiplugin.p1176b.C25909d.f64121d
            java.lang.String r0 = r0.f64117J
            r1.fillFailedResponse(r3, r2, r0)
        L_0x0026:
            com.larksuite.framework.apiplugin.b.d r2 = com.larksuite.framework.apiplugin.p1176b.C25909d.f64122e
            com.larksuite.framework.apiplugin.b.d r0 = com.larksuite.framework.apiplugin.p1176b.C25909d.f64122e
            java.lang.String r0 = r0.f64117J
            r1.fillFailedResponse(r3, r2, r0)
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.convertResponse(int, com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin$ApplyTenantAppScopeAsyncHandlerResponse):com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin$ApplyTenantAppScopeAsyncHandlerResponse");
    }

    public String getNoNeedApplyTitle(Activity activity, ApplyStatus applyStatus) {
        int i = C253578.f61876a[applyStatus.ordinal()];
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

    private void showNoNeedApplyDialog(final AbstractC25897h<ApplyTenantAppScopeAsyncHandlerResponse> hVar, final String str, final ApplyStatus applyStatus) {
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.RunnableC253557 */

            public void run() {
                Activity currentActivity = ApplyTenantAppScopeAsyncHandlerPlugin.this.mAppContext.getCurrentActivity();
                C13351i.m54345a(currentActivity, ApplyTenantAppScopeAsyncHandlerPlugin.this.getNoNeedApplyTitle(currentActivity, applyStatus), ApplyTenantAppScopeAsyncHandlerPlugin.this.getNoNeedApplyContent(currentActivity, applyStatus), "", currentActivity.getString(R.string.microapp_m_health_op_btn_known), new C13351i.AbstractC13357a() {
                    /* class com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.RunnableC253557.C253561 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: b */
                    public void mo49041b(View view) {
                    }

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: a */
                    public void mo49040a(View view) {
                        C25377d.m90883a(str, ApplyTenantAppScopeAsyncHandlerPlugin.this.getApplyTypeByStatus(applyStatus), "no_operation");
                        ApplyStatusResult a = C25375c.m90880a(applyStatus);
                        ApplyTenantAppScopeAsyncHandlerResponse applyTenantAppScopeAsyncHandlerResponse = new ApplyTenantAppScopeAsyncHandlerResponse();
                        DataResult dataResult = new DataResult();
                        dataResult.msg = a.getMsg();
                        dataResult.status = a.getStatus();
                        applyTenantAppScopeAsyncHandlerResponse.data = dataResult;
                        hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
                    }
                });
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"applyTenantAppScope"})
    public void ApplyTenantAppScopeAsyncHandlerAsync(LKEvent lKEvent, AbstractC25895f fVar, AbstractC25897h<ApplyTenantAppScopeAsyncHandlerResponse> hVar) {
        ApplyTenantAppScopeAsyncHandlerResponse applyTenantAppScopeAsyncHandlerResponse = new ApplyTenantAppScopeAsyncHandlerResponse();
        this.mILogger = fVar.mo92190b();
        this.mAppContext = getEventContext(lKEvent);
        if (getAppContext() == null) {
            this.mILogger.mo92223e("ApplyTenantAppScopeAsyncHandlerPlugin", "app context is null");
            fillFailedResponse(applyTenantAppScopeAsyncHandlerResponse, C25906a.f64080j, "app context is null");
            hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
            return;
        }
        getApplyStatusFromNet(this.mAppContext.getAppId(), C67043j.m261283f(AppbrandContext.getInst().getApplicationContext()), C67043j.m261286g(), hVar);
    }

    private void showApplyScopesDialog(final String str, final String str2, final String str3, final AbstractC25897h<ApplyTenantAppScopeAsyncHandlerResponse> hVar) {
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.RunnableC253536 */

            public void run() {
                Activity currentActivity = ApplyTenantAppScopeAsyncHandlerPlugin.this.mAppContext.getCurrentActivity();
                C13351i.m54345a(currentActivity, currentActivity.getString(R.string.OpenPlatform_gadgetRequestTitle), currentActivity.getString(R.string.OpenPlatform_gadgetRequestContent), currentActivity.getString(R.string.OpenPlatform_gadgetRequestCancel), currentActivity.getString(R.string.OpenPlatform_gadgetRequestApply), new C13351i.AbstractC13357a() {
                    /* class com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.RunnableC253536.C253541 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: a */
                    public void mo49040a(View view) {
                        C25377d.m90883a(str, "normal_apply", "apply");
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.applyAppScope(str, str2, str3, hVar);
                    }

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: b */
                    public void mo49041b(View view) {
                        C25377d.m90883a(str, "normal_apply", "cancel");
                        ApplyTenantAppScopeAsyncHandlerResponse applyTenantAppScopeAsyncHandlerResponse = new ApplyTenantAppScopeAsyncHandlerResponse();
                        DataResult dataResult = new DataResult();
                        dataResult.msg = ApplyStatusResult.USER_CANCEL_APPY.getMsg();
                        dataResult.status = ApplyStatusResult.USER_CANCEL_APPY.getStatus();
                        applyTenantAppScopeAsyncHandlerResponse.data = dataResult;
                        hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
                    }
                });
            }
        });
    }

    private void getApplyStatusFromNet(final String str, final String str2, final String str3, final AbstractC25897h<ApplyTenantAppScopeAsyncHandlerResponse> hVar) {
        final ApplyTenantAppScopeAsyncHandlerResponse applyTenantAppScopeAsyncHandlerResponse = new ApplyTenantAppScopeAsyncHandlerResponse();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("AppID", str);
            jSONObject.put("LarkVersion", str2);
            jSONObject.put("Lang", str3);
            C12843b.m53038a(C13047a.C13049b.m53532a() + "/ApplyAppScopeStatus", new HashMap(), jSONObject, this.mAppContext).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.C253481 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    if (TextUtils.isEmpty(str)) {
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.mILogger.mo92223e("ApplyTenantAppScopeAsyncHandlerPlugin", "response is empty");
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.fillFailedResponse(applyTenantAppScopeAsyncHandlerResponse, C25906a.f64081k, "response is empty");
                        hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    C1713b.m7632b("ApplyTenantAppScopeAsyncHandlerPlugin", "response:" + str);
                    int optInt = jSONObject.optInt("code");
                    if (optInt != 0) {
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.mILogger.mo92223e("ApplyTenantAppScopeAsyncHandlerPlugin", "Request error");
                        hVar.callback(ApplyTenantAppScopeAsyncHandlerPlugin.this.convertResponse(optInt, applyTenantAppScopeAsyncHandlerResponse));
                        return;
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optJSONObject == null) {
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.mILogger.mo92225w("ApplyTenantAppScopeAsyncHandlerPlugin", "apply tenant app scope, empty result");
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.fillFailedResponse(applyTenantAppScopeAsyncHandlerResponse, C25906a.f64081k, "apply tenant app scope, empty result");
                        hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
                        return;
                    }
                    ApplyTenantAppScopeAsyncHandlerPlugin.this.requestScopesByStatus(str, str2, str3, ApplyStatus.forNumber(optJSONObject.optInt(UpdateKey.STATUS)), hVar);
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.C253492 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    ApplyTenantAppScopeAsyncHandlerPlugin.this.fillFailedResponse(applyTenantAppScopeAsyncHandlerResponse, C25906a.f64079i, th.getMessage());
                    hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
                }
            });
        } catch (JSONException e) {
            this.mILogger.mo92225w("ApplyTenantAppScopeAsyncHandlerPlugin", "apply tenant app scope, e = " + e.getMessage());
            fillFailedResponse(applyTenantAppScopeAsyncHandlerResponse, C25906a.f64080j, e.getMessage());
            hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
        }
    }

    public void applyAppScope(String str, String str2, String str3, final AbstractC25897h<ApplyTenantAppScopeAsyncHandlerResponse> hVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("AppID", str);
            jSONObject.put("LarkVersion", str2);
            jSONObject.put("Lang", str3);
            C12843b.m53038a(C13047a.C13049b.m53532a() + "/ApplyAppScope", new HashMap(), jSONObject, this.mAppContext).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.C253503 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    ApplyTenantAppScopeAsyncHandlerResponse applyTenantAppScopeAsyncHandlerResponse = new ApplyTenantAppScopeAsyncHandlerResponse();
                    if (TextUtils.isEmpty(str)) {
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.mILogger.mo92223e("ApplyTenantAppScopeAsyncHandlerPlugin", "response is empty");
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.showApplyResultToast(false);
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.fillFailedResponse(applyTenantAppScopeAsyncHandlerResponse, C25906a.f64081k, "response is empty");
                        hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    ILogger aVar = ApplyTenantAppScopeAsyncHandlerPlugin.this.mILogger;
                    aVar.mo92224i("ApplyTenantAppScopeAsyncHandlerPlugin", "response:" + str);
                    int optInt = jSONObject.optInt("code");
                    if (ScopeErrCode.forNumber(optInt) == ScopeErrCode.SERVER_INTERNAL_ERROR) {
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.mILogger.mo92223e("ApplyTenantAppScopeAsyncHandlerPlugin", "Request error");
                        ApplyTenantAppScopeAsyncHandlerPlugin.this.showApplyResultToast(false);
                        hVar.callback(ApplyTenantAppScopeAsyncHandlerPlugin.this.convertResponse(optInt, applyTenantAppScopeAsyncHandlerResponse));
                        return;
                    }
                    DataResult dataResult = new DataResult();
                    dataResult.msg = ApplyStatusResult.USER_APPLY.getMsg();
                    dataResult.status = ApplyStatusResult.USER_APPLY.getStatus();
                    applyTenantAppScopeAsyncHandlerResponse.data = dataResult;
                    hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyTenantAppScopeAsyncHandlerPlugin.C253514 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    ApplyTenantAppScopeAsyncHandlerPlugin.this.showApplyResultToast(false);
                    ApplyTenantAppScopeAsyncHandlerResponse applyTenantAppScopeAsyncHandlerResponse = new ApplyTenantAppScopeAsyncHandlerResponse();
                    ApplyTenantAppScopeAsyncHandlerPlugin.this.fillFailedResponse(applyTenantAppScopeAsyncHandlerResponse, C25906a.f64079i, th.getMessage());
                    hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
                }
            });
        } catch (JSONException e) {
            this.mILogger.mo92225w("ApplyTenantAppScopeAsyncHandlerPlugin", "apply not requested, json parse error");
            showApplyResultToast(false);
            ApplyTenantAppScopeAsyncHandlerResponse applyTenantAppScopeAsyncHandlerResponse = new ApplyTenantAppScopeAsyncHandlerResponse();
            fillFailedResponse(applyTenantAppScopeAsyncHandlerResponse, C25906a.f64080j, e.getMessage());
            hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
        }
    }

    public void requestScopesByStatus(String str, String str2, String str3, ApplyStatus applyStatus, AbstractC25897h<ApplyTenantAppScopeAsyncHandlerResponse> hVar) {
        switch (C253578.f61876a[applyStatus.ordinal()]) {
            case 1:
                C25377d.m90882a(str, "normal_apply");
                showApplyScopesDialog(str, str2, str3, hVar);
                return;
            case 2:
                C25377d.m90882a(str, "repeat_apply");
                showNoNeedApplyDialog(hVar, str, applyStatus);
                return;
            case 3:
                C25377d.m90882a(str, "granted");
                showNoNeedApplyDialog(hVar, str, applyStatus);
                return;
            case 4:
                C25377d.m90882a(str, "exceeds_limit");
                showNoNeedApplyDialog(hVar, str, applyStatus);
                return;
            case 5:
                C25377d.m90882a(str, "unauthorize_sensitive_permission");
                showNoNeedApplyDialog(hVar, str, applyStatus);
                return;
            case 6:
                ApplyTenantAppScopeAsyncHandlerResponse applyTenantAppScopeAsyncHandlerResponse = new ApplyTenantAppScopeAsyncHandlerResponse();
                fillFailedResponse(applyTenantAppScopeAsyncHandlerResponse, C25906a.f64080j, "unknown apply status");
                hVar.callback(applyTenantAppScopeAsyncHandlerResponse);
                return;
            default:
                return;
        }
    }
}
