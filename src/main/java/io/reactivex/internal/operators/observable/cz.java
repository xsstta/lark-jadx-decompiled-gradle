package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.observers.C69004d;

public final class cz<T> extends AbstractC68651a<T, T> {
    public cz(Observable<T> observable) {
        super(observable);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C69004d(qVar));
    }
}
