package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.Single;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.c.v */
public final class C68509v<T> extends Single<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f171916a;

    public C68509v(Callable<? extends Throwable> callable) {
        this.f171916a = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        Throwable th;
        try {
            th = (Throwable) C68362b.m265229a(this.f171916a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            C68306a.m265071b(th);
        }
        EmptyDisposable.error(th, tVar);
    }
}
