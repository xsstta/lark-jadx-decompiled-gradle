package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkCompletion", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.db */
public final class C69387db {
    /* renamed from: a */
    public static final void m266823a(CoroutineContext fVar) {
        Job btVar = (Job) fVar.get(Job.f173460b);
        if (btVar != null && !btVar.mo242631a()) {
            throw btVar.mo242737j();
        }
    }

    /* renamed from: a */
    public static final Object m266822a(Continuation<? super Unit> cVar) {
        Object obj;
        CoroutineContext context = cVar.getContext();
        m266823a(context);
        Continuation a = C69086a.m265825a(cVar);
        if (!(a instanceof DispatchedContinuation)) {
            a = null;
        }
        DispatchedContinuation asVar = (DispatchedContinuation) a;
        if (asVar != null) {
            if (asVar.f173422c.mo242639a(context)) {
                asVar.mo242671a(context, Unit.INSTANCE);
            } else {
                YieldContext daVar = new YieldContext();
                asVar.mo242671a(context.plus(daVar), Unit.INSTANCE);
                if (daVar.f173548a) {
                    if (C69369at.m266306a(asVar)) {
                        obj = C69086a.m265828a();
                    } else {
                        obj = Unit.INSTANCE;
                    }
                }
            }
            obj = C69086a.m265828a();
        } else {
            obj = Unit.INSTANCE;
        }
        if (obj == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        if (obj == C69086a.m265828a()) {
            return obj;
        }
        return Unit.INSTANCE;
    }
}
