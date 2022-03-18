package bytekn.foundation.utils;

import bytekn.foundation.concurrent.scheduler.Scheduler;
import bytekn.foundation.p054b.p058d.C1696k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lbytekn/foundation/utils/Transmitter;", "", "()V", "TAG", "", "mainExecutor", "Lbytekn/foundation/concurrent/scheduler/Scheduler$Executor;", "transmitToMainThread", "", "runnable", "Ljava/lang/Runnable;", "transmitToMainThreadWithDelay", "delay", "", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.e.g */
public final class Transmitter {

    /* renamed from: a */
    public static final Transmitter f5769a = new Transmitter();

    /* renamed from: b */
    private static final Scheduler.Executor f5770b = C1696k.m7500a().mo8648a();

    private Transmitter() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.e.g$a */
    static final class C1701a extends Lambda implements Function0<Unit> {
        final /* synthetic */ Runnable $runnable;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1701a(Runnable runnable) {
            super(0);
            this.$runnable = runnable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$runnable.run();
        }
    }

    /* renamed from: a */
    public final void mo8678a(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "runnable");
        Scheduler.Executor.C1695a.m7499a(f5770b, 0, new C1701a(runnable), 1, null);
    }
}
