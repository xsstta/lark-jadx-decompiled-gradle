package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutor;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0002J\u001c\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0016J)\u0010\u001e\u001a\u00020\u00162\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\u001c\u0010#\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0016J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\r\u0010%\u001a\u00020\u0016H\u0000¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\nH\u0000¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\u0006H\u0016J\r\u0010+\u001a\u00020\u0016H\u0000¢\u0006\u0002\b,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "corePoolSize", "", "maxPoolSize", "schedulerName", "", "(IILjava/lang/String;)V", "(II)V", "idleWorkerKeepAliveNs", "", "(IIJLjava/lang/String;)V", "coroutineScheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "blocking", "Lkotlinx/coroutines/CoroutineDispatcher;", "parallelism", "close", "", "createScheduler", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchWithContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "tailDispatch", "", "dispatchWithContext$kotlinx_coroutines_core", "dispatchYield", "limited", "restore", "restore$kotlinx_coroutines_core", "shutdown", "timeout", "shutdown$kotlinx_coroutines_core", "toString", "usePrivateScheduler", "usePrivateScheduler$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.scheduling.c */
public class ExperimentalCoroutineDispatcher extends ExecutorCoroutineDispatcher {

    /* renamed from: a */
    private CoroutineScheduler f173899a;

    /* renamed from: e */
    private final int f173900e;

    /* renamed from: f */
    private final int f173901f;

    /* renamed from: g */
    private final long f173902g;

    /* renamed from: h */
    private final String f173903h;

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    /* renamed from: a */
    public Executor mo242722a() {
        return this.f173899a;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f173899a.close();
    }

    /* renamed from: b */
    private final CoroutineScheduler mo243097b() {
        return new CoroutineScheduler(this.f173900e, this.f173901f, this.f173902g, this.f173903h);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return super.toString() + "[scheduler = " + this.f173899a + ']';
    }

    /* renamed from: a */
    public final CoroutineDispatcher mo243098a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new LimitingDispatcher(this, i, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i).toString());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: b */
    public void mo242640b(CoroutineContext fVar, Runnable runnable) {
        try {
            CoroutineScheduler.m267187a(this.f173899a, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            DefaultExecutor.f173409a.mo242640b(fVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: a */
    public void mo6045a(CoroutineContext fVar, Runnable runnable) {
        try {
            CoroutineScheduler.m267187a(this.f173899a, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            DefaultExecutor.f173409a.mo6045a(fVar, runnable);
        }
    }

    public ExperimentalCoroutineDispatcher(int i, int i2, String str) {
        this(i, i2, C69577k.f173919e, str);
    }

    /* renamed from: a */
    public final void mo243099a(Runnable runnable, TaskContext iVar, boolean z) {
        try {
            this.f173899a.mo243080a(runnable, iVar, z);
        } catch (RejectedExecutionException unused) {
            DefaultExecutor.f173409a.mo242706a(this.f173899a.mo243078a(runnable, iVar));
        }
    }

    public ExperimentalCoroutineDispatcher(int i, int i2, long j, String str) {
        this.f173900e = i;
        this.f173901f = i2;
        this.f173902g = j;
        this.f173903h = str;
        this.f173899a = mo243097b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExperimentalCoroutineDispatcher(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C69577k.f173917c : i, (i3 & 2) != 0 ? C69577k.f173918d : i2, (i3 & 4) != 0 ? "DefaultDispatcher" : str);
    }
}
