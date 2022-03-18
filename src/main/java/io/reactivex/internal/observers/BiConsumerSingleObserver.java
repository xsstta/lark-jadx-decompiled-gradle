package io.reactivex.internal.observers;

import io.reactivex.AbstractC69012t;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68310b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class BiConsumerSingleObserver<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<T> {
    private static final long serialVersionUID = 4943102778943297569L;
    final AbstractC68310b<? super T, ? super Throwable> onCallback;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.AbstractC69012t
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public BiConsumerSingleObserver(AbstractC68310b<? super T, ? super Throwable> bVar) {
        this.onCallback = bVar;
    }

    @Override // io.reactivex.AbstractC69012t
    public void onSuccess(T t) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.accept(t, null);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            RxJavaPlugins.onError(th);
        }
    }

    @Override // io.reactivex.AbstractC69012t
    public void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.accept(null, th);
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            RxJavaPlugins.onError(new CompositeException(th, th2));
        }
    }
}
