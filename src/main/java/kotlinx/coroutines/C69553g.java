package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C69558af;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.p3475a.C69358a;
import kotlinx.coroutines.p3475a.C69359b;

/* renamed from: kotlinx.coroutines.g */
public final /* synthetic */ class C69553g {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final <T> Object m266942a(CoroutineContext fVar, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> kVar, Continuation<? super T> cVar) {
        Object obj;
        CoroutineContext context = cVar.getContext();
        CoroutineContext plus = context.plus(fVar);
        C69387db.m266823a(plus);
        if (plus == context) {
            ScopeCoroutine xVar = new ScopeCoroutine(plus, cVar);
            obj = C69359b.m266243a(xVar, xVar, kVar);
        } else if (Intrinsics.areEqual((ContinuationInterceptor) plus.get(ContinuationInterceptor.f173125b), (ContinuationInterceptor) context.get(ContinuationInterceptor.f173125b))) {
            UndispatchedCoroutine czVar = new UndispatchedCoroutine(plus, cVar);
            Object a = C69558af.m266979a(plus, null);
            try {
                Object a2 = C69359b.m266243a(czVar, czVar, kVar);
                C69558af.m266980b(plus, a);
                obj = a2;
            } catch (Throwable th) {
                C69558af.m266980b(plus, a);
                throw th;
            }
        } else {
            DispatchedCoroutine auVar = new DispatchedCoroutine(plus, cVar);
            auVar.cF_();
            C69358a.m266242a(kVar, auVar, auVar);
            obj = auVar.mo242679h();
        }
        if (obj == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return obj;
    }

    /* renamed from: a */
    public static final Job m266943a(CoroutineScope ahVar, CoroutineContext fVar, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> kVar) {
        LazyStandaloneCoroutine cdVar;
        CoroutineContext a = C69360ab.m266248a(ahVar, fVar);
        if (coroutineStart.isLazy()) {
            cdVar = new LazyStandaloneCoroutine(a, kVar);
        } else {
            cdVar = new StandaloneCoroutine(a, true);
        }
        cdVar.mo242630a(coroutineStart, cdVar, kVar);
        return cdVar;
    }

    /* renamed from: b */
    public static final <T> Deferred<T> m266945b(CoroutineScope ahVar, CoroutineContext fVar, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> kVar) {
        LazyDeferredCoroutine ccVar;
        CoroutineContext a = C69360ab.m266248a(ahVar, fVar);
        if (coroutineStart.isLazy()) {
            ccVar = new LazyDeferredCoroutine(a, kVar);
        } else {
            ccVar = new DeferredCoroutine(a, true);
        }
        ccVar.mo242630a(coroutineStart, ccVar, kVar);
        return ccVar;
    }

    /* renamed from: a */
    public static /* synthetic */ Job m266944a(CoroutineScope ahVar, CoroutineContext fVar, CoroutineStart coroutineStart, Function2 kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C69388e.m266832b(ahVar, fVar, coroutineStart, kVar);
    }

    /* renamed from: b */
    public static /* synthetic */ Deferred m266946b(CoroutineScope ahVar, CoroutineContext fVar, CoroutineStart coroutineStart, Function2 kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C69388e.m266830a(ahVar, fVar, coroutineStart, kVar);
    }
}
