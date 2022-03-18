package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/scheduling/NanoTimeSource;", "Lkotlinx/coroutines/scheduling/TimeSource;", "()V", "nanoTime", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.scheduling.f */
public final class NanoTimeSource extends TimeSource {

    /* renamed from: a */
    public static final NanoTimeSource f173909a = new NanoTimeSource();

    private NanoTimeSource() {
    }

    @Override // kotlinx.coroutines.scheduling.TimeSource
    /* renamed from: a */
    public long mo243103a() {
        return System.nanoTime();
    }
}
