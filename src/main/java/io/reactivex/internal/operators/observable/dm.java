package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class dm<T> extends AbstractC68651a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.dm$a */
    static final class C68815a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172548a;

        /* renamed from: b */
        Disposable f172549b;

        /* renamed from: c */
        T f172550c;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            mo238499a();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172549b.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172550c = null;
            this.f172549b.dispose();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238499a() {
            T t = this.f172550c;
            if (t != null) {
                this.f172550c = null;
                this.f172548a.onNext(t);
            }
            this.f172548a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172550c = t;
        }

        C68815a(AbstractC69009q<? super T> qVar) {
            this.f172548a = qVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172550c = null;
            this.f172548a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172549b, disposable)) {
                this.f172549b = disposable;
                this.f172548a.onSubscribe(this);
            }
        }
    }

    public dm(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68815a(qVar));
    }
}
