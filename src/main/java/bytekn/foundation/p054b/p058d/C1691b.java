package bytekn.foundation.p054b.p058d;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"createIoScheduler", "Lbytekn/foundation/concurrent/scheduler/Scheduler;", "kn_common_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.d.b */
public final class C1691b {
    /* renamed from: a */
    public static final Scheduler m7484a() {
        return new ExecutorServiceScheduler(new CachedExecutorServiceStrategy(TimeUnit.MINUTES.toMillis(1), new ThreadFactoryImpl("IO")));
    }
}
