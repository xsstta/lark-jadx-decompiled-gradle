package com.bytedance.ee.util.p718t;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.util.common.C13603a;

/* renamed from: com.bytedance.ee.util.t.k */
public class C13748k {

    /* renamed from: a */
    private static final Handler f35941a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static volatile C13603a f35942b;

    /* renamed from: a */
    private static void m55731a() {
        if (f35942b == null) {
            synchronized (C13603a.class) {
                if (f35942b == null) {
                    f35942b = new C13603a(f35941a);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m55734b(Runnable runnable) {
        m55731a();
        f35942b.mo50545a(runnable);
    }

    /* renamed from: c */
    public static void m55735c(Runnable runnable) {
        Handler a;
        if (runnable != null && f35942b != null && (a = f35942b.mo50544a()) != null) {
            a.removeCallbacks(runnable);
        }
    }

    /* renamed from: a */
    public static void m55732a(Runnable runnable) {
        m55731a();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f35942b.mo50545a(runnable);
        }
    }

    /* renamed from: a */
    public static void m55733a(Runnable runnable, long j) {
        m55731a();
        f35942b.mo50546a(runnable, j);
    }
}
