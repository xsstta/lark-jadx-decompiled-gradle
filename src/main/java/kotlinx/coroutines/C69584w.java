package kotlinx.coroutines;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.internal.C69554aa;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a.\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"recoverResult", "Lkotlin/Result;", "T", "state", "", "uCont", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toState", "(Ljava/lang/Object;)Ljava/lang/Object;", "caller", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.w */
public final class C69584w {
    /* renamed from: a */
    public static final <T> Object m267322a(Object obj) {
        Throwable r0 = Result.m271572exceptionOrNullimpl(obj);
        if (r0 == null) {
            return obj;
        }
        return new CompletedExceptionally(r0, false, 2, null);
    }

    /* renamed from: a */
    public static final <T> Object m267323a(Object obj, Continuation<? super T> cVar) {
        if (obj instanceof CompletedExceptionally) {
            Result.Companion aVar = Result.Companion;
            Throwable th = ((CompletedExceptionally) obj).f173971a;
            if (ak.m266271c() && (cVar instanceof CoroutineStackFrame)) {
                th = C69554aa.m266956a(th, (CoroutineStackFrame) cVar);
            }
            return Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Result.Companion aVar2 = Result.Companion;
        return Result.m271569constructorimpl(obj);
    }

    /* renamed from: a */
    public static final <T> Object m267324a(Object obj, CancellableContinuation<?> kVar) {
        Throwable r0 = Result.m271572exceptionOrNullimpl(obj);
        if (r0 == null) {
            return obj;
        }
        CancellableContinuation<?> kVar2 = kVar;
        if (ak.m266271c() && (kVar2 instanceof CoroutineStackFrame)) {
            r0 = C69554aa.m266956a(r0, (CoroutineStackFrame) kVar2);
        }
        return new CompletedExceptionally(r0, false, 2, null);
    }
}
