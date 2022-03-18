package com.ss.android.openbusiness.p3006c;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.api.AbstractC48906d;
import com.ss.android.lark.opmonitor.api.AbstractC48907e;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.openbusiness.c.d */
public class C59541d extends OPMonitor {

    /* renamed from: a */
    private static C48919b f147811a;

    /* renamed from: b */
    private static final C48924d f147812b;

    static {
        C48919b bVar = new C48919b(new AbstractC48907e() {
            /* class com.ss.android.openbusiness.p3006c.C59541d.C595421 */

            @Override // com.ss.android.lark.opmonitor.api.AbstractC48907e
            public void report(String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
                try {
                    MonitorUtils.monitorEvent(str, new JSONObject(hashMap2), new JSONObject(hashMap), null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, new AbstractC48906d() {
            /* class com.ss.android.openbusiness.p3006c.C59541d.C595432 */

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
                int i2 = C595443.f147813a[oPMonitorLogLevel.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    Log.m165383e(str, sb.toString());
                } else if (i2 == 3) {
                    Log.m165397w(str, sb.toString());
                } else if (i2 == 4) {
                    Log.m165389i(str, sb.toString());
                } else if (i2 != 5) {
                    Log.m165379d(str, sb.toString());
                } else {
                    Log.m165379d(str, sb.toString());
                }
            }
        });
        f147811a = bVar;
        f147812b = new C48924d(bVar);
    }

    /* renamed from: com.ss.android.openbusiness.c.d$3 */
    static /* synthetic */ class C595443 {

        /* renamed from: a */
        static final /* synthetic */ int[] f147813a;

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
                com.ss.android.openbusiness.p3006c.C59541d.C595443.f147813a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.openbusiness.p3006c.C59541d.C595443.f147813a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.openbusiness.p3006c.C59541d.C595443.f147813a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.openbusiness.p3006c.C59541d.C595443.f147813a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.openbusiness.p3006c.C59541d.C595443.f147813a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.openbusiness.p3006c.C59541d.C595443.<clinit>():void");
        }
    }

    private C59541d(OPMonitorCode oPMonitorCode) {
        super(f147812b, oPMonitorCode);
    }

    /* renamed from: a */
    public static C59541d m231037a(OPMonitorCode oPMonitorCode) {
        return new C59541d(oPMonitorCode);
    }
}
