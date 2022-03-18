package com.bytedance.frameworks.core.thread;

import com.bytedance.frameworks.core.thread.TTPriority;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.frameworks.core.thread.e */
public class C14108e {

    /* renamed from: a */
    private static final int f37073a;

    /* renamed from: b */
    private static final int f37074b;

    /* renamed from: c */
    private static final int f37075c;

    /* renamed from: d */
    private static final PriorityBlockingQueue<Runnable> f37076d = new PriorityBlockingQueue<>();

    /* renamed from: e */
    private static final PriorityBlockingQueue<Runnable> f37077e = new PriorityBlockingQueue<>();

    /* renamed from: c */
    public static ScheduledExecutorService m57088c() {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC14107d(TTPriority.Priority.LOW, "tt-delay-thread-"));
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m57086a() {
        int i = f37074b;
        return new ThreadPoolExecutor(i, i, 1, TimeUnit.SECONDS, f37076d, new ThreadFactoryC14107d(TTPriority.Priority.NORMAL, "tt-api-thread-"));
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m57087b() {
        int i = f37075c;
        return new ThreadPoolExecutor(i, i, 1, TimeUnit.SECONDS, f37077e, new ThreadFactoryC14107d(TTPriority.Priority.NORMAL, "tt-default-thread-"));
    }

    static {
        int i;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f37073a = availableProcessors;
        int i2 = 4;
        if ((availableProcessors / 2) + 1 < 4) {
            i = 4;
        } else {
            i = (availableProcessors / 2) + 1;
        }
        f37074b = i;
        if ((availableProcessors / 2) + 1 >= 4) {
            i2 = (availableProcessors / 2) + 1;
        }
        f37075c = i2;
    }
}
