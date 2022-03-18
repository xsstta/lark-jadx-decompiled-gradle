package com.bytedance.crash.runtime;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;

/* renamed from: com.bytedance.crash.runtime.o */
public class C3867o {

    /* renamed from: a */
    public static long f11856a = -1;

    /* renamed from: com.bytedance.crash.runtime.o$a */
    public static class C3868a {

        /* renamed from: a */
        private static long f11857a = -1;

        /* renamed from: b */
        static long m16020b() {
            return m16018a(100);
        }

        /* renamed from: a */
        public static long m16017a() {
            if (C3867o.f11856a == -1) {
                C3867o.f11856a = 1000 / m16020b();
            }
            return C3867o.f11856a;
        }

        /* renamed from: a */
        static long m16018a(long j) {
            long j2;
            long j3 = f11857a;
            if (j3 > 0) {
                return j3;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else if (Build.VERSION.SDK_INT >= 14) {
                j2 = m16019a("_SC_CLK_TCK", j);
            } else {
                j2 = j;
            }
            if (j2 > 0) {
                j = j2;
            }
            f11857a = j;
            return j;
        }

        /* renamed from: a */
        private static long m16019a(String str, long j) {
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
}
