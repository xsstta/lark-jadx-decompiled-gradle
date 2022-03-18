package io.reactivex.internal.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class ForEachWhileObserver<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<T> {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final AbstractC68309a onComplete;
    final Consumer<? super Throwable> onError;
    final AbstractC68322n<? super T> onNext;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        if (!this.done) {
            this.done = true;
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        if (!this.done) {
            try {
                if (!this.onNext.test(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            RxJavaPlugins.onError(new CompositeException(th, th2));
        }
    }

    public ForEachWhileObserver(AbstractC68322n<? super T> nVar, Consumer<? super Throwable> consumer, AbstractC68309a aVar) {
        this.onNext = nVar;
        this.onError = consumer;
        this.onComplete = aVar;
    }
}
