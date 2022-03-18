package kotlinx.coroutines;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C69558af;
import kotlinx.coroutines.internal.Symbol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\b\u001a.\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0017\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100\bH\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "REUSABLE_CLAIMED$annotations", "()V", "UNDEFINED", "UNDEFINED$annotations", "executeUnconfined", "", "Lkotlinx/coroutines/DispatchedContinuation;", "contState", "", "mode", "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", "T", "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.at */
public final class C69369at {

    /* renamed from: a */
    public static final Symbol f173425a = new Symbol("UNDEFINED");

    /* renamed from: b */
    public static final Symbol f173426b = new Symbol("REUSABLE_CLAIMED");

    /* renamed from: a */
    public static final boolean m266306a(DispatchedContinuation<? super Unit> asVar) {
        Unit unit = Unit.INSTANCE;
        EventLoop a = ThreadLocalEventLoop.f173537a.mo242858a();
        if (a.mo242703h()) {
            return false;
        }
        if (a.mo242702g()) {
            asVar.f173420a = unit;
            asVar.f173428e = 1;
            a.mo242694a((DispatchedTask<?>) asVar);
            return true;
        }
        DispatchedContinuation<? super Unit> asVar2 = asVar;
        a.mo242695a(true);
        try {
            asVar.run();
            do {
            } while (a.mo242700e());
        } catch (Throwable th) {
            a.mo242697b(true);
            throw th;
        }
        a.mo242697b(true);
        return false;
    }

    /* renamed from: a */
    public static final <T> void m266305a(Continuation<? super T> cVar, Object obj) {
        boolean z;
        if (cVar instanceof DispatchedContinuation) {
            DispatchedContinuation asVar = (DispatchedContinuation) cVar;
            Object a = C69584w.m267322a(obj);
            if (asVar.f173422c.mo242639a(asVar.getContext())) {
                asVar.f173420a = a;
                asVar.f173428e = 1;
                asVar.f173422c.mo6045a(asVar.getContext(), asVar);
                return;
            }
            EventLoop a2 = ThreadLocalEventLoop.f173537a.mo242858a();
            if (a2.mo242702g()) {
                asVar.f173420a = a;
                asVar.f173428e = 1;
                a2.mo242694a((DispatchedTask<?>) asVar);
                return;
            }
            DispatchedContinuation asVar2 = asVar;
            a2.mo242695a(true);
            try {
                Job btVar = (Job) asVar.getContext().get(Job.f173460b);
                if (btVar == null || btVar.mo242631a()) {
                    z = false;
                } else {
                    Result.Companion aVar = Result.Companion;
                    asVar.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) btVar.mo242737j())));
                    z = true;
                }
                if (!z) {
                    CoroutineContext context = asVar.getContext();
                    Object a3 = C69558af.m266979a(context, asVar.f173421b);
                    try {
                        asVar.f173423d.resumeWith(obj);
                        Unit unit = Unit.INSTANCE;
                    } finally {
                        C69558af.m266980b(context, a3);
                    }
                }
                do {
                } while (a2.mo242700e());
            } catch (Throwable th) {
                a2.mo242697b(true);
                throw th;
            }
            a2.mo242697b(true);
            return;
        }
        cVar.resumeWith(obj);
    }
}
