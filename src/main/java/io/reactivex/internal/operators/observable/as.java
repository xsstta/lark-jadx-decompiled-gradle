package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3460b.AbstractCallableC68371h;

public final class as extends Observable<Object> implements AbstractCallableC68371h<Object> {

    /* renamed from: a */
    public static final Observable<Object> f172234a = new as();

    @Override // io.reactivex.internal.p3460b.AbstractCallableC68371h, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    private as() {
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Object> qVar) {
        EmptyDisposable.complete(qVar);
    }
}
