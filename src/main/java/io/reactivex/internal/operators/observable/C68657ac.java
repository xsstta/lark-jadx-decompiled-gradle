package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.observers.AbstractC69002b;
import io.reactivex.observers.C69004d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.ac */
public final class C68657ac<T, U> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<U>> f172129b;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ac$a */
    public static final class C68658a<T, U> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172130a;

        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<U>> f172131b;

        /* renamed from: c */
        Disposable f172132c;

        /* renamed from: d */
        final AtomicReference<Disposable> f172133d = new AtomicReference<>();

        /* renamed from: e */
        volatile long f172134e;

        /* renamed from: f */
        boolean f172135f;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172132c.isDisposed();
        }

        /* renamed from: io.reactivex.internal.operators.observable.ac$a$a */
        static final class C68659a<T, U> extends AbstractC69002b<U> {

            /* renamed from: a */
            final C68658a<T, U> f172136a;

            /* renamed from: b */
            final long f172137b;

            /* renamed from: c */
            final T f172138c;

            /* renamed from: d */
            boolean f172139d;

            /* renamed from: e */
            final AtomicBoolean f172140e = new AtomicBoolean();

            @Override // io.reactivex.AbstractC69009q
            public void onComplete() {
                if (!this.f172139d) {
                    this.f172139d = true;
                    mo238321a();
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo238321a() {
                if (this.f172140e.compareAndSet(false, true)) {
                    this.f172136a.mo238320a(this.f172137b, this.f172138c);
                }
            }

            @Override // io.reactivex.AbstractC69009q
            public void onNext(U u) {
                if (!this.f172139d) {
                    this.f172139d = true;
                    dispose();
                    mo238321a();
                }
            }

            @Override // io.reactivex.AbstractC69009q
            public void onError(Throwable th) {
                if (this.f172139d) {
                    RxJavaPlugins.onError(th);
                    return;
                }
                this.f172139d = true;
                this.f172136a.onError(th);
            }

            C68659a(C68658a<T, U> aVar, long j, T t) {
                this.f172136a = aVar;
                this.f172137b = j;
                this.f172138c = t;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172132c.dispose();
            DisposableHelper.dispose(this.f172133d);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172135f) {
                this.f172135f = true;
                Disposable disposable = this.f172133d.get();
                if (disposable != DisposableHelper.DISPOSED) {
                    ((C68659a) disposable).mo238321a();
                    DisposableHelper.dispose(this.f172133d);
                    this.f172130a.onComplete();
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f172133d);
            this.f172130a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172132c, disposable)) {
                this.f172132c = disposable;
                this.f172130a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172135f) {
                long j = this.f172134e + 1;
                this.f172134e = j;
                Disposable disposable = this.f172133d.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                try {
                    ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.f172131b.apply(t), "The ObservableSource supplied is null");
                    C68659a aVar = new C68659a(this, j, t);
                    if (this.f172133d.compareAndSet(disposable, aVar)) {
                        observableSource.subscribe(aVar);
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    dispose();
                    this.f172130a.onError(th);
                }
            }
        }

        C68658a(AbstractC69009q<? super T> qVar, Function<? super T, ? extends ObservableSource<U>> function) {
            this.f172130a = qVar;
            this.f172131b = function;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238320a(long j, T t) {
            if (j == this.f172134e) {
                this.f172130a.onNext(t);
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68658a(new C69004d(qVar), this.f172129b));
    }

    public C68657ac(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<U>> function) {
        super(observableSource);
        this.f172129b = function;
    }
}
