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
import kotlin.jvm.internal.C69117h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.C69470f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
@DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", mo239173f = "Zip.kt", mo239174i = {0}, mo239175l = {253}, mo239176m = "invokeSuspend", mo239177n = {"$this$flow"}, mo239178s = {"L$0"})
public final class FlowKt__ZipKt$combineTransform$6 extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow[] $flows;
    final /* synthetic */ Function3 $transform;
    Object L$0;
    int label;
    private FlowCollector p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$6(Flow[] aVarArr, Function3 oVar, Continuation cVar) {
        super(2, cVar);
        this.$flows = aVarArr;
        this.$transform = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
        FlowKt__ZipKt$combineTransform$6 flowKt__ZipKt$combineTransform$6 = new FlowKt__ZipKt$combineTransform$6(this.$flows, this.$transform, cVar);
        flowKt__ZipKt$combineTransform$6.p$ = (FlowCollector) obj;
        return flowKt__ZipKt$combineTransform$6;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
        return ((FlowKt__ZipKt$combineTransform$6) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", mo239173f = "Zip.kt", mo239174i = {0, 0}, mo239175l = {253}, mo239176m = "invokeSuspend", mo239177n = {"$receiver", "it"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2 */
    public static final class C694002 extends SuspendLambda implements Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private FlowCollector p$;
        private Object[] p$0;
        final /* synthetic */ FlowKt__ZipKt$combineTransform$6 this$0;

        {
            this.this$0 = r1;
        }

        public final Continuation<Unit> create(FlowCollector<? super R> bVar, T[] tArr, Continuation<? super Unit> cVar) {
            C694002 r0 = new C694002(this.this$0, cVar);
            r0.p$ = bVar;
            r0.p$0 = tArr;
            return r0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Continuation<? super Unit> cVar) {
            return ((C694002) create((FlowCollector) obj, (Object[]) obj2, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            this.this$0.$transform.invoke(this.p$, this.p$0, this);
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
                Function3 oVar = this.this$0.$transform;
                this.L$0 = bVar;
                this.L$1 = objArr;
                this.label = 1;
                if (oVar.invoke(bVar, objArr, this) == a) {
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

    public final Object invokeSuspend$$forInline(Object obj) {
        FlowCollector bVar = this.p$;
        Flow[] aVarArr = this.$flows;
        Intrinsics.needClassReification();
        C69117h.m265970a(0);
        C69470f.m266891a(bVar, aVarArr, new Function0<T[]>(this) {
            /* class kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.C693991 */
            final /* synthetic */ FlowKt__ZipKt$combineTransform$6 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T[] invoke() {
                int length = this.this$0.$flows.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return (T[]) new Object[length];
            }
        }, new C694002(this, null), this);
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
            Flow[] aVarArr = this.$flows;
            Intrinsics.needClassReification();
            this.L$0 = bVar;
            this.label = 1;
            if (C69470f.m266891a(bVar, aVarArr, new Function0<T[]>(this) {
                /* class kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.C693991 */
                final /* synthetic */ FlowKt__ZipKt$combineTransform$6 this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final T[] invoke() {
                    int length = this.this$0.$flows.length;
                    Intrinsics.reifiedOperationMarker(0, "T?");
                    return (T[]) new Object[length];
                }
            }, new C694002(this, null), this) == a) {
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
}
