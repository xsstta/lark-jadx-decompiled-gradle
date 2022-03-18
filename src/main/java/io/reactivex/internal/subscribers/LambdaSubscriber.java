package io.reactivex.internal.subscribers;

import io.reactivex.AbstractC68325i;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70022d;

public final class LambdaSubscriber<T> extends AtomicReference<AbstractC70022d> implements Disposable, AbstractC68325i<T>, AbstractC70022d {
    private static final long serialVersionUID = -7251123623727029452L;
    final AbstractC68309a onComplete;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onNext;
    final Consumer<? super AbstractC70022d> onSubscribe;

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        cancel();
    }

    public boolean hasCustomOnError() {
        if (this.onError != C68326a.f171644f) {
            return true;
        }
        return false;
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
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
        }
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        ((AbstractC70022d) get()).request(j);
    }

    @Override // org.p3511d.AbstractC70021c
    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                ((AbstractC70022d) get()).cancel();
                onError(th);
            }
        }
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                dVar.cancel();
                onError(th);
            }
        }
    }

    @Override // org.p3511d.AbstractC70021c
    public void onError(Throwable th) {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
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

    public LambdaSubscriber(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, Consumer<? super AbstractC70022d> consumer3) {
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = aVar;
        this.onSubscribe = consumer3;
    }
}
