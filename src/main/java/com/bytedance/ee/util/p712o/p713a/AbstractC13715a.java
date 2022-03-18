package com.bytedance.ee.util.p712o.p713a;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;

/* renamed from: com.bytedance.ee.util.o.a.a */
public abstract class AbstractC13715a<T> extends Observable<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo50681a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50682a(AbstractC69009q<? super T> qVar);

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public final void subscribeActual(AbstractC69009q<? super T> qVar) {
        mo50682a(qVar);
        qVar.onNext(mo50681a());
    }
}
