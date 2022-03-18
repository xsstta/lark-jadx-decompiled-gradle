package com.larksuite.component.openplatform.core.plugin.inner;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.process.C67556a;

public class ApiReportAnalyticsCtrlPlugin extends OPPlugin {

    private static class ApiReportAnalyticsCtrlRequest extends C25920a {
        @JSONField(name = "event")
        @LKRequiredParam
        public String mEvent;
        @JSONField(name = ShareHitPoint.f121869d)
        public int mType;
        @JSONField(name = "value")
        @LKRequiredParam
        public JSONObject mValue;

        private ApiReportAnalyticsCtrlRequest() {
        }
    }

    private static class ApiReportAnalyticsCtrlResponse extends C25921b {
        private ApiReportAnalyticsCtrlResponse() {
        }

        /* synthetic */ ApiReportAnalyticsCtrlResponse(C249901 r1) {
            this();
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.inner.ApiReportAnalyticsCtrlPlugin$1 */
    public static /* synthetic */ class C249901 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61109a;

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
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.inner.ApiReportAnalyticsCtrlPlugin.C249901.f61109a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.ApiReportAnalyticsCtrlPlugin.C249901.f61109a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.ApiReportAnalyticsCtrlPlugin.C249901.f61109a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.BlockitApp     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.ApiReportAnalyticsCtrlPlugin.C249901.f61109a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.UnKnown     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.ApiReportAnalyticsCtrlPlugin.C249901.f61109a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.CardAPP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.inner.ApiReportAnalyticsCtrlPlugin.C249901.<clinit>():void");
        }
    }

    private String getEventName(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = C249901.f61109a[getAppContext().getAppType().ordinal()];
        String str2 = "micro_app";
        if (i == 1) {
            stringBuffer.append(str2);
        } else if (i == 2) {
            stringBuffer.append("web_app");
        } else if (i == 3) {
            stringBuffer.append("blockit_app");
        } else if (i == 4) {
            stringBuffer.append("unknow_app");
        } else if (i != 5) {
            if (C67432a.m262319a(getAppContext()).getAppInfo().isGame()) {
                str2 = "micro_game";
            }
            stringBuffer.append(str2);
        } else {
            stringBuffer.append("card_app");
        }
        stringBuffer.append("_");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    @LKPluginFunction(async = true, eventName = {"reportAnalytics"})
    public ApiReportAnalyticsCtrlResponse reportAnalytics(AbstractC25895f fVar, ApiReportAnalyticsCtrlRequest apiReportAnalyticsCtrlRequest) {
        String str;
        ApiReportAnalyticsCtrlResponse apiReportAnalyticsCtrlResponse = new ApiReportAnalyticsCtrlResponse(null);
        try {
            String str2 = apiReportAnalyticsCtrlRequest.mEvent;
            if (TextUtils.isEmpty(str2)) {
                AppBrandLogger.m52829e("tma_reportAnalytics", "event is empty");
                apiReportAnalyticsCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiReportAnalyticsCtrlResponse.mErrorMessage = "event is empty.";
                return apiReportAnalyticsCtrlResponse;
            } else if (str2.length() >= 85) {
                AppBrandLogger.m52829e("tma_reportAnalytics", "event length > MAX");
                apiReportAnalyticsCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiReportAnalyticsCtrlResponse.mErrorMessage = "event.length must be less than 85";
                return apiReportAnalyticsCtrlResponse;
            } else {
                String jSONString = apiReportAnalyticsCtrlRequest.mValue.toJSONString();
                if (jSONString.length() >= 294912) {
                    AppBrandLogger.m52829e("tma_reportAnalytics", "value length > MAX");
                    apiReportAnalyticsCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    apiReportAnalyticsCtrlResponse.mErrorMessage = "data.length must be less than 294912";
                    return apiReportAnalyticsCtrlResponse;
                }
                int i = apiReportAnalyticsCtrlRequest.mType;
                fVar.mo92190b().mo92222d("tma_reportAnalytics", "event=", str2, "&value=", jSONString);
                if (i == 1 && C67432a.m262319a(getAppContext()).getAppInfo().innertype == 1) {
                    fVar.mo92190b().mo92223e("tma_reportAnalytics", "do not handle");
                } else {
                    apiReportAnalyticsCtrlRequest.mValue.put("app_id", (Object) C67432a.m262319a(getAppContext()).getAppInfo().appId);
                    apiReportAnalyticsCtrlRequest.mValue.put("mp_name", (Object) C67432a.m262319a(getAppContext()).getAppInfo().appName);
                    JSONObject jSONObject = apiReportAnalyticsCtrlRequest.mValue;
                    if (C67432a.m262319a(getAppContext()).getAppInfo().isGame()) {
                        str = "micro_game";
                    } else {
                        str = "micro_app";
                    }
                    jSONObject.put("_param_for_special", (Object) str);
                    str2 = getEventName(str2);
                }
                fVar.mo92190b().mo92222d("tma_reportAnalytics", "event", str2, "params", apiReportAnalyticsCtrlRequest.mValue.toString());
                C67556a.m262937a(str2, new org.json.JSONObject(apiReportAnalyticsCtrlRequest.mValue.toJSONString()), 6);
                return apiReportAnalyticsCtrlResponse;
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_reportAnalytics", e);
            apiReportAnalyticsCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiReportAnalyticsCtrlResponse.mErrorMessage = e.getMessage();
            return apiReportAnalyticsCtrlResponse;
        }
    }
}
