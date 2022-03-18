package bytekn.foundation.concurrent.scheduler;

import bytekn.foundation.concurrent.scheduler.Scheduler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/ExecutorServiceScheduler;", "Lbytekn/foundation/concurrent/scheduler/Scheduler;", "executorServiceStrategy", "Lbytekn/foundation/concurrent/scheduler/ExecutorServiceStrategy;", "(Lbytekn/foundation/concurrent/scheduler/ExecutorServiceStrategy;)V", "destroy", "", "newExecutor", "Lbytekn/foundation/concurrent/scheduler/Scheduler$Executor;", "ExecutorImpl", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.d.e */
public final class ExecutorServiceScheduler implements Scheduler {

    /* renamed from: a */
    private final ExecutorServiceStrategy f5742a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J*\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\f0\u000eH\b¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/ExecutorServiceScheduler$ExecutorImpl;", "Lbytekn/foundation/concurrent/scheduler/Scheduler$Executor;", "executorServiceStrategy", "Lbytekn/foundation/concurrent/scheduler/ExecutorServiceStrategy;", "(Lbytekn/foundation/concurrent/scheduler/ExecutorServiceStrategy;)V", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "monitor", "", "cancel", "", "executeIfNotRecycled", "T", "block", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "submit", "delayMillis", "", "task", "Lkotlin/Function0;", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.e$a */
    private static final class ExecutorImpl implements Scheduler.Executor {

        /* renamed from: c */
        public static final Companion f5743c = new Companion(null);

        /* renamed from: a */
        public volatile ScheduledExecutorService f5744a;

        /* renamed from: b */
        public final Object f5745b = new Object();

        /* renamed from: d */
        private final ExecutorServiceStrategy f5746d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\b"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/ExecutorServiceScheduler$ExecutorImpl$Companion;", "", "()V", "wrapSchedulerTaskSafe", "Ljava/lang/Runnable;", "task", "Lkotlin/Function0;", "", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: bytekn.foundation.b.d.e$a$a */
        private static final class Companion {
            private Companion() {
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: bytekn.foundation.b.d.e$a$a$a */
            public static final class RunnableC1693a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ Function0 f5747a;

                RunnableC1693a(Function0 function0) {
                    this.f5747a = function0;
                }

                public final void run() {
                    try {
                        this.f5747a.invoke();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Runnable mo8650a(Function0<Unit> function0) {
                return new RunnableC1693a(function0);
            }
        }

        public ExecutorImpl(ExecutorServiceStrategy fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "executorServiceStrategy");
            this.f5746d = fVar;
            this.f5744a = fVar.mo8636a();
        }

        @Override // bytekn.foundation.concurrent.scheduler.Scheduler.Executor
        /* renamed from: a */
        public void mo8649a(long j, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "task");
            if (this.f5744a != null) {
                synchronized (this.f5745b) {
                    ScheduledExecutorService scheduledExecutorService = this.f5744a;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.schedule(f5743c.mo8650a(function0), j, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    @Override // bytekn.foundation.concurrent.scheduler.Scheduler
    /* renamed from: a */
    public Scheduler.Executor mo8648a() {
        return new ExecutorImpl(this.f5742a);
    }

    public ExecutorServiceScheduler(ExecutorServiceStrategy fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "executorServiceStrategy");
        this.f5742a = fVar;
    }
}
