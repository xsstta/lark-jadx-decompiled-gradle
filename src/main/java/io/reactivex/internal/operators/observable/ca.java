package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class ca extends Observable<Object> {

    /* renamed from: a */
    public static final Observable<Object> f172370a = new ca();

    private ca() {
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Object> qVar) {
        qVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
