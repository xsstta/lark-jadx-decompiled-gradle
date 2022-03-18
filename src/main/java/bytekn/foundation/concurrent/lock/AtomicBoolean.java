package bytekn.foundation.concurrent.lock;

import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038F@FX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004¨\u0006\u0011"}, d2 = {"Lbytekn/foundation/concurrent/lock/AtomicBoolean;", "", "value_", "", "(Z)V", "atom", "Lbytekn/foundation/concurrent/lock/AtomicInt;", "value", "getValue", "()Z", "setValue", "boolToInt", "", C63954b.f161494a, "compareAndSet", "expected", "new", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.c.a */
public final class AtomicBoolean {

    /* renamed from: a */
    private final AtomicInt f5726a;

    /* renamed from: b */
    private final int m7470b(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean mo8629a() {
        if (C1687c.m7475a(this.f5726a) != 0) {
            return true;
        }
        return false;
    }

    public AtomicBoolean(boolean z) {
        this.f5726a = new AtomicInt(m7470b(z));
    }

    /* renamed from: a */
    public final void mo8628a(boolean z) {
        C1687c.m7476a(this.f5726a, m7470b(z));
    }
}
