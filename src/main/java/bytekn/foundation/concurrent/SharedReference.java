package bytekn.foundation.concurrent;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b\"\u0004\b\u0001\u0010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\t0\u000bJ\u000b\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0005\u001a\u00028\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lbytekn/foundation/concurrent/SharedReference;", "V", "", "initialValue", "(Ljava/lang/Object;)V", "actualValue", "Ljava/lang/Object;", "access", "", "R", "block", "Lkotlin/Function1;", "get", "()Ljava/lang/Object;", "set", "value_", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.b */
public final class SharedReference<V> {

    /* renamed from: a */
    private V f5723a;

    /* renamed from: a */
    public final V mo8625a() {
        return this.f5723a;
    }

    public SharedReference(V v) {
        this.f5723a = v;
    }

    /* renamed from: a */
    public final void mo8626a(V v) {
        this.f5723a = v;
    }
}
