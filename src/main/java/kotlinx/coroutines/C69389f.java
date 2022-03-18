package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: kotlinx.coroutines.f */
public final /* synthetic */ class C69389f {
    /* renamed from: a */
    public static final <T> T m266834a(CoroutineContext fVar, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> kVar) {
        CoroutineContext fVar2;
        EventLoop bcVar;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor dVar = (ContinuationInterceptor) fVar.get(ContinuationInterceptor.f173125b);
        if (dVar == null) {
            bcVar = ThreadLocalEventLoop.f173537a.mo242858a();
            fVar2 = C69360ab.m266248a(GlobalScope.f173453a, fVar.plus(bcVar));
        } else {
            EventLoop bcVar2 = null;
            if (!(dVar instanceof EventLoop)) {
                dVar = null;
            }
            EventLoop bcVar3 = (EventLoop) dVar;
            if (bcVar3 != null) {
                if (bcVar3.mo242701f()) {
                    bcVar2 = bcVar3;
                }
                if (bcVar2 != null) {
                    bcVar = bcVar2;
                    fVar2 = C69360ab.m266248a(GlobalScope.f173453a, fVar);
                }
            }
            bcVar = ThreadLocalEventLoop.f173537a.mo242860b();
            fVar2 = C69360ab.m266248a(GlobalScope.f173453a, fVar);
        }
        BlockingCoroutine cVar = new BlockingCoroutine(fVar2, currentThread, bcVar);
        cVar.mo242630a(CoroutineStart.DEFAULT, cVar, kVar);
        return (T) cVar.mo242679h();
    }

    /* renamed from: a */
    public static /* synthetic */ Object m266835a(CoroutineContext fVar, Function2 kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = EmptyCoroutineContext.INSTANCE;
        }
        return C69388e.m266827a(fVar, kVar);
    }
}
