package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.u */
public final class CallableC68624u<T> extends AbstractC68307f<T> implements Callable<T> {

    /* renamed from: b */
    final Callable<? extends T> f172083b;

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) C68362b.m265229a(this.f172083b.call(), "The callable returned a null value");
    }

    public CallableC68624u(Callable<? extends T> callable) {
        this.f172083b = callable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.internal.subscriptions.DeferredScalarSubscription */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(cVar);
        cVar.onSubscribe(deferredScalarSubscription);
        try {
            deferredScalarSubscription.complete(C68362b.m265229a(this.f172083b.call(), "The callable returned a null value"));
        } catch (Throwable th) {
            C68306a.m265071b(th);
            if (deferredScalarSubscription.isCancelled()) {
                RxJavaPlugins.onError(th);
            } else {
                cVar.onError(th);
            }
        }
    }
}
