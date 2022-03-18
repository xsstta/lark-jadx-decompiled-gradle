package io.reactivex.internal.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.C68978c;
import io.reactivex.internal.util.C68981f;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.observers.h */
public final class FutureC68384h<T> extends CountDownLatch implements Disposable, AbstractC69009q<T>, Future<T> {

    /* renamed from: a */
    T f171700a;

    /* renamed from: b */
    Throwable f171701b;

    /* renamed from: c */
    final AtomicReference<Disposable> f171702c = new AtomicReference<>();

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }

    public FutureC68384h() {
        super(1);
    }

    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.f171702c.get());
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
            Throwable th = this.f171701b;
            if (th == null) {
                return this.f171700a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        Disposable disposable;
        if (this.f171700a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            disposable = this.f171702c.get();
            if (disposable == this || disposable == DisposableHelper.DISPOSED) {
                return;
            }
        } while (!this.f171702c.compareAndSet(disposable, this));
        countDown();
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.f171702c, disposable);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        if (this.f171700a != null) {
            this.f171702c.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.f171700a = t;
    }

    public boolean cancel(boolean z) {
        Disposable disposable;
        do {
            disposable = this.f171702c.get();
            if (disposable == this || disposable == DisposableHelper.DISPOSED) {
                return false;
            }
        } while (!this.f171702c.compareAndSet(disposable, DisposableHelper.DISPOSED));
        if (disposable != null) {
            disposable.dispose();
        }
        countDown();
        return true;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        Disposable disposable;
        if (this.f171701b == null) {
            this.f171701b = th;
            do {
                disposable = this.f171702c.get();
                if (disposable == this || disposable == DisposableHelper.DISPOSED) {
                    RxJavaPlugins.onError(th);
                    return;
                }
            } while (!this.f171702c.compareAndSet(disposable, this));
            countDown();
            return;
        }
        RxJavaPlugins.onError(th);
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
            Throwable th = this.f171701b;
            if (th == null) {
                return this.f171700a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
