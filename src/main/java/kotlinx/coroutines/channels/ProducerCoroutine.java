package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C69363ae;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0014J\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\u0013R\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/ProducerCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ProducerScope;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "channel", "Lkotlinx/coroutines/channels/Channel;", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;)V", "isActive", "", "()Z", "onCancelled", "", "cause", "", "handled", "onCompleted", "value", "(Lkotlin/Unit;)V", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.p */
public class ProducerCoroutine<E> extends ChannelCoroutine<E> implements ProducerScope<E> {
    @Override // kotlinx.coroutines.channels.ProducerScope
    /* renamed from: r */
    public /* synthetic */ SendChannel mo242848r() {
        return mo242679h();
    }

    @Override // kotlinx.coroutines.Job, kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport
    /* renamed from: a */
    public boolean mo242631a() {
        return super.mo242631a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo242627a(Unit unit) {
        SendChannel.C69384a.m266773a(mo242841q(), null, 1, null);
    }

    public ProducerCoroutine(CoroutineContext fVar, Channel<E> fVar2) {
        super(fVar, fVar2, true);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: a */
    public void mo242629a(Throwable th, boolean z) {
        if (!mo242841q().a_(th) && !z) {
            C69363ae.m266257a(getContext(), th);
        }
    }
}
