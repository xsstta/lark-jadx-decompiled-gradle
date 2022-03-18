package com.bytedance.ug.sdk.share.impl.network.p930b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ug.sdk.share.impl.network.b.b */
public class C20868b extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final RejectedExecutionHandler f51068a = new ThreadPoolExecutor.AbortPolicy();

    public void shutdown() {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    public C20868b(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, Executors.defaultThreadFactory(), rejectedExecutionHandler);
    }
}
