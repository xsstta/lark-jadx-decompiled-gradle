package com.bytedance.ee.android.file.picker.lib.utils;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/ThreadPool;", "", "()V", "executorService", "Ljava/util/concurrent/ExecutorService;", "post", "", "runnable", "Ljava/lang/Runnable;", "Ljava/util/concurrent/Future;", "T", "callable", "Ljava/util/concurrent/Callable;", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.j */
public final class ThreadPool {

    /* renamed from: a */
    public static final ThreadPool f12482a = new ThreadPool();

    /* renamed from: b */
    private static final ExecutorService f12483b;

    private ThreadPool() {
    }

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2, ThreadFactoryC41231.f12484a);
        Intrinsics.checkExpressionValueIsNotNull(newFixedThreadPool, "Executors.newFixedThread…         thread\n        }");
        f12483b = newFixedThreadPool;
    }

    /* renamed from: a */
    public final <T> Future<T> mo16118a(Callable<T> callable) {
        Intrinsics.checkParameterIsNotNull(callable, "callable");
        Future<T> submit = f12483b.submit(callable);
        Intrinsics.checkExpressionValueIsNotNull(submit, "executorService.submit(callable)");
        return submit;
    }
}
