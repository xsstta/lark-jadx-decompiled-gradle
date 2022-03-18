package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.ak;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\fR\u001a\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00008V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u00020\u00128F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/internal/AtomicOp;", "T", "<init>", "()V", "affected", "", "failure", "", "complete", "(Ljava/lang/Object;Ljava/lang/Object;)V", "decision", "decide", "(Ljava/lang/Object;)Ljava/lang/Object;", "perform", "prepare", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "atomicOp", "", "isDecided", "()Z", "", "getOpSequence", "()J", "opSequence", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/OpDescriptor;"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.d */
public abstract class AtomicOp<T> extends OpDescriptor {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f173821a = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus");
    private volatile Object _consensus = C69563c.f173819a;

    /* renamed from: a */
    public abstract Object mo242778a(T t);

    /* renamed from: a */
    public abstract void mo242983a(T t, Object obj);

    /* renamed from: b */
    public long mo242985b() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: kotlinx.coroutines.internal.d<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    /* renamed from: c */
    public AtomicOp<?> mo242988c() {
        return this;
    }

    /* renamed from: a */
    public final boolean mo242984a() {
        if (this._consensus != C69563c.f173819a) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    /* renamed from: c */
    public final Object mo242987c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C69563c.f173819a) {
            obj2 = mo242986b(mo242778a(obj));
        }
        mo242983a(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public final Object mo242986b(Object obj) {
        boolean z;
        if (ak.m266269a()) {
            if (obj != C69563c.f173819a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        if (obj2 != C69563c.f173819a) {
            return obj2;
        }
        if (f173821a.compareAndSet(this, C69563c.f173819a, obj)) {
            return obj;
        }
        return this._consensus;
    }
}
