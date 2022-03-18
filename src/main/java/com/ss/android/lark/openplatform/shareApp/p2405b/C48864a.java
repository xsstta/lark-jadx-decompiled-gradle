package com.ss.android.lark.openplatform.shareApp.p2405b;

import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.openplatform.shareApp.b.a */
public class C48864a extends OPMonitor {

    /* renamed from: a */
    private static C48919b f122749a;

    /* renamed from: b */
    private static C48924d f122750b;

    static {
        C48919b bVar = new C48919b($$Lambda$a$x4BMV6NybQUGdKpR7zIy7NH8yA.INSTANCE, $$Lambda$a$0Y4VAI8AWSST8mcmigSbGvpT4.INSTANCE);
        f122749a = bVar;
        f122750b = new C48924d(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.openplatform.shareApp.b.a$1 */
    public static /* synthetic */ class C488651 {

        /* renamed from: a */
        static final /* synthetic */ int[] f122751a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel[] r0 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.openplatform.shareApp.p2405b.C48864a.C488651.f122751a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.openplatform.shareApp.p2405b.C48864a.C488651.f122751a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.openplatform.shareApp.p2405b.C48864a.C488651.f122751a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.openplatform.shareApp.p2405b.C48864a.C488651.f122751a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.openplatform.shareApp.p2405b.C48864a.C488651.<clinit>():void");
        }
    }

    public C48864a(OPMonitorCode oPMonitorCode) {
        super(f122750b, oPMonitorCode);
    }

    /* renamed from: a */
    public static OPMonitor m192491a(OPMonitorCode oPMonitorCode) {
        return new C48864a(oPMonitorCode);
    }

    /* renamed from: a */
    public static void m192492a(OPMonitorCode oPMonitorCode, String str, String str2) {
        m192495b(oPMonitorCode, str, str2).flush();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m192494a(String str, HashMap hashMap, HashMap hashMap2) {
        MonitorUtils.monitorEvent(str, new JSONObject(hashMap2), new JSONObject(hashMap), null);
    }

    /* renamed from: b */
    public static OPMonitor m192495b(OPMonitorCode oPMonitorCode, String str, String str2) {
        OPMonitor addCategoryValue = m192491a(oPMonitorCode).addCategoryValue("app_id", str);
        if (!TextUtils.isEmpty(str2)) {
            addCategoryValue.addCategoryValue("op_tracking", str2);
        }
        return addCategoryValue;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m192493a(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
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
        int i2 = C488651.f122751a[oPMonitorLogLevel.ordinal()];
        if (i2 == 1 || i2 == 2) {
            Log.m165383e(str, sb.toString());
        } else if (i2 == 3) {
            Log.m165397w(str, sb.toString());
        } else if (i2 != 4) {
            Log.m165379d(str, sb.toString());
        } else {
            Log.m165389i(str, sb.toString());
        }
    }
}
