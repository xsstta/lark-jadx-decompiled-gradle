package bytekn.foundation.concurrent.scheduler;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/Scheduler;", "", "destroy", "", "newExecutor", "Lbytekn/foundation/concurrent/scheduler/Scheduler$Executor;", "Executor", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.d.j */
public interface Scheduler {
    /* renamed from: a */
    Executor mo8648a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&¨\u0006\t"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/Scheduler$Executor;", "", "cancel", "", "submit", "delayMillis", "", "task", "Lkotlin/Function0;", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.j$a */
    public interface Executor {
        /* renamed from: a */
        void mo8649a(long j, Function0<Unit> function0);

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: bytekn.foundation.b.d.j$a$a */
        public static final class C1695a {
            /* renamed from: a */
            public static /* synthetic */ void m7499a(Executor aVar, long j, Function0 function0, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        j = 0;
                    }
                    aVar.mo8649a(j, function0);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submit");
            }
        }
    }
}
