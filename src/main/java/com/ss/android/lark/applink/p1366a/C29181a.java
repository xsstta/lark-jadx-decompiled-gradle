package com.ss.android.lark.applink.p1366a;

import android.text.TextUtils;
import com.ss.android.lark.applink.C29187c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.opmonitor.api.AbstractC48906d;
import com.ss.android.lark.opmonitor.api.AbstractC48907e;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.applink.a.a */
public class C29181a extends OPMonitor {

    /* renamed from: a */
    private static C48919b f73033a;

    /* renamed from: b */
    private static C48924d f73034b;

    static {
        C48919b bVar = new C48919b(new AbstractC48907e() {
            /* class com.ss.android.lark.applink.p1366a.C29181a.C291821 */

            @Override // com.ss.android.lark.opmonitor.api.AbstractC48907e
            public void report(String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
                JSONObject jSONObject;
                JSONObject jSONObject2;
                if (hashMap == null || hashMap.isEmpty()) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject(hashMap);
                }
                if (hashMap2 == null || hashMap2.isEmpty()) {
                    jSONObject2 = null;
                } else {
                    jSONObject2 = new JSONObject(hashMap2);
                }
                C29187c.m107300a().mo103451a(str, jSONObject2, jSONObject, (JSONObject) null);
            }
        }, new AbstractC48906d() {
            /* class com.ss.android.lark.applink.p1366a.C29181a.C291832 */

            @Override // com.ss.android.lark.opmonitor.api.AbstractC48906d
            public void log(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
                StringBuilder sb = new StringBuilder();
                sb.append("filePath:");
                sb.append(str2);
                sb.append("\t");
                sb.append("function:");
                sb.append(str3);
                sb.append("\t");
                sb.append("line:");
                sb.append(i);
                sb.append("\t");
                sb.append("content");
                sb.append(str4);
                int i2 = C291843.f73035a[oPMonitorLogLevel.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    C29187c.m107300a().mo103455d(str, sb.toString());
                } else if (i2 == 3) {
                    C29187c.m107300a().mo103454c(str, sb.toString());
                } else if (i2 == 4) {
                    C29187c.m107300a().mo103453b(str, sb.toString());
                } else if (i2 != 5) {
                    C29187c.m107300a().mo103449a(str, sb.toString());
                } else {
                    C29187c.m107300a().mo103449a(str, sb.toString());
                }
            }
        });
        f73033a = bVar;
        f73034b = new C48924d(bVar);
    }

    /* renamed from: com.ss.android.lark.applink.a.a$3 */
    static /* synthetic */ class C291843 {

        /* renamed from: a */
        static final /* synthetic */ int[] f73035a;

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
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel[] r0 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.applink.p1366a.C29181a.C291843.f73035a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.applink.p1366a.C29181a.C291843.f73035a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.applink.p1366a.C29181a.C291843.f73035a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.applink.p1366a.C29181a.C291843.f73035a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.applink.p1366a.C29181a.C291843.f73035a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.applink.p1366a.C29181a.C291843.<clinit>():void");
        }
    }

    public C29181a(OPMonitorCode oPMonitorCode) {
        super(f73034b, oPMonitorCode);
    }

    /* renamed from: a */
    public static C29181a m107290a(OPMonitorCode oPMonitorCode) {
        return new C29181a(oPMonitorCode);
    }

    /* renamed from: a */
    public OPMonitor mo103456a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return addCategoryValue("op_tracking", str);
        }
        return this;
    }

    /* renamed from: a */
    public OPMonitor mo103457a(String str, int i, boolean z) {
        return mo103458a(str, i, z, null);
    }

    /* renamed from: a */
    public OPMonitor mo103459a(String str, long j, int i) {
        return addCategoryValue("url", str).addCategoryValue(ShareHitPoint.f121868c, Integer.valueOf(i)).setDuration(j);
    }

    /* renamed from: a */
    public OPMonitor mo103458a(String str, int i, boolean z, String str2) {
        return mo103456a(str2).addCategoryValue("url", str).addCategoryValue(ShareHitPoint.f121868c, Integer.valueOf(i)).addCategoryValue("is_handle_ok", Boolean.valueOf(z));
    }
}
