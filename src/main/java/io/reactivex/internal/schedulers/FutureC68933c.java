package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: io.reactivex.internal.schedulers.c */
final class FutureC68933c implements Future<Object> {

    /* renamed from: a */
    final Disposable f172882a;

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }

    FutureC68933c(Disposable disposable) {
        this.f172882a = disposable;
    }

    public boolean cancel(boolean z) {
        this.f172882a.dispose();
        return false;
    }
}
