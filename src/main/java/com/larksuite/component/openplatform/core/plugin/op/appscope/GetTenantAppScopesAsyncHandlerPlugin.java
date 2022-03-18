package com.larksuite.component.openplatform.core.plugin.op.appscope;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p651f.C13047a;
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
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GetTenantAppScopesAsyncHandlerPlugin extends OPPlugin {
    private IAppContext mAppContext;
    public ILogger mILogger;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    private static class GetTenantAppScopesAsyncHandlerRequest extends C25920a {
        private GetTenantAppScopesAsyncHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class GetTenantAppScopesAsyncHandlerResponse extends C25921b {
        @JSONField(name = "scopes")
        public List<Scope> scopes;

        private GetTenantAppScopesAsyncHandlerResponse() {
        }
    }

    /* access modifiers changed from: private */
    public static class Scope {
        @JSONField(name = "name")
        public String name;
        @JSONField(name = UpdateKey.STATUS)
        public int status;

        private Scope() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin$3 */
    public static /* synthetic */ class C253603 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61884a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin.C253603.f61884a = r0
                com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode.SERVER_INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin.C253603.f61884a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode.NO_VISIBILITY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin.C253603.f61884a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode.APPLICATION_NOT_INSTALLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin.C253603.<clinit>():void");
        }
    }

    public GetTenantAppScopesAsyncHandlerResponse getCallbackData(JSONArray jSONArray) {
        GetTenantAppScopesAsyncHandlerResponse getTenantAppScopesAsyncHandlerResponse = new GetTenantAppScopesAsyncHandlerResponse();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                Scope scope = new Scope();
                scope.name = optJSONObject.optString("name");
                scope.status = optJSONObject.optInt(UpdateKey.STATUS);
                arrayList.add(scope);
            }
        }
        getTenantAppScopesAsyncHandlerResponse.scopes = arrayList;
        return getTenantAppScopesAsyncHandlerResponse;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 != 3) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin.GetTenantAppScopesAsyncHandlerResponse convertResponse(int r2, com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin.GetTenantAppScopesAsyncHandlerResponse r3) {
        /*
            r1 = this;
            com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode r2 = com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode.forNumber(r2)
            int[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin.C253603.f61884a
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
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin.convertResponse(int, com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin$GetTenantAppScopesAsyncHandlerResponse):com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin$GetTenantAppScopesAsyncHandlerResponse");
    }

    @LKPluginFunction(async = true, eventName = {"getTenantAppScopes"})
    public void GetTenantAppScopesAsyncHandlerAsync(LKEvent lKEvent, AbstractC25895f fVar, AbstractC25897h<GetTenantAppScopesAsyncHandlerResponse> hVar) {
        this.mILogger = fVar.mo92190b();
        this.mAppContext = getEventContext(lKEvent);
        GetTenantAppScopesAsyncHandlerResponse getTenantAppScopesAsyncHandlerResponse = new GetTenantAppScopesAsyncHandlerResponse();
        IAppContext iAppContext = this.mAppContext;
        if (iAppContext == null) {
            this.mILogger.mo92223e("GetTenantAppScopesAsyncHandlerPlugin", "app context is null");
            fillFailedResponse(getTenantAppScopesAsyncHandlerResponse, C25906a.f64080j, "app context is null");
            hVar.callback(getTenantAppScopesAsyncHandlerResponse);
            return;
        }
        getAppScopesFromNet(iAppContext.getAppId(), C67043j.m261283f(AppbrandContext.getInst().getApplicationContext()), C67043j.m261286g(), hVar);
    }

    private void getAppScopesFromNet(String str, String str2, String str3, final AbstractC25897h<GetTenantAppScopesAsyncHandlerResponse> hVar) {
        final GetTenantAppScopesAsyncHandlerResponse getTenantAppScopesAsyncHandlerResponse = new GetTenantAppScopesAsyncHandlerResponse();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("AppID", str);
            jSONObject.put("LarkVersion", str2);
            jSONObject.put("Lang", str3);
            C12843b.m53038a(C13047a.C13049b.m53532a() + "/GetTenantAppScopes", new HashMap(), jSONObject, this.mAppContext).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin.C253581 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    if (TextUtils.isEmpty(str)) {
                        GetTenantAppScopesAsyncHandlerPlugin.this.mILogger.mo92223e("GetTenantAppScopesAsyncHandlerPlugin", "response is empty");
                        GetTenantAppScopesAsyncHandlerPlugin.this.fillFailedResponse(getTenantAppScopesAsyncHandlerResponse, C25906a.f64081k, "response is empty");
                        hVar.callback(getTenantAppScopesAsyncHandlerResponse);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    ILogger aVar = GetTenantAppScopesAsyncHandlerPlugin.this.mILogger;
                    aVar.mo92224i("GetTenantAppScopesAsyncHandlerPlugin", "response:" + str);
                    int optInt = jSONObject.optInt("code");
                    if (optInt != 0) {
                        GetTenantAppScopesAsyncHandlerPlugin.this.mILogger.mo92223e("GetTenantAppScopesAsyncHandlerPlugin", "Request error");
                        hVar.callback(GetTenantAppScopesAsyncHandlerPlugin.this.convertResponse(optInt, getTenantAppScopesAsyncHandlerResponse));
                        return;
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optJSONObject == null) {
                        GetTenantAppScopesAsyncHandlerPlugin.this.mILogger.mo92225w("GetTenantAppScopesAsyncHandlerPlugin", "get tenant app scope, empty result");
                        GetTenantAppScopesAsyncHandlerPlugin.this.fillFailedResponse(getTenantAppScopesAsyncHandlerResponse, C25906a.f64081k, "get tenant app scope, empty result");
                        hVar.callback(getTenantAppScopesAsyncHandlerResponse);
                        return;
                    }
                    hVar.callback(GetTenantAppScopesAsyncHandlerPlugin.this.getCallbackData(optJSONObject.getJSONArray("scopes")));
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.GetTenantAppScopesAsyncHandlerPlugin.C253592 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    GetTenantAppScopesAsyncHandlerPlugin.this.fillFailedResponse(getTenantAppScopesAsyncHandlerResponse, C25906a.f64079i, th.getMessage());
                    hVar.callback(getTenantAppScopesAsyncHandlerResponse);
                }
            });
        } catch (JSONException e) {
            this.mILogger.mo92225w("GetTenantAppScopesAsyncHandlerPlugin", "get tenant AppScope, e = " + e.getMessage());
            fillFailedResponse(getTenantAppScopesAsyncHandlerResponse, C25906a.f64080j, e.getMessage());
            hVar.callback(getTenantAppScopesAsyncHandlerResponse);
        }
    }
}
