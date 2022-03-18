package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class bc<T> extends Observable<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f172263a;

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) C68362b.m265229a(this.f172263a.call(), "The callable returned a null value");
    }

    public bc(Callable<? extends T> callable) {
        this.f172263a = callable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.internal.observers.DeferredScalarDisposable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(qVar);
        qVar.onSubscribe(deferredScalarDisposable);
        if (!deferredScalarDisposable.isDisposed()) {
            try {
                deferredScalarDisposable.complete(C68362b.m265229a(this.f172263a.call(), "Callable returned null"));
            } catch (Throwable th) {
                C68306a.m265071b(th);
                if (!deferredScalarDisposable.isDisposed()) {
                    qVar.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
