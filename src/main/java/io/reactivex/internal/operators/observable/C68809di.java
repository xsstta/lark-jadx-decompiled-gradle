package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;

/* renamed from: io.reactivex.internal.operators.observable.di */
public final class C68809di<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final ObservableSource<? extends T> f172534b;

    /* renamed from: io.reactivex.internal.operators.observable.di$a */
    static final class C68810a<T> implements AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172535a;

        /* renamed from: b */
        final ObservableSource<? extends T> f172536b;

        /* renamed from: c */
        final SequentialDisposable f172537c = new SequentialDisposable();

        /* renamed from: d */
        boolean f172538d = true;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (this.f172538d) {
                this.f172538d = false;
                this.f172536b.subscribe(this);
                return;
            }
            this.f172535a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172535a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.f172537c.update(disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (this.f172538d) {
                this.f172538d = false;
            }
            this.f172535a.onNext(t);
        }

        C68810a(AbstractC69009q<? super T> qVar, ObservableSource<? extends T> observableSource) {
            this.f172535a = qVar;
            this.f172536b = observableSource;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68810a aVar = new C68810a(qVar, this.f172534b);
        qVar.onSubscribe(aVar.f172537c);
        this.f172123a.subscribe(aVar);
    }

    public C68809di(ObservableSource<T> observableSource, ObservableSource<? extends T> observableSource2) {
        super(observableSource);
        this.f172534b = observableSource2;
    }
}
