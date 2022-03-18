package io.reactivex.internal.observers;

import io.reactivex.AbstractC69012t;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class ConsumerSingleObserver<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<T> {
    private static final long serialVersionUID = -7012088219455310787L;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onSuccess;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        if (this.onError != C68326a.f171644f) {
            return true;
        }
        return false;
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

    @Override // io.reactivex.AbstractC69012t
    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            RxJavaPlugins.onError(th);
        }
    }

    @Override // io.reactivex.AbstractC69012t
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            RxJavaPlugins.onError(new CompositeException(th, th2));
        }
    }

    public ConsumerSingleObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        this.onSuccess = consumer;
        this.onError = consumer2;
    }
}
