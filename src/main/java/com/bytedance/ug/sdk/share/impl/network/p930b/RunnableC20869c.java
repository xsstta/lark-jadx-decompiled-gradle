package com.bytedance.ug.sdk.share.impl.network.p930b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ug.sdk.share.impl.network.b.c */
public class RunnableC20869c implements Runnable {

    /* renamed from: a */
    protected static final AtomicInteger f51069a = new AtomicInteger();

    /* renamed from: b */
    private static ExecutorService f51070b = C20865a.m75928a();

    /* renamed from: c */
    private static ExecutorService f51071c = C20865a.m75928a();

    /* renamed from: d */
    private Runnable f51072d;

    public void run() {
        Runnable runnable = this.f51072d;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static void m75930a(Runnable runnable) {
        if (runnable != null) {
            f51070b.submit(runnable);
        }
    }
}
