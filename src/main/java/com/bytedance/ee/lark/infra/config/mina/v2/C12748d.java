package com.bytedance.ee.lark.infra.config.mina.v2;

import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40639f;

/* renamed from: com.bytedance.ee.lark.infra.config.mina.v2.d */
public class C12748d {
    /* renamed from: a */
    public static void m52749a(String str) {
        new OPMonitor(C40639f.f103071a).addCategoryValue("config_key", str).addCategoryValue("config_ts", Long.valueOf(C12745c.m52737a().mo48257e())).tracing(C12745c.m52737a().mo48255c()).flush();
    }

    /* renamed from: a */
    public static void m52750a(boolean z, String str, String str2, int i, long j) {
        OPMonitor oPMonitor = new OPMonitor(C40639f.f103073c);
        if (z) {
            oPMonitor.setResultTypeSuccess();
        } else {
            oPMonitor.setResultTypeFail().setErrorCode(str).setErrorMessage(str2);
        }
        oPMonitor.addCategoryValue("key_count", Integer.valueOf(i)).setDuration(j).tracing(C12745c.m52737a().mo48255c()).flush();
    }
}
