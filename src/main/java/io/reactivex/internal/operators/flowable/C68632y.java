package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.y */
public final class C68632y<T> extends AbstractC68307f<T> {

    /* renamed from: b */
    final AbstractC70020b<? extends T> f172091b;

    public C68632y(AbstractC70020b<? extends T> bVar) {
        this.f172091b = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f172091b.subscribe(cVar);
    }
}
