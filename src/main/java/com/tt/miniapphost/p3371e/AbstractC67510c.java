package com.tt.miniapphost.p3371e;

import android.os.Trace;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.api.AbstractC48906d;
import com.ss.android.lark.opmonitor.api.AbstractC48907e;
import com.ss.android.lark.opmonitor.api.AbstractC48908f;
import com.ss.android.lark.opmonitor.api.OPBaseReportImpl;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.event.C66035c;
import com.tt.refer.common.meta.AbstractC67796c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tt.miniapphost.e.c */
public abstract class AbstractC67510c extends OPMonitor {

    /* renamed from: a */
    protected IAppContext f170259a;

    /* renamed from: e */
    public static AbstractC48907e m262594e() {
        return new OPBaseReportImpl() {
            /* class com.tt.miniapphost.p3371e.AbstractC67510c.C675111 */

            @Override // com.ss.android.lark.opmonitor.api.OPBaseReportImpl
            /* renamed from: b */
            public void mo144736b(String str, Map<String, ? extends Object> map) {
                if (!map.isEmpty()) {
                    C66035c.m258577b(str, new JSONObject(map));
                    return;
                }
                AppBrandLogger.m52831w("AbsAppMonitor", "event name: " + str + ", event data is empty", "platform:tea");
            }

            @Override // com.ss.android.lark.opmonitor.api.OPBaseReportImpl
            /* renamed from: a */
            public void mo144735a(String str, Map<String, ? extends Object> map) {
                if (!map.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(map);
                    AppBrandLogger.m52828d("AbsAppMonitor", "monitor report: ", str, " => ", jSONObject, " platform:slardar");
                    C66035c.m258576a(str, jSONObject);
                    return;
                }
                AppBrandLogger.m52831w("AbsAppMonitor", "event name: " + str + ", event data is empty", " platform:slardar");
            }
        };
    }

    /* renamed from: f */
    public static AbstractC48906d m262595f() {
        return new AbstractC48906d() {
            /* class com.tt.miniapphost.p3371e.AbstractC67510c.C675122 */

            @Override // com.ss.android.lark.opmonitor.api.AbstractC48906d
            public void log(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(str2)) {
                    sb.append("filePath: ");
                    sb.append(str2);
                    sb.append(", ");
                }
                if (!TextUtils.isEmpty(str3)) {
                    sb.append("func: ");
                    sb.append(str3);
                    sb.append(", ");
                }
                if (i > 0) {
                    sb.append("line: ");
                    sb.append(i);
                    sb.append(", ");
                }
                sb.append(str4);
                int i2 = C675133.f170260a[oPMonitorLogLevel.ordinal()];
                if (i2 == 1) {
                    AppBrandLogger.m52828d(str, sb.toString());
                } else if (i2 == 2) {
                    AppBrandLogger.m52830i(str, sb.toString());
                } else if (i2 == 3) {
                    AppBrandLogger.m52831w(str, sb.toString());
                } else if (i2 == 4) {
                    AppBrandLogger.m52829e(str, sb.toString());
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HashMap<String, Object> mo50294a() {
        return mo234322a(0);
    }

    /* renamed from: c */
    public static C48924d m262592c() {
        C48924d dVar = new C48924d();
        dVar.mo170861b(m262593d());
        return dVar;
    }

    /* renamed from: d */
    public static C48919b m262593d() {
        return new C48919b(m262594e(), m262595f());
    }

    @Override // com.ss.android.lark.opmonitor.service.OPMonitor
    public synchronized void flush() {
        Trace.beginSection("computeGadgetCommons");
        HashMap<String, Object> a = mo50294a();
        if (a != null) {
            addCommonParams(a);
        }
        Trace.endSection();
        super.flush();
    }

    /* renamed from: com.tt.miniapphost.e.c$3 */
    static /* synthetic */ class C675133 {

        /* renamed from: a */
        static final /* synthetic */ int[] f170260a;

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
                com.tt.miniapphost.p3371e.AbstractC67510c.C675133.f170260a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapphost.p3371e.AbstractC67510c.C675133.f170260a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.miniapphost.p3371e.AbstractC67510c.C675133.f170260a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.tt.miniapphost.p3371e.AbstractC67510c.C675133.f170260a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.p3371e.AbstractC67510c.C675133.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HashMap<String, Object> mo234322a(int i) {
        IAppContext iAppContext = this.f170259a;
        if (iAppContext == null) {
            return new HashMap<>();
        }
        AbstractC67796c cVar = (AbstractC67796c) iAppContext.findServiceByInterface(AbstractC67796c.class);
        if (cVar != null) {
            return cVar.mo50340a(i);
        }
        return new HashMap<>();
    }

    /* renamed from: b */
    public synchronized void mo234323b(int i) {
        HashMap<String, Object> a = mo234322a(i);
        if (a != null) {
            addCommonParams(a);
        }
        super.flush();
    }

    public AbstractC67510c(AbstractC48908f fVar, OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        super(fVar, oPMonitorCode);
        this.f170259a = iAppContext;
    }

    public AbstractC67510c(AbstractC48908f fVar, String str, IAppContext iAppContext) {
        super(fVar, str);
        this.f170259a = iAppContext;
    }

    public AbstractC67510c(AbstractC48908f fVar, String str, OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        super(fVar, str, oPMonitorCode);
        this.f170259a = iAppContext;
    }
}
