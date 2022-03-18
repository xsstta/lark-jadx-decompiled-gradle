package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001e\u0010\u0000\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\r\u001a\u00020\u0007*\u00020\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"delay", "Lkotlinx/coroutines/Delay;", "Lkotlin/coroutines/CoroutineContext;", "getDelay", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Delay;", "", "timeMillis", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "duration", "Lkotlin/time/Duration;", "delay-p9JZ4hM", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toDelayMillis", "toDelayMillis-LRDsOJo", "(D)J", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
public final class ar {
    /* renamed from: a */
    public static final Delay m266296a(CoroutineContext fVar) {
        CoroutineContext.Element bVar = fVar.get(ContinuationInterceptor.f173125b);
        if (!(bVar instanceof Delay)) {
            bVar = null;
        }
        Delay aqVar = (Delay) bVar;
        if (aqVar != null) {
            return aqVar;
        }
        return an.m266282a();
    }

    /* renamed from: a */
    public static final Object m266295a(long j, Continuation<? super Unit> cVar) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        lVar.mo243071d();
        CancellableContinuationImpl lVar2 = lVar;
        m266296a(lVar2.getContext()).mo242661a(j, lVar2);
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }
}
