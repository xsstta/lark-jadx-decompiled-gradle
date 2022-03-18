package kotlinx.coroutines.selects;

import com.tt.frontendapiinterface.ApiHandler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69363ae;
import kotlinx.coroutines.C69574m;
import kotlinx.coroutines.C69584w;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobCancellingNode;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.internal.AtomicDesc;
import kotlinx.coroutines.internal.AtomicOp;
import kotlinx.coroutines.internal.C69554aa;
import kotlinx.coroutines.internal.C69563c;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020Y2\b\u0012\u0004\u0012\u00028\u00000Z2\b\u0012\u0004\u0012\u00028\u00000[2\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060Bj\u0002`C:\u0004TUVWB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\rH\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\fJ8\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010\u001cJ \u0010+\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J5\u00108\u001a\u00020\b*\u0002072\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109JG\u00108\u001a\u00020\b\"\u0004\b\u0001\u0010:*\b\u0012\u0004\u0012\u00028\u00010;2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0<H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010=J[\u00108\u001a\u00020\b\"\u0004\b\u0001\u0010>\"\u0004\b\u0002\u0010:*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020?2\u0006\u0010@\u001a\u00028\u00012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0<H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010AR\u001e\u0010F\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`C8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0016\u0010N\u001a\u0002008V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bN\u00102R(\u0010R\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00068B@BX\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\nR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010S\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", "R", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/Continuation;)V", "Lkotlinx/coroutines/DisposableHandle;", "handle", "", "disposeOnSelect", "(Lkotlinx/coroutines/DisposableHandle;)V", "doAfterSelect", "()V", "Lkotlin/Function0;", "", "value", "block", "doResume", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "e", "handleBuilderException", "(Ljava/lang/Throwable;)V", "initCancellability", "", "timeMillis", "Lkotlin/Function1;", "onTimeout", "(JLkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/AtomicDesc;", "desc", "performAtomicTrySelect", "(Lkotlinx/coroutines/internal/AtomicDesc;)Ljava/lang/Object;", ApiHandler.API_CALLBACK_EXCEPTION, "resumeSelectWithException", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "trySelect", "()Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "otherOp", "trySelectOther", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectClause0;", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getCompletion", "()Lkotlin/coroutines/Continuation;", "completion", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "isSelected", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setParentHandle", "parentHandle", "Lkotlin/coroutines/Continuation;", "AtomicSelectOp", "DisposeNode", "PairSelectOp", "SelectOnCancelling", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstance;"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.selects.b */
public final class SelectBuilderImpl<R> extends LockFreeLinkedListHead implements Continuation<R>, CoroutineStackFrame, SelectBuilder<R>, SelectInstance<R> {

    /* renamed from: a */
    static final AtomicReferenceFieldUpdater f173926a = AtomicReferenceFieldUpdater.newUpdater(SelectBuilderImpl.class, Object.class, "_state");

    /* renamed from: b */
    static final AtomicReferenceFieldUpdater f173927b = AtomicReferenceFieldUpdater.newUpdater(SelectBuilderImpl.class, Object.class, "_result");
    private volatile Object _parentHandle = null;
    volatile Object _result = C69578e.f173935a;
    volatile Object _state = C69578e.m267290a();

    /* renamed from: c */
    private final Continuation<R> f173928c;

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: a */
    public Continuation<R> mo243116a() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "", "impl", "Lkotlinx/coroutines/selects/SelectBuilderImpl;", "desc", "Lkotlinx/coroutines/internal/AtomicDesc;", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/internal/AtomicDesc;)V", "opSequence", "", "getOpSequence", "()J", "complete", "", "affected", "failure", "completeSelect", "prepare", "prepareSelectOp", "toString", "", "undoPrepare", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.selects.b$a */
    public static final class AtomicSelectOp extends AtomicOp<Object> {

        /* renamed from: a */
        public final SelectBuilderImpl<?> f173929a;

        /* renamed from: b */
        public final AtomicDesc f173930b;

        /* renamed from: c */
        private final long f173931c = C69578e.f173937c.mo243124a();

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: b */
        public long mo242985b() {
            return this.f173931c;
        }

        /* renamed from: e */
        private final void m267275e() {
            SelectBuilderImpl.f173926a.compareAndSet(this.f173929a, this, C69578e.m267290a());
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public String toString() {
            return "AtomicSelectOp(sequence=" + mo242985b() + ')';
        }

        /* renamed from: d */
        private final Object m267273d() {
            SelectBuilderImpl<?> bVar = this.f173929a;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof OpDescriptor) {
                    ((OpDescriptor) obj).mo242987c(this.f173929a);
                } else if (obj != C69578e.m267290a()) {
                    return C69578e.m267291b();
                } else {
                    if (SelectBuilderImpl.f173926a.compareAndSet(this.f173929a, C69578e.m267290a(), this)) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: d */
        private final void m267274d(Object obj) {
            boolean z;
            Object obj2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj2 = null;
            } else {
                obj2 = C69578e.m267290a();
            }
            if (SelectBuilderImpl.f173926a.compareAndSet(this.f173929a, this, obj2) && z) {
                this.f173929a.mo243122f();
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: a */
        public Object mo242778a(Object obj) {
            Object d;
            if (obj == null && (d = m267273d()) != null) {
                return d;
            }
            try {
                return this.f173930b.mo242982b(this);
            } catch (Throwable th) {
                if (obj == null) {
                    m267275e();
                }
                throw th;
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: a */
        public void mo242983a(Object obj, Object obj2) {
            m267274d(obj2);
            this.f173930b.mo242981a(this, obj2);
        }

        public AtomicSelectOp(SelectBuilderImpl<?> bVar, AtomicDesc bVar2) {
            this.f173929a = bVar;
            this.f173930b = bVar2;
            bVar2.mo242980a(this);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$PairSelectOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "", "affected", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.selects.b$c */
    public static final class PairSelectOp extends OpDescriptor {

        /* renamed from: a */
        public final LockFreeLinkedListNode.PrepareOp f173933a;

        @Override // kotlinx.coroutines.internal.OpDescriptor
        /* renamed from: c */
        public AtomicOp<?> mo242988c() {
            return this.f173933a.mo242988c();
        }

        public PairSelectOp(LockFreeLinkedListNode.PrepareOp cVar) {
            this.f173933a = cVar;
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        /* renamed from: c */
        public Object mo242987c(Object obj) {
            Object obj2;
            if (obj != null) {
                SelectBuilderImpl bVar = (SelectBuilderImpl) obj;
                this.f173933a.mo243030a();
                Object b = this.f173933a.mo242988c().mo242986b(null);
                if (b == null) {
                    obj2 = this.f173933a.f173842c;
                } else {
                    obj2 = C69578e.m267290a();
                }
                SelectBuilderImpl.f173926a.compareAndSet(bVar, this, obj2);
                return b;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    /* renamed from: o */
    private final DisposableHandle m267260o() {
        return (DisposableHandle) this._parentHandle;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f173928c.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<R> cVar = this.f173928c;
        if (!(cVar instanceof CoroutineStackFrame)) {
            cVar = null;
        }
        return (CoroutineStackFrame) cVar;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$SelectOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "Lkotlinx/coroutines/Job;", "job", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/Job;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.selects.b$d */
    public final class SelectOnCancelling extends JobCancellingNode<Job> {
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "SelectOnCancelling[" + SelectBuilderImpl.this + ']';
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            mo242730a(th);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: a */
        public void mo242730a(Throwable th) {
            if (SelectBuilderImpl.this.mo243123g()) {
                SelectBuilderImpl.this.mo243117a(this.f173463b.mo242737j());
            }
        }

        public SelectOnCancelling(Job btVar) {
            super(btVar);
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: e */
    public boolean mo243121e() {
        while (true) {
            Object obj = this._state;
            if (obj == C69578e.m267290a()) {
                return false;
            }
            if (!(obj instanceof OpDescriptor)) {
                return true;
            }
            ((OpDescriptor) obj).mo242987c(this);
        }
    }

    /* renamed from: p */
    private final void m267261p() {
        Job btVar = (Job) getContext().get(Job.f173460b);
        if (btVar != null) {
            DisposableHandle a = Job.C69372a.m266399a(btVar, true, false, new SelectOnCancelling(btVar), 2, null);
            m267259b(a);
            if (mo243121e()) {
                a.mo242687a();
            }
        }
    }

    /* renamed from: b */
    public final Object mo243119b() {
        if (!mo243121e()) {
            m267261p();
        }
        Object obj = this._result;
        if (obj == C69578e.f173935a) {
            if (f173927b.compareAndSet(this, C69578e.f173935a, C69086a.m265828a())) {
                return C69086a.m265828a();
            }
            obj = this._result;
        }
        if (obj == C69578e.f173936b) {
            throw new IllegalStateException("Already resumed");
        } else if (!(obj instanceof CompletedExceptionally)) {
            return obj;
        } else {
            throw ((CompletedExceptionally) obj).f173971a;
        }
    }

    /* renamed from: f */
    public final void mo243122f() {
        DisposableHandle o = m267260o();
        if (o != null) {
            o.mo242687a();
        }
        SelectBuilderImpl<R> bVar = this;
        Object i = bVar.mo243016i();
        if (i != null) {
            for (LockFreeLinkedListNode oVar = (LockFreeLinkedListNode) i; !Intrinsics.areEqual(oVar, bVar); oVar = oVar.mo243017j()) {
                if (oVar instanceof DisposeNode) {
                    ((DisposeNode) oVar).f173932a.mo242687a();
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: g */
    public boolean mo243123g() {
        Object a = mo243115a((LockFreeLinkedListNode.PrepareOp) null);
        if (a == C69574m.f173872a) {
            return true;
        }
        if (a == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + a).toString());
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    /* renamed from: b */
    private final void m267259b(DisposableHandle azVar) {
        this._parentHandle = azVar;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "handle", "Lkotlinx/coroutines/DisposableHandle;", "(Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.selects.b$b */
    public static final class DisposeNode extends LockFreeLinkedListNode {

        /* renamed from: a */
        public final DisposableHandle f173932a;

        public DisposeNode(DisposableHandle azVar) {
            this.f173932a = azVar;
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: a */
    public Object mo243114a(AtomicDesc bVar) {
        return new AtomicSelectOp(this, bVar).mo242987c(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.c<? super R> */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectBuilderImpl(Continuation<? super R> cVar) {
        this.f173928c = cVar;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: a */
    public void mo243118a(DisposableHandle azVar) {
        DisposeNode bVar = new DisposeNode(azVar);
        if (!mo243121e()) {
            mo243013b(bVar);
            if (!mo243121e()) {
                return;
            }
        }
        azVar.mo242687a();
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: a */
    public Object mo243115a(LockFreeLinkedListNode.PrepareOp cVar) {
        while (true) {
            Object obj = this._state;
            if (obj == C69578e.m267290a()) {
                if (cVar == null) {
                    if (f173926a.compareAndSet(this, C69578e.m267290a(), null)) {
                        break;
                    }
                } else {
                    PairSelectOp cVar2 = new PairSelectOp(cVar);
                    if (f173926a.compareAndSet(this, C69578e.m267290a(), cVar2)) {
                        Object c = cVar2.mo242987c(this);
                        if (c != null) {
                            return c;
                        }
                    }
                }
            } else if (obj instanceof OpDescriptor) {
                if (cVar != null) {
                    AtomicOp<?> c2 = cVar.mo242988c();
                    if ((c2 instanceof AtomicSelectOp) && ((AtomicSelectOp) c2).f173929a == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    } else if (c2.mo243049a((OpDescriptor) obj)) {
                        return C69563c.f173820b;
                    }
                }
                ((OpDescriptor) obj).mo242987c(this);
            } else if (cVar != null && obj == cVar.f173842c) {
                return C69574m.f173872a;
            } else {
                return null;
            }
        }
        mo243122f();
        return C69574m.f173872a;
    }

    /* renamed from: b */
    public final void mo243120b(Throwable th) {
        Throwable th2;
        if (mo243123g()) {
            Result.Companion aVar = Result.Companion;
            resumeWith(Result.m271569constructorimpl(C69097g.m265890a(th)));
        } else if (!(th instanceof CancellationException)) {
            Object b = mo243119b();
            if (b instanceof CompletedExceptionally) {
                Throwable th3 = ((CompletedExceptionally) b).f173971a;
                if (ak.m266271c()) {
                    th3 = C69554aa.m266961b(th3);
                }
                if (!ak.m266271c()) {
                    th2 = th;
                } else {
                    th2 = C69554aa.m266961b(th);
                }
                if (th3 == th2) {
                    return;
                }
            }
            C69363ae.m266257a(getContext(), th);
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        if (!ak.m266269a() || mo243121e()) {
            while (true) {
                Object obj2 = this._result;
                if (obj2 == C69578e.f173935a) {
                    if (f173927b.compareAndSet(this, C69578e.f173935a, C69584w.m267322a(obj))) {
                        return;
                    }
                } else if (obj2 != C69086a.m265828a()) {
                    throw new IllegalStateException("Already resumed");
                } else if (f173927b.compareAndSet(this, C69086a.m265828a(), C69578e.f173936b)) {
                    if (Result.m271575isFailureimpl(obj)) {
                        Continuation<R> cVar = this.f173928c;
                        Throwable r4 = Result.m271572exceptionOrNullimpl(obj);
                        if (r4 == null) {
                            Intrinsics.throwNpe();
                        }
                        Result.Companion aVar = Result.Companion;
                        if (ak.m266271c() && (cVar instanceof CoroutineStackFrame)) {
                            r4 = C69554aa.m266956a(r4, (CoroutineStackFrame) cVar);
                        }
                        cVar.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(r4)));
                        return;
                    }
                    this.f173928c.resumeWith(obj);
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: a */
    public void mo243117a(Throwable th) {
        Throwable th2;
        if (!ak.m266269a() || mo243121e()) {
            while (true) {
                Object obj = this._result;
                if (obj == C69578e.f173935a) {
                    Continuation<R> cVar = this.f173928c;
                    if (!ak.m266271c() || !(cVar instanceof CoroutineStackFrame)) {
                        th2 = th;
                    } else {
                        th2 = C69554aa.m266956a(th, (CoroutineStackFrame) cVar);
                    }
                    if (f173927b.compareAndSet(this, C69578e.f173935a, new CompletedExceptionally(th2, false, 2, null))) {
                        return;
                    }
                } else if (obj != C69086a.m265828a()) {
                    throw new IllegalStateException("Already resumed");
                } else if (f173927b.compareAndSet(this, C69086a.m265828a(), C69578e.f173936b)) {
                    Continuation a = C69086a.m265825a(this.f173928c);
                    Result.Companion aVar = Result.Companion;
                    a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(th)));
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    /* renamed from: a */
    public <Q> void mo243113a(SelectClause1<? extends Q> cVar, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> kVar) {
        cVar.mo242668a(this, kVar);
    }
}
