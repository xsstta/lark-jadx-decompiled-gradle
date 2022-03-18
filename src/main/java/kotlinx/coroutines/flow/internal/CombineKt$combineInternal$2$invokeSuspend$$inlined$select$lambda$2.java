package kotlinx.coroutines.flow.internal;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.C69470f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/CombineKt$onReceive$1", "kotlinx/coroutines/flow/internal/CombineKt$combineInternal$2$$special$$inlined$onReceive$1"}, mo238835k = 3, mv = {1, 1, 16})
public final class CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel[] $channels$inlined;
    final /* synthetic */ int $i$inlined;
    final /* synthetic */ Boolean[] $isClosed$inlined;
    final /* synthetic */ Object[] $latestValues$inlined;
    final /* synthetic */ Ref.IntRef $nonClosed$inlined;
    final /* synthetic */ Function2 $onReceive;
    final /* synthetic */ Ref.IntRef $remainingNulls$inlined;
    final /* synthetic */ int $size$inlined;
    Object L$0;
    int label;
    private Object p$0;
    final /* synthetic */ C69470f.C69473b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2(Function2 kVar, Continuation cVar, int i, C69470f.C69473b bVar, int i2, Boolean[] boolArr, ReceiveChannel[] sVarArr, Object[] objArr, Ref.IntRef intRef, Ref.IntRef intRef2) {
        super(2, cVar);
        this.$onReceive = kVar;
        this.$i$inlined = i;
        this.this$0 = bVar;
        this.$size$inlined = i2;
        this.$isClosed$inlined = boolArr;
        this.$channels$inlined = sVarArr;
        this.$latestValues$inlined = objArr;
        this.$remainingNulls$inlined = intRef;
        this.$nonClosed$inlined = intRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
        CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2 combineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2 = new CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2(this.$onReceive, cVar, this.$i$inlined, this.this$0, this.$size$inlined, this.$isClosed$inlined, this.$channels$inlined, this.$latestValues$inlined, this.$remainingNulls$inlined, this.$nonClosed$inlined);
        combineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2.p$0 = obj;
        return combineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
        return ((CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a = C69086a.m265828a();
        int i = this.label;
        if (i == 0) {
            C69097g.m265891a(obj);
            Object obj2 = this.p$0;
            if (obj2 == null) {
                this.$isClosed$inlined[this.$i$inlined] = C69089a.m265837a(true);
                Ref.IntRef intRef = this.$nonClosed$inlined;
                intRef.element--;
                int i2 = intRef.element;
            } else {
                Function2 kVar = this.$onReceive;
                this.L$0 = obj2;
                this.label = 1;
                if (kVar.invoke(obj2, this) == a) {
                    return a;
                }
            }
        } else if (i == 1) {
            C69097g.m265891a(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
