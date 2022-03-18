package com.bytedance.ee.bear.photopicker.photo.p521b;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.b.d */
public class C10530d {

    /* renamed from: a */
    private static final Handler f28266a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m43611a(Runnable runnable) {
        f28266a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m43612a(Runnable runnable, long j) {
        f28266a.postDelayed(runnable, j);
    }
}
