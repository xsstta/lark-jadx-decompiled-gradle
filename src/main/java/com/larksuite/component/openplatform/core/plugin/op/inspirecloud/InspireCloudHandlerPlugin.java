package com.larksuite.component.openplatform.core.plugin.op.inspirecloud;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25909d;
import com.ss.android.lark.optrace.api.ILogger;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class InspireCloudHandlerPlugin extends OPPlugin {
    private IAppContext mAppContext;
    public ILogger mILogger;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    private static class InspireCloudHandlerRequest extends C25920a {
        @JSONField(name = "context")
        @LKRequiredParam
        public String context;

        private InspireCloudHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class InspireCloudHandlerResponse extends C25921b {
        private InspireCloudHandlerResponse() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.inspirecloud.InspireCloudHandlerPlugin$3 */
    public static /* synthetic */ class C253923 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61924a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode[] r0 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.InspireCloudHandlerPlugin.C253923.f61924a = r0
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode r1 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.LIGHT_SERVICE_INVALID_PARAM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.InspireCloudHandlerPlugin.C253923.f61924a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode r1 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.LIGHT_SERVICE_REQUEST_FAIL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.InspireCloudHandlerPlugin.C253923.f61924a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode r1 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.LIGHT_SERVICE_RESOURCE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.InspireCloudHandlerPlugin.C253923.f61924a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode r1 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.LIGHT_SERVICE_UNKNOWN_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.op.inspirecloud.InspireCloudHandlerPlugin.C253923.<clinit>():void");
        }
    }

    public InspireCloudHandlerResponse convertResponse(int i, InspireCloudHandlerResponse inspireCloudHandlerResponse) {
        LightServiceErrorCode fromValue = LightServiceErrorCode.fromValue(i);
        if (fromValue == null) {
            return inspireCloudHandlerResponse;
        }
        int i2 = C253923.f61924a[fromValue.ordinal()];
        if (i2 == 1) {
            fillFailedResponse(inspireCloudHandlerResponse, C25906a.f64072b, C25906a.f64072b.f64117J);
        } else if (i2 == 2) {
            fillFailedResponse(inspireCloudHandlerResponse, C25909d.f64119b, C25909d.f64119b.f64117J);
        } else if (i2 == 3) {
            fillFailedResponse(inspireCloudHandlerResponse, C25909d.f64120c, C25909d.f64120c.f64117J);
        } else if (i2 == 4) {
            fillFailedResponse(inspireCloudHandlerResponse, C25906a.f64077g, C25906a.f64077g.f64117J);
        }
        return inspireCloudHandlerResponse;
    }

    @LKPluginFunction(async = true, eventName = {"callLightService"})
    public void InspireCloudHandlerAsync(final LKEvent lKEvent, InspireCloudHandlerRequest inspireCloudHandlerRequest, AbstractC25895f fVar, final AbstractC25897h<InspireCloudHandlerResponse> hVar) {
        this.mILogger = fVar.mo92190b();
        this.mAppContext = getEventContext(lKEvent);
        final InspireCloudHandlerResponse inspireCloudHandlerResponse = new InspireCloudHandlerResponse();
        this.mILogger.mo92224i("InspireCloudHandlerPlugin", "params: " + inspireCloudHandlerRequest.context);
        String appId = this.mAppContext.getAppId();
        LarkExtensionManager.getInstance().getExtension().mo49565b();
        if (TextUtils.isEmpty(inspireCloudHandlerRequest.context)) {
            fillFailedResponse(inspireCloudHandlerResponse, C25906a.f64072b, "params empty");
            hVar.callback(inspireCloudHandlerResponse);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(inspireCloudHandlerRequest.context);
            if (jSONObject.length() == 0) {
                fillFailedResponse(inspireCloudHandlerResponse, C25906a.f64080j, "context is empty");
                hVar.callback(inspireCloudHandlerResponse);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_id", appId);
            jSONObject2.put("context", jSONObject);
            C12843b.m53038a(C13047a.C13049b.m53532a() + "/light_service/invoke", new HashMap(), jSONObject2, this.mAppContext).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.inspirecloud.InspireCloudHandlerPlugin.C253901 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    if (TextUtils.isEmpty(str)) {
                        InspireCloudHandlerPlugin.this.mILogger.mo92223e("InspireCloudHandlerPlugin", "response is empty");
                        InspireCloudHandlerPlugin.this.fillFailedResponse(inspireCloudHandlerResponse, C25906a.f64081k, "response is empty");
                        hVar.callback(inspireCloudHandlerResponse);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    ILogger aVar = InspireCloudHandlerPlugin.this.mILogger;
                    aVar.mo92224i("InspireCloudHandlerPlugin", "response:" + str);
                    int optInt = jSONObject.optInt("code");
                    if (optInt != 0) {
                        InspireCloudHandlerPlugin.this.mILogger.mo92223e("InspireCloudHandlerPlugin", "Request error");
                        hVar.callback(InspireCloudHandlerPlugin.this.convertResponse(optInt, inspireCloudHandlerResponse));
                        return;
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optJSONObject == null) {
                        InspireCloudHandlerPlugin.this.mILogger.mo92225w("InspireCloudHandlerPlugin", "call light service, empty result");
                        InspireCloudHandlerPlugin.this.fillFailedResponse(inspireCloudHandlerResponse, C25906a.f64081k, "call light service, empty result");
                        hVar.callback(inspireCloudHandlerResponse);
                        return;
                    }
                    String optString = optJSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (TextUtils.isEmpty(optString)) {
                        InspireCloudHandlerPlugin.this.mILogger.mo92225w("InspireCloudHandlerPlugin", "call light service, empty data");
                        InspireCloudHandlerPlugin.this.fillFailedResponse(inspireCloudHandlerResponse, C25906a.f64081k, "call light service, empty data");
                        hVar.callback(inspireCloudHandlerResponse);
                        return;
                    }
                    try {
                        lKEvent.mo92127a(new JSONObject(optString));
                    } catch (JSONException unused) {
                        ILogger aVar2 = InspireCloudHandlerPlugin.this.mILogger;
                        aVar2.mo92225w("InspireCloudHandlerPlugin", "response can not parse to json object, result = " + optString);
                        InspireCloudHandlerPlugin.this.fillFailedResponse(inspireCloudHandlerResponse, C25906a.f64081k, "response can not parse to json object");
                        hVar.callback(inspireCloudHandlerResponse);
                    }
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.inspirecloud.InspireCloudHandlerPlugin.C253912 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    InspireCloudHandlerPlugin.this.fillFailedResponse(inspireCloudHandlerResponse, C25906a.f64079i, th.getMessage());
                    hVar.callback(inspireCloudHandlerResponse);
                }
            });
        } catch (JSONException e) {
            this.mILogger.mo92225w("InspireCloudHandlerPlugin", "parse json error, e = " + e.getMessage());
            fillFailedResponse(inspireCloudHandlerResponse, C25906a.f64080j, e.getMessage());
            hVar.callback(inspireCloudHandlerResponse);
        }
    }
}
