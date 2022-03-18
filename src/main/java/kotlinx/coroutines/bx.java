package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"cancelFutureOnCancellation", "", "Lkotlinx/coroutines/CancellableContinuation;", "future", "Ljava/util/concurrent/Future;", "cancelFutureOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, mo238835k = 5, mv = {1, 1, 16}, xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class bx {
    /* renamed from: a */
    public static final void m266414a(CancellableContinuation<?> kVar, Future<?> future) {
        kVar.mo243064a((Function1<? super Throwable, Unit>) new CancelFutureOnCancel(future));
    }
}
