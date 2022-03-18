package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.f */
public final class C68941f extends Scheduler {

    /* renamed from: a */
    static final RxThreadFactory f172901a;

    /* renamed from: b */
    static final RxThreadFactory f172902b;

    /* renamed from: c */
    static final C68944c f172903c;

    /* renamed from: f */
    static final RunnableC68942a f172904f;

    /* renamed from: g */
    private static final long f172905g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: h */
    private static final TimeUnit f172906h = TimeUnit.SECONDS;

    /* renamed from: d */
    final ThreadFactory f172907d;

    /* renamed from: e */
    final AtomicReference<RunnableC68942a> f172908e;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.schedulers.f$a */
    public static final class RunnableC68942a implements Runnable {

        /* renamed from: a */
        final C68289a f172909a;

        /* renamed from: b */
        private final long f172910b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<C68944c> f172911c;

        /* renamed from: d */
        private final ScheduledExecutorService f172912d;

        /* renamed from: e */
        private final Future<?> f172913e;

        /* renamed from: f */
        private final ThreadFactory f172914f;

        public void run() {
            mo238657b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo238658c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo238659d() {
            this.f172909a.dispose();
            Future<?> future = this.f172913e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f172912d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C68944c mo238655a() {
            if (this.f172909a.isDisposed()) {
                return C68941f.f172903c;
            }
            while (!this.f172911c.isEmpty()) {
                C68944c poll = this.f172911c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C68944c cVar = new C68944c(this.f172914f);
            this.f172909a.mo237937a(cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo238657b() {
            if (!this.f172911c.isEmpty()) {
                long c = mo238658c();
                Iterator<C68944c> it = this.f172911c.iterator();
                while (it.hasNext()) {
                    C68944c next = it.next();
                    if (next.mo238661a() > c) {
                        return;
                    }
                    if (this.f172911c.remove(next)) {
                        this.f172909a.mo237940b(next);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238656a(C68944c cVar) {
            cVar.mo238662a(mo238658c() + this.f172910b);
            this.f172911c.offer(cVar);
        }

        RunnableC68942a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            this.f172910b = j2;
            this.f172911c = new ConcurrentLinkedQueue<>();
            this.f172909a = new C68289a();
            this.f172914f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C68941f.f172902b);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f172912d = scheduledExecutorService;
            this.f172913e = scheduledFuture;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.schedulers.f$c */
    public static final class C68944c extends C68946h {

        /* renamed from: b */
        private long f172919b;

        /* renamed from: a */
        public long mo238661a() {
            return this.f172919b;
        }

        C68944c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: a */
        public void mo238662a(long j) {
            this.f172919b = j;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.f$b */
    static final class C68943b extends Scheduler.AbstractC68257c {

        /* renamed from: a */
        final AtomicBoolean f172915a = new AtomicBoolean();

        /* renamed from: b */
        private final C68289a f172916b;

        /* renamed from: c */
        private final RunnableC68942a f172917c;

        /* renamed from: d */
        private final C68944c f172918d;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172915a.get();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f172915a.compareAndSet(false, true)) {
                this.f172916b.dispose();
                this.f172917c.mo238656a(this.f172918d);
            }
        }

        C68943b(RunnableC68942a aVar) {
            this.f172917c = aVar;
            this.f172916b = new C68289a();
            this.f172918d = aVar.mo238655a();
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo44779a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f172916b.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f172918d.mo238663a(runnable, j, timeUnit, this.f172916b);
        }
    }

    public C68941f() {
        this(f172901a);
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.AbstractC68257c createWorker() {
        return new C68943b(this.f172908e.get());
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        RunnableC68942a aVar;
        RunnableC68942a aVar2;
        do {
            aVar = this.f172908e.get();
            aVar2 = f172904f;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.f172908e.compareAndSet(aVar, aVar2));
        aVar.mo238659d();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        RunnableC68942a aVar = new RunnableC68942a(f172905g, f172906h, this.f172907d);
        if (!this.f172908e.compareAndSet(f172904f, aVar)) {
            aVar.mo238659d();
        }
    }

    static {
        C68944c cVar = new C68944c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f172903c = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max);
        f172901a = rxThreadFactory;
        f172902b = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        RunnableC68942a aVar = new RunnableC68942a(0, null, rxThreadFactory);
        f172904f = aVar;
        aVar.mo238659d();
    }

    public C68941f(ThreadFactory threadFactory) {
        this.f172907d = threadFactory;
        this.f172908e = new AtomicReference<>(f172904f);
        start();
    }
}
