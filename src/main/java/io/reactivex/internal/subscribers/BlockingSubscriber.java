package io.reactivex.internal.subscribers;

import io.reactivex.AbstractC68325i;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70022d;

public final class BlockingSubscriber<T> extends AtomicReference<AbstractC70022d> implements AbstractC68325i<T>, AbstractC70022d {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        if (get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // org.p3511d.AbstractC70021c
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    public BlockingSubscriber(Queue<Object> queue2) {
        this.queue = queue2;
    }

    @Override // org.p3511d.AbstractC70021c
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // org.p3511d.AbstractC70021c
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        ((AbstractC70022d) get()).request(j);
    }
}
