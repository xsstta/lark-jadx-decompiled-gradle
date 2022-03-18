package com.facebook.battery.metrics.cpu;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import com.facebook.battery.metrics.core.C20998c;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.facebook.battery.metrics.cpu.b */
class C21003b {
    /* renamed from: a */
    private static void m76519a(Exception exc) {
        C20998c.m76505a("Sysconf", "Unable to read _SC_CLK_TCK by reflection", exc);
    }

    /* renamed from: a */
    public static long m76517a(long j) {
        long j2;
        if (Build.VERSION.SDK_INT >= 21) {
            j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
        } else if (Build.VERSION.SDK_INT >= 14) {
            j2 = m76518a("_SC_CLK_TCK", j);
        } else {
            j2 = j;
        }
        return j2 > 0 ? j2 : j;
    }

    /* renamed from: a */
    private static long m76518a(String str, long j) {
        try {
            int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.Os");
            Object obj = cls.getField("os").get(null);
            return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(obj, Integer.valueOf(i))).longValue();
        } catch (NoSuchMethodException e) {
            m76519a(e);
            return j;
        } catch (NoSuchFieldException e2) {
            m76519a(e2);
            return j;
        } catch (IllegalAccessException e3) {
            m76519a(e3);
            return j;
        } catch (InvocationTargetException e4) {
            m76519a(e4);
            return j;
        } catch (ClassNotFoundException e5) {
            m76519a(e5);
            return j;
        }
    }
}
