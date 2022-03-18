package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.C68290b;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.schedulers.m */
public final class C68962m extends Scheduler {

    /* renamed from: a */
    private static final C68962m f172950a = new C68962m();

    /* renamed from: io.reactivex.internal.schedulers.m$c */
    static final class C68965c extends Scheduler.AbstractC68257c implements Disposable {

        /* renamed from: a */
        final PriorityBlockingQueue<C68964b> f172958a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        final AtomicInteger f172959b = new AtomicInteger();

        /* renamed from: c */
        volatile boolean f172960c;

        /* renamed from: d */
        private final AtomicInteger f172961d = new AtomicInteger();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172960c = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172960c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.schedulers.m$c$a */
        public final class RunnableC68966a implements Runnable {

            /* renamed from: a */
            final C68964b f172962a;

            public void run() {
                this.f172962a.f172957d = true;
                C68965c.this.f172958a.remove(this.f172962a);
            }

            RunnableC68966a(C68964b bVar) {
                this.f172962a = bVar;
            }
        }

        C68965c() {
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo237795a(Runnable runnable) {
            return mo238676a(runnable, mo237794a(TimeUnit.MILLISECONDS));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Disposable mo238676a(Runnable runnable, long j) {
            if (this.f172960c) {
                return EmptyDisposable.INSTANCE;
            }
            C68964b bVar = new C68964b(runnable, Long.valueOf(j), this.f172959b.incrementAndGet());
            this.f172958a.add(bVar);
            if (this.f172961d.getAndIncrement() != 0) {
                return C68290b.m265040a(new RunnableC68966a(bVar));
            }
            int i = 1;
            while (!this.f172960c) {
                C68964b poll = this.f172958a.poll();
                if (poll == null) {
                    i = this.f172961d.addAndGet(-i);
                    if (i == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!poll.f172957d) {
                    poll.f172954a.run();
                }
            }
            this.f172958a.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo44779a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo237794a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo238676a(new RunnableC68963a(runnable, this, a), a);
        }
    }

    C68962m() {
    }

    /* renamed from: a */
    public static C68962m m265528a() {
        return f172950a;
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.AbstractC68257c createWorker() {
        return new C68965c();
    }

    /* renamed from: io.reactivex.internal.schedulers.m$a */
    static final class RunnableC68963a implements Runnable {

        /* renamed from: a */
        private final Runnable f172951a;

        /* renamed from: b */
        private final C68965c f172952b;

        /* renamed from: c */
        private final long f172953c;

        public void run() {
            if (!this.f172952b.f172960c) {
                long a = this.f172952b.mo237794a(TimeUnit.MILLISECONDS);
                long j = this.f172953c;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        RxJavaPlugins.onError(e);
                        return;
                    }
                }
                if (!this.f172952b.f172960c) {
                    this.f172951a.run();
                }
            }
        }

        RunnableC68963a(Runnable runnable, C68965c cVar, long j) {
            this.f172951a = runnable;
            this.f172952b = cVar;
            this.f172953c = j;
        }
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable) {
        RxJavaPlugins.onSchedule(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.schedulers.m$b */
    public static final class C68964b implements Comparable<C68964b> {

        /* renamed from: a */
        final Runnable f172954a;

        /* renamed from: b */
        final long f172955b;

        /* renamed from: c */
        final int f172956c;

        /* renamed from: d */
        volatile boolean f172957d;

        /* renamed from: a */
        public int compareTo(C68964b bVar) {
            int a = C68362b.m265226a(this.f172955b, bVar.f172955b);
            if (a == 0) {
                return C68362b.m265224a(this.f172956c, bVar.f172956c);
            }
            return a;
        }

        C68964b(Runnable runnable, Long l, int i) {
            this.f172954a = runnable;
            this.f172955b = l.longValue();
            this.f172956c = i;
        }
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            RxJavaPlugins.onSchedule(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.onError(e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
