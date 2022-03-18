package com.tt.miniapphost.p3371e.p3372a;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.tt.miniapphost.p3371e.AbstractC67514d;

/* renamed from: com.tt.miniapphost.e.a.a */
public class C67500a extends AbstractC67514d {

    /* renamed from: e */
    private static C48924d f170206e;

    /* renamed from: b */
    public static C48924d m262583b() {
        if (f170206e == null) {
            synchronized (C67500a.class) {
                if (f170206e == null) {
                    f170206e = m262592c();
                }
            }
        }
        return f170206e;
    }

    public C67500a(OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        super(m262583b(), oPMonitorCode, iAppContext);
    }

    public C67500a(String str, IAppContext iAppContext) {
        super(m262583b(), str, iAppContext);
    }

    public C67500a(String str, OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        super(m262583b(), str, oPMonitorCode, iAppContext);
    }
}
