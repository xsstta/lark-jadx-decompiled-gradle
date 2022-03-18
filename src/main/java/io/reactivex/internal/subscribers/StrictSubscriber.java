package io.reactivex.internal.subscribers;

import io.reactivex.AbstractC68325i;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68983g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public class StrictSubscriber<T> extends AtomicInteger implements AbstractC68325i<T>, AbstractC70022d {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final AbstractC70021c<? super T> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<AbstractC70022d> upstream = new AtomicReference<>();

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        if (!this.done) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    @Override // org.p3511d.AbstractC70021c
    public void onComplete() {
        this.done = true;
        C68983g.m265567a(this.downstream, this, this.error);
    }

    @Override // org.p3511d.AbstractC70021c
    public void onNext(T t) {
        C68983g.m265565a((AbstractC70021c) this.downstream, (Object) t, (AtomicInteger) this, this.error);
    }

    @Override // org.p3511d.AbstractC70021c
    public void onError(Throwable th) {
        this.done = true;
        C68983g.m265566a((AbstractC70021c<?>) this.downstream, th, (AtomicInteger) this, this.error);
    }

    public StrictSubscriber(AbstractC70021c<? super T> cVar) {
        this.downstream = cVar;
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
            return;
        }
        dVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }
}
