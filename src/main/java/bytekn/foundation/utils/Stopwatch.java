package bytekn.foundation.utils;

import bytekn.foundation.concurrent.clock.DefaultClock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lbytekn/foundation/utils/Stopwatch;", "", "startTick", "", "(J)V", "getStartTick", "()J", "setStartTick", "elapsedMillis", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.e.e */
public final class Stopwatch {

    /* renamed from: a */
    public static final Companion f5766a = new Companion(null);

    /* renamed from: b */
    private long f5767b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lbytekn/foundation/utils/Stopwatch$Companion;", "", "()V", "createStarted", "Lbytekn/foundation/utils/Stopwatch;", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.e.e$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final Stopwatch mo8676a() {
            return new Stopwatch(DefaultClock.f5722a.mo8624b());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final long mo8675a() {
        return DefaultClock.f5722a.mo8624b() - this.f5767b;
    }

    public Stopwatch(long j) {
        this.f5767b = j;
    }
}
