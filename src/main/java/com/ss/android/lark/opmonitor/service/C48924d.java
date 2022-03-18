package com.ss.android.lark.opmonitor.service;

import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.opmonitor.service.d */
public class C48924d extends AbsMonitorService {

    /* renamed from: a */
    public static C48924d f122912a = new C48924d();

    /* renamed from: b */
    private C48919b f122913b;

    public C48924d() {
    }

    /* renamed from: a */
    public C48919b mo170860a() {
        return this.f122913b;
    }

    /* renamed from: b */
    public void mo170861b(C48919b bVar) {
        this.f122913b = bVar;
    }

    public C48924d(C48919b bVar) {
        this.f122913b = bVar;
    }

    /* renamed from: a */
    public static void m192744a(C48919b bVar) {
        f122912a.f122913b = bVar;
    }

    @Override // com.ss.android.lark.opmonitor.api.AbstractC48908f
    public void log(OPMonitor oPMonitor) {
        log(oPMonitor, this.f122913b);
    }

    @Override // com.ss.android.lark.opmonitor.api.AbstractC48908f
    public void flush(OPMonitor oPMonitor) {
        if (this.f122913b != null && oPMonitor.getLevel() != OPMonitorLevel.TRACE) {
            String eventName = getEventName(oPMonitor, this.f122913b);
            if (oPMonitor.getReportPlatform() == 0) {
                oPMonitor.reportPlatform(this.f122913b.mo170808b());
            }
            this.f122913b.mo170807a(eventName, oPMonitor.getMetrics(), oPMonitor.getCategories(), oPMonitor.getReportPlatform());
        }
    }
}
