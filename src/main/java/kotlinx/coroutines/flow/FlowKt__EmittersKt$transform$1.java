package kotlinx.coroutines.flow;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C69117h;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", mo239173f = "Emitters.kt", mo239174i = {0, 0}, mo239175l = {213}, mo239176m = "invokeSuspend", mo239177n = {"$this$flow", "$this$collect$iv"}, mo239178s = {"L$0", "L$1"})
public final class FlowKt__EmittersKt$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    final /* synthetic */ Function3 $transform;
    Object L$0;
    Object L$1;
    int label;
    private FlowCollector p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$transform$1(Flow aVar, Function3 oVar, Continuation cVar) {
        super(2, cVar);
        this.$this_transform = aVar;
        this.$transform = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.$this_transform, this.$transform, cVar);
        flowKt__EmittersKt$transform$1.p$ = (FlowCollector) obj;
        return flowKt__EmittersKt$transform$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
        return ((FlowKt__EmittersKt$transform$1) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        FlowCollector bVar = this.p$;
        C69117h.m265970a(0);
        this.$this_transform.mo242938a(new C69390a(this, bVar), this);
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
            Flow aVar = this.$this_transform;
            this.L$0 = bVar;
            this.L$1 = aVar;
            this.label = 1;
            if (aVar.mo242938a(new C69390a(this, bVar), this) == a) {
                return a;
            }
        } else if (i == 1) {
            Flow aVar2 = (Flow) this.L$1;
            FlowCollector bVar2 = (FlowCollector) this.L$0;
            C69097g.m265891a(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$a */
    public static final class C69390a implements FlowCollector<T> {

        /* renamed from: a */
        final /* synthetic */ FlowKt__EmittersKt$transform$1 f173554a;

        /* renamed from: b */
        final /* synthetic */ FlowCollector f173555b;

        public C69390a(FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1, FlowCollector bVar) {
            this.f173554a = flowKt__EmittersKt$transform$1;
            this.f173555b = bVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(Object obj, Continuation cVar) {
            return this.f173554a.$transform.invoke(this.f173555b, obj, cVar);
        }
    }
}
