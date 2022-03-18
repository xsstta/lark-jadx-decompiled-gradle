package io.reactivex.internal.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

public final class BlockingObserver<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<T> {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
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
        this.queue.offer(NotificationLite.complete());
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public BlockingObserver(Queue<Object> queue2) {
        this.queue = queue2;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }
}
