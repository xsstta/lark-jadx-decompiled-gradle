package com.facebook.common.executors;

import com.facebook.common.logging.FLog;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.common.executors.a */
public class C21011a extends AbstractExecutorService {
    public static final Class<?> TAG = C21011a.class;
    private final Executor mExecutor;
    private volatile int mMaxConcurrency;
    private final AtomicInteger mMaxQueueSize;
    public final String mName;
    public final AtomicInteger mPendingWorkers;
    private final RunnableC21013a mTaskRunner;
    public final BlockingQueue<Runnable> mWorkQueue;

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

    public boolean isIdle() {
        if (!this.mWorkQueue.isEmpty() || this.mPendingWorkers.get() != 0) {
            return false;
        }
        return true;
    }

    public void startWorkerIfNeeded() {
        int i = this.mPendingWorkers.get();
        while (i < this.mMaxConcurrency) {
            int i2 = i + 1;
            if (this.mPendingWorkers.compareAndSet(i, i2)) {
                FLog.m76597v(TAG, "%s: starting worker %d of %d", this.mName, Integer.valueOf(i2), Integer.valueOf(this.mMaxConcurrency));
                this.mExecutor.execute(this.mTaskRunner);
                return;
            }
            FLog.m76595v(TAG, "%s: race in startWorkerIfNeeded; retrying", this.mName);
            i = this.mPendingWorkers.get();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.common.executors.a$a */
    public class RunnableC21013a implements Runnable {
        public void run() {
            AtomicInteger atomicInteger;
            boolean isEmpty;
            try {
                Runnable poll = C21011a.this.mWorkQueue.poll();
                if (poll != null) {
                    poll.run();
                } else {
                    FLog.m76595v(C21011a.TAG, "%s: Worker has nothing to run", C21011a.this.mName);
                }
                if (isEmpty) {
                    FLog.m76596v(C21011a.TAG, "%s: worker finished; %d workers left", C21011a.this.mName, Integer.valueOf(atomicInteger.decrementAndGet()));
                }
            } finally {
                int decrementAndGet = C21011a.this.mPendingWorkers.decrementAndGet();
                if (!C21011a.this.mWorkQueue.isEmpty()) {
                    C21011a.this.startWorkerIfNeeded();
                } else {
                    FLog.m76596v(C21011a.TAG, "%s: worker finished; %d workers left", C21011a.this.mName, Integer.valueOf(decrementAndGet));
                }
            }
        }

        private RunnableC21013a() {
        }
    }

    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        if (this.mWorkQueue.offer(runnable)) {
            int size = this.mWorkQueue.size();
            int i = this.mMaxQueueSize.get();
            if (size > i && this.mMaxQueueSize.compareAndSet(i, size)) {
                FLog.m76596v(TAG, "%s: max pending work in queue = %d", this.mName, Integer.valueOf(size));
            }
            startWorkerIfNeeded();
            return;
        }
        throw new RejectedExecutionException(this.mName + " queue is full, size=" + this.mWorkQueue.size());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    public static C21011a newConstrainedExecutor(String str, int i, int i2, Executor executor) {
        return new C21011a(str, i, executor, new LinkedBlockingQueue(i2));
    }

    public C21011a(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i > 0) {
            this.mName = str;
            this.mExecutor = executor;
            this.mMaxConcurrency = i;
            this.mWorkQueue = blockingQueue;
            this.mTaskRunner = new RunnableC21013a();
            this.mPendingWorkers = new AtomicInteger(0);
            this.mMaxQueueSize = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }
}
