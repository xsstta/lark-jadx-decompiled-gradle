package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.ag */
public final class C68669ag<T, U> extends Observable<T> {

    /* renamed from: a */
    final ObservableSource<? extends T> f172168a;

    /* renamed from: b */
    final ObservableSource<U> f172169b;

    /* renamed from: io.reactivex.internal.operators.observable.ag$a */
    final class C68670a implements AbstractC69009q<U> {

        /* renamed from: a */
        final SequentialDisposable f172170a;

        /* renamed from: b */
        final AbstractC69009q<? super T> f172171b;

        /* renamed from: c */
        boolean f172172c;

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.observable.ag$a$a */
        public final class C68671a implements AbstractC69009q<T> {
            @Override // io.reactivex.AbstractC69009q
            public void onComplete() {
                C68670a.this.f172171b.onComplete();
            }

            C68671a() {
            }

            @Override // io.reactivex.AbstractC69009q
            public void onError(Throwable th) {
                C68670a.this.f172171b.onError(th);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onNext(T t) {
                C68670a.this.f172171b.onNext(t);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                C68670a.this.f172170a.update(disposable);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172172c) {
                this.f172172c = true;
                C68669ag.this.f172168a.subscribe(new C68671a());
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(U u) {
            onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.f172170a.update(disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172172c) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172172c = true;
            this.f172171b.onError(th);
        }

        C68670a(SequentialDisposable sequentialDisposable, AbstractC69009q<? super T> qVar) {
            this.f172170a = sequentialDisposable;
            this.f172171b = qVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        qVar.onSubscribe(sequentialDisposable);
        this.f172169b.subscribe(new C68670a(sequentialDisposable, qVar));
    }

    public C68669ag(ObservableSource<? extends T> observableSource, ObservableSource<U> observableSource2) {
        this.f172168a = observableSource;
        this.f172169b = observableSource2;
    }
}
