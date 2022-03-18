package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ak;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0017\u0018\u00002\u00020C:\u0005JKLMNB\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000b\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u000f\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\rH\b¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\r2\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001a\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\f\b\u0000\u0010\u001c*\u00060\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00030 ¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00060\u0000j\u0002`\u00032\n\u0010#\u001a\u00060\u0000j\u0002`\u0003H\u0010¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0002¢\u0006\u0004\b&\u0010\u0007J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u0002J\u000f\u0010(\u001a\u00020\u0005H\u0001¢\u0006\u0004\b(\u0010\u0002J,\u0010*\u001a\u00020)2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J.\u00100\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\rH\b¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0001¢\u0006\u0004\b3\u0010-J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J/\u0010<\u001a\u00020;2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00032\u0006\u0010:\u001a\u00020)H\u0001¢\u0006\u0004\b<\u0010=J'\u0010A\u001a\u00020\u00052\n\u0010>\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020\t8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bB\u0010/R\u0013\u0010\u0013\u001a\u00020C8F@\u0006¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0017\u0010G\u001a\u00060\u0000j\u0002`\u00038F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010-R\u0017\u0010I\u001a\u00060\u0000j\u0002`\u00038F@\u0006¢\u0006\u0006\u001a\u0004\bH\u0010-¨\u0006O"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "addLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlin/Function0;", "", "condition", "addLastIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;)Z", "addLastIfPrevAndIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", "next", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "addOneIfEmpty", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "correctPrev", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "current", "findPrevNonRemoved", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "finishAdd", "helpRemove", "helpRemovePrev", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "nextIfRemoved", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "remove", "()Z", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "removeOrNext", "Lkotlinx/coroutines/internal/Removed;", "removed", "()Lkotlinx/coroutines/internal/Removed;", "", "toString", "()Ljava/lang/String;", "condAdd", "", "tryCondAddNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "validateNode", "isRemoved", "", "getNext", "()Ljava/lang/Object;", "getNextNode", "nextNode", "getPrevNode", "prevNode", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "PrepareOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.o */
public class LockFreeLinkedListNode {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f173835a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");

    /* renamed from: e */
    static final AtomicReferenceFieldUpdater f173836e = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");

    /* renamed from: f */
    static final AtomicReferenceFieldUpdater f173837f = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "next", "desc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "finishPrepare", "", "perform", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.internal.o$c */
    public static final class PrepareOp extends OpDescriptor {

        /* renamed from: a */
        public final LockFreeLinkedListNode f173840a;

        /* renamed from: b */
        public final LockFreeLinkedListNode f173841b;

        /* renamed from: c */
        public final AbstractAtomicDesc f173842c;

