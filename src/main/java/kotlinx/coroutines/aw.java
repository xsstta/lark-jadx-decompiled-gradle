package kotlinx.coroutines;

import com.tt.frontendapiinterface.ApiHandler;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.internal.C69554aa;
import kotlinx.coroutines.internal.C69558af;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a.\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0015\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\b\u001a'\u0010\u0019\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\b\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001e"}, d2 = {"MODE_ATOMIC_DEFAULT", "", "MODE_ATOMIC_DEFAULT$annotations", "()V", "MODE_CANCELLABLE", "MODE_CANCELLABLE$annotations", "MODE_UNDISPATCHED", "MODE_UNDISPATCHED$annotations", "isCancellableMode", "", "(I)Z", "isDispatchedMode", "dispatch", "", "T", "Lkotlinx/coroutines/DispatchedTask;", "mode", "resume", "delegate", "Lkotlin/coroutines/Continuation;", "useMode", "resumeUnconfined", "resumeWithStackTrace", ApiHandler.API_CALLBACK_EXCEPTION, "", "runUnconfinedEventLoop", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
public final class aw {
    /* renamed from: a */
    public static final boolean m266321a(int i) {
        return i == 1;
    }

    /* renamed from: b */
    public static final boolean m266322b(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: a */
    private static final void m266318a(DispatchedTask<?> avVar) {
        EventLoop a = ThreadLocalEventLoop.f173537a.mo242858a();
        if (a.mo242702g()) {
            a.mo242694a(avVar);
            return;
        }
        a.mo242695a(true);
        try {
            m266320a(avVar, avVar.mo242676j(), 2);
            do {
            } while (a.mo242700e());
        } catch (Throwable th) {
            a.mo242697b(true);
            throw th;
        }
        a.mo242697b(true);
    }

    /* renamed from: a */
    public static final <T> void m266319a(DispatchedTask<? super T> avVar, int i) {
        Continuation<? super T> j = avVar.mo242676j();
        if (!m266322b(i) || !(j instanceof DispatchedContinuation) || m266321a(i) != m266321a(avVar.f173428e)) {
            m266320a(avVar, j, i);
            return;
        }
        CoroutineDispatcher acVar = ((DispatchedContinuation) j).f173422c;
        CoroutineContext context = j.getContext();
        if (acVar.mo242639a(context)) {
            acVar.mo6045a(context, avVar);
        } else {
            m266318a(avVar);
        }
    }

    /* renamed from: a */
    public static final <T> void m266320a(DispatchedTask<? super T> avVar, Continuation<? super T> cVar, int i) {
        Object obj;
        Object f = avVar.mo242675f();
        Throwable c = avVar.mo242683c(f);
        if (c == null) {
            c = null;
        } else if (ak.m266271c() && (cVar instanceof CoroutineStackFrame)) {
            c = C69554aa.m266956a(c, (CoroutineStackFrame) cVar);
        }
        if (c != null) {
            Result.Companion aVar = Result.Companion;
            obj = C69097g.m265890a(c);
        } else {
            Result.Companion aVar2 = Result.Companion;
            obj = avVar.mo242682b(f);
        }
        Object r3 = Result.m271569constructorimpl(obj);
        if (i == 0) {
            cVar.resumeWith(r3);
        } else if (i == 1) {
            C69369at.m266305a(cVar, r3);
        } else if (i != 2) {
            throw new IllegalStateException(("Invalid mode " + i).toString());
        } else if (cVar != null) {
            DispatchedContinuation asVar = (DispatchedContinuation) cVar;
            CoroutineContext context = asVar.getContext();
            Object a = C69558af.m266979a(context, asVar.f173421b);
            try {
                asVar.f173423d.resumeWith(r3);
                Unit unit = Unit.INSTANCE;
            } finally {
                C69558af.m266980b(context, a);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        }
    }
}
