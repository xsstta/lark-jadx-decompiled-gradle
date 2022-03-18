package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.AbstractC68374a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.internal.schedulers.h */
public class C68946h extends Scheduler.AbstractC68257c implements Disposable {

    /* renamed from: a */
    volatile boolean f172922a;

    /* renamed from: b */
    private final ScheduledExecutorService f172923b;

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f172922a;
    }

    /* renamed from: b */
    public void mo238666b() {
        if (!this.f172922a) {
            this.f172922a = true;
            this.f172923b.shutdown();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (!this.f172922a) {
            this.f172922a = true;
            this.f172923b.shutdownNow();
        }
    }

    @Override // io.reactivex.Scheduler.AbstractC68257c
    /* renamed from: a */
    public Disposable mo237795a(Runnable runnable) {
        return mo44779a(runnable, 0, null);
    }

    public C68946h(ThreadFactory threadFactory) {
        this.f172923b = C68948j.m265517a(threadFactory);
    }

    @Override // io.reactivex.Scheduler.AbstractC68257c
    /* renamed from: a */
    public Disposable mo44779a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f172922a) {
            return EmptyDisposable.INSTANCE;
        }
        return mo238663a(runnable, j, timeUnit, (AbstractC68374a) null);
    }

    /* renamed from: b */
    public Disposable mo238665b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        if (j <= 0) {
            try {
                future = this.f172923b.submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.f172923b.schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    /* renamed from: a */
    public ScheduledRunnable mo238663a(Runnable runnable, long j, TimeUnit timeUnit, AbstractC68374a aVar) {
        Future<?> future;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), aVar);
        if (aVar != null && !aVar.mo237937a(scheduledRunnable)) {
            return scheduledRunnable;
        }
        if (j <= 0) {
            try {
                future = this.f172923b.submit((Callable) scheduledRunnable);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo237940b(scheduledRunnable);
                }
                RxJavaPlugins.onError(e);
            }
        } else {
            future = this.f172923b.schedule((Callable) scheduledRunnable, j, timeUnit);
        }
        scheduledRunnable.setFuture(future);
        return scheduledRunnable;
    }

    /* renamed from: b */
    public Disposable mo238664b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> future;
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (j2 <= 0) {
            CallableC68940e eVar = new CallableC68940e(onSchedule, this.f172923b);
            if (j <= 0) {
                try {
                    future = this.f172923b.submit(eVar);
                } catch (RejectedExecutionException e) {
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.f172923b.schedule(eVar, j, timeUnit);
            }
            eVar.mo238652a(future);
            return eVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
        try {
            scheduledDirectPeriodicTask.setFuture(this.f172923b.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.onError(e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
