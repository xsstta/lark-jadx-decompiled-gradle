package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u001c\b\u0003\u0010\u0005*\u0016\u0012\u0006\b\u0000\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00070\u0006*\b\u0012\u0004\u0012\u0002H\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000eHH"}, d2 = {"groupByTo", "", "E", "K", "V", "M", "", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "destination", "keySelector", "Lkotlin/Function1;", "valueTransform", "continuation", "Lkotlin/coroutines/Continuation;"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", mo239173f = "Channels.common.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0}, mo239175l = {3070}, mo239176m = "groupByTo", mo239177n = {"$this$groupByTo", "destination", "keySelector", "valueTransform", "$this$consumeEach$iv", "$this$consume$iv$iv", "cause$iv$iv", "$this$consume$iv"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
public final class ChannelsKt__Channels_commonKt$groupByTo$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$groupByTo$3(Continuation cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C69380j.m266633b(null, null, null, null, this);
    }
}
