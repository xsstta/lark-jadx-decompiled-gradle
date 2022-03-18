package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.p3475a.C69359b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\t\u001a\u00020\u0002\u001aM\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H@ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\bHHø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\u001e\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u001a\n\u0010\u001c\u001a\u00020\u0015*\u00020\u0002\u001a\u0015\u0010\u001d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"isActive", "", "Lkotlinx/coroutines/CoroutineScope;", "isActive$annotations", "(Lkotlinx/coroutines/CoroutineScope;)V", "(Lkotlinx/coroutines/CoroutineScope;)Z", "CoroutineScope", "context", "Lkotlin/coroutines/CoroutineContext;", "MainScope", "coroutineScope", "R", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentCoroutineContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "message", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ensureActive", "plus", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.ai */
public final class C69364ai {
    /* renamed from: a */
    public static final CoroutineScope m266265a(CoroutineContext fVar) {
        if (fVar.get(Job.f173460b) == null) {
            fVar = fVar.plus(C69373by.m266416a((Job) null, 1, (Object) null));
        }
        return new ContextScope(fVar);
    }

    /* renamed from: a */
    public static final boolean m266268a(CoroutineScope ahVar) {
        Job btVar = (Job) ahVar.getCoroutineContext().get(Job.f173460b);
        if (btVar != null) {
            return btVar.mo242631a();
        }
        return true;
    }

    /* renamed from: a */
    public static final <R> Object m266264a(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> kVar, Continuation<? super R> cVar) {
        ScopeCoroutine xVar = new ScopeCoroutine(cVar.getContext(), cVar);
        Object a = C69359b.m266243a(xVar, xVar, kVar);
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }

    /* renamed from: a */
    public static final void m266266a(CoroutineScope ahVar, CancellationException cancellationException) {
        Job btVar = (Job) ahVar.getCoroutineContext().get(Job.f173460b);
        if (btVar != null) {
            btVar.mo242734a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + ahVar).toString());
    }

    /* renamed from: a */
    public static /* synthetic */ void m266267a(CoroutineScope ahVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m266266a(ahVar, cancellationException);
    }
}
