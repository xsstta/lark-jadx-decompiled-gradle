package com.ss.android.ugc.effectmanager.common.monitor;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/monitor/EPMonitor;", "", "()V", "traceBegin", "", "monitorTrace", "Lcom/ss/android/ugc/effectmanager/common/monitor/MonitorTrace;", "traceEnd", "traceStep", "step", "", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.e.a */
public final class EPMonitor {

    /* renamed from: a */
    public static final EPMonitor f151302a = new EPMonitor();

    private EPMonitor() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m235191a(MonitorTrace bVar) {
        if (bVar != null) {
            bVar.mo207204c();
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m235193b(MonitorTrace bVar) {
        if (bVar != null) {
            bVar.mo207205d();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m235192a(MonitorTrace bVar, String str) {
        if (str != null && bVar != null) {
            bVar.mo207202a(str);
        }
    }
}
