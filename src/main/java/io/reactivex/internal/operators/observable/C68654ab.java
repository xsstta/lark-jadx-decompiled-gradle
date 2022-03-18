package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68313e;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.ab */
public final class C68654ab<T> extends Observable<T> {

    /* renamed from: a */
    final ObservableOnSubscribe<T> f172128a;

    /* renamed from: io.reactivex.internal.operators.observable.ab$a */
    static final class C68655a<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {
        private static final long serialVersionUID = -3434801548987643227L;
        final AbstractC69009q<? super T> observer;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.ObservableEmitter
        public ObservableEmitter<T> serialize() {
            return new C68656b(this);
        }

        @Override // io.reactivex.disposables.Disposable, io.reactivex.ObservableEmitter
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.observer.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        @Override // io.reactivex.ObservableEmitter
        public void setDisposable(Disposable disposable) {
            DisposableHelper.set(this, disposable);
        }

        C68655a(AbstractC69009q<? super T> qVar) {
            this.observer = qVar;
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.ObservableEmitter
        public void setCancellable(AbstractC68313e eVar) {
            setDisposable(new CancellableDisposable(eVar));
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!isDisposed()) {
                this.observer.onNext(t);
            }
        }

        /* JADX INFO: finally extract failed */
        @Override // io.reactivex.ObservableEmitter
        public boolean tryOnError(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.observer.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ab$b */
    static final class C68656b<T> extends AtomicInteger implements ObservableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final ObservableEmitter<T> emitter;
        final AtomicThrowable error = new AtomicThrowable();
        final C68926b<T> queue = new C68926b<>(16);

        @Override // io.reactivex.ObservableEmitter
        public ObservableEmitter<T> serialize() {
            return this;
        }

        @Override // io.reactivex.ObservableEmitter
        public boolean isDisposed() {
            return this.emitter.isDisposed();
        }

        public String toString() {
            return this.emitter.toString();
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (!this.emitter.isDisposed() && !this.done) {
                this.done = true;
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public void drainLoop() {
            boolean z;
            ObservableEmitter<T> observableEmitter = this.emitter;
            C68926b<T> bVar = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            int i = 1;
            while (!observableEmitter.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    bVar.clear();
                    observableEmitter.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z2 = this.done;
                T poll = bVar.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    observableEmitter.onComplete();
                    return;
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    observableEmitter.onNext(poll);
                }
            }
            bVar.clear();
        }

        @Override // io.reactivex.ObservableEmitter
        public void setCancellable(AbstractC68313e eVar) {
            this.emitter.setCancellable(eVar);
        }

        @Override // io.reactivex.ObservableEmitter
        public void setDisposable(Disposable disposable) {
            this.emitter.setDisposable(disposable);
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                RxJavaPlugins.onError(th);
            }
        }

        C68656b(ObservableEmitter<T> observableEmitter) {
            this.emitter = observableEmitter;
        }

        @Override // io.reactivex.ObservableEmitter
        public boolean tryOnError(Throwable th) {
            if (!this.emitter.isDisposed() && !this.done) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (!this.emitter.isDisposed() && !this.done) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C68926b<T> bVar = this.queue;
                    synchronized (bVar) {
                        bVar.offer(t);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    this.emitter.onNext(t);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                drainLoop();
            }
        }
    }

    public C68654ab(ObservableOnSubscribe<T> observableOnSubscribe) {
        this.f172128a = observableOnSubscribe;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68655a aVar = new C68655a(qVar);
        qVar.onSubscribe(aVar);
        try {
            this.f172128a.subscribe(aVar);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            aVar.onError(th);
        }
    }
}
