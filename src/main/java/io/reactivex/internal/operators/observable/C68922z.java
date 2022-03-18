package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.z */
public final class C68922z<T> extends AbstractC68651a<T, Long> {

    /* renamed from: io.reactivex.internal.operators.observable.z$a */
    static final class C68923a implements Disposable, AbstractC69009q<Object> {

        /* renamed from: a */
        final AbstractC69009q<? super Long> f172853a;

        /* renamed from: b */
        Disposable f172854b;

        /* renamed from: c */
        long f172855c;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172854b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172854b.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172853a.onNext(Long.valueOf(this.f172855c));
            this.f172853a.onComplete();
        }

        C68923a(AbstractC69009q<? super Long> qVar) {
            this.f172853a = qVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172853a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(Object obj) {
            this.f172855c++;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172854b, disposable)) {
                this.f172854b = disposable;
                this.f172853a.onSubscribe(this);
            }
        }
    }

    public C68922z(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Long> qVar) {
        this.f172123a.subscribe(new C68923a(qVar));
    }
}
