package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class dc<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172505b;

    /* renamed from: io.reactivex.internal.operators.observable.dc$a */
    static final class C68801a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172506a;

        /* renamed from: b */
        long f172507b;

        /* renamed from: c */
        Disposable f172508c;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172508c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172508c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172506a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172506a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172508c, disposable)) {
                this.f172508c = disposable;
                this.f172506a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            long j = this.f172507b;
            if (j != 0) {
                this.f172507b = j - 1;
            } else {
                this.f172506a.onNext(t);
            }
        }

        C68801a(AbstractC69009q<? super T> qVar, long j) {
            this.f172506a = qVar;
            this.f172507b = j;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68801a(qVar, this.f172505b));
    }

    public dc(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f172505b = j;
    }
}
