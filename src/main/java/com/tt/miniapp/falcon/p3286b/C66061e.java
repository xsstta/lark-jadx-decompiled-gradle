package com.tt.miniapp.falcon.p3286b;

import com.ss.android.lark.opmonitor.trace.OPTrace;

/* renamed from: com.tt.miniapp.falcon.b.e */
public class C66061e {

    /* renamed from: a */
    private OPTrace f166754a;

    /* renamed from: b */
    private boolean f166755b;

    /* renamed from: a */
    public OPTrace mo231160a() {
        return this.f166754a;
    }

    /* renamed from: b */
    public boolean mo231163b() {
        return this.f166755b;
    }

    /* renamed from: a */
    public void mo231161a(OPTrace oPTrace) {
        this.f166754a = oPTrace;
    }

    /* renamed from: a */
    public void mo231162a(boolean z) {
        this.f166755b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tt.miniapp.falcon.p3286b.C66061e m258686a(com.bytedance.ee.lark.infra.sandbox.context.IAppContext r3, java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L_0x0020
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0014
            com.ss.android.lark.opmonitor.trace.OPTrace r5 = com.ss.android.lark.opmonitor.trace.OPTrace.deserialize(r5, r4)
            com.ss.android.lark.opmonitor.trace.OPTrace r2 = r5.subTrace()
            goto L_0x0020
        L_0x0014:
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r6 = "get empty trace id from jssdk"
            r5[r1] = r6
            java.lang.String r6 = "OPTraceWrapper"
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r6, r5)
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r2 != 0) goto L_0x003e
            boolean r5 = com.tt.miniapphost.util.ProcessUtil.isMiniappProcess()
            if (r5 == 0) goto L_0x0036
            com.tt.miniapphost.AppbrandContext r3 = com.tt.miniapphost.AppbrandContext.getInst()
            com.ss.android.lark.opmonitor.trace.OPTrace r3 = r3.getTracing()
            com.ss.android.lark.opmonitor.trace.OPTrace r2 = r3.subTrace(r4)
            goto L_0x003e
        L_0x0036:
            com.ss.android.lark.opmonitor.trace.OPTrace r3 = r3.getTracingSpan()
            com.ss.android.lark.opmonitor.trace.OPTrace r2 = r3.subTrace(r4)
        L_0x003e:
            com.tt.miniapp.falcon.b.e r3 = new com.tt.miniapp.falcon.b.e
            r3.<init>()
            r3.mo231161a(r2)
            r3.mo231162a(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.falcon.p3286b.C66061e.m258686a(com.bytedance.ee.lark.infra.sandbox.context.IAppContext, java.lang.String, java.lang.String, boolean):com.tt.miniapp.falcon.b.e");
    }
}
