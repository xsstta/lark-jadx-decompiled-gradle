package com.scwang.smartrefresh.layout.p1237d;

/* renamed from: com.scwang.smartrefresh.layout.d.a */
public class RunnableC27143a implements Runnable {

    /* renamed from: a */
    public long f67463a;

    /* renamed from: b */
    public Runnable f67464b;

    public void run() {
        try {
            Runnable runnable = this.f67464b;
            if (runnable != null) {
                runnable.run();
                this.f67464b = null;
            }
        } catch (Throwable unused) {
        }
    }

    public RunnableC27143a(Runnable runnable) {
        this.f67464b = runnable;
    }

    public RunnableC27143a(Runnable runnable, long j) {
        this.f67464b = runnable;
        this.f67463a = j;
    }
}
