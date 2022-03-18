package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.p3459a.C68326a;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: io.reactivex.internal.schedulers.a */
public abstract class AbstractC68928a extends AtomicReference<Future<?>> implements Disposable {
    protected static final FutureTask<Void> DISPOSED = new FutureTask<>(C68326a.f171640b, null);
    protected static final FutureTask<Void> FINISHED = new FutureTask<>(C68326a.f171640b, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    public Runnable getWrappedRunnable() {
        return this.runnable;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        Future future = (Future) get();
        if (future == FINISHED || future == DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z;
        Future future = (Future) get();
        if (future != FINISHED && future != (futureTask = DISPOSED) && compareAndSet(future, futureTask) && future != null) {
            if (this.runner != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    AbstractC68928a(Runnable runnable2) {
        this.runnable = runnable2;
    }

    public final void setFuture(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) get();
            if (future2 != FINISHED) {
                if (future2 == DISPOSED) {
                    if (this.runner != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
