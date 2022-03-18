package com.bytedance.crash.runtime;

import android.os.HandlerThread;

/* renamed from: com.bytedance.crash.runtime.n */
public class C3866n {

    /* renamed from: a */
    private static volatile C3879s f11855a;

    /* renamed from: b */
    public static C3879s m16016b() {
        if (f11855a == null) {
            m16015a();
        }
        return f11855a;
    }

    /* renamed from: a */
    public static HandlerThread m16015a() {
        if (f11855a == null) {
            synchronized (C3866n.class) {
                if (f11855a == null) {
                    f11855a = new C3879s("default_npth_thread");
                    f11855a.mo15510b();
                }
            }
        }
        return f11855a.mo15512c();
    }
}
