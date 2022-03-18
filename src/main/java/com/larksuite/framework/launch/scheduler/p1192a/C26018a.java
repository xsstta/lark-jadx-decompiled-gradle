package com.larksuite.framework.launch.scheduler.p1192a;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.larksuite.framework.launch.scheduler.a.a */
public class C26018a {

    /* renamed from: a */
    private ExecutorService f64398a;

    /* renamed from: a */
    public ExecutorService mo92523a() {
        return this.f64398a;
    }

    /* renamed from: com.larksuite.framework.launch.scheduler.a.a$a */
    public static class C26019a {

        /* renamed from: a */
        private int f64399a;

        /* renamed from: b */
        private ThreadFactory f64400b;

        /* renamed from: c */
        private ExecutorService f64401c;

        /* renamed from: b */
        private int m94180b() {
            return Runtime.getRuntime().availableProcessors();
        }

        /* renamed from: c */
        private ThreadFactory m94181c() {
            final AtomicInteger atomicInteger = new AtomicInteger(1);
            return new ThreadFactory() {
                /* class com.larksuite.framework.launch.scheduler.p1192a.C26018a.C26019a.ThreadFactoryC260201 */

                /* renamed from: a */
                public static Thread m94184a(Thread thread) {
                    return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
                }

                public Thread newThread(Runnable runnable) {
                    return m94184a(new Thread(runnable, "LaunchThread#" + atomicInteger.getAndIncrement()));
                }
            };
        }

        /* renamed from: a */
        public C26018a mo92525a() {
            if (this.f64401c == null) {
                if (this.f64399a == 0) {
                    this.f64399a = m94180b();
                }
                if (this.f64400b == null) {
                    this.f64400b = m94181c();
                }
                this.f64401c = new ScheduledThreadPoolExecutor(this.f64399a, this.f64400b);
            }
            return new C26018a(this.f64401c);
        }

        /* renamed from: a */
        public C26019a mo92524a(ExecutorService executorService) {
            this.f64401c = executorService;
            return this;
        }
    }

    C26018a(ExecutorService executorService) {
        this.f64398a = executorService;
    }
}
