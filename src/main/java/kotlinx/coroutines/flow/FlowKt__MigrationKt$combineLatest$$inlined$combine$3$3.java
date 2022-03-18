package kotlinx.coroutines.flow;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.C69117h;
import kotlinx.coroutines.flow.C69528n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2", "kotlinx/coroutines/flow/FlowKt__MigrationKt$combine$$inlined$unsafeFlow$3$lambda$2", "kotlinx/coroutines/flow/FlowKt__MigrationKt$combine$$inlined$combine$3$3"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$combineLatest$$inlined$combine$3$3", mo239173f = "Migration.kt", mo239174i = {0, 0, 0, 0, 1, 1}, mo239175l = {309, 310}, mo239176m = "invokeSuspend", mo239177n = {"$receiver", "it", "continuation", "args", "$receiver", "it"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
public final class FlowKt__MigrationKt$combineLatest$$inlined$combine$3$3 extends SuspendLambda implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    private FlowCollector p$;
    private Object[] p$0;
    final /* synthetic */ C69528n.C69531c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$combineLatest$$inlined$combine$3$3(Continuation cVar, C69528n.C69531c cVar2) {
        super(3, cVar);
        this.this$0 = cVar2;
    }

    public final Continuation<Unit> create(FlowCollector<? super R> bVar, Object[] objArr, Continuation<? super Unit> cVar) {
        FlowKt__MigrationKt$combineLatest$$inlined$combine$3$3 flowKt__MigrationKt$combineLatest$$inlined$combine$3$3 = new FlowKt__MigrationKt$combineLatest$$inlined$combine$3$3(cVar, this.this$0);
        flowKt__MigrationKt$combineLatest$$inlined$combine$3$3.p$ = bVar;
        flowKt__MigrationKt$combineLatest$$inlined$combine$3$3.p$0 = objArr;
        return flowKt__MigrationKt$combineLatest$$inlined$combine$3$3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object[] objArr, Continuation<? super Unit> cVar) {
        return ((FlowKt__MigrationKt$combineLatest$$inlined$combine$3$3) create((FlowCollector) obj, objArr, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        FlowCollector bVar = this.p$;
        Object[] objArr = this.p$0;
        Function6 rVar = this.this$0.f173761b;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        Object obj4 = objArr[2];
        Object obj5 = objArr[3];
        Object obj6 = objArr[4];
        C69117h.m265970a(0);
        Object invoke = rVar.invoke(obj2, obj3, obj4, obj5, obj6, this);
        C69117h.m265970a(1);
        C69117h.m265970a(0);
        bVar.emit(invoke, this);
        C69117h.m265970a(2);
        C69117h.m265970a(1);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector bVar;
        Object[] objArr;
        FlowCollector bVar2;
        Object a = C69086a.m265828a();
        int i = this.label;
        if (i == 0) {
            C69097g.m265891a(obj);
            bVar2 = this.p$;
            Object[] objArr2 = this.p$0;
            Function6 rVar = this.this$0.f173761b;
            Object obj2 = objArr2[0];
            Object obj3 = objArr2[1];
            Object obj4 = objArr2[2];
            Object obj5 = objArr2[3];
            Object obj6 = objArr2[4];
            this.L$0 = bVar2;
            this.L$1 = objArr2;
            this.L$2 = this;
            this.L$3 = objArr2;
            this.L$4 = bVar2;
            this.label = 1;
            Object invoke = rVar.invoke(obj2, obj3, obj4, obj5, obj6, this);
            if (invoke == a) {
                return a;
            }
            bVar = bVar2;
            objArr = objArr2;
            obj = invoke;
        } else if (i == 1) {
            bVar2 = (FlowCollector) this.L$4;
            Object[] objArr3 = (Object[]) this.L$3;
            Continuation cVar = (Continuation) this.L$2;
            objArr = (Object[]) this.L$1;
            bVar = (FlowCollector) this.L$0;
            C69097g.m265891a(obj);
        } else if (i == 2) {
            Object[] objArr4 = (Object[]) this.L$1;
            FlowCollector bVar3 = (FlowCollector) this.L$0;
            C69097g.m265891a(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.L$0 = bVar;
        this.L$1 = objArr;
        this.label = 2;
        if (bVar2.emit(obj, this) == a) {
            return a;
        }
        return Unit.INSTANCE;
    }
}
