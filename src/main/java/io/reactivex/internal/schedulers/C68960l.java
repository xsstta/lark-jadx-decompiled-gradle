package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.l */
public final class C68960l extends Scheduler {

    /* renamed from: c */
    static final RxThreadFactory f172943c = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: d */
    static final ScheduledExecutorService f172944d;

    /* renamed from: a */
    final ThreadFactory f172945a;

    /* renamed from: b */
    final AtomicReference<ScheduledExecutorService> f172946b;

    /* renamed from: io.reactivex.internal.schedulers.l$a */
    static final class C68961a extends Scheduler.AbstractC68257c {

        /* renamed from: a */
        final ScheduledExecutorService f172947a;

        /* renamed from: b */
        final C68289a f172948b = new C68289a();

        /* renamed from: c */
        volatile boolean f172949c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172949c;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f172949c) {
                this.f172949c = true;
                this.f172948b.dispose();
            }
        }

        C68961a(ScheduledExecutorService scheduledExecutorService) {
            this.f172947a = scheduledExecutorService;
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo44779a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> future;
            if (this.f172949c) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), this.f172948b);
            this.f172948b.mo237937a(scheduledRunnable);
            if (j <= 0) {
                try {
                    future = this.f172947a.submit((Callable) scheduledRunnable);
                } catch (RejectedExecutionException e) {
                    dispose();
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.f172947a.schedule((Callable) scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(future);
            return scheduledRunnable;
        }
    }

    public C68960l() {
        this(f172943c);
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.AbstractC68257c createWorker() {
        return new C68961a(this.f172946b.get());
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        ScheduledExecutorService andSet;
        ScheduledExecutorService scheduledExecutorService = this.f172946b.get();
        ScheduledExecutorService scheduledExecutorService2 = f172944d;
        if (scheduledExecutorService != scheduledExecutorService2 && (andSet = this.f172946b.getAndSet(scheduledExecutorService2)) != scheduledExecutorService2) {
            andSet.shutdownNow();
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f172944d = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f172946b.get();
            if (scheduledExecutorService != f172944d) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = m265526a(this.f172945a);
            }
        } while (!this.f172946b.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    /* renamed from: a */
    static ScheduledExecutorService m265526a(ThreadFactory threadFactory) {
        return C68948j.m265517a(threadFactory);
    }

    public C68960l(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f172946b = atomicReference;
        this.f172945a = threadFactory;
        atomicReference.lazySet(m265526a(threadFactory));
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        if (j <= 0) {
            try {
                future = this.f172946b.get().submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.f172946b.get().schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    @Override // io.reactivex.Scheduler
    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> future;
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f172946b.get();
            CallableC68940e eVar = new CallableC68940e(onSchedule, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(eVar);
                } catch (RejectedExecutionException e) {
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(eVar, j, timeUnit);
            }
            eVar.mo238652a(future);
            return eVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
        try {
            scheduledDirectPeriodicTask.setFuture(this.f172946b.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.onError(e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
