package com.larksuite.component.openplatform.core.plugin.op.inspirecloud;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.google.firebase.messaging.Constants;
import com.p063a.p064a.p065a.p066a.C1713b;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"callLightService"}, support = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.op.inspirecloud.a */
public class C25393a extends AbstractC65797c {
    public C25393a() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("callLightService");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.inspirecloud.a$3 */
    public static /* synthetic */ class C253963 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61927a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode[] r0 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.C25393a.C253963.f61927a = r0
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode r1 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.LIGHT_SERVICE_NO_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.C25393a.C253963.f61927a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode r1 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.LIGHT_SERVICE_INVALID_PARAM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.C25393a.C253963.f61927a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode r1 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.LIGHT_SERVICE_REQUEST_FAIL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.C25393a.C253963.f61927a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode r1 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.LIGHT_SERVICE_RESOURCE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.C25393a.C253963.f61927a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode r1 = com.larksuite.component.openplatform.core.plugin.op.inspirecloud.LightServiceErrorCode.LIGHT_SERVICE_UNKNOWN_ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.op.inspirecloud.C25393a.C253963.<clinit>():void");
        }
    }

    /* renamed from: a */
    public ApiCode mo88531a(int i) {
        LightServiceErrorCode fromValue = LightServiceErrorCode.fromValue(i);
        if (fromValue == null) {
            return ApiCode.GENERAL_UNKONW_ERROR;
        }
        ApiCode apiCode = ApiCode.GENERAL_UNKONW_ERROR;
        int i2 = C253963.f61927a[fromValue.ordinal()];
        if (i2 == 1) {
            return ApiCode.GENERAL_OK;
        }
        if (i2 == 2) {
            return ApiCode.GENERAL_PARAM;
        }
        if (i2 == 3) {
            return ApiCode.CALLLIGHTSERVICE_CLOUD_SERVICE_REQUEST_FAIL;
        }
        if (i2 == 4) {
            return ApiCode.CALLLIGHTSERVICE_RESOURCE_NOT_FOUND;
        }
        if (i2 != 5) {
            return apiCode;
        }
        return ApiCode.GENERAL_UNKONW_ERROR;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("InspireCloudHandler", "params: " + bVar.mo234988d());
        String appId = mo230473f().getAppId();
        LarkExtensionManager.getInstance().getExtension().mo49565b();
        if (TextUtils.isEmpty(bVar.mo234988d())) {
            mo230493c("params empty");
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(bVar.mo234988d()).optJSONObject("context");
            if (optJSONObject != null) {
                if (optJSONObject.length() != 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", appId);
                    jSONObject.put("context", optJSONObject);
                    C12843b.m53038a(C13047a.C13049b.m53532a() + "/light_service/invoke", new HashMap(), jSONObject, mo230473f()).subscribe(new Consumer<String>() {
                        /* class com.larksuite.component.openplatform.core.plugin.op.inspirecloud.C25393a.C253941 */

                        /* renamed from: a */
                        public void accept(String str) throws Exception {
                            if (TextUtils.isEmpty(str)) {
                                AppBrandLogger.m52829e("InspireCloudHandler", "response is empty");
                                C25393a.this.mo230493c("response is empty");
                                return;
                            }
                            JSONObject jSONObject = new JSONObject(str);
                            C1713b.m7632b("InspireCloudHandler", "response:" + str);
                            int optInt = jSONObject.optInt("code");
                            if (optInt != 0) {
                                AppBrandLogger.m52829e("InspireCloudHandler", "Request error");
                                C25393a.this.mo230481a(C25393a.this.mo88531a(optInt));
                                return;
                            }
                            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            if (optJSONObject == null) {
                                AppBrandLogger.m52831w("InspireCloudHandler", "call light service, empty result");
                                C25393a.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                                return;
                            }
                            String optString = optJSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            if (TextUtils.isEmpty(optString)) {
                                AppBrandLogger.m52831w("InspireCloudHandler", "call light service, empty data");
                                C25393a.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                                return;
                            }
                            try {
                                C25393a.this.mo230492b(new JSONObject(optString));
                            } catch (JSONException unused) {
                                AppBrandLogger.m52831w("InspireCloudHandler", "response can not parse to json object, result = " + optString);
                                C25393a.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                            }
                        }
                    }, new Consumer<Throwable>() {
                        /* class com.larksuite.component.openplatform.core.plugin.op.inspirecloud.C25393a.C253952 */

                        /* renamed from: a */
                        public void accept(Throwable th) throws Exception {
                            C25393a.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                        }
                    });
                    return;
                }
            }
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
        } catch (JSONException e) {
            e.printStackTrace();
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
        }
    }

    public C25393a(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
