package kotlinx.coroutines;

import com.tt.frontendapiinterface.ApiHandler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.C69554aa;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000z2\b\u0012\u0004\u0012\u00028\u00000{2\u00060bj\u0002`cB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0016\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001d\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u0010\u001cJ\u001e\u00102\u001a\u00020\n2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\n00H\b¢\u0006\u0004\b2\u00103J8\u00109\u001a\u00020\n2'\u00108\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n04j\u0002`7H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000fH\u0002¢\u0006\u0004\b;\u0010\u0018J8\u0010=\u001a\u00020<2'\u00108\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n04j\u0002`7H\u0002¢\u0006\u0004\b=\u0010>JB\u0010?\u001a\u00020\n2'\u00108\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n04j\u0002`72\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0014¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020\u000fH\u0001¢\u0006\u0004\bG\u0010\u0018J:\u0010J\u001a\u00020\n2\u0006\u0010H\u001a\u00028\u00002!\u0010I\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n04H\u0016¢\u0006\u0004\bJ\u0010KJ#\u0010M\u001a\u0004\u0018\u00010L2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bM\u0010NJ \u0010Q\u001a\u00020\n2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000OH\u0016ø\u0001\u0000¢\u0006\u0004\bQ\u0010\fJ\u000f\u0010R\u001a\u00020\nH\u0002¢\u0006\u0004\bR\u0010\u001cJ\u0011\u0010T\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\bS\u0010'J\u000f\u0010U\u001a\u00020AH\u0016¢\u0006\u0004\bU\u0010CJ\u000f\u0010V\u001a\u00020\u000fH\u0002¢\u0006\u0004\bV\u0010\u0018J#\u0010V\u001a\u0004\u0018\u00010\b2\u0006\u0010H\u001a\u00028\u00002\b\u0010W\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bV\u0010XJ\u0019\u0010Z\u001a\u0004\u0018\u00010\b2\u0006\u0010Y\u001a\u00020\rH\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\\\u0010\u0018J\u001b\u0010^\u001a\u00020\n*\u00020]2\u0006\u0010H\u001a\u00028\u0000H\u0016¢\u0006\u0004\b^\u0010_J\u001b\u0010`\u001a\u00020\n*\u00020]2\u0006\u0010Y\u001a\u00020\rH\u0016¢\u0006\u0004\b`\u0010aR\u001e\u0010f\u001a\n\u0018\u00010bj\u0004\u0018\u0001`c8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001c\u0010h\u001a\u00020g8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010l\u001a\u0004\bm\u0010nR\u0016\u0010o\u001a\u00020\u000f8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0018R\u0016\u0010p\u001a\u00020\u000f8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u0018R\u0016\u0010q\u001a\u00020\u000f8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bq\u0010\u0018R(\u0010w\u001a\u0004\u0018\u00010r2\b\u0010H\u001a\u0004\u0018\u00010r8B@BX\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\bx\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006y"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "proposedUpdate", "", "alreadyResumedError", "(Ljava/lang/Object;)V", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "cancelLater", "state", "cancelResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelResult", "checkCompleted", "()Z", "token", "completeResume", "detachChild$kotlinx_coroutines_core", "()V", "detachChild", "detachChildIfNonResuable", "mode", "dispatchResume", "(I)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "initCancellability", "Lkotlin/Function0;", "block", "invokeHandlerSafely", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "invokeOnCancellation", "(Lkotlin/jvm/functions/Function1;)V", "isReusable", "Lkotlinx/coroutines/CancelHandler;", "makeHandler", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;", "multipleHandlersError", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "", "nameString", "()Ljava/lang/String;", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "resetState", "value", "onCancellation", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/CancelledContinuation;", "resumeImpl", "(Ljava/lang/Object;I)Lkotlinx/coroutines/CancelledContinuation;", "Lkotlin/Result;", "result", "resumeWith", "setupCancellation", "takeState$kotlinx_coroutines_core", "takeState", "toString", "tryResume", "idempotent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", ApiHandler.API_CALLBACK_EXCEPTION, "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "trySuspend", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "isCancelled", "isCompleted", "Lkotlinx/coroutines/DisposableHandle;", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setParentHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.l */
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CoroutineStackFrame, CancellableContinuation<T> {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f173868b = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decision");

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f173869c = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state");
    private volatile int _decision = 0;
    private volatile Object _parentHandle = null;
    private volatile Object _state = Active.f173434a;

    /* renamed from: a */
    private final CoroutineContext f173870a;

    /* renamed from: d */
    private final Continuation<T> f173871d;

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo242768i() {
        return "CancellableContinuation";
    }

    /* renamed from: b */
    public final Object mo243067b() {
        return this._state;
    }

    /* renamed from: d */
    public void mo243071d() {
        m267152m();
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f173870a;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: j */
    public final Continuation<T> mo242676j() {
        return this.f173871d;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: a */
    public boolean mo243066a() {
        return mo243067b() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: a */
    public void mo243065a(CoroutineDispatcher acVar, T t) {
        Continuation<T> cVar = this.f173871d;
        CoroutineDispatcher acVar2 = null;
        if (!(cVar instanceof DispatchedContinuation)) {
            cVar = null;
        }
        DispatchedContinuation asVar = (DispatchedContinuation) cVar;
        if (asVar != null) {
            acVar2 = asVar.f173422c;
        }
        m267143a(t, acVar2 == acVar ? 2 : this.f173428e);
    }

    /* renamed from: k */
    private final DisposableHandle m267150k() {
        return (DisposableHandle) this._parentHandle;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: f */
    public Object mo242675f() {
        return mo243067b();
    }

    /* renamed from: q */
    private final void m267156q() {
        if (!m267151l()) {
            mo243074h();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> cVar = this.f173871d;
        if (!(cVar instanceof CoroutineStackFrame)) {
            cVar = null;
        }
        return (CoroutineStackFrame) cVar;
    }

    /* renamed from: l */
    private final boolean m267151l() {
        Continuation<T> cVar = this.f173871d;
        if (!(cVar instanceof DispatchedContinuation) || !((DispatchedContinuation) cVar).mo242673a((CancellableContinuationImpl<?>) this)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo243070c() {
        return !(mo243067b() instanceof NotCompleted);
    }

    /* renamed from: h */
    public final void mo243074h() {
        DisposableHandle k = m267150k();
        if (k != null) {
            k.mo242687a();
        }
        m267146a((DisposableHandle) NonDisposableHandle.f173485a);
    }

    /* renamed from: n */
    private final boolean m267153n() {
        Throwable a;
        boolean c = mo243070c();
        if (this.f173428e != 0) {
            return c;
        }
        Continuation<T> cVar = this.f173871d;
        if (!(cVar instanceof DispatchedContinuation)) {
            cVar = null;
        }
        DispatchedContinuation asVar = (DispatchedContinuation) cVar;
        if (asVar == null || (a = asVar.mo242669a(this)) == null) {
            return c;
        }
        if (!c) {
            mo243068b(a);
        }
        return true;
    }

    /* renamed from: o */
    private final boolean m267154o() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f173868b.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: p */
    private final boolean m267155p() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f173868b.compareAndSet(this, 0, 2));
        return true;
    }

    public String toString() {
        return mo242768i() + '(' + al.m266274a((Continuation<?>) this.f173871d) + "){" + mo243067b() + "}@" + al.m266273a((Object) this);
    }

    /* renamed from: m */
    private final void m267152m() {
        Job btVar;
        if (!m267153n() && m267150k() == null && (btVar = (Job) this.f173871d.getContext().get(Job.f173460b)) != null) {
            btVar.mo242738k();
            DisposableHandle a = Job.C69372a.m266399a(btVar, true, false, new ChildContinuation(btVar, this), 2, null);
            m267146a(a);
            if (mo243070c() && !m267151l()) {
                a.mo242687a();
                m267146a((DisposableHandle) NonDisposableHandle.f173485a);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo243072e() {
        boolean z;
        if (ak.m266269a()) {
            if (m267150k() != NonDisposableHandle.f173485a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (ak.m266269a() && !(!(obj instanceof NotCompleted))) {
            throw new AssertionError();
        } else if (obj instanceof CompletedIdempotentResult) {
            mo243074h();
            return false;
        } else {
            this._decision = 0;
            this._state = Active.f173434a;
            return true;
        }
    }

    /* renamed from: g */
    public final Object mo243073g() {
        Job btVar;
        m267152m();
        if (m267154o()) {
            return C69086a.m265828a();
        }
        Object b = mo243067b();
        if (b instanceof CompletedExceptionally) {
            Throwable th = ((CompletedExceptionally) b).f173971a;
            CancellableContinuationImpl<T> lVar = this;
            if (!ak.m266271c()) {
                throw th;
            } else if (!(lVar instanceof CoroutineStackFrame)) {
                throw th;
            } else {
                throw C69554aa.m266956a(th, lVar);
            }
        } else if (this.f173428e != 1 || (btVar = (Job) getContext().get(Job.f173460b)) == null || btVar.mo242631a()) {
            return mo242682b(b);
        } else {
            CancellationException j = btVar.mo242737j();
            mo242680a(b, (Throwable) j);
            CancellableContinuationImpl<T> lVar2 = this;
            if (!ak.m266271c()) {
                throw j;
            } else if (!(lVar2 instanceof CoroutineStackFrame)) {
                throw j;
            } else {
                throw C69554aa.m266956a(j, lVar2);
            }
        }
    }

    /* renamed from: a */
    private final void m267146a(DisposableHandle azVar) {
        this._parentHandle = azVar;
    }

    /* renamed from: a */
    public Throwable mo242767a(Job btVar) {
        return btVar.mo242737j();
    }

    /* renamed from: a */
    private final void m267144a(int i) {
        if (!m267155p()) {
            aw.m266319a(this, i);
        }
    }

    /* renamed from: b */
    private final CancelHandler m267147b(Function1<? super Throwable, Unit> function1) {
        if (function1 instanceof CancelHandler) {
            return (CancelHandler) function1;
        }
        return new InvokeOnCancel(function1);
    }

    /* renamed from: c */
    public final void mo243069c(Throwable th) {
        if (!m267149d(th)) {
            mo243068b(th);
            m267156q();
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        m267143a(C69584w.m267324a(obj, (CancellableContinuation<?>) this), this.f173428e);
    }

    /* renamed from: d */
    private final void m267148d(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: a */
    public Object mo243062a(Throwable th) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof NotCompleted)) {
                return null;
            }
        } while (!f173869c.compareAndSet(this, obj, new CompletedExceptionally(th, false, 2, null)));
        m267156q();
        return C69574m.f173872a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: b */
    public <T> T mo242682b(Object obj) {
        return obj instanceof CompletedIdempotentResult ? (T) ((CompletedIdempotentResult) obj).f173973b : obj instanceof CompletedWithCancellation ? (T) ((CompletedWithCancellation) obj).f173974a : obj;
    }

    /* renamed from: d */
    private final boolean m267149d(Throwable th) {
        if (this.f173428e != 0) {
            return false;
        }
        Continuation<T> cVar = this.f173871d;
        if (!(cVar instanceof DispatchedContinuation)) {
            cVar = null;
        }
        DispatchedContinuation asVar = (DispatchedContinuation) cVar;
        if (asVar != null) {
            return asVar.mo242672a(th);
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo243068b(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            z = obj instanceof CancelHandler;
        } while (!f173869c.compareAndSet(this, obj, new CancelledContinuation(this, th, z)));
        if (z) {
            try {
                ((CancelHandler) obj).mo242689a(th);
            } catch (Throwable th2) {
                CoroutineContext context = getContext();
                C69363ae.m266257a(context, new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
            }
        }
        m267156q();
        m267144a(0);
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: a */
    public void mo243063a(Object obj) {
        boolean z;
        if (ak.m266269a()) {
            if (obj == C69574m.f173872a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        m267144a(this.f173428e);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: a */
    public void mo243064a(Function1<? super Throwable, Unit> function1) {
        Throwable th = null;
        CancelHandler iVar = null;
        while (true) {
            Object obj = this._state;
            if (obj instanceof Active) {
                if (iVar == null) {
                    iVar = m267147b(function1);
                }
                if (f173869c.compareAndSet(this, obj, iVar)) {
                    return;
                }
            } else if (obj instanceof CancelHandler) {
                m267145a(function1, obj);
            } else if (obj instanceof CancelledContinuation) {
                if (!((CancelledContinuation) obj).mo243139c()) {
                    m267145a(function1, obj);
                }
                try {
                    if (!(obj instanceof CompletedExceptionally)) {
                        obj = null;
                    }
                    CompletedExceptionally vVar = (CompletedExceptionally) obj;
                    if (vVar != null) {
                        th = vVar.f173971a;
                    }
                    function1.invoke(th);
                    return;
                } catch (Throwable th2) {
                    C69363ae.m266257a(getContext(), new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.c<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(Continuation<? super T> cVar, int i) {
        super(i);
        this.f173871d = cVar;
        this.f173870a = cVar.getContext();
    }

    /* renamed from: a */
    private final CancelledContinuation m267143a(Object obj, int i) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof NotCompleted)) {
                if (obj2 instanceof CancelledContinuation) {
                    CancelledContinuation oVar = (CancelledContinuation) obj2;
                    if (oVar.mo243076a()) {
                        return oVar;
                    }
                }
                m267148d(obj);
            } else if (f173869c.compareAndSet(this, obj2, obj)) {
                m267156q();
                m267144a(i);
                return null;
            }
        }
    }

    /* renamed from: a */
    private final void m267145a(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: a */
    public Object mo243061a(T t, Object obj) {
        Object obj2;
        boolean z;
        CompletedIdempotentResult xVar;
        do {
            obj2 = this._state;
            if (obj2 instanceof NotCompleted) {
                if (obj == null) {
                    xVar = t;
                } else {
                    xVar = new CompletedIdempotentResult(obj, t);
                }
            } else if (!(obj2 instanceof CompletedIdempotentResult)) {
                return null;
            } else {
                CompletedIdempotentResult xVar2 = (CompletedIdempotentResult) obj2;
                if (xVar2.f173972a != obj) {
                    return null;
                }
                if (ak.m266269a()) {
                    if (xVar2.f173973b == t) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                return C69574m.f173872a;
            }
        } while (!f173869c.compareAndSet(this, obj2, xVar));
        m267156q();
        return C69574m.f173872a;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: a */
    public void mo242680a(Object obj, Throwable th) {
        if (obj instanceof CompletedWithCancellation) {
            try {
                ((CompletedWithCancellation) obj).f173975b.invoke(th);
            } catch (Throwable th2) {
                CoroutineContext context = getContext();
                C69363ae.m266257a(context, new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
            }
        }
    }
}
