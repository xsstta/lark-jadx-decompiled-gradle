package io.reactivex.internal.subscribers;

import io.reactivex.AbstractC68325i;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements Disposable, AbstractC68325i<T>, AbstractC70022d {
    private static final long serialVersionUID = -8612022020200669122L;
    final AbstractC70021c<? super T> downstream;
    final AtomicReference<AbstractC70022d> upstream = new AtomicReference<>();

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // org.p3511d.AbstractC70021c
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }

    @Override // org.p3511d.AbstractC70021c
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public SubscriberResourceWrapper(AbstractC70021c<? super T> cVar) {
        this.downstream = cVar;
    }

    @Override // org.p3511d.AbstractC70021c
    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            this.upstream.get().request(j);
        }
    }
}
