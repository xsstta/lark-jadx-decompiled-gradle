package com.ss.android.ugc.effectmanager.common;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.effectmanager.common.f */
public class ThreadFactoryC60514f implements ThreadFactory {

    /* renamed from: a */
    private String f151308a;

    /* renamed from: b */
    private AtomicInteger f151309b = new AtomicInteger();

    /* renamed from: c */
    private boolean f151310c;

    /* renamed from: a */
    public static Thread m235199a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f151309b.incrementAndGet();
        Thread a = m235199a(new Thread(runnable, this.f151308a + "-" + incrementAndGet));
        if (!this.f151310c) {
            if (a.isDaemon()) {
                a.setDaemon(false);
            }
            if (a.getPriority() != 5) {
                a.setPriority(5);
            }
        }
        return a;
    }

    public ThreadFactoryC60514f(String str, boolean z) {
        this.f151308a = str;
        this.f151310c = z;
    }
}
