package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class bj<T> extends AbstractC68651a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.bj$a */
    static final class C68708a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172292a;

        /* renamed from: b */
        Disposable f172293b;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172293b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172293b.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172292a.onComplete();
        }

        C68708a(AbstractC69009q<? super T> qVar) {
            this.f172292a = qVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172292a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172292a.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172293b, disposable)) {
                this.f172293b = disposable;
                this.f172292a.onSubscribe(this);
            }
        }
    }

    public bj(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68708a(qVar));
    }
}
