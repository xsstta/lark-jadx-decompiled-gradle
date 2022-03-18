package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/SendingCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/SendChannel;)V", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.r */
public final class SendingCollector<T> implements FlowCollector<T> {

    /* renamed from: a */
    private final SendChannel<T> f173677a;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.w<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public SendingCollector(SendChannel<? super T> wVar) {
        this.f173677a = wVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> cVar) {
        Object a = this.f173677a.mo242817a(t, cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }
}
