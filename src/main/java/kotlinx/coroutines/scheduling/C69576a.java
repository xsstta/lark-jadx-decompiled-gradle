package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.scheduling.a */
public final /* synthetic */ class C69576a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f173896a;

    static {
        int[] iArr = new int[CoroutineScheduler.WorkerState.values().length];
        f173896a = iArr;
        iArr[CoroutineScheduler.WorkerState.PARKING.ordinal()] = 1;
        iArr[CoroutineScheduler.WorkerState.BLOCKING.ordinal()] = 2;
        iArr[CoroutineScheduler.WorkerState.CPU_ACQUIRED.ordinal()] = 3;
        iArr[CoroutineScheduler.WorkerState.DORMANT.ordinal()] = 4;
        iArr[CoroutineScheduler.WorkerState.TERMINATED.ordinal()] = 5;
    }
}
