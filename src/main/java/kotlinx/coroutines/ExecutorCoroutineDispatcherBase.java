package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C69564e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\r\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0014J\u001c\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J*\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a2\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherBase;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "()V", "removesFutureOnCancellation", "", "close", "", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "other", "", "hashCode", "", "initFutureCancellation", "initFutureCancellation$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "scheduleBlock", "Ljava/util/concurrent/ScheduledFuture;", "time", "unit", "Ljava/util/concurrent/TimeUnit;", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.bj */
public abstract class ExecutorCoroutineDispatcherBase extends ExecutorCoroutineDispatcher implements Delay {

    /* renamed from: a */
    private boolean f173451a;

    /* renamed from: b */
    public final void mo242725b() {
        this.f173451a = C69564e.m267013a(mo242722a());
    }

    public int hashCode() {
        return System.identityHashCode(mo242722a());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return mo242722a().toString();
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor a = mo242722a();
        if (!(a instanceof ExecutorService)) {
            a = null;
        }
        ExecutorService executorService = (ExecutorService) a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExecutorCoroutineDispatcherBase) || ((ExecutorCoroutineDispatcherBase) obj).mo242722a() != mo242722a()) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: a */
    public void mo242661a(long j, CancellableContinuation<? super Unit> kVar) {
        ScheduledFuture<?> scheduledFuture;
        if (this.f173451a) {
            scheduledFuture = m266376a(new ResumeUndispatchedRunnable(this, kVar), j, TimeUnit.MILLISECONDS);
        } else {
            scheduledFuture = null;
        }
        if (scheduledFuture != null) {
            bw.m266412a(kVar, scheduledFuture);
        } else {
            DefaultExecutor.f173409a.mo242661a(j, kVar);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: a */
    public void mo6045a(CoroutineContext fVar, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor a = mo242722a();
            TimeSource a2 = cx.m266817a();
            if (a2 == null || (runnable2 = a2.mo242865a(runnable)) == null) {
                runnable2 = runnable;
            }
            a.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            TimeSource a3 = cx.m266817a();
            if (a3 != null) {
                a3.mo242869c();
            }
            DefaultExecutor.f173409a.mo242706a(runnable);
        }
    }

    /* renamed from: a */
    private final ScheduledFuture<?> m266376a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            Executor a = mo242722a();
            if (!(a instanceof ScheduledExecutorService)) {
                a = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) a;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService.schedule(runnable, j, timeUnit);
            }
            return null;
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }
}
