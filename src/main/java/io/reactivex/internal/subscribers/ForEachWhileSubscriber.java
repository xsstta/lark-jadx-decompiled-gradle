package io.reactivex.internal.subscribers;

import io.reactivex.AbstractC68325i;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70022d;

public final class ForEachWhileSubscriber<T> extends AtomicReference<AbstractC70022d> implements Disposable, AbstractC68325i<T> {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final AbstractC68309a onComplete;
    final Consumer<? super Throwable> onError;
    final AbstractC68322n<? super T> onNext;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // org.p3511d.AbstractC70021c
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

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
    }

    @Override // org.p3511d.AbstractC70021c
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

    @Override // org.p3511d.AbstractC70021c
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

    public ForEachWhileSubscriber(AbstractC68322n<? super T> nVar, Consumer<? super Throwable> consumer, AbstractC68309a aVar) {
        this.onNext = nVar;
        this.onError = consumer;
        this.onComplete = aVar;
    }
}
