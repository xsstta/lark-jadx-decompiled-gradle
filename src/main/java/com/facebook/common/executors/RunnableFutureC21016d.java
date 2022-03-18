package com.facebook.common.executors;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;

/* renamed from: com.facebook.common.executors.d */
public class RunnableFutureC21016d<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a */
    private final Handler f51409a;

    /* renamed from: b */
    private final FutureTask<V> f51410b;

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.f51410b.get();
    }

    public boolean isCancelled() {
        return this.f51410b.isCancelled();
    }

    public boolean isDone() {
        return this.f51410b.isDone();
    }

    public void run() {
        this.f51410b.run();
    }

    /* renamed from: a */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    public boolean cancel(boolean z) {
        return this.f51410b.cancel(z);
    }

    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f51410b.get(j, timeUnit);
    }

    public RunnableFutureC21016d(Handler handler, Callable<V> callable) {
        this.f51409a = handler;
        this.f51410b = new FutureTask<>(callable);
    }

    public RunnableFutureC21016d(Handler handler, Runnable runnable, @Nullable V v) {
        this.f51409a = handler;
        this.f51410b = new FutureTask<>(runnable, v);
    }
}
