package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHH"}, d2 = {"indexOfFirst", "", "E", "Lkotlinx/coroutines/channels/ReceiveChannel;", "predicate", "Lkotlin/Function1;", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", mo239173f = "Channels.common.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0}, mo239175l = {2436}, mo239176m = "indexOfFirst", mo239177n = {"$this$indexOfFirst", "predicate", "index", "$this$consumeEach$iv", "$this$consume$iv$iv", "cause$iv$iv", "$this$consume$iv"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
public final class ChannelsKt__Channels_commonKt$indexOfFirst$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$indexOfFirst$1(Continuation cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C69380j.m266655m(null, null, this);
    }
}
