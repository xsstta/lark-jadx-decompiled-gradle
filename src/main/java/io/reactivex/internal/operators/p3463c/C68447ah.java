package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.Single;
import io.reactivex.disposables.C68290b;

/* renamed from: io.reactivex.internal.operators.c.ah */
public final class C68447ah<T> extends Single<T> {

    /* renamed from: a */
    final T f171792a;

    public C68447ah(T t) {
        this.f171792a = t;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        tVar.onSubscribe(C68290b.m265041b());
        tVar.onSuccess(this.f171792a);
    }
}
