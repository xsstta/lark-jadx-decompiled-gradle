package com.facebook.common.executors;

import android.os.Handler;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: com.facebook.common.executors.c */
public class C21015c extends AbstractExecutorService implements AbstractScheduledExecutorServiceC21014b {
    private final Handler mHandler;

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public void quit() {
        this.mHandler.getLooper().quit();
    }

    public boolean isHandlerThread() {
        if (Thread.currentThread() == this.mHandler.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    public C21015c(Handler handler) {
        this.mHandler = handler;
    }

    public void execute(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFutureC21016d<T> newTaskFor(Callable<T> callable) {
        return new RunnableFutureC21016d<>(this.mHandler, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, (Object) null);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        Objects.requireNonNull(callable);
        RunnableFutureC21016d<T> newTaskFor = newTaskFor((Callable) callable);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFutureC21016d<T> newTaskFor(Runnable runnable, @Nullable T t) {
        return new RunnableFutureC21016d<>(this.mHandler, runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> ScheduledFuture<T> submit(Runnable runnable, @Nullable T t) {
        Objects.requireNonNull(runnable);
        RunnableFutureC21016d<T> newTaskFor = newTaskFor(runnable, (Object) t);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC21016d newTaskFor = newTaskFor(runnable, (Object) null);
        this.mHandler.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        RunnableFutureC21016d newTaskFor = newTaskFor((Callable) callable);
        this.mHandler.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
