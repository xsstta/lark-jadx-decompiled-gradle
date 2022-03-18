package com.ss.android.ad.splash.core.p1251f;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ss.android.ad.splash.core.f.a */
public class C27302a {

    /* renamed from: a */
    private static volatile C27302a f68073a;

    /* renamed from: b */
    private volatile ExecutorService f68074b;

    /* renamed from: a */
    public static C27302a m99297a() {
        if (f68073a == null) {
            synchronized (C27302a.class) {
                if (f68073a == null) {
                    f68073a = new C27302a();
                }
            }
        }
        return f68073a;
    }

    /* renamed from: a */
    public void mo97333a(ExecutorService executorService) {
        if (executorService != null) {
            this.f68074b = executorService;
        }
    }

    /* renamed from: a */
    public void mo97332a(Runnable runnable) {
        if (this.f68074b == null) {
            this.f68074b = Executors.newFixedThreadPool(2);
        }
        this.f68074b.submit(runnable);
    }
}
