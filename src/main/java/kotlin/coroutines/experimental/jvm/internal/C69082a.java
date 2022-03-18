package kotlin.coroutines.experimental.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.experimental.Continuation;
import kotlin.coroutines.experimental.ContinuationInterceptor;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a \u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001¨\u0006\u0007"}, d2 = {"interceptContinuationIfNeeded", "Lkotlin/coroutines/experimental/Continuation;", "T", "context", "Lkotlin/coroutines/experimental/CoroutineContext;", "continuation", "normalizeContinuation", "kotlin-stdlib-coroutines"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlin.coroutines.experimental.jvm.internal.a */
public final class C69082a {
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.coroutines.experimental.a<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Continuation<T> m265818a(CoroutineContext cVar, Continuation<? super T> aVar) {
        Continuation<T> a;
        Intrinsics.checkParameterIsNotNull(cVar, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "continuation");
        ContinuationInterceptor bVar = (ContinuationInterceptor) cVar.mo239157a(ContinuationInterceptor.f173127a);
        return (bVar == null || (a = bVar.mo239156a(aVar)) == null) ? aVar : a;
    }
}
