package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.observable.ae */
public final class C68663ae<T> extends Observable<T> {

    /* renamed from: a */
    final Callable<? extends ObservableSource<? extends T>> f172152a;

    public C68663ae(Callable<? extends ObservableSource<? extends T>> callable) {
        this.f172152a = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        try {
            ((ObservableSource) C68362b.m265229a(this.f172152a.call(), "null ObservableSource supplied")).subscribe(qVar);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, qVar);
        }
    }
}
