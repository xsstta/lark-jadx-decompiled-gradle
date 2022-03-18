package bytekn.foundation.concurrent.lock;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ\u000b\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lbytekn/foundation/concurrent/lock/AtomicReference;", "V", "", "initialValue", "(Ljava/lang/Object;)V", "atomicReference", "Ljava/util/concurrent/atomic/AtomicReference;", "compareAndSet", "", "expected", "new", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "get", "()Ljava/lang/Object;", "set", "", "value_", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.c.e */
public final class AtomicReference<V> {

    /* renamed from: a */
    private final java.util.concurrent.atomic.AtomicReference<V> f5729a;

    /* renamed from: a */
    public final V mo8633a() {
        return this.f5729a.get();
    }

    public AtomicReference(V v) {
        this.f5729a = new java.util.concurrent.atomic.AtomicReference<>(v);
    }
}
