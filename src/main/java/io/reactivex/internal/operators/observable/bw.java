package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.C68991m;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class bw<T> extends AbstractC68651a<T, C68991m<T>> {

    /* renamed from: io.reactivex.internal.operators.observable.bw$a */
    static final class C68734a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super C68991m<T>> f172361a;

        /* renamed from: b */
        Disposable f172362b;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172362b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172362b.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172361a.onNext(C68991m.m265593f());
            this.f172361a.onComplete();
        }

        C68734a(AbstractC69009q<? super C68991m<T>> qVar) {
            this.f172361a = qVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172361a.onNext(C68991m.m265592a(th));
            this.f172361a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172361a.onNext(C68991m.m265591a((Object) t));
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172362b, disposable)) {
                this.f172362b = disposable;
                this.f172361a.onSubscribe(this);
            }
        }
    }

    public bw(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super C68991m<T>> qVar) {
        this.f172123a.subscribe(new C68734a(qVar));
    }
}
