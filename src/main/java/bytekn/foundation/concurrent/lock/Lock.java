package bytekn.foundation.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lbytekn/foundation/concurrent/lock/Lock;", "", "()V", "delegate", "Ljava/util/concurrent/locks/ReentrantLock;", "acquire", "", "destroy", "newCondition", "Lbytekn/foundation/concurrent/lock/Condition;", "release", "ConditionImpl", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.c.g */
public final class Lock {

    /* renamed from: a */
    private final ReentrantLock f5730a = new ReentrantLock();

    /* renamed from: a */
    public final void mo8634a() {
        this.f5730a.lock();
    }

    /* renamed from: b */
    public final void mo8635b() {
        this.f5730a.unlock();
    }
}
