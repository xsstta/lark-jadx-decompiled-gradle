package com.bytedance.geckox.policy.p777c;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.geckox.policy.c.a */
public class ExecutorC14302a implements Executor {

    /* renamed from: a */
    private ExecutorService f37581a = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, this.f37582b.mo52348a(), new ThreadFactory() {
        /* class com.bytedance.geckox.policy.p777c.ExecutorC14302a.ThreadFactoryC143031 */

        /* renamed from: a */
        public static Thread m57678a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread a = m57678a(new Thread(runnable));
            a.setName("gecko-update-thread");
            a.setPriority(3);
            return a;
        }
    });

    /* renamed from: b */
    private C14304b f37582b = new C14304b();

    public void execute(Runnable runnable) {
        this.f37581a.execute(runnable);
    }
}
