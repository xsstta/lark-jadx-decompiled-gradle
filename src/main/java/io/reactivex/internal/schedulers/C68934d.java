package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.queue.C68924a;
import io.reactivex.p3456d.C68279a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.d */
public final class C68934d extends Scheduler {

    /* renamed from: b */
    static final Scheduler f172883b = C68279a.m265025d();

    /* renamed from: a */
    final Executor f172884a;

    /* renamed from: io.reactivex.internal.schedulers.d$c */
    public static final class RunnableC68937c extends Scheduler.AbstractC68257c implements Runnable {

        /* renamed from: a */
        final Executor f172887a;

        /* renamed from: b */
        final C68924a<Runnable> f172888b;

        /* renamed from: c */
        volatile boolean f172889c;

        /* renamed from: d */
        final AtomicInteger f172890d = new AtomicInteger();

        /* renamed from: e */
        final C68289a f172891e = new C68289a();

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172889c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.schedulers.d$c$a */
        public static final class RunnableC68938a extends AtomicBoolean implements Disposable, Runnable {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return get();
            }

            public void run() {
                if (!get()) {
                    try {
                        this.actual.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }

            RunnableC68938a(Runnable runnable) {
                this.actual = runnable;
            }
        }

        /* renamed from: io.reactivex.internal.schedulers.d$c$b */
        final class RunnableC68939b implements Runnable {

            /* renamed from: b */
            private final SequentialDisposable f172893b;

            /* renamed from: c */
            private final Runnable f172894c;

            public void run() {
                this.f172893b.replace(RunnableC68937c.this.mo237795a(this.f172894c));
            }

            RunnableC68939b(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.f172893b = sequentialDisposable;
                this.f172894c = runnable;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f172889c) {
                this.f172889c = true;
                this.f172891e.dispose();
                if (this.f172890d.getAndIncrement() == 0) {
                    this.f172888b.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            r1 = r3.f172890d.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r3.f172889c == false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0.clear();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                io.reactivex.internal.queue.a<java.lang.Runnable> r0 = r3.f172888b
                r1 = 1
            L_0x0003:
                boolean r2 = r3.f172889c
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L_0x0025
                boolean r2 = r3.f172889c
                if (r2 == 0) goto L_0x001b
                r0.clear()
                return
            L_0x001b:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f172890d
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            L_0x0025:
                r2.run()
                boolean r2 = r3.f172889c
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.schedulers.C68934d.RunnableC68937c.run():void");
        }

        public RunnableC68937c(Executor executor) {
            this.f172887a = executor;
            this.f172888b = new C68924a<>();
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo237795a(Runnable runnable) {
            if (this.f172889c) {
                return EmptyDisposable.INSTANCE;
            }
            RunnableC68938a aVar = new RunnableC68938a(RxJavaPlugins.onSchedule(runnable));
            this.f172888b.offer(aVar);
            if (this.f172890d.getAndIncrement() == 0) {
                try {
                    this.f172887a.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f172889c = true;
                    this.f172888b.clear();
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo44779a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo237795a(runnable);
            }
            if (this.f172889c) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new RunnableC68939b(sequentialDisposable2, RxJavaPlugins.onSchedule(runnable)), this.f172891e);
            this.f172891e.mo237937a(scheduledRunnable);
            Executor executor = this.f172887a;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f172889c = true;
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new FutureC68933c(C68934d.f172883b.scheduleDirect(scheduledRunnable, j, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.AbstractC68257c createWorker() {
        return new RunnableC68937c(this.f172884a);
    }

    /* renamed from: io.reactivex.internal.schedulers.d$a */
    final class RunnableC68935a implements Runnable {

        /* renamed from: b */
        private final RunnableC68936b f172886b;

        public void run() {
            this.f172886b.direct.replace(C68934d.this.scheduleDirect(this.f172886b));
        }

        RunnableC68935a(RunnableC68936b bVar) {
            this.f172886b = bVar;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$b */
    static final class RunnableC68936b extends AtomicReference<Runnable> implements Disposable, Runnable {
        private static final long serialVersionUID = -4101336210206799084L;
        final SequentialDisposable direct = new SequentialDisposable();
        final SequentialDisposable timed = new SequentialDisposable();

        public Runnable getWrappedRunnable() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                return runnable;
            }
            return C68326a.f171640b;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }

        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.timed.lazySet(DisposableHelper.DISPOSED);
                    this.direct.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }

        RunnableC68936b(Runnable runnable) {
            super(runnable);
        }
    }

    public C68934d(Executor executor) {
        this.f172884a = executor;
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable) {
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        try {
            if (this.f172884a instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(onSchedule);
                scheduledDirectTask.setFuture(((ExecutorService) this.f172884a).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            RunnableC68937c.RunnableC68938a aVar = new RunnableC68937c.RunnableC68938a(onSchedule);
            this.f172884a.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.onError(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (this.f172884a instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(onSchedule);
                scheduledDirectTask.setFuture(((ScheduledExecutorService) this.f172884a).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            RunnableC68936b bVar = new RunnableC68936b(onSchedule);
            bVar.timed.replace(f172883b.scheduleDirect(new RunnableC68935a(bVar), j, timeUnit));
            return bVar;
        }
    }

    @Override // io.reactivex.Scheduler
    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f172884a instanceof ScheduledExecutorService)) {
            return super.schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(RxJavaPlugins.onSchedule(runnable));
            scheduledDirectPeriodicTask.setFuture(((ScheduledExecutorService) this.f172884a).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.onError(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}
