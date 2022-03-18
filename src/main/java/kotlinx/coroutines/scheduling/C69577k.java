package kotlinx.coroutines.scheduling;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.C69555ac;
import kotlinx.coroutines.internal.C69557ae;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0010\u0010\n\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000\"\u0019\u0010\r\u001a\u00020\u000e*\u00020\u000f8À\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"BLOCKING_DEFAULT_PARALLELISM", "", "CORE_POOL_SIZE", "DEFAULT_SCHEDULER_NAME", "", "IDLE_WORKER_KEEP_ALIVE_NS", "", "MAX_POOL_SIZE", "TASK_NON_BLOCKING", "TASK_PROBABLY_BLOCKING", "WORK_STEALING_TIME_RESOLUTION_NS", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/TimeSource;", "isBlocking", "", "Lkotlinx/coroutines/scheduling/Task;", "(Lkotlinx/coroutines/scheduling/Task;)Z", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.scheduling.k */
public final class C69577k {

    /* renamed from: a */
    public static final long f173915a = C69557ae.m266976a("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, (Object) null);

    /* renamed from: b */
    public static final int f173916b = C69557ae.m266974a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);

    /* renamed from: c */
    public static final int f173917c;

    /* renamed from: d */
    public static final int f173918d;

    /* renamed from: e */
    public static final long f173919e = TimeUnit.SECONDS.toNanos(C69557ae.m266976a("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, (Object) null));

    /* renamed from: f */
    public static TimeSource f173920f = NanoTimeSource.f173909a;

    static {
        int i = C69557ae.m266974a("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(C69555ac.m266964a(), 2), 1, 0, 8, (Object) null);
        f173917c = i;
        f173918d = C69557ae.m266974a("kotlinx.coroutines.scheduler.max.pool.size", RangesKt.coerceIn(C69555ac.m266964a() * SmActions.ACTION_ONTHECALL_EXIT, i, 2097150), 0, 2097150, 4, (Object) null);
    }
}
