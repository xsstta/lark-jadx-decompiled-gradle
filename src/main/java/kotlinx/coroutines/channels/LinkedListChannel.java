package kotlinx.coroutines.channels;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0014¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00058DX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00058DX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00058DX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00058DX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/LinkedListChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "()V", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.n */
public class LinkedListChannel<E> extends AbstractChannel<E> {
    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: a */
    public final boolean mo242790a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: b */
    public final boolean mo242793b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: l */
    public final boolean mo242826l() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: m */
    public final boolean mo242827m() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: a */
    public Object mo242816a(E e) {
        ReceiveOrClosed<?> b;
        do {
            Object a = super.mo242816a((Object) e);
            if (a == C69377b.f173501a) {
                return C69377b.f173501a;
            }
            if (a == C69377b.f173502b) {
                b = mo242823b((Object) e);
                if (b == null) {
                    return C69377b.f173501a;
                }
            } else if (a instanceof Closed) {
                return a;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + a).toString());
            }
        } while (!(b instanceof Closed));
        return b;
    }
}
