package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class bd<T> extends Observable<T> {

    /* renamed from: a */
    final Future<? extends T> f172264a;

    /* renamed from: b */
    final long f172265b;

    /* renamed from: c */
    final TimeUnit f172266c;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.internal.observers.DeferredScalarDisposable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        Object obj;
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(qVar);
        qVar.onSubscribe(deferredScalarDisposable);
        if (!deferredScalarDisposable.isDisposed()) {
            try {
                TimeUnit timeUnit = this.f172266c;
                if (timeUnit != null) {
                    obj = this.f172264a.get(this.f172265b, timeUnit);
                } else {
                    obj = this.f172264a.get();
                }
                deferredScalarDisposable.complete(C68362b.m265229a(obj, "Future returned null"));
            } catch (Throwable th) {
                C68306a.m265071b(th);
                if (!deferredScalarDisposable.isDisposed()) {
                    qVar.onError(th);
                }
            }
        }
    }

    public bd(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f172264a = future;
        this.f172265b = j;
        this.f172266c = timeUnit;
    }
}
