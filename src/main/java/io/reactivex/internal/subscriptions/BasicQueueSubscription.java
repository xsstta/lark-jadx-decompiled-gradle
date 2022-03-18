package io.reactivex.internal.subscriptions;

import io.reactivex.internal.p3460b.AbstractC68370g;
import java.util.concurrent.atomic.AtomicLong;

public abstract class BasicQueueSubscription<T> extends AtomicLong implements AbstractC68370g<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
