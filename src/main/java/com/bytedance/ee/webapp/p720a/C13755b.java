package com.bytedance.ee.webapp.p720a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.tt.miniapphost.p3371e.AbstractC67510c;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.webapp.a.b */
public class C13755b extends AbstractC67510c {

    /* renamed from: b */
    private static final C48924d f35958b = m262592c();

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.p3371e.AbstractC67510c
    /* renamed from: a */
    public HashMap<String, Object> mo50294a() {
        HashMap<String, Object> a = super.mo50294a();
        if (a != null) {
            String traceId = this.f170259a.getTraceId();
            if (!TextUtils.isEmpty(traceId)) {
                a.put("trace_id", traceId);
            }
        }
        return a;
    }

    private C13755b(OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        super(f35958b, oPMonitorCode, iAppContext);
    }

    /* renamed from: a */
    public static C13755b m55770a(OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        return new C13755b(oPMonitorCode, iAppContext);
    }

    private C13755b(String str, OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        super(f35958b, str, oPMonitorCode, iAppContext);
    }

    /* renamed from: a */
    public static C13755b m55771a(String str, OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        return new C13755b(str, oPMonitorCode, iAppContext);
    }
}
