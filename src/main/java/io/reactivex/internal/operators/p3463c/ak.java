package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.C68991m;
import io.reactivex.Single;
import io.reactivex.internal.operators.p3462b.C68408a;

/* renamed from: io.reactivex.internal.operators.c.ak */
public final class ak<T> extends Single<C68991m<T>> {

    /* renamed from: a */
    final Single<T> f171799a;

    public ak(Single<T> single) {
        this.f171799a = single;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super C68991m<T>> tVar) {
        this.f171799a.subscribe(new C68408a(tVar));
    }
}
