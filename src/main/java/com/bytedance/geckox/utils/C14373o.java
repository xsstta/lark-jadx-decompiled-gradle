package com.bytedance.geckox.utils;

import com.bytedance.geckox.policy.p777c.ExecutorC14302a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.geckox.utils.o */
public class C14373o {

    /* renamed from: c */
    private static C14373o f37735c;

    /* renamed from: a */
    private Executor f37736a;

    /* renamed from: b */
    private ExecutorC14302a f37737b;

    private C14373o() {
    }

    /* renamed from: c */
    public Executor mo52492c() {
        return Executors.newSingleThreadExecutor(new ThreadFactory() {
            /* class com.bytedance.geckox.utils.C14373o.ThreadFactoryC143752 */

            /* renamed from: a */
            public static Thread m57860a(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public Thread newThread(Runnable runnable) {
                Thread a = m57860a(new Thread(runnable));
                a.setName("gecko-check-update-thread");
                a.setPriority(3);
                return a;
            }
        });
    }

    /* renamed from: d */
    public ExecutorC14302a mo52493d() {
        if (this.f37737b == null) {
            this.f37737b = new ExecutorC14302a();
        }
        return this.f37737b;
    }

    /* renamed from: a */
    public static C14373o m57855a() {
        if (f37735c == null) {
            synchronized (C14373o.class) {
                if (f37735c == null) {
                    f37735c = new C14373o();
                }
            }
        }
        return f37735c;
    }

    /* renamed from: b */
    public Executor mo52491b() {
        if (this.f37736a == null) {
            this.f37736a = Executors.newSingleThreadExecutor(new ThreadFactory() {
                /* class com.bytedance.geckox.utils.C14373o.ThreadFactoryC143741 */

                /* renamed from: a */
                public static Thread m57859a(Thread thread) {
                    return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
                }

                public Thread newThread(Runnable runnable) {
                    Thread a = m57859a(new Thread(runnable));
                    a.setName("gecko-check-update-thread");
                    a.setPriority(3);
                    return a;
                }
            });
        }
        return this.f37736a;
    }
}
