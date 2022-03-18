package io.reactivex.internal.subscribers;

import io.reactivex.AbstractC68325i;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements AbstractC68325i<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    protected boolean hasValue;
    protected AbstractC70022d upstream;

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.p3511d.AbstractC70022d
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.reactivex.internal.subscribers.DeferredScalarSubscriber<T, R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p3511d.AbstractC70021c
    public void onComplete() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            this.downstream.onComplete();
        }
    }

    public DeferredScalarSubscriber(AbstractC70021c<? super R> cVar) {
        super(cVar);
    }

    @Override // org.p3511d.AbstractC70021c
    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            this.downstream.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
