package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ea<T, D> extends Observable<T> {

    /* renamed from: a */
    final Callable<? extends D> f172617a;

    /* renamed from: b */
    final Function<? super D, ? extends ObservableSource<? extends T>> f172618b;

    /* renamed from: c */
    final Consumer<? super D> f172619c;

    /* renamed from: d */
    final boolean f172620d;

    /* renamed from: io.reactivex.internal.operators.observable.ea$a */
    static final class C68842a<T, D> extends AtomicBoolean implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 5904473792286235046L;
        final Consumer<? super D> disposer;
        final AbstractC69009q<? super T> downstream;
        final boolean eager;
        final D resource;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            disposeAfter();
            this.upstream.dispose();
        }

        /* access modifiers changed from: package-private */
        public void disposeAfter() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.upstream.dispose();
                this.downstream.onComplete();
                return;
            }
            this.downstream.onComplete();
            this.upstream.dispose();
            disposeAfter();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.downstream.onNext(t);
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
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th2) {
                        C68306a.m265071b(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                this.upstream.dispose();
                this.downstream.onError(th);
                return;
            }
            this.downstream.onError(th);
            this.upstream.dispose();
            disposeAfter();
        }

        C68842a(AbstractC69009q<? super T> qVar, D d, Consumer<? super D> consumer, boolean z) {
            this.downstream = qVar;
            this.resource = d;
            this.disposer = consumer;
            this.eager = z;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        try {
            Object call = this.f172617a.call();
            try {
                ((ObservableSource) C68362b.m265229a(this.f172618b.apply(call), "The sourceSupplier returned a null ObservableSource")).subscribe(new C68842a(qVar, call, this.f172619c, this.f172620d));
            } catch (Throwable th) {
                C68306a.m265071b(th);
                EmptyDisposable.error(new CompositeException(th, th), qVar);
            }
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            EmptyDisposable.error(th2, qVar);
        }
    }

    public ea(Callable<? extends D> callable, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer, boolean z) {
        this.f172617a = callable;
        this.f172618b = function;
        this.f172619c = consumer;
        this.f172620d = z;
    }
}
