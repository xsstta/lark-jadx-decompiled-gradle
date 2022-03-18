package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;

/* renamed from: io.reactivex.internal.operators.observable.bg */
public final class C68702bg<T> extends Observable<T> {

    /* renamed from: a */
    final ObservableSource<T> f172277a;

    public C68702bg(ObservableSource<T> observableSource) {
        this.f172277a = observableSource;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172277a.subscribe(qVar);
    }
}
