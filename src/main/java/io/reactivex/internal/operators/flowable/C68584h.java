package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.h */
public final class C68584h<T, R> extends AbstractC68307f<R> {

    /* renamed from: b */
    final AbstractC70020b<T> f172022b;

    /* renamed from: c */
    final Function<? super T, ? extends AbstractC70020b<? extends R>> f172023c;

    /* renamed from: d */
    final int f172024d;

    /* renamed from: e */
    final ErrorMode f172025e;

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super R> cVar) {
        if (!ap.m265312a(this.f172022b, cVar, this.f172023c)) {
            this.f172022b.subscribe(C68574f.m265327a(cVar, this.f172023c, this.f172024d, this.f172025e));
        }
    }

    public C68584h(AbstractC70020b<T> bVar, Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i, ErrorMode errorMode) {
        this.f172022b = bVar;
        this.f172023c = function;
        this.f172024d = i;
        this.f172025e = errorMode;
    }
}
