package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC68989k;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeCallbackObserver<T> extends AtomicReference<Disposable> implements Disposable, AbstractC68989k<T> {
    private static final long serialVersionUID = -6076952298809384986L;
    final AbstractC68309a onComplete;
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
        return DisposableHelper.isDisposed((Disposable) get());
    }

    @Override // io.reactivex.AbstractC68989k
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            C68306a.m265071b(th);
            RxJavaPlugins.onError(th);
        }
    }

    @Override // io.reactivex.AbstractC68989k
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.AbstractC68989k
    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            RxJavaPlugins.onError(th);
        }
    }

    @Override // io.reactivex.AbstractC68989k
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            RxJavaPlugins.onError(new CompositeException(th, th2));
        }
    }

    public MaybeCallbackObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar) {
        this.onSuccess = consumer;
        this.onError = consumer2;
        this.onComplete = aVar;
    }
}
