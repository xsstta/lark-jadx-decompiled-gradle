package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68370g;
import io.reactivex.internal.p3460b.AbstractC68372i;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68977b;
import io.reactivex.internal.util.C68981f;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.r */
public final class C68616r<T, U> extends AbstractC68522a<T, U> {

    /* renamed from: c */
    final Function<? super T, ? extends AbstractC70020b<? extends U>> f172073c;

    /* renamed from: d */
    final boolean f172074d;

    /* renamed from: e */
    final int f172075e;

    /* renamed from: f */
    final int f172076f;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.r$a */
    public static final class C68617a<T, U> extends AtomicReference<AbstractC70022d> implements Disposable, AbstractC68325i<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final C68618b<T, U> parent;
        long produced;
        volatile AbstractC68373j<U> queue;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(U u) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        /* access modifiers changed from: package-private */
        public void requestMore(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((AbstractC70022d) get()).request(j2);
                    return;
                }
                this.produced = j2;
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof AbstractC68370g) {
                    AbstractC68370g gVar = (AbstractC68370g) dVar;
                    int requestFusion = gVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = gVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = gVar;
                    }
                }
                dVar.request((long) this.bufferSize);
            }
        }

        C68617a(C68618b<T, U> bVar, long j) {
            this.id = j;
            this.parent = bVar;
            int i = bVar.bufferSize;
            this.bufferSize = i;
            this.limit = i >> 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.r$b */
    public static final class C68618b<T, U> extends AtomicInteger implements AbstractC68325i<T>, AbstractC70022d {
        static final C68617a<?, ?>[] CANCELLED = new C68617a[0];
        static final C68617a<?, ?>[] EMPTY = new C68617a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final AbstractC70021c<? super U> downstream;
        final AtomicThrowable errs = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends AbstractC70020b<? extends U>> mapper;
        final int maxConcurrency;
        volatile AbstractC68372i<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<C68617a<?, ?>[]> subscribers;
        long uniqueId;
        AbstractC70022d upstream;

        /* access modifiers changed from: package-private */
        public void clearScalarQueue() {
            AbstractC68372i<U> iVar = this.queue;
            if (iVar != null) {
                iVar.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            AbstractC68372i<U> iVar;
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeAll();
                if (getAndIncrement() == 0 && (iVar = this.queue) != null) {
                    iVar.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public AbstractC68373j<U> getMainQueue() {
            AbstractC68372i<U> iVar = this.queue;
            if (iVar == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    iVar = new C68926b<>(this.bufferSize);
                } else {
                    iVar = new SpscArrayQueue<>(this.maxConcurrency);
                }
                this.queue = iVar;
            }
            return iVar;
        }

        /* access modifiers changed from: package-private */
        public boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            } else if (this.delayErrors || this.errs.get() == null) {
                return false;
            } else {
                clearScalarQueue();
                Throwable terminate = this.errs.terminate();
                if (terminate != C68981f.f172984a) {
                    this.downstream.onError(terminate);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void disposeAll() {
            C68617a<?, ?>[] andSet;
            C68617a<?, ?>[] aVarArr = this.subscribers.get();
            C68617a<?, ?>[] aVarArr2 = CANCELLED;
            if (!(aVarArr == aVarArr2 || (andSet = this.subscribers.getAndSet(aVarArr2)) == aVarArr2)) {
                for (C68617a<?, ?> aVar : andSet) {
                    aVar.dispose();
                }
                Throwable terminate = this.errs.terminate();
                if (!(terminate == null || terminate == C68981f.f172984a)) {
                    RxJavaPlugins.onError(terminate);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drainLoop() {
            boolean z;
            boolean z2;
            long j;
            long j2;
            C68617a<T, U>[] aVarArr;
            int i;
            long j3;
            AbstractC70021c<? super U> cVar = this.downstream;
            int i2 = 1;
            while (!checkTerminate()) {
                AbstractC68372i<U> iVar = this.queue;
                long j4 = this.requested.get();
                if (j4 == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                long j5 = 0;
                long j6 = 0;
                if (iVar != null) {
                    while (true) {
                        long j7 = 0;
                        U u = null;
                        while (true) {
                            if (j4 == 0) {
                                break;
                            }
                            U poll = iVar.poll();
                            if (!checkTerminate()) {
                                if (poll == null) {
                                    u = poll;
                                    break;
                                }
                                cVar.onNext(poll);
                                j6++;
                                j7++;
                                j4--;
                                u = poll;
                            } else {
                                return;
                            }
                        }
                        if (j7 != 0) {
                            if (z) {
                                j4 = Long.MAX_VALUE;
                            } else {
                                j4 = this.requested.addAndGet(-j7);
                            }
                        }
                        if (j4 == 0 || u == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.done;
                AbstractC68372i<U> iVar2 = this.queue;
                C68617a<?, ?>[] aVarArr2 = this.subscribers.get();
                int length = aVarArr2.length;
                if (!z3 || ((iVar2 != null && !iVar2.isEmpty()) || length != 0)) {
                    if (length != 0) {
                        long j8 = this.lastId;
                        int i3 = this.lastIndex;
                        if (length <= i3 || aVarArr2[i3].id != j8) {
                            if (length <= i3) {
                                i3 = 0;
                            }
                            for (int i4 = 0; i4 < length && aVarArr2[i3].id != j8; i4++) {
                                i3++;
                                if (i3 == length) {
                                    i3 = 0;
                                }
                            }
                            this.lastIndex = i3;
                            this.lastId = aVarArr2[i3].id;
                        }
                        int i5 = i3;
                        boolean z4 = false;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                aVarArr = aVarArr2;
                                z2 = z4;
                                break;
                            } else if (!checkTerminate()) {
                                C68617a<T, U> aVar = aVarArr2[i5];
                                U u2 = null;
                                while (!checkTerminate()) {
                                    AbstractC68373j<U> jVar = aVar.queue;
                                    if (jVar == null) {
                                        aVarArr = aVarArr2;
                                        i = length;
                                    } else {
                                        aVarArr = aVarArr2;
                                        i = length;
                                        long j9 = j5;
                                        while (j4 != j5) {
                                            try {
                                                u2 = jVar.poll();
                                                if (u2 == null) {
                                                    break;
                                                }
                                                cVar.onNext(u2);
                                                if (!checkTerminate()) {
                                                    j4--;
                                                    j9++;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                C68306a.m265071b(th);
                                                aVar.dispose();
                                                this.errs.addThrowable(th);
                                                if (!this.delayErrors) {
                                                    this.upstream.cancel();
                                                }
                                                if (!checkTerminate()) {
                                                    removeInner(aVar);
                                                    i6++;
                                                    length = i;
                                                    z4 = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j9 != j5) {
                                            if (!z) {
                                                j4 = this.requested.addAndGet(-j9);
                                            } else {
                                                j4 = Long.MAX_VALUE;
                                            }
                                            aVar.requestMore(j9);
                                            j3 = 0;
                                        } else {
                                            j3 = j5;
                                        }
                                        if (!(j4 == j3 || u2 == null)) {
                                            aVarArr2 = aVarArr;
                                            length = i;
                                            j5 = 0;
                                        }
                                    }
                                    boolean z5 = aVar.done;
                                    AbstractC68373j<U> jVar2 = aVar.queue;
                                    if (z5 && (jVar2 == null || jVar2.isEmpty())) {
                                        removeInner(aVar);
                                        if (!checkTerminate()) {
                                            j6++;
                                            z4 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j4 == 0) {
                                        z2 = z4;
                                        break;
                                    }
                                    i5++;
                                    length = i;
                                    if (i5 == length) {
                                        i5 = 0;
                                    }
                                    i6++;
                                    aVarArr2 = aVarArr;
                                    j5 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i5;
                        this.lastId = aVarArr[i5].id;
                        j2 = j6;
                        j = 0;
                    } else {
                        j = 0;
                        j2 = j6;
                        z2 = false;
                    }
                    if (j2 != j && !this.cancelled) {
                        this.upstream.request(j2);
                    }
                    if (z2) {
                        i2 = i2;
                    } else {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable terminate = this.errs.terminate();
                    if (terminate == C68981f.f172984a) {
                        return;
                    }
                    if (terminate == null) {
                        cVar.onComplete();
                        return;
                    } else {
                        cVar.onError(terminate);
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public AbstractC68373j<U> getInnerQueue(C68617a<T, U> aVar) {
            AbstractC68373j<U> jVar = aVar.queue;
            if (jVar != null) {
                return jVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
            aVar.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C68977b.m265548a(this.requested, j);
                drain();
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else if (this.errs.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.r$a<?, ?>[]> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public boolean addInner(C68617a<T, U> aVar) {
            C68617a<?, ?>[] aVarArr;
            C68617a[] aVarArr2;
            do {
                aVarArr = this.subscribers.get();
                if (aVarArr == CANCELLED) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C68617a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.subscribers.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    int i = this.maxConcurrency;
                    if (i == Integer.MAX_VALUE) {
                        dVar.request(Long.MAX_VALUE);
                    } else {
                        dVar.request((long) i);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void removeInner(C68617a<T, U> aVar) {
            C68617a<?, ?>[] aVarArr;
            C68617a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.subscribers.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = EMPTY;
                        } else {
                            C68617a<?, ?>[] aVarArr3 = new C68617a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(aVarArr, aVarArr2));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: io.reactivex.internal.operators.flowable.r$b<T, U> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.done) {
                try {
                    AbstractC70020b bVar = (AbstractC70020b) C68362b.m265229a(this.mapper.apply(t), "The mapper returned a null Publisher");
                    if (bVar instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar).call();
                            if (call != null) {
                                tryEmitScalar(call);
                            } else if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                                int i = this.scalarEmitted + 1;
                                this.scalarEmitted = i;
                                int i2 = this.scalarLimit;
                                if (i == i2) {
                                    this.scalarEmitted = 0;
                                    this.upstream.request((long) i2);
                                }
                            }
                        } catch (Throwable th) {
                            C68306a.m265071b(th);
                            this.errs.addThrowable(th);
                            drain();
                        }
                    } else {
                        long j = this.uniqueId;
                        this.uniqueId = 1 + j;
                        C68617a aVar = new C68617a(this, j);
                        if (addInner(aVar)) {
                            bVar.subscribe(aVar);
                        }
                    }
                } catch (Throwable th2) {
                    C68306a.m265071b(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void tryEmitScalar(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                AbstractC68373j<U> jVar = this.queue;
                if (j == 0 || (jVar != null && !jVar.isEmpty())) {
                    if (jVar == null) {
                        jVar = getMainQueue();
                    }
                    if (!jVar.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i = this.scalarEmitted + 1;
                        this.scalarEmitted = i;
                        int i2 = this.scalarLimit;
                        if (i == i2) {
                            this.scalarEmitted = 0;
                            this.upstream.request((long) i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        /* access modifiers changed from: package-private */
        public void innerError(C68617a<T, U> aVar, Throwable th) {
            if (this.errs.addThrowable(th)) {
                aVar.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (C68617a<?, ?> aVar2 : this.subscribers.getAndSet(CANCELLED)) {
                        aVar2.dispose();
                    }
                }
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public void tryEmit(U u, C68617a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                AbstractC68373j jVar = aVar.queue;
                if (jVar == null) {
                    jVar = new SpscArrayQueue(this.bufferSize);
                    aVar.queue = jVar;
                }
                if (!jVar.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.requested.get();
                AbstractC68373j<U> jVar2 = aVar.queue;
                if (j == 0 || (jVar2 != null && !jVar2.isEmpty())) {
                    if (jVar2 == null) {
                        jVar2 = getInnerQueue(aVar);
                    }
                    if (!jVar2.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    aVar.requestMore(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            drainLoop();
        }

        C68618b(AbstractC70021c<? super U> cVar, Function<? super T, ? extends AbstractC70020b<? extends U>> function, boolean z, int i, int i2) {
            AtomicReference<C68617a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = cVar;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = Math.max(1, i >> 1);
            atomicReference.lazySet(EMPTY);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super U> cVar) {
        if (!ap.m265312a(this.f171934b, cVar, this.f172073c)) {
            this.f171934b.mo238000a((AbstractC68325i) m265340a(cVar, this.f172073c, this.f172074d, this.f172075e, this.f172076f));
        }
    }

    public C68616r(AbstractC68307f<T> fVar, Function<? super T, ? extends AbstractC70020b<? extends U>> function, boolean z, int i, int i2) {
        super(fVar);
        this.f172073c = function;
        this.f172074d = z;
        this.f172075e = i;
        this.f172076f = i2;
    }

    /* renamed from: a */
    public static <T, U> AbstractC68325i<T> m265340a(AbstractC70021c<? super U> cVar, Function<? super T, ? extends AbstractC70020b<? extends U>> function, boolean z, int i, int i2) {
        return new C68618b(cVar, function, z, i, i2);
    }
}
