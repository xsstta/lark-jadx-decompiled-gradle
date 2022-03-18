package com.tt.miniapphost;

import com.bytedance.ee.lark.infra.foundation.schedulers.Scheduler;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.optrace.p2413c.p2414a.RunnableC48935b;
import com.tt.miniapphost.data.ContextSingletonInstance;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tt.miniapphost.l */
public class C67554l implements Scheduler {

    /* renamed from: a */
    public AtomicInteger f170367a = new AtomicInteger();

    /* renamed from: b */
    private ThreadPoolExecutor f170368b;

    /* renamed from: a */
    public void mo234580a() {
        this.f170368b.setCorePoolSize(1);
    }

    /* renamed from: b */
    public static C67554l m262725b() {
        return ContextSingletonInstance.getInstance().getTmaScheduler();
    }

    public C67554l() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(true), new ThreadFactory() {
            /* class com.tt.miniapphost.C67554l.ThreadFactoryC675551 */

            /* renamed from: a */
            public static Thread m262727a(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public Thread newThread(Runnable runnable) {
                return m262727a(new Thread(runnable, "TmaThread-" + C67554l.this.f170367a.getAndIncrement()));
            }
        });
        this.f170368b = threadPoolExecutor;
        threadPoolExecutor.prestartAllCoreThreads();
    }

    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Scheduler
    public void execute(Runnable runnable) {
        this.f170368b.execute(new RunnableC48935b(runnable));
    }
}
