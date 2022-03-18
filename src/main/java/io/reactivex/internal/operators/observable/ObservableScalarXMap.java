package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68368e;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements AbstractC68368e<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;
        final AbstractC69009q<? super T> observer;
        final T value;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == 3) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            if (get() != 1) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public ScalarDisposable(AbstractC69009q<? super T> qVar, T t) {
            this.observer = qVar;
            this.value = t;
        }

        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ObservableScalarXMap$a */
    public static final class C68650a<T, R> extends Observable<R> {

        /* renamed from: a */
        final T f172121a;

        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<? extends R>> f172122b;

        @Override // io.reactivex.Observable
        public void subscribeActual(AbstractC69009q<? super R> qVar) {
            try {
                ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.f172122b.apply(this.f172121a), "The mapper returned a null ObservableSource");
                if (observableSource instanceof Callable) {
                    try {
                        Object call = ((Callable) observableSource).call();
                        if (call == null) {
                            EmptyDisposable.complete(qVar);
                            return;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(qVar, call);
                        qVar.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        EmptyDisposable.error(th, qVar);
                    }
                } else {
                    observableSource.subscribe(qVar);
                }
            } catch (Throwable th2) {
                EmptyDisposable.error(th2, qVar);
            }
        }

        C68650a(T t, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f172121a = t;
            this.f172122b = function;
        }
    }

    /* renamed from: a */
    public static <T, U> Observable<U> m265360a(T t, Function<? super T, ? extends ObservableSource<? extends U>> function) {
        return RxJavaPlugins.onAssembly(new C68650a(t, function));
    }

    /* renamed from: a */
    public static <T, R> boolean m265361a(ObservableSource<T> observableSource, AbstractC69009q<? super R> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        if (!(observableSource instanceof Callable)) {
            return false;
        }
        try {
            Object obj = (Object) ((Callable) observableSource).call();
            if (obj == 0) {
                EmptyDisposable.complete(qVar);
                return true;
            }
            try {
                ObservableSource observableSource2 = (ObservableSource) C68362b.m265229a(function.apply(obj), "The mapper returned a null ObservableSource");
                if (observableSource2 instanceof Callable) {
                    try {
                        Object call = ((Callable) observableSource2).call();
                        if (call == null) {
                            EmptyDisposable.complete(qVar);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(qVar, call);
                        qVar.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        EmptyDisposable.error(th, qVar);
                        return true;
                    }
                } else {
                    observableSource2.subscribe(qVar);
                }
                return true;
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                EmptyDisposable.error(th2, qVar);
                return true;
            }
        } catch (Throwable th3) {
            C68306a.m265071b(th3);
            EmptyDisposable.error(th3, qVar);
            return true;
        }
    }
}
