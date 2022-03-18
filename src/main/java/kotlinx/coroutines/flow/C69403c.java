package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.ReceiveChannel;

@Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, mo238835k = 4, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.c */
public final class C69403c {
    /* renamed from: a */
    public static final <T, R> Object m266837a(Flow<? extends T> aVar, R r, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> oVar, Continuation<? super R> cVar) {
        return C69547p.m266941a(aVar, r, oVar, cVar);
    }

    /* renamed from: a */
    public static final <T> Object m266838a(Flow<? extends T> aVar, FlowCollector<? super T> bVar, Continuation<? super Throwable> cVar) {
        return C69487j.m266902a(aVar, bVar, cVar);
    }

    /* renamed from: a */
    public static final <T> Object m266839a(FlowCollector<? super T> bVar, ReceiveChannel<? extends T> sVar, Continuation<? super Unit> cVar) {
        return C69415e.m266850a(bVar, sVar, cVar);
    }
}
