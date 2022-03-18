package com.ss.android.lark.opmonitor.trace;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/opmonitor/trace/OPTraceService;", "", "()V", "opTrace", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "opTrace$annotations", "generateTrace", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.opmonitor.trace.b */
public final class OPTraceService {

    /* renamed from: a */
    public static final OPTraceService f122916a = new OPTraceService();

    /* renamed from: b */
    private static final OPTrace f122917b = new OPTrace();

    private OPTraceService() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final OPTrace m192757a() {
        return f122917b.subTrace();
    }
}
