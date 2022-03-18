package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.p3460b.AbstractCallableC68371h;

public final class bq<T> extends Observable<T> implements AbstractCallableC68371h<T> {

    /* renamed from: a */
    private final T f172339a;

    @Override // io.reactivex.internal.p3460b.AbstractCallableC68371h, java.util.concurrent.Callable
    public T call() {
        return this.f172339a;
    }

    public bq(T t) {
        this.f172339a = t;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(qVar, this.f172339a);
        qVar.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }
}
