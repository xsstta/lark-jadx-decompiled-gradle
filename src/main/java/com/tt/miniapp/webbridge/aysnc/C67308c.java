package com.tt.miniapp.webbridge.aysnc;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.C67552k;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3371e.AbstractC67510c;
import com.tt.refer.common.annotation.ApiHandler;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiHandler(eventName = "monitorReport")
/* renamed from: com.tt.miniapp.webbridge.aysnc.c */
public class C67308c extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return null;
    }

    /* renamed from: a */
    private C48919b m262187a() {
        return AbstractC67510c.m262593d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.webbridge.aysnc.c$1 */
    public static /* synthetic */ class C673091 {

        /* renamed from: a */
        static final /* synthetic */ int[] f169851a;

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
                com.tt.miniapp.webbridge.aysnc.C67308c.C673091.f169851a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.TRACE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapp.webbridge.aysnc.C67308c.C673091.f169851a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.miniapp.webbridge.aysnc.C67308c.C673091.f169851a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.tt.miniapp.webbridge.aysnc.C67308c.C673091.f169851a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.tt.miniapp.webbridge.aysnc.C67308c.C673091.f169851a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.webbridge.aysnc.C67308c.C673091.<clinit>():void");
        }
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        if (this.iAppContext.getAppType() != AppType.WebAPP || this.iAppContext.findServiceByInterface(AbstractC67709b.class) == null || ((AbstractC67709b.AbstractC67710a) ((AbstractC67709b) this.iAppContext.findServiceByInterface(AbstractC67709b.class)).mo235130i()).mo235052f("gadget.web_app.api.monitor_report")) {
            try {
                m262191a(new JSONObject(this.mArgs).getJSONArray("monitorEvents"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            AppBrandLogger.m52830i("LarkApiMonitorReport", "monitor api not support");
            callbackFail("monitorReport unavailable for web app");
        }
        return CharacterUtils.empty();
    }

    /* renamed from: a */
    private HashMap<String, Object> m262188a(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m262191a(JSONArray jSONArray) {
        int i;
        OPMonitorLogLevel oPMonitorLogLevel;
        if (jSONArray == null || jSONArray.length() <= 0) {
            AppBrandLogger.m52830i("LarkApiMonitorReport", "monitor events is empty");
            callbackOk();
            return;
        }
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("name");
                HashMap<String, Object> a = m262188a(optJSONObject.optJSONObject("metrics"));
                HashMap<String, Object> a2 = m262188a(optJSONObject.optJSONObject("categories"));
                if (!a2.containsKey("app_id")) {
                    a2.put("app_id", this.iAppContext.getAppId());
                }
                if (!(this.iAppContext == null || C67432a.m262319a(this.iAppContext) == null)) {
                    AppInfoEntity appInfo = C67432a.m262319a(this.iAppContext).getAppInfo();
                    if (appInfo != null) {
                        a2.put("app_version", appInfo.version);
                        a2.put("app_name", appInfo.appName);
                        a2.put("scene", appInfo.scene);
                    }
                    a2.put("js_version", C67552k.m262720a(AppbrandContext.getInst().getApplicationContext(), this.iAppContext));
                }
                if (!a2.containsKey("app_type")) {
                    a2.put("app_type", C67475d.m262448a(this.iAppContext.getAppType()));
                }
                if (!a2.containsKey("trace_id")) {
                    a2.put("trace_id", AppbrandContext.getInst().getTraceId());
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(a);
                hashMap.putAll(a2);
                int i3 = -1;
                if (hashMap.get("monitor_level") instanceof Integer) {
                    i = ((Integer) hashMap.get("monitor_level")).intValue();
                } else {
                    i = -1;
                }
                OPMonitorLevel forNumber = OPMonitorLevel.forNumber(i);
                m262189a(forNumber, optString, a, a2, optJSONObject.optString("platform"));
                int i4 = C673091.f169851a[forNumber.ordinal()];
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
                    i3 = ((Integer) hashMap.get("monitor_line")).intValue();
                }
                m262190a(oPMonitorLogLevel, "op_monitor", str, str2, i3, "monitor_event:" + optString + "," + "data:" + new JSONObject(hashMap));
            }
        }
        callbackOk();
    }

    /* renamed from: a */
    private int m262186a(C48919b bVar, String str) {
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

    public C67308c(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }

    /* renamed from: a */
    private void m262189a(OPMonitorLevel oPMonitorLevel, String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, String str2) {
        C48919b a;
        if (oPMonitorLevel != OPMonitorLevel.TRACE && (a = m262187a()) != null) {
            a.mo170807a(str, hashMap, hashMap2, m262186a(a, str2));
        }
    }

    /* renamed from: a */
    private void m262190a(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
        C48919b a = m262187a();
        if (a != null) {
            a.mo170806a(oPMonitorLogLevel, str, str2, str3, i, str4);
        }
    }
}
