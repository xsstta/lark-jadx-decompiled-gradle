package com.tt.miniapphost.p3362a.p3367e;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;

/* renamed from: com.tt.miniapphost.a.e.a */
public class C67455a {

    /* renamed from: a */
    public int f170058a;

    /* renamed from: b */
    public volatile boolean f170059b;

    /* renamed from: c */
    public String f170060c;

    /* renamed from: d */
    public OPTrace f170061d;

    public C67455a() {
        OPTrace a = OPTraceService.m192757a();
        this.f170061d = a;
        this.f170060c = a.getTracingID();
        Log.m165379d("AppContextTraceModel", "traceModel:" + this.f170060c);
    }

    /* renamed from: a */
    public void mo234195a(int i) {
        this.f170059b = true;
        this.f170058a = i;
    }
}
