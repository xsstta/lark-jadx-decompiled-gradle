package io.reactivex.internal.observers;

import io.reactivex.AbstractC68273c;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class CallbackCompletableObserver extends AtomicReference<Disposable> implements AbstractC68273c, Disposable, Consumer<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final AbstractC68309a onComplete;
    final Consumer<? super Throwable> onError;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        if (this.onError != this) {
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

    @Override // io.reactivex.AbstractC68273c
    public void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            C68306a.m265071b(th);
            RxJavaPlugins.onError(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.AbstractC68273c
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public CallbackCompletableObserver(AbstractC68309a aVar) {
        this.onError = this;
        this.onComplete = aVar;
    }

    public void accept(Throwable th) {
        RxJavaPlugins.onError(new OnErrorNotImplementedException(th));
    }

    @Override // io.reactivex.AbstractC68273c
    public void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            RxJavaPlugins.onError(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public CallbackCompletableObserver(Consumer<? super Throwable> consumer, AbstractC68309a aVar) {
        this.onError = consumer;
        this.onComplete = aVar;
    }
}
