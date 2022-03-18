package com.larksuite.framework.apiplugin.p1177c;

import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.optrace.api.ILogger;

/* renamed from: com.larksuite.framework.apiplugin.c.b */
public class C25918b implements AbstractC25895f {

    /* renamed from: a */
    private OPTrace f64208a;

    /* renamed from: b */
    private C25919a f64209b;

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25895f
    /* renamed from: a */
    public OPTrace mo92188a() {
        return this.f64208a;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25895f
    /* renamed from: b */
    public ILogger mo92190b() {
        return this.f64209b;
    }

    public C25918b() {
        this(null);
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25895f
    /* renamed from: a */
    public void mo92189a(OPMonitor oPMonitor) {
        oPMonitor.flush(this.f64208a);
    }

    /* renamed from: com.larksuite.framework.apiplugin.c.b$a */
    public static class C25919a implements ILogger {

        /* renamed from: a */
        private final String f64210a = "OpenAPI_";

        /* renamed from: b */
        private OPTrace f64211b;

        public C25919a(OPTrace oPTrace) {
            this.f64211b = oPTrace;
        }

        @Override // com.ss.android.lark.optrace.api.ILogger
        /* renamed from: d */
        public void mo92222d(String str, Object... objArr) {
            OPTrace oPTrace = this.f64211b;
            oPTrace.mo92222d("OpenAPI_" + str, objArr);
        }

        @Override // com.ss.android.lark.optrace.api.ILogger
        /* renamed from: e */
        public void mo92223e(String str, Object... objArr) {
            OPTrace oPTrace = this.f64211b;
            oPTrace.mo92223e("OpenAPI_" + str, objArr);
        }

        @Override // com.ss.android.lark.optrace.api.ILogger
        /* renamed from: i */
        public void mo92224i(String str, Object... objArr) {
            OPTrace oPTrace = this.f64211b;
            oPTrace.mo92224i("OpenAPI_" + str, objArr);
        }

        @Override // com.ss.android.lark.optrace.api.ILogger
        /* renamed from: w */
        public void mo92225w(String str, Object... objArr) {
            OPTrace oPTrace = this.f64211b;
            oPTrace.mo92225w("OpenAPI_" + str, objArr);
        }
    }

    public C25918b(OPTrace oPTrace) {
        this.f64208a = oPTrace;
        if (oPTrace == null) {
            this.f64208a = OPTraceService.m192757a().subTrace();
            Log.m165383e("LKEventContextImpl", "opTrace is null");
        }
        if (this.f64209b == null) {
            this.f64209b = new C25919a(this.f64208a);
        }
    }
}
