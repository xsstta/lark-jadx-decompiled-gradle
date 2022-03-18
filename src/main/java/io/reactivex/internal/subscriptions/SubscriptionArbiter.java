package io.reactivex.internal.subscriptions;

import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.C68977b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70022d;

public class SubscriptionArbiter extends AtomicInteger implements AbstractC70022d {
    private static final long serialVersionUID = -2189523197179400958L;
    AbstractC70022d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    final AtomicLong missedProduced = new AtomicLong();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicReference<AbstractC70022d> missedSubscription = new AtomicReference<>();
    long requested;
    protected boolean unbounded;

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            drain();
        }
    }

    /* access modifiers changed from: package-private */
    public final void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    /* access modifiers changed from: package-private */
    public final void drainLoop() {
        int i = 1;
        AbstractC70022d dVar = null;
        long j = 0;
        do {
            AbstractC70022d dVar2 = this.missedSubscription.get();
            if (dVar2 != null) {
                dVar2 = this.missedSubscription.getAndSet(null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0);
            }
            AbstractC70022d dVar3 = this.actual;
            if (this.cancelled) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.actual = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    j4 = C68977b.m265547a(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            SubscriptionHelper.reportMoreProduced(j4);
                            j4 = 0;
                        }
                    }
                    this.requested = j4;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.cancelOnReplace) {
                        dVar3.cancel();
                    }
                    this.actual = dVar2;
                    if (j4 != 0) {
                        j = C68977b.m265547a(j, j4);
                        dVar = dVar2;
                    }
                } else if (!(dVar3 == null || j2 == 0)) {
                    j = C68977b.m265547a(j, j2);
                    dVar = dVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            dVar.request(j);
        }
    }

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    public final void produced(long j) {
        if (!this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C68977b.m265548a(this.missedProduced, j);
                drain();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    SubscriptionHelper.reportMoreProduced(j3);
                    j3 = 0;
                }
                this.requested = j3;
            }
            if (decrementAndGet() != 0) {
                drainLoop();
            }
        }
    }

    @Override // org.p3511d.AbstractC70022d
    public final void request(long j) {
        if (SubscriptionHelper.validate(j) && !this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C68977b.m265548a(this.missedRequested, j);
                drain();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long a = C68977b.m265547a(j2, j);
                this.requested = a;
                if (a == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            AbstractC70022d dVar = this.actual;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (dVar != null) {
                dVar.request(j);
            }
        }
    }

    public final void setSubscription(AbstractC70022d dVar) {
        if (this.cancelled) {
            dVar.cancel();
            return;
        }
        C68362b.m265229a((Object) dVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            AbstractC70022d andSet = this.missedSubscription.getAndSet(dVar);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        AbstractC70022d dVar2 = this.actual;
        if (dVar2 != null && this.cancelOnReplace) {
            dVar2.cancel();
        }
        this.actual = dVar;
        long j = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j != 0) {
            dVar.request(j);
        }
    }
}
