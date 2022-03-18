package com.bytedance.android.monitor.p112i;

import android.view.MotionEvent;

/* renamed from: com.bytedance.android.monitor.i.i */
public class C2660i {

    /* renamed from: a */
    private static long f8442a;

    /* renamed from: a */
    public static long m11188a() {
        if (f8442a == 0) {
            f8442a = System.currentTimeMillis();
        }
        return f8442a;
    }

    /* renamed from: a */
    public static void m11189a(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            f8442a = System.currentTimeMillis();
        }
    }
}
