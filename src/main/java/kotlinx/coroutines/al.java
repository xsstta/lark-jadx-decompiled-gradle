package kotlinx.coroutines;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"classSimpleName", "", "", "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
public final class al {
    /* renamed from: a */
    public static final String m266273a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: b */
    public static final String m266275b(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: a */
    public static final String m266274a(Continuation<?> cVar) {
        Object obj;
        if (cVar instanceof DispatchedContinuation) {
            return cVar.toString();
        }
        try {
            Result.Companion aVar = Result.Companion;
            obj = Result.m271569constructorimpl(cVar + '@' + m266273a((Object) cVar));
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        if (Result.m271572exceptionOrNullimpl(obj) != null) {
            obj = cVar.getClass().getName() + '@' + m266273a((Object) cVar);
        }
        return (String) obj;
    }
}
