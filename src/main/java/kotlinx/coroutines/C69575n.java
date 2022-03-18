package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000\u001a3\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HHø\u0001\u0000¢\u0006\u0002\u0010\n\u001a=\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\f2\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HHø\u0001\u0000¢\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HHø\u0001\u0000¢\u0006\u0002\u0010\n\u001a3\u0010\u000f\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HHø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\u0010\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0018\u0010\u0013\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"getOrCreateCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "delegate", "Lkotlin/coroutines/Continuation;", "suspendAtomicCancellableCoroutine", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "holdCancellability", "", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendAtomicCancellableCoroutineReusable", "suspendCancellableCoroutine", "disposeOnCancellation", "handle", "Lkotlinx/coroutines/DisposableHandle;", "removeOnCancellation", "node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.n */
public final class C69575n {
    /* renamed from: a */
    public static final <T> CancellableContinuationImpl<T> m267177a(Continuation<? super T> cVar) {
        if (!(cVar instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl<>(cVar, 0);
        }
        CancellableContinuationImpl<T> b = ((DispatchedContinuation) cVar).mo242674b();
        if (b != null) {
            if (!b.mo243072e()) {
                b = null;
            }
            if (b != null) {
                return b;
            }
        }
        return new CancellableContinuationImpl<>(cVar, 0);
    }

    /* renamed from: a */
    public static final void m267178a(CancellableContinuation<?> kVar, DisposableHandle azVar) {
        kVar.mo243064a((Function1<? super Throwable, Unit>) new DisposeOnCancel(azVar));
    }

    /* renamed from: a */
    public static final void m267179a(CancellableContinuation<?> kVar, LockFreeLinkedListNode oVar) {
        kVar.mo243064a((Function1<? super Throwable, Unit>) new RemoveOnCancel(oVar));
    }
}
