package com.bytedance.geckox.utils;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.geckox.utils.g */
public class ExecutorC14360g implements Executor {

    /* renamed from: a */
    private static volatile ExecutorC14360g f37725a;

    /* renamed from: b */
    private Executor f37726b = Executors.newSingleThreadExecutor(new ThreadFactory() {
        /* class com.bytedance.geckox.utils.ExecutorC14360g.ThreadFactoryC143611 */

        /* renamed from: a */
        public static Thread m57833a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread a = m57833a(new Thread(runnable));
            a.setName("gecko-io-thread");
            a.setPriority(3);
            return a;
        }
    });

    private ExecutorC14360g() {
    }

    /* renamed from: a */
    public static ExecutorC14360g m57832a() {
        if (f37725a == null) {
            synchronized (ExecutorC14360g.class) {
                if (f37725a == null) {
                    f37725a = new ExecutorC14360g();
                }
            }
        }
        return f37725a;
    }

    public void execute(Runnable runnable) {
        this.f37726b.execute(runnable);
    }
}
