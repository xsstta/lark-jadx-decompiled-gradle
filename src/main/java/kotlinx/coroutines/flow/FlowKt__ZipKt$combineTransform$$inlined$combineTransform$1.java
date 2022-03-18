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
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.internal.C69470f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1", mo239173f = "Zip.kt", mo239174i = {0}, mo239175l = {253}, mo239176m = "invokeSuspend", mo239177n = {"$this$flow"}, mo239178s = {"L$0"})
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1 extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow[] $flows;
    final /* synthetic */ Function4 $transform$inlined;
    Object L$0;
    int label;
    private FlowCollector p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1(Flow[] aVarArr, Continuation cVar, Function4 pVar) {
        super(2, cVar);
        this.$flows = aVarArr;
        this.$transform$inlined = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
        FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1 flowKt__ZipKt$combineTransform$$inlined$combineTransform$1 = new FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1(this.$flows, cVar, this.$transform$inlined);
        flowKt__ZipKt$combineTransform$$inlined$combineTransform$1.p$ = (FlowCollector) obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransform$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
        return ((FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
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
                /* class kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1.C693911 */
                final /* synthetic */ FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1 this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new Object[this.this$0.$flows.length];
                }
            }, new C693922(this, null), this) == a) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6$2"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1$2", mo239173f = "Zip.kt", mo239174i = {0, 0, 0, 0, 0}, mo239175l = {306}, mo239176m = "invokeSuspend", mo239177n = {"$receiver", "it", "continuation", "args", "$receiver"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1$2 */
    public static final class C693922 extends SuspendLambda implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        private FlowCollector p$;
        private Object[] p$0;
        final /* synthetic */ FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1 this$0;

        {
            this.this$0 = r1;
        }

        public final Continuation<Unit> create(FlowCollector<? super R> bVar, Object[] objArr, Continuation<? super Unit> cVar) {
            C693922 r0 = new C693922(this.this$0, cVar);
            r0.p$ = bVar;
            r0.p$0 = objArr;
            return r0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object[] objArr, Continuation<? super Unit> cVar) {
            return ((C693922) create((FlowCollector) obj, objArr, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                FlowCollector bVar = this.p$;
                Object[] objArr = this.p$0;
                Function4 pVar = this.this$0.$transform$inlined;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.L$0 = bVar;
                this.L$1 = objArr;
                this.L$2 = this;
                this.L$3 = objArr;
                this.L$4 = bVar;
                this.label = 1;
                if (pVar.invoke(bVar, obj2, obj3, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                FlowCollector bVar2 = (FlowCollector) this.L$4;
                Object[] objArr2 = (Object[]) this.L$3;
                Continuation cVar = (Continuation) this.L$2;
                Object[] objArr3 = (Object[]) this.L$1;
                FlowCollector bVar3 = (FlowCollector) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }
}
