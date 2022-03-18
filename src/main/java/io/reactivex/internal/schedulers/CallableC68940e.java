package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.e */
final class CallableC68940e implements Disposable, Callable<Void> {

    /* renamed from: f */
    static final FutureTask<Void> f172895f = new FutureTask<>(C68326a.f171640b, null);

    /* renamed from: a */
    final Runnable f172896a;

    /* renamed from: b */
    final AtomicReference<Future<?>> f172897b = new AtomicReference<>();

    /* renamed from: c */
    final AtomicReference<Future<?>> f172898c = new AtomicReference<>();

    /* renamed from: d */
    final ExecutorService f172899d;

    /* renamed from: e */
    Thread f172900e;

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (this.f172898c.get() == f172895f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Void call() throws Exception {
        this.f172900e = Thread.currentThread();
        try {
            this.f172896a.run();
            mo238653b(this.f172899d.submit(this));
            this.f172900e = null;
        } catch (Throwable th) {
            this.f172900e = null;
            RxJavaPlugins.onError(th);
        }
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        boolean z;
        AtomicReference<Future<?>> atomicReference = this.f172898c;
        FutureTask<Void> futureTask = f172895f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        boolean z2 = true;
        if (!(andSet == null || andSet == futureTask)) {
            if (this.f172900e != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            andSet.cancel(z);
        }
        Future<?> andSet2 = this.f172897b.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.f172900e == Thread.currentThread()) {
                z2 = false;
            }
            andSet2.cancel(z2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo238652a(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = this.f172898c.get();
            if (future2 == f172895f) {
                if (this.f172900e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!this.f172898c.compareAndSet(future2, future));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo238653b(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = this.f172897b.get();
            if (future2 == f172895f) {
                if (this.f172900e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!this.f172897b.compareAndSet(future2, future));
    }

    CallableC68940e(Runnable runnable, ExecutorService executorService) {
        this.f172896a = runnable;
        this.f172899d = executorService;
    }
}
