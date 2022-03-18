package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class az<T, R> extends AbstractC68651a<T, R> {

    /* renamed from: b */
    final Function<? super T, ? extends AbstractC69015w<? extends R>> f172249b;

    /* renamed from: c */
    final boolean f172250c;

    /* renamed from: io.reactivex.internal.operators.observable.az$a */
    static final class C68694a<T, R> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 8600231336733376951L;
        final AtomicInteger active = new AtomicInteger(1);
        volatile boolean cancelled;
        final boolean delayErrors;
        final AbstractC69009q<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends AbstractC69015w<? extends R>> mapper;
        final AtomicReference<C68926b<R>> queue = new AtomicReference<>();
        final C68289a set = new C68289a();
        Disposable upstream;

        /* renamed from: io.reactivex.internal.operators.observable.az$a$a */
        final class C68695a extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<R> {
            private static final long serialVersionUID = -502562646270949838L;

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }

            @Override // io.reactivex.AbstractC69012t
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68695a() {
            }

            @Override // io.reactivex.AbstractC69012t
            public void onError(Throwable th) {
                C68694a.this.innerError(this, th);
            }

            @Override // io.reactivex.AbstractC69012t
            public void onSuccess(R r) {
                C68694a.this.innerSuccess(this, r);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            C68926b<R> bVar = this.queue.get();
            if (bVar != null) {
                bVar.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        /* access modifiers changed from: package-private */
        public C68926b<R> getOrCreateQueue() {
            C68926b<R> bVar;
            do {
                C68926b<R> bVar2 = this.queue.get();
                if (bVar2 != null) {
                    return bVar2;
                }
                bVar = new C68926b<>(Observable.bufferSize());
            } while (!this.queue.compareAndSet(null, bVar));
            return bVar;
        }

        /* access modifiers changed from: package-private */
        public void drainLoop() {
            boolean z;
            R r;
            AbstractC69009q<? super R> qVar = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<C68926b<R>> atomicReference = this.queue;
            int i = 1;
            while (!this.cancelled) {
                if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                    boolean z2 = false;
                    if (atomicInteger.get() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C68926b<R> bVar = atomicReference.get();
                    if (bVar != null) {
                        r = bVar.poll();
                    } else {
                        r = null;
                    }
                    if (r == null) {
                        z2 = true;
                    }
                    if (z && z2) {
                        Throwable terminate = this.errors.terminate();
                        if (terminate != null) {
                            qVar.onError(terminate);
                            return;
                        } else {
                            qVar.onComplete();
                            return;
                        }
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        qVar.onNext(r);
                    }
                } else {
                    Throwable terminate2 = this.errors.terminate();
                    clear();
                    qVar.onError(terminate2);
                    return;
                }
            }
            clear();
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
            this.active.decrementAndGet();
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            try {
                AbstractC69015w wVar = (AbstractC69015w) C68362b.m265229a(this.mapper.apply(t), "The mapper returned a null SingleSource");
                this.active.getAndIncrement();
                C68695a aVar = new C68695a();
                if (!this.cancelled && this.set.mo237937a(aVar)) {
                    wVar.subscribe(aVar);
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public void innerError(C68694a<T, R>.C68695a aVar, Throwable th) {
            this.set.mo237941c(aVar);
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.dispose();
                    this.set.dispose();
                }
                this.active.decrementAndGet();
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public void innerSuccess(C68694a<T, R>.C68695a aVar, R r) {
            this.set.mo237941c(aVar);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    this.downstream.onNext(r);
                    if (this.active.decrementAndGet() == 0) {
                        z = true;
                    }
                    C68926b<R> bVar = this.queue.get();
                    if (!z || (bVar != null && !bVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        drainLoop();
                    }
                    Throwable terminate = this.errors.terminate();
                    if (terminate != null) {
                        this.downstream.onError(terminate);
                        return;
                    } else {
                        this.downstream.onComplete();
                        return;
                    }
                }
            }
            C68926b<R> orCreateQueue = getOrCreateQueue();
            synchronized (orCreateQueue) {
                orCreateQueue.offer(r);
            }
            this.active.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        C68694a(AbstractC69009q<? super R> qVar, Function<? super T, ? extends AbstractC69015w<? extends R>> function, boolean z) {
            this.downstream = qVar;
            this.mapper = function;
            this.delayErrors = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        this.f172123a.subscribe(new C68694a(qVar, this.f172249b, this.f172250c));
    }

    public az(ObservableSource<T> observableSource, Function<? super T, ? extends AbstractC69015w<? extends R>> function, boolean z) {
        super(observableSource);
        this.f172249b = function;
        this.f172250c = z;
    }
}
