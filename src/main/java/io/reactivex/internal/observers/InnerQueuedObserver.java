package io.reactivex.internal.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3460b.AbstractC68368e;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.util.C68987k;
import java.util.concurrent.atomic.AtomicReference;

public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<T> {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final AbstractC68386j<T> parent;
    final int prefetch;
    AbstractC68373j<T> queue;

    public void setDone() {
        this.done = true;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public int fusionMode() {
        return this.fusionMode;
    }

    public boolean isDone() {
        return this.done;
    }

    public AbstractC68373j<T> queue() {
        return this.queue;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            if (disposable instanceof AbstractC68368e) {
                AbstractC68368e eVar = (AbstractC68368e) disposable;
                int requestFusion = eVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = eVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = eVar;
                    return;
                }
            }
            this.queue = C68987k.m265581a(-this.prefetch);
        }
    }

    public InnerQueuedObserver(AbstractC68386j<T> jVar, int i) {
        this.parent = jVar;
        this.prefetch = i;
    }
}
