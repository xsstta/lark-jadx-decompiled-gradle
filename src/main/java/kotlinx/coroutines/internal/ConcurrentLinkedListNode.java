package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\t\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u001aB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\u0004\u0018\u00018\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0007J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0002\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010 \u001a\u00020\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0016\u0010\"\u001a\u00028\u00008B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0016¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "prev", "<init>", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "", "cleanPrev", "()V", "", "markAsClosed", "()Z", "Lkotlin/Function0;", "", "onClosedAction", "nextOrIfClosed", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "remove", "value", "trySetNext", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "isTail", "getLeftmostAliveNode", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "leftmostAliveNode", "getNext", "next", "", "getNextOrClosed", "()Ljava/lang/Object;", "nextOrClosed", "getPrev", "getRemoved", "removed", "getRightmostAliveNode", "rightmostAliveNode", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.g  reason: case insensitive filesystem */
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f173824a = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next");

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f173825b = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    /* renamed from: f */
    public abstract boolean mo242995f();

    /* renamed from: a */
    public final Object mo242989a() {
        return this._next;
    }

    /* renamed from: d */
    public final N mo242993d() {
        return (N) ((ConcurrentLinkedListNode) this._prev);
    }

    /* renamed from: e */
    public final void mo242994e() {
        f173825b.lazySet(this, null);
    }

    /* renamed from: b */
    public final N mo242991b() {
        Object a = mo242989a();
        if (a == ConcurrentLinkedListNode.f173823a) {
            return null;
        }
        return (N) ((ConcurrentLinkedListNode) a);
    }

    /* renamed from: c */
    public final boolean mo242992c() {
        if (mo242991b() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private final N mo243052h() {
        N d = mo242993d();
        while (d != null && d.mo242995f()) {
            d = (N) ((ConcurrentLinkedListNode) d._prev);
        }
        return d;
    }

    /* renamed from: i */
    private final N mo243053i() {
        if (!ak.m266269a() || (!mo242992c())) {
            N b = mo242991b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            while (b.mo242995f()) {
                b = (N) b.mo242991b();
                if (b == null) {
                    Intrinsics.throwNpe();
                }
            }
            return b;
        }
        throw new AssertionError();
    }

    /* renamed from: g */
    public final void mo242996g() {
        if (ak.m266269a() && !mo242995f()) {
            throw new AssertionError();
        } else if (!ak.m266269a() || (!mo242992c())) {
            while (true) {
                N h = mo243052h();
                N i = mo243053i();
                i._prev = h;
                if (h != null) {
                    h._next = i;
                }
                if (!i.mo242995f() && (h == null || !h.mo242995f())) {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    public ConcurrentLinkedListNode(N n) {
        this._prev = n;
    }

    /* renamed from: a */
    public final boolean mo242990a(N n) {
        return f173824a.compareAndSet(this, null, n);
    }
}
