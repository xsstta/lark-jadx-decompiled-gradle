package com.tt.refer.common.p3417c;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p627b.C12822a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.optrace.api.TracingCoreSpan;

/* renamed from: com.tt.refer.common.c.b */
public class C67750b {
    /* renamed from: a */
    public static void m263609a(IAppContext iAppContext, TracingCoreSpan tracingCoreSpan, String str) {
        OPMonitor oPMonitor;
        if (iAppContext == null) {
            oPMonitor = new OPMonitor(C12822a.f34245a);
        } else {
            oPMonitor = OPMonitorUtils.getOpMonitor(iAppContext, (String) null, C12822a.f34245a);
        }
        if (oPMonitor == null) {
            AppBrandLogger.m52829e("ECONetworkMonitorHelper", "get network  request will start opmonitor null");
            return;
        }
        oPMonitor.addCategoryValue("name", str);
        if (tracingCoreSpan != null) {
            oPMonitor.tracing(tracingCoreSpan.getTracingID());
        }
        oPMonitor.flush();
    }

    /* renamed from: a */
    public static void m263610a(boolean z, int i, String str, IAppContext iAppContext, TracingCoreSpan tracingCoreSpan, String str2) {
        OPMonitor oPMonitor;
        if (iAppContext == null) {
            oPMonitor = new OPMonitor(C12822a.f34248d);
        } else {
            oPMonitor = OPMonitorUtils.getOpMonitor(iAppContext, (String) null, C12822a.f34248d);
        }
        if (oPMonitor == null) {
            AppBrandLogger.m52829e("ECONetworkMonitorHelper", "get network request will end opmonitor null");
            return;
        }
        oPMonitor.addCategoryValue("name", str2).addCategoryValue("http_code", Integer.valueOf(i)).setErrorMessage(str);
        if (z) {
            oPMonitor.setResultTypeSuccess();
        } else {
            oPMonitor.setResultTypeFail();
        }
        if (tracingCoreSpan != null) {
            oPMonitor.tracing(tracingCoreSpan.getTracingID());
        }
        oPMonitor.flush();
    }
}
