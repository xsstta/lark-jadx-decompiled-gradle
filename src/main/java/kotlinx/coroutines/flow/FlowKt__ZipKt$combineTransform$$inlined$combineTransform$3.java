package kotlinx.coroutines.flow;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.C69117h;
import kotlinx.coroutines.flow.internal.C69470f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3", mo239173f = "Zip.kt", mo239174i = {0}, mo239175l = {253}, mo239176m = "invokeSuspend", mo239177n = {"$this$flow"}, mo239178s = {"L$0"})
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3 extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow[] $flows;
    final /* synthetic */ Function6 $transform$inlined;
    Object L$0;
    int label;
    private FlowCollector p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3(Flow[] aVarArr, Continuation cVar, Function6 rVar) {
        super(2, cVar);
        this.$flows = aVarArr;
        this.$transform$inlined = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
        FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3 flowKt__ZipKt$combineTransform$$inlined$combineTransform$3 = new FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3(this.$flows, cVar, this.$transform$inlined);
        flowKt__ZipKt$combineTransform$$inlined$combineTransform$3.p$ = (FlowCollector) obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransform$3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
        return ((FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6$2"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3$2", mo239173f = "Zip.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3$2 */
    public static final class C693962 extends SuspendLambda implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private FlowCollector p$;
        private Object[] p$0;
        final /* synthetic */ FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3 this$0;

        {
            this.this$0 = r1;
        }

        public final Continuation<Unit> create(FlowCollector<? super R> bVar, Object[] objArr, Continuation<? super Unit> cVar) {
            C693962 r0 = new C693962(this.this$0, cVar);
            r0.p$ = bVar;
            r0.p$0 = objArr;
            return r0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object[] objArr, Continuation<? super Unit> cVar) {
            return ((C693962) create((FlowCollector) obj, objArr, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            FlowCollector bVar = this.p$;
            Object[] objArr = this.p$0;
            this.this$0.$transform$inlined.invoke(bVar, objArr[0], objArr[1], objArr[2], objArr[3], this);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                FlowCollector bVar = this.p$;
                Object[] objArr = this.p$0;
                this.this$0.$transform$inlined.invoke(bVar, objArr[0], objArr[1], objArr[2], objArr[3], this);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a = C69086a.m265828a();
        int i = this.label;
        if (i == 0) {
            C69097g.m265891a(obj);
            FlowCollector bVar = this.p$;
            this.L$0 = bVar;
            this.label = 1;
            if (C69470f.m266891a(bVar, this.$flows, new Function0<Object[]>(this) {
                /* class kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3.C693951 */
                final /* synthetic */ FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3 this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new Object[this.this$0.$flows.length];
                }
            }, new C693962(this, null), this) == a) {
                return a;
            }
        } else if (i == 1) {
            FlowCollector bVar2 = (FlowCollector) this.L$0;
            C69097g.m265891a(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        C69117h.m265970a(0);
        C69470f.m266891a(this.p$, this.$flows, new Function0<Object[]>(this) {
            /* class kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3.C693951 */
            final /* synthetic */ FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.this$0.$flows.length];
            }
        }, new C693962(this, null), this);
        C69117h.m265970a(2);
        C69117h.m265970a(1);
        return Unit.INSTANCE;
    }
}
