package com.huawei.hms.framework.common;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class ExecutorsEnhance {

    private static class DelegatedExecutorService extends AbstractExecutorService {

        /* renamed from: e */
        private final ExecutorService f58031e;

        DelegatedExecutorService(ExecutorService executorService) {
            this.f58031e = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.f58031e.awaitTermination(j, timeUnit);
        }

        public void execute(Runnable runnable) {
            this.f58031e.execute(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f58031e.invokeAll(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            return this.f58031e.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f58031e.invokeAny(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            return (T) this.f58031e.invokeAny(collection, j, timeUnit);
        }

        public boolean isShutdown() {
            return this.f58031e.isShutdown();
        }

        public boolean isTerminated() {
            return this.f58031e.isTerminated();
        }

        public void shutdown() {
            this.f58031e.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            return this.f58031e.shutdownNow();
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f58031e.submit(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.f58031e.submit(runnable, t);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f58031e.submit(callable);
        }
    }

    private static class FinalizableDelegatedExecutorService extends DelegatedExecutorService {
        FinalizableDelegatedExecutorService(ExecutorService executorService) {
            super(executorService);
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public void finalize() {
            super.shutdown();
        }
    }

    public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) {
        return new FinalizableDelegatedExecutorService(new ThreadPoolExcutorEnhance(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory));
    }
}