        /* renamed from: a */
        public final void mo243030a() {
            this.f173842c.mo243026b(this);
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        /* renamed from: c */
        public AtomicOp<?> mo242988c() {
            return this.f173842c.mo242979a();
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public String toString() {
            return "PrepareOp(op=" + mo242988c() + ')';
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        /* renamed from: c */
        public Object mo242987c(Object obj) {
            Object obj2;
            boolean z;
            boolean z2 = true;
            if (ak.m266269a()) {
                if (obj == this.f173840a) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if (obj != null) {
                LockFreeLinkedListNode oVar = (LockFreeLinkedListNode) obj;
                Object a = this.f173842c.mo242813a(this);
                if (a == C69571p.f173846a) {
                    LockFreeLinkedListNode oVar2 = this.f173841b;
                    if (LockFreeLinkedListNode.f173836e.compareAndSet(oVar, this, oVar2.mo243015h())) {
                        oVar2.mo243010a((OpDescriptor) null);
                    }
                    return C69571p.f173846a;
                }
                if (a != null) {
                    mo242988c().mo242986b(a);
                } else {
                    z2 = mo242988c().mo242984a();
                }
                if (z2) {
                    obj2 = this.f173841b;
                } else {
                    obj2 = mo242988c();
                }
                LockFreeLinkedListNode.f173836e.compareAndSet(oVar, this, obj2);
                return null;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }

        public PrepareOp(LockFreeLinkedListNode oVar, LockFreeLinkedListNode oVar2, AbstractAtomicDesc aVar) {
            this.f173840a = oVar;
            this.f173841b = oVar2;
            this.f173842c = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020(B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0019\u0010&\u001a\u00028\u00008F@\u0006¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "queue", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "affected", "", "failure", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "next", "", "finishOnSuccess", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "prepareOp", "finishPrepare", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "", "retry", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "updatedNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "getResult", "()Ljava/lang/Object;", "result$annotations", "()V", "result", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.internal.o$d */
    public static class RemoveFirstDesc<T> extends AbstractAtomicDesc {

        /* renamed from: c */
        private static final AtomicReferenceFieldUpdater f173843c = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_affectedNode");

        /* renamed from: d */
        private static final AtomicReferenceFieldUpdater f173844d = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_originalNext");
        private volatile Object _affectedNode;
        private volatile Object _originalNext;

        /* renamed from: b */
        public final LockFreeLinkedListNode f173845b;

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: b */
        public final LockFreeLinkedListNode mo243025b() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: c */
        public final LockFreeLinkedListNode mo243028c() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        /* renamed from: d */
        public final T mo243032d() {
            LockFreeLinkedListNode b = mo243025b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            return (T) b;
        }

        public RemoveFirstDesc(LockFreeLinkedListNode oVar) {
            this.f173845b = oVar;
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: a */
        public Object mo242814a(LockFreeLinkedListNode oVar) {
            if (oVar == this.f173845b) {
                return C69570n.m267045b();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: b */
        public void mo243026b(PrepareOp cVar) {
            f173843c.compareAndSet(this, null, cVar.f173840a);
            f173844d.compareAndSet(this, null, cVar.f173841b);
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: a */
        public final LockFreeLinkedListNode mo243023a(OpDescriptor vVar) {
            LockFreeLinkedListNode oVar = this.f173845b;
            while (true) {
                Object obj = oVar._next;
                if (obj instanceof OpDescriptor) {
                    OpDescriptor vVar2 = (OpDescriptor) obj;
                    if (vVar.mo243049a(vVar2)) {
                        return null;
                    }
                    vVar2.mo242987c(this.f173845b);
                } else if (obj != null) {
                    return (LockFreeLinkedListNode) obj;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: a */
        public final Object mo243022a(LockFreeLinkedListNode oVar, LockFreeLinkedListNode oVar2) {
            return oVar2.mo243015h();
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: a */
        public final boolean mo243024a(LockFreeLinkedListNode oVar, Object obj) {
            if (!(obj instanceof Removed)) {
                return false;
            }
            ((Removed) obj).f173863a.mo243021n();
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: b */
        public final void mo243027b(LockFreeLinkedListNode oVar, LockFreeLinkedListNode oVar2) {
            oVar2.mo243010a((OpDescriptor) null);
        }
    }

    public boolean cK_() {
        return mo243016i() instanceof Removed;
    }

    public boolean cL_() {
        if (mo243019l() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final Object mo243016i() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).mo242987c(this);
        }
    }

    /* renamed from: j */
    public final LockFreeLinkedListNode mo243017j() {
        return C69570n.m267044a(mo243016i());
    }

    /* renamed from: h */
    public final Removed mo243015h() {
        Removed wVar = (Removed) this._removedRef;
        if (wVar != null) {
            return wVar;
        }
        Removed wVar2 = new Removed(this);
        f173835a.lazySet(this, wVar2);
        return wVar2;
    }

    /* renamed from: k */
    public final LockFreeLinkedListNode mo243018k() {
        LockFreeLinkedListNode a = mo243010a((OpDescriptor) null);
        if (a != null) {
            return a;
        }
        return m267046d((LockFreeLinkedListNode) this._prev);
    }

    /* renamed from: m */
    public final void mo243020m() {
        Object i = mo243016i();
        if (i != null) {
            ((Removed) i).f173863a.mo243010a((OpDescriptor) null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
    }

    /* renamed from: n */
    public final void mo243021n() {
        LockFreeLinkedListNode oVar = this;
        while (true) {
            Object i = oVar.mo243016i();
            if (!(i instanceof Removed)) {
                oVar.mo243010a((OpDescriptor) null);
                return;
            }
            oVar = ((Removed) i).f173863a;
        }
    }

    /* renamed from: l */
    public final LockFreeLinkedListNode mo243019l() {
        Object i;
        LockFreeLinkedListNode oVar;
        do {
            i = mo243016i();
            if (i instanceof Removed) {
                return ((Removed) i).f173863a;
            }
            if (i == this) {
                return (LockFreeLinkedListNode) i;
            }
            if (i != null) {
                oVar = (LockFreeLinkedListNode) i;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f173836e.compareAndSet(this, i, oVar.mo243015h()));
        oVar.mo243010a((OpDescriptor) null);
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005H\u0014J \u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H$J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ\u001c\u0010\u0018\u001a\u00020\u00192\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0014J\u0018\u0010\u001a\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\f\u001a\u00020\u001bH\u0014J \u0010\u001c\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H$R\u001a\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "()V", "affectedNode", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", "complete", "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "", "affected", "finishOnSuccess", "next", "finishPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "onPrepare", "prepare", "retry", "", "takeAffectedNode", "Lkotlinx/coroutines/internal/OpDescriptor;", "updatedNext", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.internal.o$a */
    public static abstract class AbstractAtomicDesc extends AtomicDesc {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo242814a(LockFreeLinkedListNode oVar) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract Object mo243022a(LockFreeLinkedListNode oVar, LockFreeLinkedListNode oVar2);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo243024a(LockFreeLinkedListNode oVar, Object obj) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract LockFreeLinkedListNode mo243025b();

        /* renamed from: b */
        public abstract void mo243026b(PrepareOp cVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo243027b(LockFreeLinkedListNode oVar, LockFreeLinkedListNode oVar2);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract LockFreeLinkedListNode mo243028c();

        /* renamed from: a */
        public Object mo242813a(PrepareOp cVar) {
            mo243026b(cVar);
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public LockFreeLinkedListNode mo243023a(OpDescriptor vVar) {
            LockFreeLinkedListNode b = mo243025b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            return b;
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        /* renamed from: b */
        public final Object mo242982b(AtomicOp<?> dVar) {
            boolean z;
            while (true) {
                LockFreeLinkedListNode a = mo243023a((OpDescriptor) dVar);
                if (a == null) {
                    return C69563c.f173820b;
                }
                Object obj = a._next;
                if (obj == dVar || dVar.mo242984a()) {
                    return null;
                }
                if (obj instanceof OpDescriptor) {
                    OpDescriptor vVar = (OpDescriptor) obj;
                    if (dVar.mo243049a(vVar)) {
                        return C69563c.f173820b;
                    }
                    vVar.mo242987c(a);
                } else {
                    Object a2 = mo242814a(a);
                    if (a2 != null) {
                        return a2;
                    }
                    if (mo243024a(a, obj)) {
                        continue;
                    } else if (obj != null) {
                        PrepareOp cVar = new PrepareOp(a, (LockFreeLinkedListNode) obj, this);
                        if (LockFreeLinkedListNode.f173836e.compareAndSet(a, obj, cVar)) {
                            try {
                                Object c = cVar.mo242987c(a);
                                if (c != C69571p.f173846a) {
                                    if (ak.m266269a()) {
                                        if (c == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!z) {
                                            throw new AssertionError();
                                        }
                                    }
                                    return null;
                                }
                            } catch (Throwable th) {
                                LockFreeLinkedListNode.f173836e.compareAndSet(a, cVar, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    }
                }
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        /* renamed from: a */
        public final void mo242981a(AtomicOp<?> dVar, Object obj) {
            boolean z;
            Object obj2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            LockFreeLinkedListNode b = mo243025b();
            if (b != null) {
                LockFreeLinkedListNode c = mo243028c();
                if (c != null) {
                    if (z) {
                        obj2 = mo243022a(b, c);
                    } else {
                        obj2 = c;
                    }
                    if (LockFreeLinkedListNode.f173836e.compareAndSet(b, dVar, obj2) && z) {
                        mo243027b(b, c);
                    }
                } else if (ak.m266269a() && !(!z)) {
                    throw new AssertionError();
                }
            } else if (ak.m266269a() && !(!z)) {
                throw new AssertionError();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.internal.o$b */
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {

        /* renamed from: d */
        public LockFreeLinkedListNode f173838d;

        /* renamed from: e */
        public final LockFreeLinkedListNode f173839e;

        public CondAddOp(LockFreeLinkedListNode oVar) {
            this.f173839e = oVar;
        }

        /* renamed from: a */
        public void mo242983a(LockFreeLinkedListNode oVar, Object obj) {
            boolean z;
            LockFreeLinkedListNode oVar2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                oVar2 = this.f173839e;
            } else {
                oVar2 = this.f173838d;
            }
            if (oVar2 != null && LockFreeLinkedListNode.f173836e.compareAndSet(oVar, this, oVar2) && z) {
                LockFreeLinkedListNode oVar3 = this.f173839e;
                LockFreeLinkedListNode oVar4 = this.f173838d;
                if (oVar4 == null) {
                    Intrinsics.throwNpe();
                }
                oVar3.mo243014c(oVar4);
            }
        }
    }

    /* renamed from: d */
    private final LockFreeLinkedListNode m267046d(LockFreeLinkedListNode oVar) {
        while (oVar.cK_()) {
            oVar = (LockFreeLinkedListNode) oVar._prev;
        }
        return oVar;
    }

    /* renamed from: b */
    public final void mo243013b(LockFreeLinkedListNode oVar) {
        do {
        } while (!mo243018k().mo243012a(oVar, this));
    }

    /* renamed from: c */
    public final void mo243014c(LockFreeLinkedListNode oVar) {
        LockFreeLinkedListNode oVar2;
        do {
            oVar2 = (LockFreeLinkedListNode) oVar._prev;
            if (mo243016i() != oVar) {
                return;
            }
        } while (!f173837f.compareAndSet(oVar, oVar2, this));
        if (cK_()) {
            oVar.mo243010a((OpDescriptor) null);
        }
    }

    /* renamed from: a */
    public final boolean mo243011a(LockFreeLinkedListNode oVar) {
        f173837f.lazySet(oVar, this);
        f173836e.lazySet(oVar, this);
        while (mo243016i() == this) {
            if (f173836e.compareAndSet(this, this, oVar)) {
                oVar.mo243014c(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (kotlinx.coroutines.internal.LockFreeLinkedListNode.f173836e.compareAndSet(r4, r3, ((kotlinx.coroutines.internal.Removed) r5).f173863a) != false) goto L_0x0051;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode mo243010a(kotlinx.coroutines.internal.OpDescriptor r8) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.mo243010a(kotlinx.coroutines.internal.v):kotlinx.coroutines.internal.o");
    }

    /* renamed from: a */
    public final boolean mo243012a(LockFreeLinkedListNode oVar, LockFreeLinkedListNode oVar2) {
        f173837f.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f173836e;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, oVar2, oVar)) {
            return false;
        }
        oVar.mo243014c(oVar2);
        return true;
    }

    /* renamed from: a */
    public final int mo243009a(LockFreeLinkedListNode oVar, LockFreeLinkedListNode oVar2, CondAddOp bVar) {
        f173837f.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f173836e;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        bVar.f173838d = oVar2;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, oVar2, bVar)) {
            return 0;
        }
        if (bVar.mo242987c(this) == null) {
            return 1;
        }
        return 2;
    }
}
