package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.concurrent.c */
final class RunnableC21809c implements Runnable {

    /* renamed from: a */
    private final Runnable f53209a;

    /* renamed from: b */
    private final int f53210b;

    public RunnableC21809c(Runnable runnable, int i) {
        this.f53209a = runnable;
        this.f53210b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f53210b);
        this.f53209a.run();
    }
}
