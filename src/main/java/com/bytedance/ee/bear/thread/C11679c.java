package com.bytedance.ee.bear.thread;

import com.larksuite.framework.thread.ThreadFactoryC26153m;
import io.reactivex.Scheduler;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bytedance.ee.bear.thread.c */
public class C11679c extends Scheduler {

    /* renamed from: c */
    static final ThreadFactoryC26153m f31463c = new ThreadFactoryC26153m("lark-rxjava-single");

    /* renamed from: d */
    static final ScheduledExecutorService f31464d;

    /* renamed from: a */
    final ThreadFactory f31465a;

    /* renamed from: b */
    final AtomicReference<ScheduledExecutorService> f31466b;

    /* renamed from: com.bytedance.ee.bear.thread.c$b */
    static final class C11681b extends Scheduler.AbstractC68257c {

        /* renamed from: a */
        final ScheduledExecutorService f31473a;

        /* renamed from: b */
        final C68289a f31474b = new C68289a();

        /* renamed from: c */
        volatile boolean f31475c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f31475c;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f31475c) {
                this.f31475c = true;
                this.f31474b.dispose();
            }
        }

        C11681b(ScheduledExecutorService scheduledExecutorService) {
            this.f31473a = scheduledExecutorService;
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo44779a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> future;
            if (this.f31475c) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), this.f31474b);
            this.f31474b.mo237937a(scheduledRunnable);
            if (j <= 0) {
                try {
                    future = this.f31473a.submit((Callable) scheduledRunnable);
                } catch (RejectedExecutionException e) {
                    dispose();
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.f31473a.schedule((Callable) scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(future);
            return scheduledRunnable;
        }
    }

    public C11679c() {
        this(f31463c);
    }

    /* renamed from: com.bytedance.ee.bear.thread.c$a */
    static class CallableC11680a implements Disposable, Callable<Void> {

        /* renamed from: f */
        static final FutureTask<Void> f31467f = new FutureTask<>(C68326a.f171640b, null);

        /* renamed from: a */
        final Runnable f31468a;

        /* renamed from: b */
        final AtomicReference<Future<?>> f31469b = new AtomicReference<>();

        /* renamed from: c */
        final AtomicReference<Future<?>> f31470c = new AtomicReference<>();

        /* renamed from: d */
        final ExecutorService f31471d;

        /* renamed from: e */
        Thread f31472e;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f31470c.get() == f31467f) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, java.lang.Thread] */
        /* renamed from: a */
        public Void call() throws Exception {
            Thread thread = 0;
            try {
                thread = Thread.currentThread();
                try {
                    this.f31468a.run();
                    mo44777b(this.f31471d.submit(this));
                } catch (Throwable th) {
                    RxJavaPlugins.onError(th);
                }
                this.f31472e = thread;
                return thread;
            } finally {
                this.f31472e = thread;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            boolean z;
            AtomicReference<Future<?>> atomicReference = this.f31470c;
            FutureTask<Void> futureTask = f31467f;
            Future<?> andSet = atomicReference.getAndSet(futureTask);
            boolean z2 = true;
            if (!(andSet == null || andSet == futureTask)) {
                if (this.f31472e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                andSet.cancel(z);
            }
            Future<?> andSet2 = this.f31469b.getAndSet(futureTask);
            if (andSet2 != null && andSet2 != futureTask) {
                if (this.f31472e == Thread.currentThread()) {
                    z2 = false;
                }
                andSet2.cancel(z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo44777b(Future<?> future) {
            Future<?> future2;
            boolean z;
            do {
                future2 = this.f31469b.get();
                if (future2 == f31467f) {
                    if (this.f31472e != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                }
            } while (!this.f31469b.compareAndSet(future2, future));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo44776a(Future<?> future) {
            Future<?> future2;
            boolean z;
            do {
                future2 = this.f31470c.get();
                if (future2 == f31467f) {
                    if (this.f31472e != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                }
            } while (!this.f31470c.compareAndSet(future2, future));
        }

        CallableC11680a(Runnable runnable, ExecutorService executorService) {
            this.f31468a = runnable;
            this.f31471d = executorService;
        }
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.AbstractC68257c createWorker() {
        return new C11681b(this.f31466b.get());
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f31464d = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        ScheduledExecutorService andSet;
        ScheduledExecutorService scheduledExecutorService = this.f31466b.get();
        ScheduledExecutorService scheduledExecutorService2 = f31464d;
        if (scheduledExecutorService != scheduledExecutorService2 && (andSet = this.f31466b.getAndSet(scheduledExecutorService2)) != scheduledExecutorService2) {
            andSet.shutdownNow();
        }
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f31466b.get();
            if (scheduledExecutorService != f31464d) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = m48483a(this.f31465a);
            }
        } while (!this.f31466b.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    /* renamed from: a */
    static ScheduledExecutorService m48483a(ThreadFactory threadFactory) {
        return Executors.newScheduledThreadPool(1, threadFactory);
    }

    public C11679c(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f31466b = atomicReference;
        this.f31465a = threadFactory;
        atomicReference.lazySet(m48483a(threadFactory));
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        if (j <= 0) {
            try {
                future = this.f31466b.get().submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.f31466b.get().schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    @Override // io.reactivex.Scheduler
    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> future;
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f31466b.get();
            CallableC11680a aVar = new CallableC11680a(onSchedule, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(aVar);
                } catch (RejectedExecutionException e) {
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(aVar, j, timeUnit);
            }
            aVar.mo44776a(future);
            return aVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
        try {
            scheduledDirectPeriodicTask.setFuture(this.f31466b.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.onError(e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
