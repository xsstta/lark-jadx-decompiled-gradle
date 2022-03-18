package com.bytedance.ee.util.common;

import android.os.Process;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.common.d */
public class C13606d {
    /* renamed from: a */
    public static void m55244a(Exception exc) {
        m55245a("ReportCrashUtils_DbCrash", exc);
    }

    /* renamed from: a */
    public static void m55245a(String str, Throwable th) {
        C13479a.m54762a("ReportCrashUtils_" + str, th, true);
    }

    /* renamed from: b */
    public static void m55246b(String str, Throwable th) {
        C13479a.m54762a("ReportCrashUtils_" + str, th, true);
        if (th instanceof NoClassDefFoundError) {
            C13479a.m54758a(str, "kill self");
            Process.killProcess(Process.myPid());
        }
    }
}
