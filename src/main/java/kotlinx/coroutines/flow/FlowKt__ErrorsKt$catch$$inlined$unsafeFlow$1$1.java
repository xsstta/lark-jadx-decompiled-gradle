package kotlinx.coroutines.flow;

import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.C69487j;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¨\u0006\b"}, d2 = {"collect", "", "T", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", mo239173f = "Errors.kt", mo239174i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, mo239175l = {SmEvents.EVENT_RE, SmEvents.EVENT_TO}, mo239176m = "collect", mo239177n = {"this", "collector", "continuation", "$receiver", "this", "collector", "continuation", "$receiver", ApiHandler.API_CALLBACK_EXCEPTION}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C69487j.C69488a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(C69487j.C69488a aVar, Continuation cVar) {
        super(cVar);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo242938a(null, this);
    }
}
