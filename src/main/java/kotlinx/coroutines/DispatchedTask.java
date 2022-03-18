package kotlinx.coroutines;

import com.tt.frontendapiinterface.ApiHandler;
import java.util.concurrent.CancellationException;
import kotlin.C69026a;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C69554aa;
import kotlinx.coroutines.internal.C69558af;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskContext;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\b\u0013J\u001f\u0010\u0014\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u001aJ\u0006\u0010\u001b\u001a\u00020\fJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001dR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelResult", "", "state", "", "cause", "", "cancelResult$kotlinx_coroutines_core", "getExceptionalResult", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", ApiHandler.API_CALLBACK_EXCEPTION, "finallyException", "handleFatalException$kotlinx_coroutines_core", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.av */
public abstract class DispatchedTask<T> extends Task {

    /* renamed from: e */
    public int f173428e;

    /* renamed from: a */
    public void mo242680a(Object obj, Throwable th) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public <T> T mo242682b(Object obj) {
        return obj;
    }

    /* renamed from: f */
    public abstract Object mo242675f();

    /* renamed from: j */
    public abstract Continuation<T> mo242676j();

    public final void run() {
        Object obj;
        Object obj2;
        CancellationException cancellationException;
        TaskContext iVar = this.f173913g;
        Job btVar = null;
        Throwable th = null;
        try {
            Continuation<T> j = mo242676j();
            if (j != null) {
                DispatchedContinuation asVar = (DispatchedContinuation) j;
                Continuation<T> cVar = asVar.f173423d;
                CoroutineContext context = cVar.getContext();
                Object f = mo242675f();
                Object a = C69558af.m266979a(context, asVar.f173421b);
                try {
                    Throwable c = mo242683c(f);
                    if (aw.m266321a(this.f173428e)) {
                        btVar = (Job) context.get(Job.f173460b);
                    }
                    if (c == null && btVar != null && !btVar.mo242631a()) {
                        CancellationException j2 = btVar.mo242737j();
                        mo242680a(f, j2);
                        Result.Companion aVar = Result.Companion;
                        if (ak.m266271c()) {
                            if (cVar instanceof CoroutineStackFrame) {
                                cancellationException = C69554aa.m266956a(j2, (CoroutineStackFrame) cVar);
                                cVar.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(cancellationException)));
                            }
                        }
                        cancellationException = j2;
                        cVar.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(cancellationException)));
                    } else if (c != null) {
                        Result.Companion aVar2 = Result.Companion;
                        cVar.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(c)));
                    } else {
                        T b = mo242682b(f);
                        Result.Companion aVar3 = Result.Companion;
                        cVar.resumeWith(Result.m271569constructorimpl(b));
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        Result.Companion aVar4 = Result.Companion;
                        DispatchedTask<T> avVar = this;
                        iVar.mo243100b();
                        obj2 = Result.m271569constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion aVar5 = Result.Companion;
                        obj2 = Result.m271569constructorimpl(C69097g.m265890a(th2));
                    }
                    mo242681a(th, Result.m271572exceptionOrNullimpl(obj2));
                    return;
                } finally {
                    C69558af.m266980b(context, a);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
            }
        } catch (Throwable th3) {
            Result.Companion aVar6 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th3));
        }
        mo242681a(th, Result.m271572exceptionOrNullimpl(obj));
    }

    public DispatchedTask(int i) {
        this.f173428e = i;
    }

    /* renamed from: c */
    public final Throwable mo242683c(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            obj = null;
        }
        CompletedExceptionally vVar = (CompletedExceptionally) obj;
        if (vVar != null) {
            return vVar.f173971a;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo242681a(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C69026a.m265651a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            String str = "Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
            if (th == null) {
                Intrinsics.throwNpe();
            }
            C69363ae.m266257a(mo242676j().getContext(), new CoroutinesInternalError(str, th));
        }
    }
}
