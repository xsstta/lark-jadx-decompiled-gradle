package kotlinx.coroutines.flow;

import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", mo239173f = "Migration.kt", mo239174i = {0, 0, 1, 1, 1, 1}, mo239175l = {190, SmEvents.EVENT_MEETING_LICENSE_TIME_OUT}, mo239176m = "invokeSuspend", mo239177n = {"$this$transformLatest", "it", "$this$transformLatest", "it", "$this$emitAll$iv", "flow$iv"}, mo239178s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 $transform;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    private FlowCollector p$;
    private Object p$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(Function2 kVar, Continuation cVar) {
        super(3, cVar);
        this.$transform = kVar;
    }

    public final Continuation<Unit> create(FlowCollector<? super R> bVar, T t, Continuation<? super Unit> cVar) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.$transform, cVar);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.p$ = bVar;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.p$0 = t;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Continuation<? super Unit> cVar) {
        return ((FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1) create((FlowCollector) obj, obj2, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector bVar;
        Object obj2;
        FlowCollector bVar2;
        Object a = C69086a.m265828a();
        int i = this.label;
        if (i == 0) {
            C69097g.m265891a(obj);
            bVar2 = this.p$;
            Object obj3 = this.p$0;
            Function2 kVar = this.$transform;
            this.L$0 = bVar2;
            this.L$1 = obj3;
            this.L$2 = bVar2;
            this.label = 1;
            Object invoke = kVar.invoke(obj3, this);
            if (invoke == a) {
                return a;
            }
            bVar = bVar2;
            obj2 = obj3;
            obj = invoke;
        } else if (i == 1) {
            bVar2 = (FlowCollector) this.L$2;
            obj2 = this.L$1;
            bVar = (FlowCollector) this.L$0;
            C69097g.m265891a(obj);
        } else if (i == 2) {
            Flow aVar = (Flow) this.L$3;
            FlowCollector bVar3 = (FlowCollector) this.L$2;
            FlowCollector bVar4 = (FlowCollector) this.L$0;
            C69097g.m265891a(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Flow aVar2 = (Flow) obj;
        this.L$0 = bVar;
        this.L$1 = obj2;
        this.L$2 = bVar2;
        this.L$3 = aVar2;
        this.label = 2;
        if (aVar2.mo242938a(bVar2, this) == a) {
            return a;
        }
        return Unit.INSTANCE;
    }
}
