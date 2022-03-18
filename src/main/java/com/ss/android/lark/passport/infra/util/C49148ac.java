package com.ss.android.lark.passport.infra.util;

import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.thread.CoreThreadPool;

/* renamed from: com.ss.android.lark.passport.infra.util.ac */
public class C49148ac {

    /* renamed from: a */
    private static final Handler f123422a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m193806a(Runnable runnable) {
        m193807a(runnable, 0);
    }

    /* renamed from: b */
    public static void m193808b(Runnable runnable) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(runnable);
    }

    /* renamed from: a */
    public static void m193807a(Runnable runnable, long j) {
        if (Looper.getMainLooper() == Looper.myLooper() && j == 0) {
            runnable.run();
        } else {
            f123422a.postDelayed(runnable, j);
        }
    }
}
