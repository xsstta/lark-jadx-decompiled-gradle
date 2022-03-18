package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC68990l;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.x */
public final class C68918x<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68990l<? extends T> f172851b;

    /* renamed from: io.reactivex.internal.operators.observable.x$a */
    static final class C68919a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC68989k<T>, AbstractC69009q<T> {
        private static final long serialVersionUID = -1953724749712440952L;
        final AbstractC69009q<? super T> downstream;
        boolean inMaybe;
        AbstractC68990l<? extends T> other;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69009q
        public void onComplete() {
            if (this.inMaybe) {
                this.downstream.onComplete();
                return;
            }
            this.inMaybe = true;
            DisposableHelper.replace(this, null);
            AbstractC68990l<? extends T> lVar = this.other;
            this.other = null;
            lVar.mo238772a(this);
        }

        @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && !this.inMaybe) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSuccess(T t) {
            this.downstream.onNext(t);
            this.downstream.onComplete();
        }

        C68919a(AbstractC69009q<? super T> qVar, AbstractC68990l<? extends T> lVar) {
            this.downstream = qVar;
            this.other = lVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68919a(qVar, this.f172851b));
    }

    public C68918x(Observable<T> observable, AbstractC68990l<? extends T> lVar) {
        super(observable);
        this.f172851b = lVar;
    }
}
