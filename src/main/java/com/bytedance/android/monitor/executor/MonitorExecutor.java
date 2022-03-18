package com.bytedance.android.monitor.executor;

import com.bytedance.android.monitor.exception.MonitorRunnable;
import com.bytedance.android.monitor.p112i.C2655c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/android/monitor/executor/MonitorExecutor;", "", "()V", "TAG", "", "corePoolSize", "", "value", "Ljava/util/concurrent/ExecutorService;", "executor", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "setExecutor", "(Ljava/util/concurrent/ExecutorService;)V", "keepAliveTime", "", "maximumPoolSize", "sExecutor", "post", "", "runnable", "Lkotlin/Function0;", "submit", "Ljava/lang/Runnable;", "com.bytedance.android.livesdk.monitor.base"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.e.a */
public final class MonitorExecutor {

    /* renamed from: a */
    public static final MonitorExecutor f8417a = new MonitorExecutor();

    /* renamed from: b */
    private static final int f8418b = 4;

    /* renamed from: c */
    private static final int f8419c = 8;

    /* renamed from: d */
    private static final long f8420d = f8420d;

    /* renamed from: e */
    private static ExecutorService f8421e;

    private MonitorExecutor() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.e.a$a */
    static final class RunnableC2646a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Function0 f8422a;

        RunnableC2646a(Function0 function0) {
            this.f8422a = function0;
        }

        public final void run() {
            try {
                this.f8422a.invoke();
            } catch (Exception e) {
                C2655c.m11159a(e);
            }
        }
    }

    /* renamed from: a */
    public final ExecutorService mo11451a() {
        if (f8421e == null) {
            f8421e = new ThreadPoolExecutor(f8418b, f8419c, f8420d, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
        }
        ExecutorService executorService = f8421e;
        if (executorService == null) {
            Intrinsics.throwNpe();
        }
        return executorService;
    }

    /* renamed from: a */
    public final void mo11452a(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "runnable");
        mo11451a().execute(new MonitorRunnable(runnable));
    }

    /* renamed from: a */
    public final void mo11453a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "runnable");
        mo11451a().execute(new RunnableC2646a(function0));
    }
}
