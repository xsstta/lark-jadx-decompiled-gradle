package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.C68946h;
import io.reactivex.internal.schedulers.C68951k;
import io.reactivex.internal.util.C68981f;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

public abstract class Scheduler {
    static final long CLOCK_DRIFT_TOLERANCE_NANOSECONDS = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract AbstractC68257c createWorker();

    public void shutdown() {
    }

    public void start() {
    }

    /* renamed from: io.reactivex.Scheduler$b */
    static final class RunnableC68256b implements Disposable, Runnable {

        /* renamed from: a */
        final Runnable f171542a;

        /* renamed from: b */
        final AbstractC68257c f171543b;

        /* renamed from: c */
        volatile boolean f171544c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171544c;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171544c = true;
            this.f171543b.dispose();
        }

        public void run() {
            if (!this.f171544c) {
                try {
                    this.f171542a.run();
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f171543b.dispose();
                    throw C68981f.m265557a(th);
                }
            }
        }

        RunnableC68256b(Runnable runnable, AbstractC68257c cVar) {
            this.f171542a = runnable;
            this.f171543b = cVar;
        }
    }

    public static long clockDriftTolerance() {
        return CLOCK_DRIFT_TOLERANCE_NANOSECONDS;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.Scheduler$a */
    public static final class RunnableC68255a implements Disposable, Runnable {

        /* renamed from: a */
        final Runnable f171539a;

        /* renamed from: b */
        final AbstractC68257c f171540b;

        /* renamed from: c */
        Thread f171541c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171540b.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f171541c == Thread.currentThread()) {
                AbstractC68257c cVar = this.f171540b;
                if (cVar instanceof C68946h) {
                    ((C68946h) cVar).mo238666b();
                    return;
                }
            }
            this.f171540b.dispose();
        }

        public void run() {
            this.f171541c = Thread.currentThread();
            try {
                this.f171539a.run();
            } finally {
                dispose();
                this.f171541c = null;
            }
        }

        RunnableC68255a(Runnable runnable, AbstractC68257c cVar) {
            this.f171539a = runnable;
            this.f171540b = cVar;
        }
    }

    /* renamed from: io.reactivex.Scheduler$c */
    public static abstract class AbstractC68257c implements Disposable {
        /* renamed from: a */
        public abstract Disposable mo44779a(Runnable runnable, long j, TimeUnit timeUnit);

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.Scheduler$c$a */
        public final class RunnableC68258a implements Runnable {

            /* renamed from: a */
            final Runnable f171545a;

            /* renamed from: b */
            final SequentialDisposable f171546b;

            /* renamed from: c */
            final long f171547c;

            /* renamed from: d */
            long f171548d;

            /* renamed from: e */
            long f171549e;

            /* renamed from: f */
            long f171550f;

            public void run() {
                long j;
                this.f171545a.run();
                if (!this.f171546b.isDisposed()) {
                    long a = AbstractC68257c.this.mo237794a(TimeUnit.NANOSECONDS);
                    long j2 = this.f171549e;
                    if (Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS + a < j2 || a >= j2 + this.f171547c + Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS) {
                        long j3 = this.f171547c;
                        long j4 = a + j3;
                        long j5 = this.f171548d + 1;
                        this.f171548d = j5;
                        this.f171550f = j4 - (j3 * j5);
                        j = j4;
                    } else {
                        long j6 = this.f171550f;
                        long j7 = this.f171548d + 1;
                        this.f171548d = j7;
                        j = j6 + (j7 * this.f171547c);
                    }
                    this.f171549e = a;
                    this.f171546b.replace(AbstractC68257c.this.mo44779a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }

            RunnableC68258a(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.f171545a = runnable;
                this.f171546b = sequentialDisposable;
                this.f171547c = j3;
                this.f171549e = j2;
                this.f171550f = j;
            }
        }

        /* renamed from: a */
        public long mo237794a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: a */
        public Disposable mo237795a(Runnable runnable) {
            return mo44779a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public Disposable mo237796a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
            long nanos = timeUnit.toNanos(j2);
            long a = mo237794a(TimeUnit.NANOSECONDS);
            Disposable a2 = mo44779a(new RunnableC68258a(a + timeUnit.toNanos(j), onSchedule, a, sequentialDisposable2, nanos), j, timeUnit);
            if (a2 == EmptyDisposable.INSTANCE) {
                return a2;
            }
            sequentialDisposable.replace(a2);
            return sequentialDisposable2;
        }
    }

    public <S extends Scheduler & Disposable> S when(Function<AbstractC68307f<AbstractC68307f<AbstractC68259a>>, AbstractC68259a> function) {
        return new C68951k(function, this);
    }

    public long now(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public Disposable scheduleDirect(Runnable runnable) {
        return scheduleDirect(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        AbstractC68257c createWorker = createWorker();
        RunnableC68255a aVar = new RunnableC68255a(RxJavaPlugins.onSchedule(runnable), createWorker);
        createWorker.mo44779a(aVar, j, timeUnit);
        return aVar;
    }

    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        AbstractC68257c createWorker = createWorker();
        RunnableC68256b bVar = new RunnableC68256b(RxJavaPlugins.onSchedule(runnable), createWorker);
        Disposable a = createWorker.mo237796a(bVar, j, j2, timeUnit);
        if (a == EmptyDisposable.INSTANCE) {
            return a;
        }
        return bVar;
    }
}
