package io.reactivex.internal.subscriptions;

import io.reactivex.internal.p3460b.AbstractC68370g;
import org.p3511d.AbstractC70021c;

public enum EmptySubscription implements AbstractC68370g<Object> {
    INSTANCE;

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public void clear() {
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public Object poll() {
        return null;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68369f
    public int requestFusion(int i) {
        return i & 2;
    }

    public String toString() {
        return "EmptySubscription";
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(AbstractC70021c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void error(Throwable th, AbstractC70021c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
