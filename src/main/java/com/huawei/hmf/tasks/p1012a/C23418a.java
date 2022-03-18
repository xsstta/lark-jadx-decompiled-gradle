package com.huawei.hmf.tasks.p1012a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.huawei.hmf.tasks.a.a */
public final class C23418a {

    /* renamed from: a */
    static final int f57734a;

    /* renamed from: b */
    static final int f57735b;

    /* renamed from: c */
    private static final C23418a f57736c = new C23418a();

    /* renamed from: e */
    private static final int f57737e;

    /* renamed from: d */
    private final Executor f57738d = new ExecutorC23419a((byte) 0);

    /* renamed from: com.huawei.hmf.tasks.a.a$a */
    static class ExecutorC23419a implements Executor {
        private ExecutorC23419a() {
        }

        /* synthetic */ ExecutorC23419a(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f57737e = availableProcessors;
        f57734a = availableProcessors + 1;
        f57735b = (availableProcessors * 2) + 1;
    }

    /* renamed from: a */
    public static ExecutorService m84966a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f57734a, f57735b, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static Executor m84967b() {
        return f57736c.f57738d;
    }
}
