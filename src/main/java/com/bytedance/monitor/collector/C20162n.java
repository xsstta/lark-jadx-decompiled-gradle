package com.bytedance.monitor.collector;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;

/* renamed from: com.bytedance.monitor.collector.n */
public class C20162n {

    /* renamed from: a */
    private static long f49268a = -1;

    /* renamed from: b */
    private static long f49269b = -1;

    /* renamed from: b */
    public static long m73580b() {
        return m73578a(100);
    }

    /* renamed from: a */
    public static long m73577a() {
        if (f49269b == -1) {
            f49269b = 1000 / m73580b();
        }
        return f49269b;
    }

    /* renamed from: a */
    public static long m73578a(long j) {
        long j2;
        long j3 = f49268a;
        if (j3 > 0) {
            return j3;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
        } else if (Build.VERSION.SDK_INT >= 14) {
            j2 = m73579a("_SC_CLK_TCK", j);
        } else {
            j2 = j;
        }
        if (j2 > 0) {
            j = j2;
        }
        f49268a = j;
        return j;
    }

    /* renamed from: a */
    private static long m73579a(String str, long j) {
        try {
            int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.Os");
            Object obj = cls.getField("os").get(null);
            return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(obj, Integer.valueOf(i))).longValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return j;
        }
    }
}
