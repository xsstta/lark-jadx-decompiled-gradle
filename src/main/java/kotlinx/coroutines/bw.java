package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, mo238835k = 4, mv = {1, 1, 16})
public final class bw {
    /* renamed from: a */
    public static final CompletableJob m266405a(Job btVar) {
        return C69373by.m266415a(btVar);
    }

    /* renamed from: a */
    public static final void m266407a(CoroutineContext fVar) {
        C69373by.m266417a(fVar);
    }

    /* renamed from: a */
    public static final void m266408a(CoroutineContext fVar, CancellationException cancellationException) {
        C69373by.m266418a(fVar, cancellationException);
    }

    /* renamed from: a */
    public static final void m266410a(Job btVar, String str, Throwable th) {
        C69373by.m266420a(btVar, str, th);
    }

    /* renamed from: a */
    public static final void m266412a(CancellableContinuation<?> kVar, Future<?> future) {
        bx.m266414a(kVar, future);
    }

    /* renamed from: b */
    public static final void m266413b(Job btVar) {
        C69373by.m266422b(btVar);
    }
}
