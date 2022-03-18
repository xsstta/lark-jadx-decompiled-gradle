package com.bytedance.apm.p153n;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashSet;

/* renamed from: com.bytedance.apm.n.a */
public class C3046a {

    /* renamed from: a */
    private static HashSet<HandlerThread> f9812a = new HashSet<>();

    /* renamed from: b */
    private static volatile Handler f9813b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static Handler m12755a() {
        return f9813b;
    }
}
