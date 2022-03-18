package com.larksuite.component.openplatform.core.plugin.inner;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.C67552k;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3371e.AbstractC67510c;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import java.util.HashMap;

public class ApiMonitorReportHandlerPlugin extends OPPlugin {
    private ILogger mILogger;

    private static class ApiMonitorReportHandlerRequest extends C25920a {
        @JSONField(name = "monitorEvents")
        @LKRequiredParam
        public JSONArray monitorEvents;

        private ApiMonitorReportHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiMonitorReportHandlerResponse extends C25921b {
        private ApiMonitorReportHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private C48919b getMonitorConfig() {
        return AbstractC67510c.m262593d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.inner.ApiMonitorReportHandlerPlugin$2 */
    public static /* synthetic */ class C249882 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61105a;

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
                com.ss.android.lark.opmonitor.model.OPMonitorLevel[] r0 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.inner.ApiMonitorReportHandlerPlugin.C249882.f61105a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.TRACE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.ApiMonitorReportHandlerPlugin.C249882.f61105a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.ApiMonitorReportHandlerPlugin.C249882.f61105a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.ApiMonitorReportHandlerPlugin.C249882.f61105a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.ApiMonitorReportHandlerPlugin.C249882.f61105a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.inner.ApiMonitorReportHandlerPlugin.C249882.<clinit>():void");
        }
    }

