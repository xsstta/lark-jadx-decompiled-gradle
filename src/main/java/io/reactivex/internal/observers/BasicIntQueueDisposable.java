package io.reactivex.internal.observers;

import io.reactivex.internal.p3460b.AbstractC68368e;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements AbstractC68368e<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
