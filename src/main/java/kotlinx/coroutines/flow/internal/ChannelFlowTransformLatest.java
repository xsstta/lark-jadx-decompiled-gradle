package kotlinx.coroutines.flow.internal;

import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003Bn\u0012B\u0010\u0004\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0002\b\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aRO\u0010\u0004\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0002\b\rX\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest;", "T", "R", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "transform", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "flow", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "(Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;I)V", "Lkotlin/jvm/functions/Function3;", "create", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flowCollect", "collector", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.e */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {

    /* renamed from: d */
    public final Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> f173662d;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", mo239173f = "Merge.kt", mo239174i = {0, 0, 0}, mo239175l = {SmEvents.EVENT_UE}, mo239176m = "invokeSuspend", mo239177n = {"$this$flowScope", "previousFlow", "$this$collect$iv"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.flow.internal.e$a */
    public static final class C69467a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FlowCollector $collector;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ ChannelFlowTransformLatest this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69467a(ChannelFlowTransformLatest eVar, FlowCollector bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = eVar;
            this.$collector = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            C69467a aVar = new C69467a(this.this$0, this.$collector, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C69467a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.internal.e$a$a */
        public static final class C69468a implements FlowCollector<T> {

            /* renamed from: a */
            final /* synthetic */ C69467a f173663a;

            /* renamed from: b */
            final /* synthetic */ CoroutineScope f173664b;

            /* renamed from: c */
            final /* synthetic */ Ref.ObjectRef f173665c;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/ChannelFlowTransformLatest$flowCollect$3$1$2"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: kotlinx.coroutines.flow.internal.e$a$a$a */
            static final class C69469a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Object $value;
                Object L$0;
                int label;
                private CoroutineScope p$;
                final /* synthetic */ C69468a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C69469a(Object obj, Continuation cVar, C69468a aVar) {
                    super(2, cVar);
                    this.$value = obj;
                    this.this$0 = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                    C69469a aVar = new C69469a(this.$value, cVar, this.this$0);
                    aVar.p$ = (CoroutineScope) obj;
                    return aVar;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                    return ((C69469a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: kotlin.jvm.functions.o<kotlinx.coroutines.flow.b<? super R>, T, kotlin.coroutines.c<? super kotlin.Unit>, java.lang.Object> */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object a = C69086a.m265828a();
                    int i = this.label;
                    if (i == 0) {
                        C69097g.m265891a(obj);
                        CoroutineScope ahVar = this.p$;
                        FlowCollector bVar = this.this$0.f173663a.$collector;
                        Object obj2 = this.$value;
                        this.L$0 = ahVar;
                        this.label = 1;
                        if (this.this$0.f173663a.this$0.f173662d.invoke(bVar, obj2, this) == a) {
                            return a;
                        }
                    } else if (i == 1) {
                        CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                        C69097g.m265891a(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                /*
                // Method dump skipped, instructions count: 142
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.C69467a.C69468a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }

            public C69468a(C69467a aVar, CoroutineScope ahVar, Ref.ObjectRef objectRef) {
                this.f173663a = aVar;
                this.f173664b = ahVar;
                this.f173665c = objectRef;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) null;
                Flow aVar = this.this$0.f173661c;
                this.L$0 = ahVar;
                this.L$1 = objectRef;
                this.L$2 = aVar;
                this.label = 1;
                if (aVar.mo242938a(new C69468a(this, ahVar, objectRef), this) == a) {
                    return a;
                }
            } else if (i == 1) {
                Flow aVar2 = (Flow) this.L$2;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    /* renamed from: b */
    public Object mo242950b(FlowCollector<? super R> bVar, Continuation<? super Unit> cVar) {
        if (!ak.m266269a() || C69089a.m265837a(bVar instanceof SendingCollector).booleanValue()) {
            Object a = C69478i.m266895a(new C69467a(this, bVar, null), cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
        throw new AssertionError();
    }
}
