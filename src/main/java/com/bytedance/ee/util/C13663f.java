package com.bytedance.ee.util;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.util.common.C13603a;

/* renamed from: com.bytedance.ee.util.f */
public class C13663f {

    /* renamed from: a */
    private static final Handler f35852a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static volatile C13603a f35853b;

    /* renamed from: a */
    private static void m55436a() {
        if (f35853b == null) {
            synchronized (C13603a.class) {
                if (f35853b == null) {
                    f35853b = new C13603a(f35852a);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m55437a(Runnable runnable) {
        m55436a();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f35853b.mo50545a(runnable);
        }
    }
}
