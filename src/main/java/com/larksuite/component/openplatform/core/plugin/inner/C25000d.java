package com.larksuite.component.openplatform.core.plugin.inner;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.C67552k;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3371e.AbstractC67510c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@ApiSupportType(apiName = {"monitorReport"}, support = {AppType.GadgetAPP, AppType.WebAPP, AppType.WebGadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.d */
public class C25000d extends AbstractC65797c {
    public C25000d() {
    }

    /* renamed from: b */
    private C48919b m90263b() {
        return AbstractC67510c.m262593d();
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("monitorReport");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.inner.d$1 */
    public static /* synthetic */ class C250011 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61111a;

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
                com.larksuite.component.openplatform.core.plugin.inner.C25000d.C250011.f61111a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.TRACE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.C25000d.C250011.f61111a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.C25000d.C250011.f61111a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.C25000d.C250011.f61111a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.C25000d.C250011.f61111a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.inner.C25000d.C250011.<clinit>():void");
        }
    }

    /* renamed from: a */
    private HashMap<String, Object> m90259a(JSONObject jSONObject) {
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

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        if (mo230473f().getAppType() != AppType.WebAPP || mo230475h().mo235052f("gadget.web_app.api.monitor_report")) {
            m90262a((JSONArray) bVar.mo234984a("monitorEvents"));
            return;
        }
        AppBrandLogger.m52830i("LarkApiMonitorReport", "monitor api not support");
        mo230493c("monitorReport unavailable for web app");
    }

    /* renamed from: a */
    private void m90262a(JSONArray jSONArray) {
        int i;
        OPMonitorLogLevel oPMonitorLogLevel;
        if (jSONArray == null || jSONArray.length() <= 0) {
            AppBrandLogger.m52830i("LarkApiMonitorReport", "monitor events is empty");
            mo230494j();
            return;
        }
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("name");
                HashMap<String, Object> a = m90259a(optJSONObject.optJSONObject("metrics"));
                HashMap<String, Object> a2 = m90259a(optJSONObject.optJSONObject("categories"));
                if (!a2.containsKey("app_id")) {
                    a2.put("app_id", mo230473f().getAppId());
                }
                if (!(mo230473f() == null || C67432a.m262319a(mo230473f()) == null)) {
                    AppInfoEntity appInfo = C67432a.m262319a(mo230473f()).getAppInfo();
                    if (appInfo != null) {
                        a2.put("app_version", appInfo.version);
                        a2.put("app_name", appInfo.appName);
                        a2.put("scene", appInfo.scene);
                    }
                    a2.put("js_version", C67552k.m262720a(AppbrandContext.getInst().getApplicationContext(), mo230473f()));
                    a2.put("js_grey_hash", C66399c.m259608a().mo231913a(AppbrandContext.getInst().getApplicationContext()));
                }
                if (!a2.containsKey("app_type")) {
                    a2.put("app_type", C67475d.m262448a(mo230473f().getAppType()));
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
                m90260a(forNumber, optString, a, a2, optJSONObject.optString("platform"));
                int i4 = C250011.f61111a[forNumber.ordinal()];
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
                m90261a(oPMonitorLogLevel, "op_monitor", str, str2, i3, "monitor_event:" + optString + "," + "data:" + new JSONObject(hashMap));
            }
        }
        mo230494j();
    }

    public C25000d(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    private int m90258a(C48919b bVar, String str) {
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

    /* renamed from: a */
    private void m90260a(OPMonitorLevel oPMonitorLevel, String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, String str2) {
        C48919b b;
        if (oPMonitorLevel != OPMonitorLevel.TRACE && (b = m90263b()) != null) {
            b.mo170807a(str, hashMap, hashMap2, m90258a(b, str2));
        }
    }

    /* renamed from: a */
    private void m90261a(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
        C48919b b = m90263b();
        if (b != null) {
            b.mo170806a(oPMonitorLogLevel, str, str2, str3, i, str4);
        }
    }
}
