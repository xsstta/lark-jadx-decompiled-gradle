package com.bumptech.glide.load.engine.p089c;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.load.engine.c.a */
public final class ExecutorServiceC2328a implements ExecutorService {

    /* renamed from: a */
    private static final long f7720a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static volatile int f7721b;

    /* renamed from: c */
    private final ExecutorService f7722c;

    public boolean isShutdown() {
        return this.f7722c.isShutdown();
    }

    public boolean isTerminated() {
        return this.f7722c.isTerminated();
    }

    public void shutdown() {
        this.f7722c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f7722c.shutdownNow();
    }

    public String toString() {
        return this.f7722c.toString();
    }

    /* renamed from: b */
    public static ExecutorServiceC2328a m9914b() {
        return m9913a().mo10777a();
    }

    /* renamed from: d */
    public static ExecutorServiceC2328a m9916d() {
        return m9915c().mo10777a();
    }

    /* renamed from: g */
    public static ExecutorServiceC2328a m9919g() {
        return m9918f().mo10777a();
    }

    /* renamed from: com.bumptech.glide.load.engine.c.a$c */
    public interface AbstractC2332c {

        /* renamed from: a */
        public static final AbstractC2332c f7734a = new AbstractC2332c() {
            /* class com.bumptech.glide.load.engine.p089c.ExecutorServiceC2328a.AbstractC2332c.C23331 */

            @Override // com.bumptech.glide.load.engine.p089c.ExecutorServiceC2328a.AbstractC2332c
            /* renamed from: a */
            public void mo10780a(Throwable th) {
            }
        };

        /* renamed from: b */
        public static final AbstractC2332c f7735b;

        /* renamed from: c */
        public static final AbstractC2332c f7736c = new AbstractC2332c() {
            /* class com.bumptech.glide.load.engine.p089c.ExecutorServiceC2328a.AbstractC2332c.C23353 */

            @Override // com.bumptech.glide.load.engine.p089c.ExecutorServiceC2328a.AbstractC2332c
            /* renamed from: a */
            public void mo10780a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        };

        /* renamed from: d */
        public static final AbstractC2332c f7737d;

        /* renamed from: a */
        void mo10780a(Throwable th);

        static {
            C23342 r0 = new AbstractC2332c() {
                /* class com.bumptech.glide.load.engine.p089c.ExecutorServiceC2328a.AbstractC2332c.C23342 */

                @Override // com.bumptech.glide.load.engine.p089c.ExecutorServiceC2328a.AbstractC2332c
                /* renamed from: a */
                public void mo10780a(Throwable th) {
                    if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            };
            f7735b = r0;
            f7737d = r0;
        }
    }

    /* renamed from: a */
    public static C2329a m9913a() {
        return new C2329a(true).mo10775a(1).mo10776a("disk-cache");
    }

    /* renamed from: c */
    public static C2329a m9915c() {
        return new C2329a(false).mo10775a(m9920h()).mo10776a(ShareHitPoint.f121868c);
    }

    /* renamed from: f */
    public static C2329a m9918f() {
        int i;
        if (m9920h() >= 4) {
            i = 2;
        } else {
            i = 1;
        }
        return new C2329a(true).mo10775a(i).mo10776a("animation");
    }

    /* renamed from: h */
    public static int m9920h() {
        if (f7721b == 0) {
            f7721b = Math.min(4, C2336b.m9929a());
        }
        return f7721b;
    }

    /* renamed from: e */
    public static ExecutorServiceC2328a m9917e() {
        return new ExecutorServiceC2328a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f7720a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC2330b("source-unlimited", AbstractC2332c.f7737d, false)));
    }

    /* renamed from: com.bumptech.glide.load.engine.c.a$a */
    public static final class C2329a {

        /* renamed from: a */
        private final boolean f7723a;

        /* renamed from: b */
        private int f7724b;

        /* renamed from: c */
        private int f7725c;

        /* renamed from: d */
        private AbstractC2332c f7726d = AbstractC2332c.f7737d;

        /* renamed from: e */
        private String f7727e;

        /* renamed from: f */
        private long f7728f;

        /* renamed from: a */
        public ExecutorServiceC2328a mo10777a() {
            if (!TextUtils.isEmpty(this.f7727e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f7724b, this.f7725c, this.f7728f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC2330b(this.f7727e, this.f7726d, this.f7723a));
                if (this.f7728f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new ExecutorServiceC2328a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f7727e);
        }

        /* renamed from: a */
        public C2329a mo10776a(String str) {
            this.f7727e = str;
            return this;
        }

        /* renamed from: a */
        public C2329a mo10775a(int i) {
            this.f7724b = i;
            this.f7725c = i;
            return this;
        }

        C2329a(boolean z) {
            this.f7723a = z;
        }
    }

    ExecutorServiceC2328a(ExecutorService executorService) {
        this.f7722c = executorService;
    }

    public void execute(Runnable runnable) {
        this.f7722c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f7722c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f7722c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f7722c.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f7722c.submit(callable);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.c.a$b */
    public static final class ThreadFactoryC2330b implements ThreadFactory {

        /* renamed from: a */
        final AbstractC2332c f7729a;

        /* renamed from: b */
        final boolean f7730b;

        /* renamed from: c */
        private final String f7731c;

        /* renamed from: d */
        private int f7732d;

        /* renamed from: a */
        public static Thread m9924a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread a;
            a = m9924a(new Thread(runnable, "glide-" + this.f7731c + "-thread-" + this.f7732d) {
                /* class com.bumptech.glide.load.engine.p089c.ExecutorServiceC2328a.ThreadFactoryC2330b.C23311 */

                public void run() {
                    Process.setThreadPriority(9);
                    if (ThreadFactoryC2330b.this.f7730b) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        super.run();
                    } catch (Throwable th) {
                        ThreadFactoryC2330b.this.f7729a.mo10780a(th);
                    }
                }
            });
            this.f7732d = this.f7732d + 1;
            return a;
        }

        ThreadFactoryC2330b(String str, AbstractC2332c cVar, boolean z) {
            this.f7731c = str;
            this.f7729a = cVar;
            this.f7730b = z;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f7722c.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f7722c.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f7722c.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f7722c.invokeAny(collection, j, timeUnit);
    }
}
