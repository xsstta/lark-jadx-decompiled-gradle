package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.Single;
import io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: io.reactivex.internal.operators.c.al */
public final class al extends Single<Object> {

    /* renamed from: a */
    public static final Single<Object> f171800a = new al();

    private al() {
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super Object> tVar) {
        tVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
