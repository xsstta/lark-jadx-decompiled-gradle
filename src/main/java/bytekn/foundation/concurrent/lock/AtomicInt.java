package bytekn.foundation.concurrent.lock;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003J\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lbytekn/foundation/concurrent/lock/AtomicInt;", "", "initialValue", "", "(I)V", "atomicInt", "Ljava/util/concurrent/atomic/AtomicInteger;", "addAndGet", "delta", "compareAndSet", "", "expected", "new", "decrementAndGet", "get", "incrementAndGet", "set", "", "newValue", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.c.b */
public final class AtomicInt {

    /* renamed from: a */
    private final AtomicInteger f5727a;

    /* renamed from: a */
    public final int mo8630a() {
        return this.f5727a.get();
    }

    public AtomicInt(int i) {
        this.f5727a = new AtomicInteger(i);
    }

    /* renamed from: a */
    public final void mo8631a(int i) {
        this.f5727a.set(i);
    }
}
