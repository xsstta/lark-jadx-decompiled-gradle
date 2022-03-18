package io.reactivex.internal.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<T> {
    private static final long serialVersionUID = -7251123623727029452L;
    final AbstractC68309a onComplete;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onNext;
    final Consumer<? super Disposable> onSubscribe;

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

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                ((Disposable) get()).dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                disposable.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                RxJavaPlugins.onError(new CompositeException(th, th2));
            }
        } else {
            RxJavaPlugins.onError(th);
        }
    }

    public LambdaObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, Consumer<? super Disposable> consumer3) {
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = aVar;
        this.onSubscribe = consumer3;
    }
}
