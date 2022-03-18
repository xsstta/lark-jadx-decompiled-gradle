package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.observable.at */
public final class C68684at<T> extends Observable<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f172235a;

    public C68684at(Callable<? extends Throwable> callable) {
        this.f172235a = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        Throwable th;
        try {
            th = (Throwable) C68362b.m265229a(this.f172235a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            C68306a.m265071b(th);
        }
        EmptyDisposable.error(th, qVar);
    }
}
