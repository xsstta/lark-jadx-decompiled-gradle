package io.reactivex.internal.subscribers;

import io.reactivex.AbstractC68325i;
import io.reactivex.internal.p3460b.AbstractC68370g;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68987k;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70022d;

public final class InnerQueuedSubscriber<T> extends AtomicReference<AbstractC70022d> implements AbstractC68325i<T>, AbstractC70022d {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final AbstractC68971e<T> parent;
    final int prefetch;
    long produced;
    volatile AbstractC68373j<T> queue;

    public void setDone() {
        this.done = true;
    }

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    public AbstractC68373j<T> queue() {
        return this.queue;
    }

    @Override // org.p3511d.AbstractC70021c
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j = this.produced + 1;
            if (j == ((long) this.limit)) {
                this.produced = 0;
                ((AbstractC70022d) get()).request(j);
                return;
            }
            this.produced = j;
        }
    }

    @Override // org.p3511d.AbstractC70021c
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // org.p3511d.AbstractC70021c
    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        if (this.fusionMode != 1) {
            long j2 = this.produced + j;
            if (j2 >= ((long) this.limit)) {
                this.produced = 0;
                ((AbstractC70022d) get()).request(j2);
                return;
            }
            this.produced = j2;
        }
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            if (dVar instanceof AbstractC68370g) {
                AbstractC68370g gVar = (AbstractC68370g) dVar;
                int requestFusion = gVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = gVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = gVar;
                    C68987k.m265583a(dVar, this.prefetch);
                    return;
                }
            }
            this.queue = C68987k.m265581a(this.prefetch);
            C68987k.m265583a(dVar, this.prefetch);
        }
    }

    public InnerQueuedSubscriber(AbstractC68971e<T> eVar, int i) {
        this.parent = eVar;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }
}
