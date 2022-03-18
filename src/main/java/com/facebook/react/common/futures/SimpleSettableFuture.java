package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SimpleSettableFuture<T> implements Future<T> {

    /* renamed from: a */
    private final CountDownLatch f51498a = new CountDownLatch(1);

    /* renamed from: b */
    private T f51499b;

    /* renamed from: c */
    private Exception f51500c;

    public boolean isCancelled() {
        return false;
    }

    /* renamed from: a */
    public T mo71759a() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isDone() {
        if (this.f51498a.getCount() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m76736b() {
        if (this.f51498a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        this.f51498a.await();
        if (this.f51500c == null) {
            return this.f51499b;
        }
        throw new ExecutionException(this.f51500c);
    }

    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo71760a(Exception exc) {
        m76736b();
        this.f51500c = exc;
        this.f51498a.countDown();
    }

    /* renamed from: a */
    public void mo71761a(T t) {
        m76736b();
        this.f51499b = t;
        this.f51498a.countDown();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (!this.f51498a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        } else if (this.f51500c == null) {
            return this.f51499b;
        } else {
            throw new ExecutionException(this.f51500c);
        }
    }
}
