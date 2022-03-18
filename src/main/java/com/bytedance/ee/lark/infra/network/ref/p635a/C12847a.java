package com.bytedance.ee.lark.infra.network.ref.p635a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.network.p627b.C12822a;
import com.bytedance.ee.lark.infra.network.p633e.C12834a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.a.a */
public class C12847a {
    /* renamed from: a */
    public static void m53052a(C12878e eVar) {
        OPTrace b;
        OPMonitor oPMonitor = new OPMonitor(C12822a.f34245a);
        if (!(eVar == null || (b = eVar.mo48553b()) == null)) {
            oPMonitor.tracing(b);
            oPMonitor.addCategoryValue("request_id", b.getRequestId());
        }
        oPMonitor.flush();
    }

    /* renamed from: a */
    public static void m53056a(String str, boolean z) {
        new OPMonitor(C12822a.f34249e).addCategoryValue("network_channel", str).addCategoryValue("rust_init", Boolean.valueOf(z)).flush();
    }

    /* renamed from: a */
    public static void m53053a(C12878e eVar, String str, String str2) {
        m53051a(new OPMonitor(C12822a.f34246b), eVar, str, str2).flush();
    }

    /* renamed from: a */
    public static OPMonitor m53051a(OPMonitor oPMonitor, C12878e eVar, String str, String str2) {
        OPTrace b;
        if (!TextUtils.isEmpty(str)) {
            oPMonitor.addCategoryValue("url", C12834a.m53000a(str));
        }
        if (!(eVar == null || (b = eVar.mo48553b()) == null)) {
            oPMonitor.tracing(b);
            oPMonitor.addCategoryValue("request_id", b.getRequestId());
        }
        oPMonitor.addCategoryValue("network_execute_type", str2);
        return oPMonitor;
    }

    /* renamed from: a */
    public static void m53055a(C12878e eVar, String str, boolean z, String str2, String str3) {
        OPMonitor errorMessage = new OPMonitor(C12822a.f34248d).setErrorMessage(str2);
        if (z) {
            errorMessage.setResultTypeSuccess();
        } else {
            errorMessage.setResultTypeFail();
        }
        errorMessage.addCategoryValue("network_service_task_id", str);
        m53051a(errorMessage, eVar, "", str3).flush();
    }

    /* renamed from: a */
    public static void m53054a(C12878e eVar, String str, boolean z, String str2, int i, String str3, String str4) {
        OPMonitor oPMonitor = new OPMonitor(C12822a.f34247c);
        oPMonitor.addCategoryValue("http_code", Integer.valueOf(i)).addCategoryValue("rust_task_id", str4).setErrorMessage(str3);
        if (z) {
            oPMonitor.setResultTypeSuccess();
        } else {
            oPMonitor.setResultTypeFail();
        }
        m53051a(oPMonitor, eVar, str2, str).flush();
    }
}
