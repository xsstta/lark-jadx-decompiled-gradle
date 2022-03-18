package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.os.i */
public final class C0804i {

    /* renamed from: a */
    private static long f3212a;

    /* renamed from: b */
    private static Method f3213b;

    /* renamed from: c */
    private static Method f3214c;

    /* renamed from: d */
    private static Method f3215d;

    /* renamed from: e */
    private static Method f3216e;

    /* renamed from: a */
    public static void m3895a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT < 29) {
            try {
                f3212a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3213b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                f3214c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                f3215d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                f3216e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m3896a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
