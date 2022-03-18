package kotlinx.coroutines.channels;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0018\b\u0003\u0010\u0005*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0003\u0012\u0006\b\u0000\u0012\u0002H\u00040\u0006*\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\b\u001a\u0002H\u00052\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\rHH"}, d2 = {"associateTo", "", "E", "K", "V", "M", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "destination", "transform", "Lkotlin/Function1;", "Lkotlin/Pair;", "continuation", "Lkotlin/coroutines/Continuation;"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", mo239173f = "Channels.common.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0}, mo239175l = {2894}, mo239176m = "associateTo", mo239177n = {"$this$associateTo", "destination", "transform", "$this$consumeEach$iv", "$this$consume$iv$iv", "cause$iv$iv", "$this$consume$iv"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
public final class ChannelsKt__Channels_commonKt$associateTo$1 extends ContinuationImpl {
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

    public ChannelsKt__Channels_commonKt$associateTo$1(Continuation cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C69380j.m266632b((ReceiveChannel) null, (Map) null, (Function1) null, this);
    }
}
