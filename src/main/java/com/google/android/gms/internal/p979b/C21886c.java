package com.google.android.gms.internal.p979b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.b.c */
final class C21886c implements AbstractC21885b {
    private C21886c() {
    }

    @Override // com.google.android.gms.internal.p979b.AbstractC21885b
    /* renamed from: a */
    public final ExecutorService mo73995a(ThreadFactory threadFactory, int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
