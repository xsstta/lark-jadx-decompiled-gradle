package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.c.e */
public final class C68474e<T> extends Single<T> {

    /* renamed from: a */
    final Callable<? extends AbstractC69015w<? extends T>> f171849a;

    public C68474e(Callable<? extends AbstractC69015w<? extends T>> callable) {
        this.f171849a = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        try {
            ((AbstractC69015w) C68362b.m265229a(this.f171849a.call(), "The singleSupplier returned a null SingleSource")).subscribe(tVar);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, tVar);
        }
    }
}
