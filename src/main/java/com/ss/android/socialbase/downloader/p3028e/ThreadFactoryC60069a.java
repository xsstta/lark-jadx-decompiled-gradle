package com.ss.android.socialbase.downloader.p3028e;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.socialbase.downloader.e.a */
public class ThreadFactoryC60069a implements ThreadFactory {

    /* renamed from: a */
    private final String f149815a;

    /* renamed from: b */
    private final AtomicInteger f149816b = new AtomicInteger();

    /* renamed from: c */
    private final boolean f149817c;

    /* renamed from: a */
    public static Thread m233220a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f149816b.incrementAndGet();
        Thread a = m233220a(new Thread(runnable, this.f149815a + "-" + incrementAndGet));
        if (!this.f149817c) {
            if (a.isDaemon()) {
                a.setDaemon(false);
            }
            if (a.getPriority() != 5) {
                a.setPriority(5);
            }
        }
        return a;
    }

    public ThreadFactoryC60069a(String str, boolean z) {
        this.f149815a = str;
        this.f149817c = z;
    }
}
