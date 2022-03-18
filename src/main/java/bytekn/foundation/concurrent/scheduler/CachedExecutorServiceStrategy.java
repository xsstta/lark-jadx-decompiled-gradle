package bytekn.foundation.concurrent.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/CachedExecutorServiceStrategy;", "Lbytekn/foundation/concurrent/scheduler/ExecutorServiceStrategy;", "keepAliveTimeoutMillis", "", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "(JLjava/util/concurrent/ThreadFactory;)V", "destroy", "", "get", "Ljava/util/concurrent/ScheduledExecutorService;", "recycle", "executorService", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.d.a */
public final class CachedExecutorServiceStrategy implements ExecutorServiceStrategy {

    /* renamed from: a */
    public static final Lazy f5731a = LazyKt.lazy(C1689b.INSTANCE);

    /* renamed from: b */
    public static final Companion f5732b = new Companion(null);

    /* renamed from: c */
    private final long f5733c;

    /* renamed from: d */
    private final ThreadFactory f5734d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/CachedExecutorServiceStrategy$Companion;", "", "()V", "MAX_THREAD_SIZE", "", "pool", "Lbytekn/foundation/concurrent/scheduler/ExpirationPool;", "Ljava/util/concurrent/ScheduledExecutorService;", "getPool", "()Lbytekn/foundation/concurrent/scheduler/ExpirationPool;", "pool$delegate", "Lkotlin/Lazy;", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.a$a */
    private static final class Companion {
        /* renamed from: a */
        public final ExpirationPool<ScheduledExecutorService> mo8637a() {
            Lazy lazy = CachedExecutorServiceStrategy.f5731a;
            Companion aVar = CachedExecutorServiceStrategy.f5732b;
            return (ExpirationPool) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lbytekn/foundation/concurrent/scheduler/ExpirationPool;", "Ljava/util/concurrent/ScheduledExecutorService;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.a$b */
    static final class C1689b extends Lambda implements Function0<ExpirationPool<ScheduledExecutorService>> {
        public static final C1689b INSTANCE = new C1689b();

        C1689b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExpirationPool<ScheduledExecutorService> invoke() {
            return new ExpirationPool<>(C16901.INSTANCE);
        }
    }

    @Override // bytekn.foundation.concurrent.scheduler.ExecutorServiceStrategy
    /* renamed from: a */
    public ScheduledExecutorService mo8636a() {
        ScheduledExecutorService a = f5732b.mo8637a().mo8652a();
        if (a != null) {
            return a;
        }
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5, this.f5734d);
        Intrinsics.checkExpressionValueIsNotNull(newScheduledThreadPool, "Executors.newScheduledTh…READ_SIZE, threadFactory)");
        return newScheduledThreadPool;
    }

    public CachedExecutorServiceStrategy(long j, ThreadFactory threadFactory) {
        Intrinsics.checkParameterIsNotNull(threadFactory, "threadFactory");
        this.f5733c = j;
        this.f5734d = threadFactory;
    }
}
