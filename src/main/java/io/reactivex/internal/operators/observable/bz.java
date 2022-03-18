package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3460b.AbstractC68372i;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class bz<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC69015w<? extends T> f172365b;

    /* renamed from: io.reactivex.internal.operators.observable.bz$a */
    static final class C68740a<T> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean disposed;
        final AbstractC69009q<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final AtomicReference<Disposable> mainDisposable = new AtomicReference<>();
        volatile boolean mainDone;
        final C68741a<T> otherObserver = new C68741a<>(this);
        volatile int otherState;
        volatile AbstractC68372i<T> queue;
        T singleItem;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* access modifiers changed from: package-private */
        public AbstractC68372i<T> getOrCreateQueue() {
            AbstractC68372i<T> iVar = this.queue;
            if (iVar != null) {
                return iVar;
            }
            C68926b bVar = new C68926b(Observable.bufferSize());
            this.queue = bVar;
            return bVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            DisposableHelper.dispose(this.mainDisposable);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void drainLoop() {
            T t;
            boolean z;
            AbstractC69009q<? super T> qVar = this.downstream;
            int i = 1;
            while (!this.disposed) {
                if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    qVar.onError(this.error.terminate());
                    return;
                }
                int i2 = this.otherState;
                if (i2 == 1) {
                    T t2 = this.singleItem;
                    this.singleItem = null;
                    this.otherState = 2;
                    qVar.onNext(t2);
                    i2 = 2;
                }
                boolean z2 = this.mainDone;
                AbstractC68372i<T> iVar = this.queue;
                if (iVar != null) {
                    t = iVar.poll();
                } else {
                    t = null;
                }
                if (t == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z && i2 == 2) {
                    this.queue = null;
                    qVar.onComplete();
                    return;
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    qVar.onNext(t);
                }
            }
            this.singleItem = null;
            this.queue = null;
        }

        /* renamed from: io.reactivex.internal.operators.observable.bz$a$a */
        static final class C68741a<T> extends AtomicReference<Disposable> implements AbstractC69012t<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final C68740a<T> parent;

            @Override // io.reactivex.AbstractC69012t
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68741a(C68740a<T> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.AbstractC69012t
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.AbstractC69012t
            public void onSuccess(T t) {
                this.parent.otherSuccess(t);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.mainDisposable, disposable);
        }

        C68740a(AbstractC69009q<? super T> qVar) {
            this.downstream = qVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.error.addThrowable(th)) {
                DisposableHelper.dispose(this.mainDisposable);
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public void otherError(Throwable th) {
            if (this.error.addThrowable(th)) {
                DisposableHelper.dispose(this.mainDisposable);
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public void otherSuccess(T t) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t);
                this.otherState = 2;
            } else {
                this.singleItem = t;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68740a aVar = new C68740a(qVar);
        qVar.onSubscribe(aVar);
        this.f172123a.subscribe(aVar);
        this.f172365b.subscribe(aVar.otherObserver);
    }

    public bz(Observable<T> observable, AbstractC69015w<? extends T> wVar) {
        super(observable);
        this.f172365b = wVar;
    }
}