    private HashMap<String, Object> jsonToMap(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (jSONObject != null && jSONObject.size() > 0) {
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.get(str));
            }
        }
        return hashMap;
    }

    private int convertPlatform(C48919b bVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            if ("Tea".equals(str)) {
                return 4;
            }
            if ("TeaSlardar".equals(str)) {
                return 6;
            }
            if ("Slardar".equals(str)) {
                return 2;
            }
        }
        return bVar.mo170808b();
    }

    public void monitorEvents(JSONArray jSONArray, AbstractC25897h<ApiMonitorReportHandlerResponse> hVar) {
        int i;
        OPMonitorLogLevel oPMonitorLogLevel;
        int i2;
        if (jSONArray == null || jSONArray.size() <= 0) {
            this.mILogger.mo92224i("LarkApiMonitorReport", "monitor events is empty");
            hVar.callback(new ApiMonitorReportHandlerResponse());
            return;
        }
        int size = jSONArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i3);
            if (jSONObject != null) {
                String string = jSONObject.getString("name");
                HashMap<String, Object> jsonToMap = jsonToMap(jSONObject.getJSONObject("metrics"));
                HashMap<String, Object> jsonToMap2 = jsonToMap(jSONObject.getJSONObject("categories"));
                if (!jsonToMap2.containsKey("app_id")) {
                    jsonToMap2.put("app_id", getAppContext().getAppId());
                }
                if (!(getAppContext() == null || C67432a.m262319a(getAppContext()) == null)) {
                    AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
                    if (appInfo != null) {
                        jsonToMap2.put("app_version", appInfo.version);
                        jsonToMap2.put("app_name", appInfo.appName);
                        jsonToMap2.put("scene", appInfo.scene);
                    }
                    jsonToMap2.put("js_version", C67552k.m262720a(AppbrandContext.getInst().getApplicationContext(), getAppContext()));
                    jsonToMap2.put("js_grey_hash", C66399c.m259608a().mo231913a(AppbrandContext.getInst().getApplicationContext()));
                }
                if (!jsonToMap2.containsKey("app_type")) {
                    jsonToMap2.put("app_type", C67475d.m262448a(getAppContext().getAppType()));
                }
                if (!jsonToMap2.containsKey("trace_id")) {
                    jsonToMap2.put("trace_id", AppbrandContext.getInst().getTraceId());
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(jsonToMap);
                hashMap.putAll(jsonToMap2);
                if (hashMap.get("monitor_level") instanceof Integer) {
                    i = ((Integer) hashMap.get("monitor_level")).intValue();
                } else {
                    i = -1;
                }
                OPMonitorLevel forNumber = OPMonitorLevel.forNumber(i);
                report(forNumber, string, jsonToMap, jsonToMap2, jSONObject.getString("platform"));
                int i4 = C249882.f61105a[forNumber.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    oPMonitorLogLevel = OPMonitorLogLevel.INFO;
                } else if (i4 == 3) {
                    oPMonitorLogLevel = OPMonitorLogLevel.WARN;
                } else if (i4 == 4) {
                    oPMonitorLogLevel = OPMonitorLogLevel.ERROR;
                } else if (i4 != 5) {
                    oPMonitorLogLevel = OPMonitorLogLevel.INFO;
                } else {
                    oPMonitorLogLevel = OPMonitorLogLevel.FATAL;
                }
                String str = hashMap.get("monitor_file") instanceof String ? (String) hashMap.get("monitor_file") : null;
                String str2 = hashMap.get("monitor_function") instanceof String ? (String) hashMap.get("monitor_function") : null;
                if (hashMap.get("monitor_line") instanceof Integer) {
                    i2 = ((Integer) hashMap.get("monitor_line")).intValue();
                } else {
                    i2 = -1;
                }
                log(oPMonitorLogLevel, "op_monitor", str, str2, i2, "monitor_event:" + string + "," + "data:" + new JSONObject(hashMap));
            }
        }
        hVar.callback(new ApiMonitorReportHandlerResponse());
    }

    @LKPluginFunction(async = true, eventName = {"monitorReport"})
    public void monitorReportHandlerAsync(LKEvent lKEvent, ApiMonitorReportHandlerRequest apiMonitorReportHandlerRequest, AbstractC25895f fVar, final AbstractC25897h<ApiMonitorReportHandlerResponse> hVar) {
        this.mILogger = fVar.mo92190b();
        if (getAppContext() == null) {
            this.mILogger.mo92223e("LarkApiMonitorReport", "app context is null");
            ApiMonitorReportHandlerResponse apiMonitorReportHandlerResponse = new ApiMonitorReportHandlerResponse();
            apiMonitorReportHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiMonitorReportHandlerResponse.mErrorMessage = "app context is null";
            hVar.callback(apiMonitorReportHandlerResponse);
        } else if (getAppContext().getAppType() != AppType.WebAPP || getApiDependency().mo235052f("gadget.web_app.api.monitor_report")) {
            final JSONArray jSONArray = apiMonitorReportHandlerRequest.monitorEvents;
            C67866g.m264025a(new Action() {
                /* class com.larksuite.component.openplatform.core.plugin.inner.ApiMonitorReportHandlerPlugin.C249871 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    long currentTimeMillis = System.currentTimeMillis();
                    ApiMonitorReportHandlerPlugin.this.monitorEvents(jSONArray, hVar);
                    AppBrandLogger.m52830i("LarkApiMonitorReport", "monitor cost:" + (System.currentTimeMillis() - currentTimeMillis));
                }
            }, Schedulers.longIO());
        } else {
            this.mILogger.mo92224i("LarkApiMonitorReport", "monitor api not support");
            ApiMonitorReportHandlerResponse apiMonitorReportHandlerResponse2 = new ApiMonitorReportHandlerResponse();
            apiMonitorReportHandlerResponse2.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiMonitorReportHandlerResponse2.mErrorMessage = "monitorReport unavailable for web app";
            hVar.callback(apiMonitorReportHandlerResponse2);
        }
    }

    private void report(OPMonitorLevel oPMonitorLevel, String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, String str2) {
        C48919b monitorConfig;
        if (oPMonitorLevel != OPMonitorLevel.TRACE && (monitorConfig = getMonitorConfig()) != null) {
            monitorConfig.mo170807a(str, hashMap, hashMap2, convertPlatform(monitorConfig, str2));
        }
    }

    private void log(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
        C48919b monitorConfig = getMonitorConfig();
        if (monitorConfig != null) {
            monitorConfig.mo170806a(oPMonitorLogLevel, str, str2, str3, i, str4);
        }
    }
}
