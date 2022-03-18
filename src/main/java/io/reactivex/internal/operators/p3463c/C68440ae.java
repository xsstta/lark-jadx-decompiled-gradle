package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;

/* renamed from: io.reactivex.internal.operators.c.ae */
public final class C68440ae<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171785a;

    public C68440ae(AbstractC69015w<T> wVar) {
        this.f171785a = wVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171785a.subscribe(tVar);
    }
}
