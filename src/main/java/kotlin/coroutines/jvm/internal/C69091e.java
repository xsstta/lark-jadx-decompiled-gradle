package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001¨\u0006\b"}, d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "probeCoroutineResumed", "", "frame", "probeCoroutineSuspended", "kotlin-stdlib"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlin.coroutines.jvm.internal.e */
public final class C69091e {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.c<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Continuation<T> m265845a(Continuation<? super T> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "completion");
        return cVar;
    }

    /* renamed from: b */
    public static final void m265846b(Continuation<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "frame");
    }

    /* renamed from: c */
    public static final void m265847c(Continuation<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "frame");
    }
}
