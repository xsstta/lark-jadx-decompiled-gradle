package com.ss.android.appcenter.business.monitor.p1269a;

import com.ss.android.appcenter.common.util.C28179c;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.appcenter.business.monitor.a.a */
public class C27700a extends OPMonitor {

    /* renamed from: a */
    private static C48919b f69201a;

    /* renamed from: b */
    private static final C48924d f69202b;

    static {
        C48919b bVar = new C48919b($$Lambda$a$NA5pD8n3VONkmCMyYkXMQPTuUY4.INSTANCE, $$Lambda$a$dTUqwxd_O793MSjIRp8pNbsrYc.INSTANCE);
        f69201a = bVar;
        f69202b = new C48924d(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.monitor.a.a$1 */
    public static /* synthetic */ class C277011 {

        /* renamed from: a */
        static final /* synthetic */ int[] f69203a;

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
                com.ss.android.appcenter.business.monitor.p1269a.C27700a.C277011.f69203a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.appcenter.business.monitor.p1269a.C27700a.C277011.f69203a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.appcenter.business.monitor.p1269a.C27700a.C277011.f69203a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.appcenter.business.monitor.p1269a.C27700a.C277011.f69203a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.monitor.p1269a.C27700a.C277011.<clinit>():void");
        }
    }

    private C27700a(String str) {
        super(f69202b, str);
    }

    @Override // com.ss.android.lark.opmonitor.service.OPMonitor
    public OPMonitor tracing(OPTrace oPTrace) {
        if (oPTrace != null) {
            return super.tracing(oPTrace);
        }
        return this;
    }

    /* renamed from: a */
    public static C27700a m101232a(String str) {
        C27700a aVar = new C27700a(str);
        m101233a(aVar);
        return aVar;
    }

    /* renamed from: b */
    public static void m101238b(String str) {
        C27700a aVar = new C27700a("op_workplace_error");
        aVar.setMonitorCode(C27702b.f69226W).addCategoryValue("method", str);
        m101233a(aVar);
        aVar.flush();
    }

    /* renamed from: a */
    private static void m101233a(C27700a aVar) {
        if (C27548m.m100547m().mo98221e() != null) {
            aVar.addCategoryValue("user_id", C28179c.m103226a(C27548m.m100547m().mo98221e().mo98213b()));
            aVar.addCategoryValue("tenant_id", C28179c.m103226a(C27548m.m100547m().mo98221e().mo98215d()));
        }
    }

    /* renamed from: a */
    public static void m101234a(OPMonitorCode oPMonitorCode, OPTrace oPTrace) {
        C27700a a = m101232a("op_workplace_event");
        a.setMonitorCode(oPMonitorCode).tracing(oPTrace);
        a.flush();
    }

    /* renamed from: a */
    public static void m101236a(String str, Exception exc) {
        C27700a aVar = new C27700a("op_workplace_error");
        aVar.setMonitorCode(C27702b.f69227X).setErrorMessage(exc.toString()).addCategoryValue("method", str);
        m101233a(aVar);
        aVar.flush();
        C28184h.m103247a("AppCenterMonitor", str, exc);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101237a(String str, HashMap hashMap, HashMap hashMap2) {
        if (C27548m.m100547m().mo98216a() != null) {
            C27548m.m100547m().mo98216a().mo98159a(str, new JSONObject(hashMap2), new JSONObject(hashMap), null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101235a(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
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
        int i2 = C277011.f69203a[oPMonitorLogLevel.ordinal()];
        if (i2 == 1) {
            C28184h.m103248b(str, sb.toString());
        } else if (i2 == 2) {
            C28184h.m103249c(str, sb.toString());
        } else if (i2 == 3) {
            C28184h.m103250d(str, sb.toString());
        } else if (i2 != 4) {
            C28184h.m103246a(str, sb.toString());
        } else {
            C28184h.m103246a(str, sb.toString());
        }
    }
}
