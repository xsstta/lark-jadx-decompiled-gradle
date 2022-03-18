package io.reactivex.internal.subscriptions;

import org.p3511d.AbstractC70021c;

public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final AbstractC70021c<? super T> downstream;
    protected T value;

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final boolean isCancelled() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    public final boolean tryCancel() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.value;
        this.value = null;
        return t;
    }

    public DeferredScalarSubscription(AbstractC70021c<? super T> cVar) {
        this.downstream = cVar;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68369f
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // org.p3511d.AbstractC70022d
    public final void request(long j) {
        T t;
        if (SubscriptionHelper.validate(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3) && (t = this.value) != null) {
                            this.value = null;
                            AbstractC70021c<? super T> cVar = this.downstream;
                            cVar.onNext(t);
                            if (get() != 4) {
                                cVar.onComplete();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void complete(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    AbstractC70021c<? super T> cVar = this.downstream;
                    cVar.onNext(t);
                    if (get() != 4) {
                        cVar.onComplete();
                        return;
                    }
                    return;
                }
                this.value = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.value = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.value = t;
        lazySet(16);
        AbstractC70021c<? super T> cVar2 = this.downstream;
        cVar2.onNext(t);
        if (get() != 4) {
            cVar2.onComplete();
        }
    }
}
