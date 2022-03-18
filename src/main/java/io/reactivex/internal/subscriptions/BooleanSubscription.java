package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import org.p3511d.AbstractC70022d;

public final class BooleanSubscription extends AtomicBoolean implements AbstractC70022d {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        SubscriptionHelper.validate(j);
    }
}
