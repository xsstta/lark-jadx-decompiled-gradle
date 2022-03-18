package com.bytedance.geckox.utils;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.geckox.utils.k */
public class ExecutorC14365k implements Executor {

    /* renamed from: a */
    private static volatile ExecutorC14365k f37730a;

    /* renamed from: b */
    private Executor f37731b = Executors.newSingleThreadExecutor(new ThreadFactory() {
        /* class com.bytedance.geckox.utils.ExecutorC14365k.ThreadFactoryC143661 */

        /* renamed from: a */
        public static Thread m57841a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread a = m57841a(new Thread(runnable));
            a.setName("gecko-piecemeal-thread");
            return a;
        }
    });

    private ExecutorC14365k() {
    }

    /* renamed from: a */
    public static ExecutorC14365k m57840a() {
        if (f37730a == null) {
            synchronized (ExecutorC14365k.class) {
                if (f37730a == null) {
                    f37730a = new ExecutorC14365k();
                }
            }
        }
        return f37730a;
    }

    public void execute(Runnable runnable) {
        this.f37731b.execute(runnable);
    }
}
