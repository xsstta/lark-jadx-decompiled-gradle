package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.s */
public final class C68619s<T, U> extends AbstractC68307f<U> {

    /* renamed from: b */
    final AbstractC70020b<T> f172077b;

    /* renamed from: c */
    final Function<? super T, ? extends AbstractC70020b<? extends U>> f172078c;

    /* renamed from: d */
    final boolean f172079d;

    /* renamed from: e */
    final int f172080e;

    /* renamed from: f */
    final int f172081f;

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super U> cVar) {
        if (!ap.m265312a(this.f172077b, cVar, this.f172078c)) {
            this.f172077b.subscribe(C68616r.m265340a(cVar, this.f172078c, this.f172079d, this.f172080e, this.f172081f));
        }
    }

    public C68619s(AbstractC70020b<T> bVar, Function<? super T, ? extends AbstractC70020b<? extends U>> function, boolean z, int i, int i2) {
        this.f172077b = bVar;
        this.f172078c = function;
        this.f172079d = z;
        this.f172080e = i;
        this.f172081f = i2;
    }
}
