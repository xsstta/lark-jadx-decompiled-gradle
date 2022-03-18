package androidx.p041h;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.h.a */
public final class C1091a {

    /* renamed from: a */
    private static long f4076a;

    /* renamed from: b */
    private static Method f4077b;

    /* renamed from: b */
    public static void m5200b() {
        if (Build.VERSION.SDK_INT >= 18) {
            C1092b.m5202a();
        }
    }

    /* renamed from: a */
    public static boolean m5199a() {
        try {
            if (f4077b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m5201c();
    }

    /* renamed from: c */
    private static boolean m5201c() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f4077b == null) {
                    f4076a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f4077b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f4077b.invoke(null, Long.valueOf(f4076a))).booleanValue();
            } catch (Exception e) {
                m5198a("isTagEnabled", e);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m5197a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C1092b.m5203a(str);
        }
    }

    /* renamed from: a */
    private static void m5198a(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }
}
