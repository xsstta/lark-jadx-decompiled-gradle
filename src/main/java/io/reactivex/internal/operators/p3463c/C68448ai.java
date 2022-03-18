package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69014v;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;

/* renamed from: io.reactivex.internal.operators.c.ai */
public final class C68448ai<T, R> extends Single<R> {

    /* renamed from: a */
    final AbstractC69015w<T> f171793a;

    /* renamed from: b */
    final AbstractC69014v<? extends R, ? super T> f171794b;

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super R> tVar) {
        try {
            this.f171793a.subscribe((AbstractC69012t) C68362b.m265229a((Object) this.f171794b.mo238793a(tVar), "The onLift returned a null SingleObserver"));
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, tVar);
        }
    }

    public C68448ai(AbstractC69015w<T> wVar, AbstractC69014v<? extends R, ? super T> vVar) {
        this.f171793a = wVar;
        this.f171794b = vVar;
    }
}
