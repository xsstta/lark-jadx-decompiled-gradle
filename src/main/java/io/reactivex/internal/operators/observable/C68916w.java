package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.w */
public final class C68916w<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68293e f172850b;

    /* renamed from: io.reactivex.internal.operators.observable.w$a */
    static final class C68917a<T> extends AtomicReference<Disposable> implements AbstractC68273c, Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -1953724749712440952L;
        final AbstractC69009q<? super T> downstream;
        boolean inCompletable;
        AbstractC68293e other;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC68273c, io.reactivex.AbstractC69009q
        public void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            DisposableHelper.replace(this, null);
            AbstractC68293e eVar = this.other;
            this.other = null;
            eVar.mo237885a(this);
        }

        @Override // io.reactivex.AbstractC68273c, io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.AbstractC68273c, io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && !this.inCompletable) {
                this.downstream.onSubscribe(this);
            }
        }

        C68917a(AbstractC69009q<? super T> qVar, AbstractC68293e eVar) {
            this.downstream = qVar;
            this.other = eVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68917a(qVar, this.f172850b));
    }

    public C68916w(Observable<T> observable, AbstractC68293e eVar) {
        super(observable);
        this.f172850b = eVar;
    }
}
