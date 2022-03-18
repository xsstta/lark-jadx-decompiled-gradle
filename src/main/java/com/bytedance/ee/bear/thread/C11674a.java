package com.bytedance.ee.bear.thread;

import android.os.Process;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.thread.a */
public class C11674a {

    /* renamed from: com.bytedance.ee.bear.thread.a$c */
    public static class C11677c extends ThreadPoolExecutor {

        /* renamed from: a */
        private String f31456a;

        /* renamed from: b */
        private volatile String f31457b = "";

        /* renamed from: c */
        private volatile String f31458c = "";

        /* renamed from: a */
        public String mo44762a() {
            return this.f31458c;
        }

        /* renamed from: b */
        public String mo44764b() {
            return this.f31457b;
        }

        public String toString() {
            return "mExecutorName: " + this.f31456a + " " + super.toString();
        }

        public void shutdown() {
            if (TextUtils.isEmpty(this.f31457b)) {
                Throwable th = new Throwable("shutdown :" + System.currentTimeMillis());
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                this.f31457b = stringWriter.toString();
            }
            super.shutdown();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            if (TextUtils.isEmpty(this.f31458c)) {
                Throwable th = new Throwable("shutdownNow :" + System.currentTimeMillis());
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                this.f31458c = stringWriter.toString();
            }
            return super.shutdownNow();
        }

        public void execute(Runnable runnable) {
            super.execute(runnable);
        }

        /* access modifiers changed from: protected */
        public void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
        }

        /* access modifiers changed from: protected */
        public void beforeExecute(Thread thread, Runnable runnable) {
            super.beforeExecute(thread, runnable);
        }

        public C11677c(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
            super(i, i2, j, timeUnit, blockingQueue, threadFactory);
            this.f31456a = str;
        }
    }

    /* renamed from: com.bytedance.ee.bear.thread.a$a */
    private static class C11675a extends Thread {
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }

        C11675a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.thread.a$b */
    public static class ThreadFactoryC11676b implements ThreadFactory {

        /* renamed from: a */
        private String f31454a;

        /* renamed from: b */
        private int f31455b;

        ThreadFactoryC11676b(String str) {
            this.f31454a = str;
        }

        public Thread newThread(Runnable runnable) {
            return new C11675a(runnable, this.f31454a + "_" + this.f31455b);
        }
    }

    /* renamed from: a */
    public ExecutorService mo44757a(String str) {
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C11677c cVar = new C11677c("BEAR_CPU", availableProcessors, (availableProcessors * 2) + 1, 30, timeUnit, linkedBlockingQueue, new ThreadFactoryC11676b("BEAR_CPU_" + str));
        cVar.allowCoreThreadTimeOut(true);
        return cVar;
    }

    /* renamed from: b */
    public ExecutorService mo44758b(String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C11677c cVar = new C11677c("BEAR_NETWORK", 7, 15, 10, timeUnit, linkedBlockingQueue, new ThreadFactoryC11676b("BEAR_NETWORK_" + str));
        cVar.allowCoreThreadTimeOut(true);
        return cVar;
    }

    /* renamed from: c */
    public Executor mo44759c(String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        return new C11677c("BEAR_SINGLE", 1, 1, 30, timeUnit, linkedBlockingQueue, new ThreadFactoryC11676b("BEAR_SINGLE_" + str));
    }
}
