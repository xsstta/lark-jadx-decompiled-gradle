package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.al;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\f\u001a\u00020\rH\u0016R\u0018\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/internal/OpDescriptor;", "", "()V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "isEarlierThan", "", "that", "perform", "affected", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.v */
public abstract class OpDescriptor {
    /* renamed from: c */
    public abstract Object mo242987c(Object obj);

    /* renamed from: c */
    public abstract AtomicOp<?> mo242988c();

    public String toString() {
        return al.m266275b(this) + '@' + al.m266273a(this);
    }

    /* renamed from: a */
    public final boolean mo243049a(OpDescriptor vVar) {
        AtomicOp<?> c;
        AtomicOp<?> c2 = mo242988c();
        if (c2 == null || (c = vVar.mo242988c()) == null || c2.mo242985b() >= c.mo242985b()) {
            return false;
        }
        return true;
    }
}
