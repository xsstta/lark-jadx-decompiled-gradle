package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.C69404d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¨\u0006\b"}, d2 = {"collect", "", "T", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", mo239173f = "Builders.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0}, mo239175l = {115}, mo239176m = "collect", mo239177n = {"this", "collector", "continuation", "$receiver", "$this$forEach$iv", "element$iv", "value"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7"})
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6$1 extends ContinuationImpl {
    int I$0;
    int I$1;
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
    final /* synthetic */ C69404d.C69410f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6$1(C69404d.C69410f fVar, Continuation cVar) {
        super(cVar);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo242938a(null, this);
    }
}
