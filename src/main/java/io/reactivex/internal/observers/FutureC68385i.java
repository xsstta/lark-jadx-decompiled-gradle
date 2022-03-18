package io.reactivex.internal.observers;

import io.reactivex.AbstractC69012t;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.C68978c;
import io.reactivex.internal.util.C68981f;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.observers.i */
public final class FutureC68385i<T> extends CountDownLatch implements Disposable, AbstractC69012t<T>, Future<T> {

    /* renamed from: a */
    T f171703a;

    /* renamed from: b */
    Throwable f171704b;

    /* renamed from: c */
    final AtomicReference<Disposable> f171705c = new AtomicReference<>();

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }

    public FutureC68385i() {
        super(1);
    }

    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f171705c.get());
    }

    public boolean isDone() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            C68978c.m265550a();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.f171704b;
            if (th == null) {
                return this.f171703a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.AbstractC69012t
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.f171705c, disposable);
    }

    @Override // io.reactivex.AbstractC69012t
    public void onError(Throwable th) {
        Disposable disposable;
        do {
            disposable = this.f171705c.get();
            if (disposable == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f171704b = th;
        } while (!this.f171705c.compareAndSet(disposable, this));
        countDown();
    }

    @Override // io.reactivex.AbstractC69012t
    public void onSuccess(T t) {
        Disposable disposable = this.f171705c.get();
        if (disposable != DisposableHelper.DISPOSED) {
            this.f171703a = t;
            this.f171705c.compareAndSet(disposable, this);
            countDown();
        }
    }

    public boolean cancel(boolean z) {
        Disposable disposable;
        do {
            disposable = this.f171705c.get();
            if (disposable == this || disposable == DisposableHelper.DISPOSED) {
                return false;
            }
        } while (!this.f171705c.compareAndSet(disposable, DisposableHelper.DISPOSED));
        if (disposable != null) {
            disposable.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            C68978c.m265550a();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(C68981f.m265558a(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f171704b;
            if (th == null) {
                return this.f171703a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
