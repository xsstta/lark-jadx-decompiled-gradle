package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68368e;
import io.reactivex.internal.p3460b.AbstractC68372i;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68981f;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class av<T, U> extends AbstractC68651a<T, U> {

    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends U>> f172238b;

    /* renamed from: c */
    final boolean f172239c;

    /* renamed from: d */
    final int f172240d;

    /* renamed from: e */
    final int f172241e;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.av$a */
    public static final class C68686a<T, U> extends AtomicReference<Disposable> implements AbstractC69009q<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final C68687b<T, U> parent;
        volatile AbstractC68373j<U> queue;

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(U u) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.parent.errors.addThrowable(th)) {
                if (!this.parent.delayErrors) {
                    this.parent.disposeAll();
                }
                this.done = true;
                this.parent.drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof AbstractC68368e)) {
                AbstractC68368e eVar = (AbstractC68368e) disposable;
                int requestFusion = eVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = eVar;
                    this.done = true;
                    this.parent.drain();
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = eVar;
                }
            }
        }

        C68686a(C68687b<T, U> bVar, long j) {
            this.id = j;
            this.parent = bVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.av$b */
    static final class C68687b<T, U> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        static final C68686a<?, ?>[] CANCELLED = new C68686a[0];
        static final C68686a<?, ?>[] EMPTY = new C68686a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final AbstractC69009q<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<C68686a<?, ?>[]> observers;
        volatile AbstractC68372i<U> queue;
        Queue<ObservableSource<? extends U>> sources;
        long uniqueId;
        Disposable upstream;
        int wip;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Throwable terminate;
            if (!this.cancelled) {
                this.cancelled = true;
                if (disposeAll() && (terminate = this.errors.terminate()) != null && terminate != C68981f.f172984a) {
                    RxJavaPlugins.onError(terminate);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean checkTerminate() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = (Throwable) this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            disposeAll();
            Throwable terminate = this.errors.terminate();
            if (terminate != C68981f.f172984a) {
                this.downstream.onError(terminate);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean disposeAll() {
            C68686a<?, ?>[] andSet;
            this.upstream.dispose();
            C68686a<?, ?>[] aVarArr = this.observers.get();
            C68686a<?, ?>[] aVarArr2 = CANCELLED;
            if (aVarArr == aVarArr2 || (andSet = this.observers.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (C68686a<?, ?> aVar : andSet) {
                aVar.dispose();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void drainLoop() {
            int i;
            AbstractC69009q<? super U> qVar = this.downstream;
            int i2 = 1;
            while (!checkTerminate()) {
                AbstractC68372i<U> iVar = this.queue;
                if (iVar != null) {
                    while (!checkTerminate()) {
                        U poll = iVar.poll();
                        if (poll != null) {
                            qVar.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z = this.done;
                AbstractC68372i<U> iVar2 = this.queue;
                C68686a<?, ?>[] aVarArr = this.observers.get();
                int length = aVarArr.length;
                int i3 = 0;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.sources.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((iVar2 == null || iVar2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.lastId;
                        int i4 = this.lastIndex;
                        if (length <= i4 || aVarArr[i4].id != j) {
                            if (length <= i4) {
                                i4 = 0;
                            }
                            for (int i5 = 0; i5 < length && aVarArr[i4].id != j; i5++) {
                                i4++;
                                if (i4 == length) {
                                    i4 = 0;
                                }
                            }
                            this.lastIndex = i4;
                            this.lastId = aVarArr[i4].id;
                        }
                        int i6 = 0;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (!checkTerminate()) {
                                C68686a<T, U> aVar = aVarArr[i4];
                                AbstractC68373j<U> jVar = aVar.queue;
                                if (jVar != null) {
                                    while (true) {
                                        try {
                                            U poll2 = jVar.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            qVar.onNext(poll2);
                                            if (checkTerminate()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C68306a.m265071b(th);
                                            aVar.dispose();
                                            this.errors.addThrowable(th);
                                            if (!checkTerminate()) {
                                                removeInner(aVar);
                                                i6++;
                                                i4++;
                                                if (i4 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = aVar.done;
                                AbstractC68373j<U> jVar2 = aVar.queue;
                                if (z2 && (jVar2 == null || jVar2.isEmpty())) {
                                    removeInner(aVar);
                                    if (!checkTerminate()) {
                                        i6++;
                                    } else {
                                        return;
                                    }
                                }
                                i4++;
                                if (i4 != length) {
                                }
                                i4 = 0;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i4;
                        this.lastId = aVarArr[i4].id;
                        i3 = i6;
                    }
                    if (i3 == 0) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        while (true) {
                            int i8 = i3 - 1;
                            if (i3 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                ObservableSource<? extends U> poll3 = this.sources.poll();
                                if (poll3 == null) {
                                    this.wip--;
                                } else {
                                    subscribeInner(poll3);
                                }
                            }
                            i3 = i8;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable terminate = this.errors.terminate();
                    if (terminate == C68981f.f172984a) {
                        return;
                    }
                    if (terminate == null) {
                        qVar.onComplete();
                        return;
                    } else {
                        qVar.onError(terminate);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.av$a<?, ?>[]> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public boolean addInner(C68686a<T, U> aVar) {
            C68686a<?, ?>[] aVarArr;
            C68686a[] aVarArr2;
            do {
                aVarArr = this.observers.get();
                if (aVarArr == CANCELLED) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C68686a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.observers.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        public void removeInner(C68686a<T, U> aVar) {
            C68686a<?, ?>[] aVarArr;
            C68686a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.observers.get();
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
                            C68686a<?, ?>[] aVarArr3 = new C68686a[(length - 1)];
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
            } while (!this.observers.compareAndSet(aVarArr, aVarArr2));
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.done) {
                try {
                    ObservableSource<? extends U> observableSource = (ObservableSource) C68362b.m265229a(this.mapper.apply(t), "The mapper returned a null ObservableSource");
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            int i = this.wip;
                            if (i == this.maxConcurrency) {
                                this.sources.offer(observableSource);
                                return;
                            }
                            this.wip = i + 1;
                        }
                    }
                    subscribeInner(observableSource);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.upstream.dispose();
                    onError(th);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void subscribeInner(ObservableSource<? extends U> observableSource) {
            ObservableSource<? extends U> poll;
            while (observableSource instanceof Callable) {
                if (tryEmitScalar((Callable) observableSource) && this.maxConcurrency != Integer.MAX_VALUE) {
                    boolean z = false;
                    synchronized (this) {
                        poll = this.sources.poll();
                        if (poll == null) {
                            this.wip--;
                            z = true;
                        }
                    }
                    if (z) {
                        drain();
                        return;
                    }
                    observableSource = poll;
                } else {
                    return;
                }
            }
            long j = this.uniqueId;
            this.uniqueId = 1 + j;
            C68686a<T, U> aVar = new C68686a<>(this, j);
            if (addInner(aVar)) {
                observableSource.subscribe(aVar);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [io.reactivex.internal.b.i] */
        /* access modifiers changed from: package-private */
        public boolean tryEmitScalar(Callable<? extends U> callable) {
            AbstractC68372i<U> iVar;
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    AbstractC68372i<U> iVar2 = this.queue;
                    AbstractC68372i<U> iVar3 = iVar2;
                    if (iVar2 == null) {
                        if (this.maxConcurrency == Integer.MAX_VALUE) {
                            iVar = new C68926b(this.bufferSize);
                        } else {
                            iVar = new SpscArrayQueue(this.maxConcurrency);
                        }
                        this.queue = iVar;
                        iVar3 = iVar;
                    }
                    if (!iVar3.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.downstream.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.errors.addThrowable(th);
                drain();
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void tryEmit(U u, C68686a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                AbstractC68373j jVar = aVar.queue;
                if (jVar == null) {
                    jVar = new C68926b(this.bufferSize);
                    aVar.queue = jVar;
                }
                jVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.downstream.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            drainLoop();
        }

        C68687b(AbstractC69009q<? super U> qVar, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
            this.downstream = qVar;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super U> qVar) {
        if (!ObservableScalarXMap.m265361a(this.f172123a, qVar, this.f172238b)) {
            this.f172123a.subscribe(new C68687b(qVar, this.f172238b, this.f172239c, this.f172240d, this.f172241e));
        }
    }

    public av(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
        super(observableSource);
        this.f172238b = function;
        this.f172239c = z;
        this.f172240d = i;
        this.f172241e = i2;
    }
}
