package com.larksuite.framework.thread;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.larksuite.framework.thread.i */
public class C26147i extends C26141f {
    @Override // com.larksuite.framework.thread.C26141f, com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: a */
    public /* bridge */ /* synthetic */ String mo93047a() {
        return super.mo93047a();
    }

    @Override // com.larksuite.framework.thread.C26141f, com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: b */
    public /* bridge */ /* synthetic */ HashMap mo93051b() {
        return super.mo93051b();
    }

    @Override // com.larksuite.framework.thread.C26141f, com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo93052b(String str) {
        super.mo93052b(str);
    }

    @Override // java.util.concurrent.AbstractExecutorService, com.larksuite.framework.thread.C26141f, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return super.submit(runnable);
    }

    @Override // com.larksuite.framework.thread.C26141f, com.larksuite.framework.thread.AbstractC26160p
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo93049a(String str) {
        super.mo93049a(str);
    }

    /* renamed from: c */
    public static C26147i m94623c(String str) {
        return new C26147i(str, 1, new ThreadFactoryC26153m("lk-ssc-" + str));
    }

    @Override // java.util.concurrent.AbstractExecutorService, com.larksuite.framework.thread.C26141f, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return super.submit(callable);
    }

    @Override // com.larksuite.framework.thread.C26141f
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo93048a(long j, long j2) {
        super.mo93048a(j, j2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, com.larksuite.framework.thread.C26141f, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }

    @Override // com.larksuite.framework.thread.C26141f, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor
    public /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return super.schedule(runnable, j, timeUnit);
    }

    @Override // com.larksuite.framework.thread.C26141f, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor
    public /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return super.schedule(callable, j, timeUnit);
    }

    private C26147i(String str, int i, ThreadFactory threadFactory) {
        super(str, i, threadFactory);
        setKeepAliveTime(10, TimeUnit.SECONDS);
        allowCoreThreadTimeOut(true);
        mo93048a(10000, 5000);
    }

    @Override // com.larksuite.framework.thread.C26141f, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor
    public /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // com.larksuite.framework.thread.C26141f, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor
    public /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }
}
