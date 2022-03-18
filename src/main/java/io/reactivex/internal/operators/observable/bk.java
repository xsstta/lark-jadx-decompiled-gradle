package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;

public final class bk<T> extends AbstractC68651a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.bk$a */
    static final class C68709a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172294a;

        /* renamed from: b */
        Disposable f172295b;

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172295b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172295b.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172294a.onComplete();
        }

        C68709a(AbstractC69009q<? super T> qVar) {
            this.f172294a = qVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172294a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.f172295b = disposable;
            this.f172294a.onSubscribe(this);
        }
    }

    public bk(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68709a(qVar));
    }
}
