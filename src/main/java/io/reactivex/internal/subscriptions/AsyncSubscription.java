package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70022d;

public final class AsyncSubscription extends AtomicLong implements Disposable, AbstractC70022d {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<AbstractC70022d> actual;
    final AtomicReference<Disposable> resource;

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (this.actual.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    public boolean replaceResource(Disposable disposable) {
        return DisposableHelper.replace(this.resource, disposable);
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.actual, this, j);
    }

    public boolean setResource(Disposable disposable) {
        return DisposableHelper.set(this.resource, disposable);
    }

    public void setSubscription(AbstractC70022d dVar) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, dVar);
    }

    public AsyncSubscription(Disposable disposable) {
        this();
        this.resource.lazySet(disposable);
    }
}
