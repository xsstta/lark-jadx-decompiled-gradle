package com.bytedance.ee.plugin.common.log;

public final class PluginLog {
    private static volatile ILog sLog = new DefaultLog();

    /* renamed from: d */
    public static void m54788d(String str) {
        sLog.mo28176d(str);
    }

    /* renamed from: e */
    public static void m54789e(String str) {
        sLog.mo28177e(str);
    }

    /* renamed from: i */
    public static void m54791i(String str) {
        sLog.mo28179i(str);
    }

    public static void installLog(ILog iLog) {
        if (iLog != null) {
            sLog = iLog;
        }
    }

    /* renamed from: e */
    public static void m54790e(Throwable th) {
        sLog.mo28178e(th);
    }
}
