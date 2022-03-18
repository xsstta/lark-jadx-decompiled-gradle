package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.p3460b.AbstractC68364a;
import io.reactivex.internal.p3460b.AbstractC68370g;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.ac */
public final class C68527ac<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final Scheduler f171939c;

    /* renamed from: d */
    final boolean f171940d;

    /* renamed from: e */
    final int f171941e;

    /* renamed from: io.reactivex.internal.operators.flowable.ac$a */
    static abstract class AbstractRunnableC68528a<T> extends BasicIntQueueSubscription<T> implements AbstractC68325i<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        AbstractC68373j<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        AbstractC70022d upstream;
        final Scheduler.AbstractC68257c worker;

        /* access modifiers changed from: package-private */
        public abstract void runAsync();

        /* access modifiers changed from: package-private */
        public abstract void runBackfused();

        /* access modifiers changed from: package-private */
        public abstract void runSync();

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public final void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // org.p3511d.AbstractC70021c
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                trySchedule();
            }
        }

        /* access modifiers changed from: package-private */
        public final void trySchedule() {
            if (getAndIncrement() == 0) {
                this.worker.mo237795a(this);
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final void run() {
            if (this.outputFused) {
                runBackfused();
            } else if (this.sourceMode == 1) {
                runSync();
            } else {
                runAsync();
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this.requested, j);
                trySchedule();
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // org.p3511d.AbstractC70021c
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            trySchedule();
        }

        @Override // org.p3511d.AbstractC70021c
        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode == 2) {
                    trySchedule();
                    return;
                }
                if (!this.queue.offer(t)) {
                    this.upstream.cancel();
                    this.error = new MissingBackpressureException("Queue is full?!");
                    this.done = true;
                }
                trySchedule();
            }
        }

        AbstractRunnableC68528a(Scheduler.AbstractC68257c cVar, boolean z, int i) {
            this.worker = cVar;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminated(boolean z, boolean z2, AbstractC70021c<?> cVar) {
            if (this.cancelled) {
                clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.cancelled = true;
                        clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.ac$b */
    static final class C68529b<T> extends AbstractRunnableC68528a<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final AbstractC68364a<? super T> downstream;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            T t = (T) this.queue.poll();
            if (!(t == null || this.sourceMode == 1)) {
                long j = this.consumed + 1;
                if (j == ((long) this.limit)) {
                    this.consumed = 0;
                    this.upstream.request(j);
                } else {
                    this.consumed = j;
                }
            }
            return t;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68527ac.AbstractRunnableC68528a
        public void runBackfused() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68527ac.AbstractRunnableC68528a
        public void runAsync() {
            int i;
            boolean z;
            AbstractC68364a<? super T> aVar = this.downstream;
            AbstractC68373j jVar = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int i2 = 1;
            while (true) {
                long j3 = this.requested.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.done;
                    try {
                        Object obj = (Object) jVar.poll();
                        if (obj == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!checkTerminated(z2, z, aVar)) {
                            if (z) {
                                break;
                            }
                            if (aVar.tryOnNext(obj)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.limit)) {
                                this.upstream.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        jVar.clear();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (i != 0 || !checkTerminated(this.done, jVar.isEmpty(), aVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j;
                        this.consumed = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68527ac.AbstractRunnableC68528a
        public void runSync() {
            AbstractC68364a<? super T> aVar = this.downstream;
            AbstractC68373j jVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        Object obj = (Object) jVar.poll();
                        if (!this.cancelled) {
                            if (obj == 0) {
                                this.cancelled = true;
                                aVar.onComplete();
                                this.worker.dispose();
                                return;
                            } else if (aVar.tryOnNext(obj)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (jVar.isEmpty()) {
                        this.cancelled = true;
                        aVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.AbstractC68325i, org.p3511d.AbstractC70021c
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof AbstractC68370g) {
                    AbstractC68370g gVar = (AbstractC68370g) dVar;
                    int requestFusion = gVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = gVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = gVar;
                        this.downstream.onSubscribe(this);
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request((long) this.prefetch);
            }
        }

        C68529b(AbstractC68364a<? super T> aVar, Scheduler.AbstractC68257c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.downstream = aVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.ac$c */
    static final class C68530c<T> extends AbstractRunnableC68528a<T> implements AbstractC68325i<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final AbstractC70021c<? super T> downstream;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            T t = (T) this.queue.poll();
            if (!(t == null || this.sourceMode == 1)) {
                long j = this.produced + 1;
                if (j == ((long) this.limit)) {
                    this.produced = 0;
                    this.upstream.request(j);
                } else {
                    this.produced = j;
                }
            }
            return t;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68527ac.AbstractRunnableC68528a
        public void runBackfused() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68527ac.AbstractRunnableC68528a
        public void runSync() {
            AbstractC70021c<? super T> cVar = this.downstream;
            AbstractC68373j jVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        Object obj = (Object) jVar.poll();
                        if (!this.cancelled) {
                            if (obj == 0) {
                                this.cancelled = true;
                                cVar.onComplete();
                                this.worker.dispose();
                                return;
                            }
                            cVar.onNext(obj);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (jVar.isEmpty()) {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.C68527ac.AbstractRunnableC68528a
        public void runAsync() {
            int i;
            boolean z;
            AbstractC70021c<? super T> cVar = this.downstream;
            AbstractC68373j jVar = this.queue;
            long j = this.produced;
            int i2 = 1;
            while (true) {
                long j2 = this.requested.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.done;
                    try {
                        Object obj = (Object) jVar.poll();
                        if (obj == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!checkTerminated(z2, z, cVar)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(obj);
                            j++;
                            if (j == ((long) this.limit)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.requested.addAndGet(-j);
                                }
                                this.upstream.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        jVar.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (i != 0 || !checkTerminated(this.done, jVar.isEmpty(), cVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.AbstractC68325i, org.p3511d.AbstractC70021c
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof AbstractC68370g) {
                    AbstractC68370g gVar = (AbstractC68370g) dVar;
                    int requestFusion = gVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = gVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = gVar;
                        this.downstream.onSubscribe(this);
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request((long) this.prefetch);
            }
        }

        C68530c(AbstractC70021c<? super T> cVar, Scheduler.AbstractC68257c cVar2, boolean z, int i) {
            super(cVar2, z, i);
            this.downstream = cVar;
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        Scheduler.AbstractC68257c createWorker = this.f171939c.createWorker();
        if (cVar instanceof AbstractC68364a) {
            this.f171934b.mo238000a((AbstractC68325i) new C68529b((AbstractC68364a) cVar, createWorker, this.f171940d, this.f171941e));
        } else {
            this.f171934b.mo238000a((AbstractC68325i) new C68530c(cVar, createWorker, this.f171940d, this.f171941e));
        }
    }

    public C68527ac(AbstractC68307f<T> fVar, Scheduler scheduler, boolean z, int i) {
        super(fVar);
        this.f171939c = scheduler;
        this.f171940d = z;
        this.f171941e = i;
    }
}
