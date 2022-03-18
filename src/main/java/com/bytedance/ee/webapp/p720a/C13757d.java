package com.bytedance.ee.webapp.p720a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.tt.miniapphost.p3371e.AbstractC67510c;

/* renamed from: com.bytedance.ee.webapp.a.d */
public class C13757d implements IMonitorCreator {

    /* renamed from: a */
    private IAppContext f35983a;

    public C13757d(IAppContext iAppContext) {
        this.f35983a = iAppContext;
    }

    /* renamed from: a */
    public AbstractC67510c createOPMonitor(String str, OPMonitorCode oPMonitorCode) {
        if (TextUtils.isEmpty(str)) {
            str = "op_monitor_event";
        }
        return C13755b.m55771a(str, oPMonitorCode, this.f35983a);
    }
}
