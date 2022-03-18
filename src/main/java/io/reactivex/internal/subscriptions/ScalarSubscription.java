package io.reactivex.internal.subscriptions;

import io.reactivex.internal.p3460b.AbstractC68370g;
import java.util.concurrent.atomic.AtomicInteger;
import org.p3511d.AbstractC70021c;

public final class ScalarSubscription<T> extends AtomicInteger implements AbstractC68370g<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final AbstractC70021c<? super T> subscriber;
    final T value;

    @Override // io.reactivex.internal.p3460b.AbstractC68369f
    public int requestFusion(int i) {
        return i & 1;
    }

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        if (get() == 2) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        if (SubscriptionHelper.validate(j) && compareAndSet(0, 1)) {
            AbstractC70021c<? super T> cVar = this.subscriber;
            cVar.onNext(this.value);
            if (get() != 2) {
                cVar.onComplete();
            }
        }
    }

    public ScalarSubscription(AbstractC70021c<? super T> cVar, T t) {
        this.subscriber = cVar;
        this.value = t;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
