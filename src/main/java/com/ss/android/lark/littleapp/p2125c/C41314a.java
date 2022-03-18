package com.ss.android.lark.littleapp.p2125c;

import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.api.AbstractC48906d;
import com.ss.android.lark.opmonitor.api.AbstractC48907e;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.c.a */
public class C41314a extends OPMonitor {

    /* renamed from: a */
    private static final C48919b f105096a;

    /* renamed from: b */
    private static final C48924d f105097b;

    static {
        C48919b bVar = new C48919b(new AbstractC48907e() {
            /* class com.ss.android.lark.littleapp.p2125c.C41314a.C413151 */

            @Override // com.ss.android.lark.opmonitor.api.AbstractC48907e
            public void report(String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
                C41354g.m163939a().monitorOpEvent(str, new JSONObject(hashMap2), new JSONObject(hashMap), null);
            }
        }, new AbstractC48906d() {
            /* class com.ss.android.lark.littleapp.p2125c.C41314a.C413162 */

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
                int i2 = C413173.f105098a[oPMonitorLogLevel.ordinal()];
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
        f105096a = bVar;
        f105097b = new C48924d(bVar);
    }

    /* renamed from: com.ss.android.lark.littleapp.c.a$3 */
    static /* synthetic */ class C413173 {

        /* renamed from: a */
        static final /* synthetic */ int[] f105098a;

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
                com.ss.android.lark.littleapp.p2125c.C41314a.C413173.f105098a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.littleapp.p2125c.C41314a.C413173.f105098a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.littleapp.p2125c.C41314a.C413173.f105098a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.littleapp.p2125c.C41314a.C413173.f105098a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.littleapp.p2125c.C41314a.C413173.f105098a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.littleapp.p2125c.C41314a.C413173.<clinit>():void");
        }
    }

    public C41314a(String str) {
        super(f105097b, str);
    }

    /* renamed from: a */
    public static OPMonitor m163781a(String str) {
        return new C41314a(str);
    }
}
