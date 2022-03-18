package kotlinx.coroutines.channels;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058DX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00058DX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00058DX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00058DX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/channels/RendezvousChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "()V", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.u */
public class RendezvousChannel<E> extends AbstractChannel<E> {
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
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: m */
    public final boolean mo242827m() {
        return true;
    }
}
