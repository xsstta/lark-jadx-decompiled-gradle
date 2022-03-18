package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class ObserverResourceWrapper<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<T> {
    private static final long serialVersionUID = -8612022020200669122L;
    final AbstractC69009q<? super T> downstream;
    final AtomicReference<Disposable> upstream = new AtomicReference<>();

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (this.upstream.get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public ObserverResourceWrapper(AbstractC69009q<? super T> qVar) {
        this.downstream = qVar;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this.upstream, disposable)) {
            this.downstream.onSubscribe(this);
        }
    }
}
