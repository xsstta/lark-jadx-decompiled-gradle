package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.y */
public final class C68920y<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC69015w<? extends T> f172852b;

    /* renamed from: io.reactivex.internal.operators.observable.y$a */
    static final class C68921a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<T>, AbstractC69012t<T> {
        private static final long serialVersionUID = -1953724749712440952L;
        final AbstractC69009q<? super T> downstream;
        boolean inSingle;
        AbstractC69015w<? extends T> other;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.inSingle = true;
            DisposableHelper.replace(this, null);
            AbstractC69015w<? extends T> wVar = this.other;
            this.other = null;
            wVar.subscribe(this);
        }

        @Override // io.reactivex.AbstractC69012t, io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.AbstractC69012t, io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && !this.inSingle) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.downstream.onNext(t);
            this.downstream.onComplete();
        }

        C68921a(AbstractC69009q<? super T> qVar, AbstractC69015w<? extends T> wVar) {
            this.downstream = qVar;
            this.other = wVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68921a(qVar, this.f172852b));
    }

    public C68920y(Observable<T> observable, AbstractC69015w<? extends T> wVar) {
        super(observable);
        this.f172852b = wVar;
    }
}
