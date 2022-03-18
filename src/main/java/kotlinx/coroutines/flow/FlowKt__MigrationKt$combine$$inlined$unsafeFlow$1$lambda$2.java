package kotlinx.coroutines.flow;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C69117h;
import kotlinx.coroutines.flow.C69532o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$combine$$inlined$unsafeFlow$1$lambda$2", mo239173f = "Zip.kt", mo239174i = {0, 0}, mo239175l = {240}, mo239176m = "invokeSuspend", mo239177n = {"$receiver", "it"}, mo239178s = {"L$0", "L$1"})
public final class FlowKt__MigrationKt$combine$$inlined$unsafeFlow$1$lambda$2 extends SuspendLambda implements Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    private FlowCollector p$;
    private Object[] p$0;
    final /* synthetic */ C69532o.C69536d this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$combine$$inlined$unsafeFlow$1$lambda$2(Continuation cVar, C69532o.C69536d dVar) {
        super(3, cVar);
        this.this$0 = dVar;
    }

    public final Continuation<Unit> create(FlowCollector<? super R> bVar, T[] tArr, Continuation<? super Unit> cVar) {
        FlowKt__MigrationKt$combine$$inlined$unsafeFlow$1$lambda$2 flowKt__MigrationKt$combine$$inlined$unsafeFlow$1$lambda$2 = new FlowKt__MigrationKt$combine$$inlined$unsafeFlow$1$lambda$2(cVar, this.this$0);
        flowKt__MigrationKt$combine$$inlined$unsafeFlow$1$lambda$2.p$ = bVar;
        flowKt__MigrationKt$combine$$inlined$unsafeFlow$1$lambda$2.p$0 = tArr;
        return flowKt__MigrationKt$combine$$inlined$unsafeFlow$1$lambda$2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Continuation<? super Unit> cVar) {
        return ((FlowKt__MigrationKt$combine$$inlined$unsafeFlow$1$lambda$2) create((FlowCollector) obj, (Object[]) obj2, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        FlowCollector bVar = this.p$;
        Object invoke = this.this$0.f173769b.invoke(this.p$0, this);
        C69117h.m265970a(0);
        bVar.emit(invoke, this);
        C69117h.m265970a(2);
        C69117h.m265970a(1);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a = C69086a.m265828a();
        int i = this.label;
        if (i == 0) {
            C69097g.m265891a(obj);
            FlowCollector bVar = this.p$;
            Object[] objArr = this.p$0;
            Object invoke = this.this$0.f173769b.invoke(objArr, this);
            this.L$0 = bVar;
            this.L$1 = objArr;
            this.label = 1;
            if (bVar.emit(invoke, this) == a) {
                return a;
            }
        } else if (i == 1) {
            Object[] objArr2 = (Object[]) this.L$1;
            FlowCollector bVar2 = (FlowCollector) this.L$0;
            C69097g.m265891a(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
