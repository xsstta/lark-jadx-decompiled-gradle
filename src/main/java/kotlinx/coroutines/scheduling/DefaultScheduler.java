package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C69555ac;
import kotlinx.coroutines.internal.C69557ae;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "()V", "IO", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIO", "()Lkotlinx/coroutines/CoroutineDispatcher;", "close", "", "toDebugString", "", "toString", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.scheduling.b */
public final class DefaultScheduler extends ExperimentalCoroutineDispatcher {

    /* renamed from: a */
    public static final DefaultScheduler f173897a;

    /* renamed from: e */
    private static final CoroutineDispatcher f173898e;

    @Override // kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "DefaultDispatcher";
    }

    /* renamed from: b */
    public final CoroutineDispatcher mo243097b() {
        return f173898e;
    }

    private DefaultScheduler() {
        super(0, 0, null, 7, null);
    }

    @Override // kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher, kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    static {
        DefaultScheduler bVar = new DefaultScheduler();
        f173897a = bVar;
        f173898e = bVar.mo243098a(C69557ae.m266974a("kotlinx.coroutines.io.parallelism", RangesKt.coerceAtLeast(64, C69555ac.m266964a()), 0, 0, 12, (Object) null));
    }
}
