package bytekn.foundation.concurrent.executor;

import bytekn.foundation.concurrent.scheduler.Scheduler;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.p054b.C1684a;
import bytekn.foundation.p054b.p058d.C1696k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lbytekn/foundation/concurrent/executor/AsyncExecutor;", "Lbytekn/foundation/concurrent/executor/ExecutorService;", "()V", "ioExecutor", "Lbytekn/foundation/concurrent/scheduler/Scheduler$Executor;", "execute", "", "runnable", "Ljava/lang/Runnable;", "Lbytekn/foundation/concurrent/Runnable;", "shutdown", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.b.a */
public final class AsyncExecutor implements ExecutorService {

    /* renamed from: a */
    public static final Companion f5724a = new Companion(null);

    /* renamed from: b */
    private final Scheduler.Executor f5725b = C1696k.m7501b().mo8648a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lbytekn/foundation/concurrent/executor/AsyncExecutor$Companion;", "", "()V", "TAG", "", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.b.a$b */
    static final class C1685b extends Lambda implements Function0<Unit> {
        final /* synthetic */ Runnable $runnable;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1685b(Runnable runnable) {
            super(0);
            this.$runnable = runnable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("AsyncExecutor", "AsyncExecutor::executor.submit-->io thread=" + C1684a.m7462a());
            this.$runnable.run();
        }
    }

    public void execute(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "runnable");
        Logger bVar = Logger.f5760a;
        bVar.mo8662a("AsyncExecutor", "AsyncExecutor::executor.submit-->calling thread=" + C1684a.m7462a());
        Scheduler.Executor.C1695a.m7499a(this.f5725b, 0, new C1685b(runnable), 1, null);
    }
}
