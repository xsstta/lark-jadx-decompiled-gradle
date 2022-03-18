package io.reactivex.internal.subscribers;

import io.reactivex.AbstractC68325i;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68977b;
import java.util.concurrent.atomic.AtomicLong;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements AbstractC68325i<T>, AbstractC70022d {
    private static final long serialVersionUID = 7917814472626990048L;
    protected final AbstractC70021c<? super R> downstream;
    protected long produced;
    protected AbstractC70022d upstream;
    protected R value;

    /* access modifiers changed from: protected */
    public void onDrop(R r) {
    }

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        this.upstream.cancel();
    }

    public SinglePostCompleteSubscriber(AbstractC70021c<? super R> cVar) {
        this.downstream = cVar;
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // org.p3511d.AbstractC70022d
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, C68977b.m265547a(j2, j)));
            this.upstream.request(j);
        }
    }

    /* access modifiers changed from: protected */
    public final void complete(R r) {
        long j = this.produced;
        if (j != 0) {
            C68977b.m265549b(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                onDrop(r);
                return;
            } else if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r;
                if (!compareAndSet(0, Long.MIN_VALUE)) {
                    this.value = null;
                } else {
                    return;
                }
            }
        }
    }
}
