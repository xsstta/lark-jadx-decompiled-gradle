package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.v */
public final class C68625v<T> extends AbstractC68307f<T> {

    /* renamed from: b */
    final Future<? extends T> f172084b;

    /* renamed from: c */
    final long f172085c;

    /* renamed from: d */
    final TimeUnit f172086d;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.internal.subscriptions.DeferredScalarSubscription */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        Object obj;
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(cVar);
        cVar.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.f172086d;
            if (timeUnit != null) {
                obj = this.f172084b.get(this.f172085c, timeUnit);
            } else {
                obj = this.f172084b.get();
            }
            if (obj == null) {
                cVar.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(obj);
            }
        } catch (Throwable th) {
            C68306a.m265071b(th);
            if (!deferredScalarSubscription.isCancelled()) {
                cVar.onError(th);
            }
        }
    }

    public C68625v(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f172084b = future;
        this.f172085c = j;
        this.f172086d = timeUnit;
    }
}
