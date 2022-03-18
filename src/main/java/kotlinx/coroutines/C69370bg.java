package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000*\u001e\b\u0002\u0010\u0012\u001a\u0004\b\u0000\u0010\u0013\"\b\u0012\u0004\u0012\u0002H\u00130\u00142\b\u0012\u0004\u0012\u0002H\u00130\u0014¨\u0006\u0015"}, d2 = {"CLOSED_EMPTY", "Lkotlinx/coroutines/internal/Symbol;", "CLOSED_EMPTY$annotations", "()V", "DISPOSED_TASK", "DISPOSED_TASK$annotations", "MAX_DELAY_NS", "", "MAX_MS", "MS_TO_NS", "SCHEDULE_COMPLETED", "", "SCHEDULE_DISPOSED", "SCHEDULE_OK", "delayNanosToMillis", "timeNanos", "delayToNanos", "timeMillis", "Queue", "T", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.bg */
public final class C69370bg {

    /* renamed from: a */
    public static final Symbol f173448a = new Symbol("REMOVED_TASK");

    /* renamed from: b */
    public static final Symbol f173449b = new Symbol("CLOSED_EMPTY");

    /* renamed from: a */
    public static final long m266373a(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
