package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C69558af;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000E2\u000604j\u0002`52\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\bø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001bH\b¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\bø\u0001\u0000¢\u0006\u0004\b'\u0010$J \u0010(\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010$J\u0011\u0010,\u001a\u0004\u0018\u00010)H\u0010¢\u0006\u0004\b*\u0010+J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u001e\u00100\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b0\u00101\u0012\u0004\b2\u00103R$\u00106\u001a\n\u0018\u000104j\u0004\u0018\u0001`58\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010\u0010\u001a\u00020\u000f8\u0016@\u0016X\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0016\u0010=\u001a\u00020)8\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b=\u00101R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048P@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010AR\u0019\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lkotlinx/coroutines/DispatchedContinuation;", "T", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "Lkotlinx/coroutines/CancellableContinuation;", "", "checkPostponedCancellation", "(Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Throwable;", "Lkotlinx/coroutines/CancellableContinuationImpl;", "claimReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "dispatchYield", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "requester", "", "isReusable", "(Lkotlinx/coroutines/CancellableContinuationImpl;)Z", "cause", "postponeCancellation", "(Ljava/lang/Throwable;)Z", "Lkotlin/Result;", "result", "resumeCancellableWith", "(Ljava/lang/Object;)V", "resumeCancelled", "()Z", "resumeUndispatchedWith", "resumeWith", "", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "", "toString", "()Ljava/lang/String;", "_state", "Ljava/lang/Object;", "_state$annotations", "()V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "countOrElement", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/CoroutineDispatcher;", "getReusableCancellableContinuation", "reusableCancellableContinuation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.as */
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements Continuation<T>, CoroutineStackFrame {

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f173419i = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: a */
    public Object f173420a = C69369at.f173425a;

    /* renamed from: b */
    public final Object f173421b;

    /* renamed from: c */
    public final CoroutineDispatcher f173422c;

    /* renamed from: d */
    public final Continuation<T> f173423d;

    /* renamed from: h */
    private final CoroutineStackFrame f173424h;

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f173423d.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: j */
    public Continuation<T> mo242676j() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        return this.f173424h;
    }

    /* renamed from: a */
    public final CancellableContinuationImpl<?> mo242670a() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof CancellableContinuationImpl)) {
            obj = null;
        }
        return (CancellableContinuationImpl) obj;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: f */
    public Object mo242675f() {
        boolean z;
        Object obj = this.f173420a;
        if (ak.m266269a()) {
            if (obj != C69369at.f173425a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        this.f173420a = C69369at.f173425a;
        return obj;
    }

    /* renamed from: b */
    public final CancellableContinuationImpl<T> mo242674b() {
        Object obj;
        do {
            obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C69369at.f173426b;
                return null;
            } else if (!(obj instanceof CancellableContinuationImpl)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!f173419i.compareAndSet(this, obj, C69369at.f173426b));
        return (CancellableContinuationImpl) obj;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f173422c + ", " + al.m266274a((Continuation<?>) this.f173423d) + ']';
    }

    /* renamed from: a */
    public final boolean mo242672a(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (Intrinsics.areEqual(obj, C69369at.f173426b)) {
                if (f173419i.compareAndSet(this, C69369at.f173426b, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f173419i.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: a */
    public final Throwable mo242669a(CancellableContinuation<?> kVar) {
        do {
            Object obj = this._reusableCancellableContinuation;
            if (obj != C69369at.f173426b) {
                if (obj == null) {
                    return null;
                }
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (f173419i.compareAndSet(this, obj, null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f173419i.compareAndSet(this, C69369at.f173426b, kVar));
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        CoroutineContext context = this.f173423d.getContext();
        Object a = C69584w.m267322a(obj);
        if (this.f173422c.mo242639a(context)) {
            this.f173420a = a;
            this.f173428e = 0;
            this.f173422c.mo6045a(context, this);
            return;
        }
        EventLoop a2 = ThreadLocalEventLoop.f173537a.mo242858a();
        if (a2.mo242702g()) {
            this.f173420a = a;
            this.f173428e = 0;
            a2.mo242694a((DispatchedTask<?>) this);
            return;
        }
        DispatchedContinuation<T> asVar = this;
        a2.mo242695a(true);
        try {
            CoroutineContext context2 = getContext();
            Object a3 = C69558af.m266979a(context2, this.f173421b);
            try {
                this.f173423d.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                do {
                } while (a2.mo242700e());
                a2.mo242697b(true);
            } finally {
                C69558af.m266980b(context2, a3);
            }
        } catch (Throwable th) {
            a2.mo242697b(true);
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo242673a(CancellableContinuationImpl<?> lVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof CancellableContinuationImpl) || obj == lVar) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo242671a(CoroutineContext fVar, T t) {
        this.f173420a = t;
        this.f173428e = 1;
        this.f173422c.mo242640b(fVar, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.coroutines.c<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(CoroutineDispatcher acVar, Continuation<? super T> cVar) {
        super(0);
        this.f173422c = acVar;
        this.f173423d = cVar;
        this.f173424h = (CoroutineStackFrame) (!(cVar instanceof CoroutineStackFrame) ? null : cVar);
        this.f173421b = C69558af.m266978a(getContext());
        this._reusableCancellableContinuation = null;
    }
}
