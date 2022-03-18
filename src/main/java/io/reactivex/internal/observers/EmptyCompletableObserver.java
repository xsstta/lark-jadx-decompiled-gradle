package io.reactivex.internal.observers;

import io.reactivex.AbstractC68273c;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class EmptyCompletableObserver extends AtomicReference<Disposable> implements AbstractC68273c, Disposable {
    private static final long serialVersionUID = -7545121636549663526L;

    public boolean hasCustomOnError() {
        return false;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.AbstractC68273c
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.AbstractC68273c
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.AbstractC68273c
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        RxJavaPlugins.onError(new OnErrorNotImplementedException(th));
    }
}
