package bytekn.foundation.concurrent.clock;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lbytekn/foundation/concurrent/clock/DefaultClock;", "Lbytekn/foundation/concurrent/clock/Clock;", "()V", "currentTimeMillis", "", "getCurrentTimeMillis", "()J", "uptimeMillis", "getUptimeMillis", "uptimeNanos", "getUptimeNanos", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.a.a */
public final class DefaultClock {

    /* renamed from: a */
    public static final DefaultClock f5722a = new DefaultClock();

    private DefaultClock() {
    }

    /* renamed from: a */
    public long mo8623a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo8624b() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
    }
}
