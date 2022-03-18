package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.C68375b;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.b */
public final class C68929b extends Scheduler {

    /* renamed from: a */
    static final C68931b f172868a;

    /* renamed from: b */
    static final RxThreadFactory f172869b;

    /* renamed from: c */
    static final int f172870c = m265493a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: d */
    static final C68932c f172871d;

    /* renamed from: e */
    final ThreadFactory f172872e;

    /* renamed from: f */
    final AtomicReference<C68931b> f172873f;

    /* renamed from: a */
    static int m265493a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: io.reactivex.internal.schedulers.b$a */
    static final class C68930a extends Scheduler.AbstractC68257c {

        /* renamed from: a */
        volatile boolean f172874a;

        /* renamed from: b */
        private final C68375b f172875b;

        /* renamed from: c */
        private final C68289a f172876c;

        /* renamed from: d */
        private final C68375b f172877d;

        /* renamed from: e */
        private final C68932c f172878e;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172874a;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f172874a) {
                this.f172874a = true;
                this.f172877d.dispose();
            }
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo237795a(Runnable runnable) {
            if (this.f172874a) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f172878e.mo238663a(runnable, 0, TimeUnit.MILLISECONDS, this.f172875b);
        }

        C68930a(C68932c cVar) {
            this.f172878e = cVar;
            C68375b bVar = new C68375b();
            this.f172875b = bVar;
            C68289a aVar = new C68289a();
            this.f172876c = aVar;
            C68375b bVar2 = new C68375b();
            this.f172877d = bVar2;
            bVar2.mo237937a(bVar);
            bVar2.mo237937a(aVar);
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo44779a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f172874a) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f172878e.mo238663a(runnable, j, timeUnit, this.f172876c);
        }
    }

    public C68929b() {
        this(f172869b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.schedulers.b$b */
    public static final class C68931b {

        /* renamed from: a */
        final int f172879a;

        /* renamed from: b */
        final C68932c[] f172880b;

        /* renamed from: c */
        long f172881c;

        /* renamed from: b */
        public void mo238639b() {
            for (C68932c cVar : this.f172880b) {
                cVar.dispose();
            }
        }

        /* renamed from: a */
        public C68932c mo238638a() {
            int i = this.f172879a;
            if (i == 0) {
                return C68929b.f172871d;
            }
            C68932c[] cVarArr = this.f172880b;
            long j = this.f172881c;
            this.f172881c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        C68931b(int i, ThreadFactory threadFactory) {
            this.f172879a = i;
            this.f172880b = new C68932c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f172880b[i2] = new C68932c(threadFactory);
            }
        }
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.AbstractC68257c createWorker() {
        return new C68930a(this.f172873f.get().mo238638a());
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        C68931b bVar;
        C68931b bVar2;
        do {
            bVar = this.f172873f.get();
            bVar2 = f172868a;
            if (bVar == bVar2) {
                return;
            }
        } while (!this.f172873f.compareAndSet(bVar, bVar2));
        bVar.mo238639b();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        C68931b bVar = new C68931b(f172870c, this.f172872e);
        if (!this.f172873f.compareAndSet(f172868a, bVar)) {
            bVar.mo238639b();
        }
    }

    static {
        C68932c cVar = new C68932c(new RxThreadFactory("RxComputationShutdown"));
        f172871d = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f172869b = rxThreadFactory;
        C68931b bVar = new C68931b(0, rxThreadFactory);
        f172868a = bVar;
        bVar.mo238639b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.schedulers.b$c */
    public static final class C68932c extends C68946h {
        C68932c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    public C68929b(ThreadFactory threadFactory) {
        this.f172872e = threadFactory;
        this.f172873f = new AtomicReference<>(f172868a);
        start();
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f172873f.get().mo238638a().mo238665b(runnable, j, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f172873f.get().mo238638a().mo238664b(runnable, j, j2, timeUnit);
    }
}
