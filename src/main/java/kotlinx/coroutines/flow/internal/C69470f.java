package kotlinx.coroutines.flow.internal;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.C69382o;
import kotlinx.coroutines.channels.ChannelCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.Symbol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001an\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00032(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f*\u00020\u00102\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001a\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000f*\u00020\u00102\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001a\u0001\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00040\u00152\u0014\u0010\u0016\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00030\u00172\u0014\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00140\u00170\u001929\u0010\t\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\u001aH@ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a¢\u0001\u0010\u001c\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00032W\u0010\t\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0015\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001f¢\u0006\u0002\b\u001aH@ø\u0001\u0000¢\u0006\u0002\u0010$\u001av\u0010%\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00130&2\u0006\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u000e\b\u0004\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u001923\b\b\u0010%\u001a-\b\u0001\u0012\u0013\u0012\u00110\f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0+H\bø\u0001\u0000¢\u0006\u0002\u0010-\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"getNull", "Lkotlinx/coroutines/internal/Symbol;", "zipImpl", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "flow", "flow2", "transform", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "asChannel", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "asFairChannel", "combineInternal", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "flows", "", "arrayFactory", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;[Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "combineTransformInternal", "first", "second", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", AbstractC60044a.f149675a, C63954b.f161494a, "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceive", "Lkotlinx/coroutines/selects/SelectBuilder;", "isClosed", "", "channel", "onClosed", "Lkotlin/Function2;", "value", "(Lkotlinx/coroutines/selects/SelectBuilder;ZLkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.f */
public final class C69470f {
    /* renamed from: a */
    public static final Symbol m266893a() {
        return C69480o.f173673a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.internal.CombineKt$asFairChannel$1", mo239173f = "Combine.kt", mo239174i = {0, 0, 0}, mo239175l = {143}, mo239176m = "invokeSuspend", mo239177n = {"$this$produce", "channel", "$this$collect$iv"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.flow.internal.f$a */
    public static final class C69471a extends SuspendLambda implements Function2<ProducerScope<? super Object>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow $flow;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private ProducerScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69471a(Flow aVar, Continuation cVar) {
            super(2, cVar);
            this.$flow = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            C69471a aVar = new C69471a(this.$flow, cVar);
            aVar.p$ = (ProducerScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super Object> qVar, Continuation<? super Unit> cVar) {
            return ((C69471a) create(qVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.internal.f$a$a */
        public static final class C69472a implements FlowCollector<Object> {

            /* renamed from: a */
            final /* synthetic */ ChannelCoroutine f173666a;

            public C69472a(ChannelCoroutine gVar) {
                this.f173666a = gVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object obj, Continuation cVar) {
                ChannelCoroutine gVar = this.f173666a;
                if (obj == null) {
                    obj = C69480o.f173673a;
                }
                Object b = gVar.mo242840b(obj, cVar);
                if (b == C69086a.m265828a()) {
                    return b;
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                ProducerScope qVar = this.p$;
                SendChannel r = qVar.mo242848r();
                if (r != null) {
                    ChannelCoroutine gVar = (ChannelCoroutine) r;
                    Flow aVar = this.$flow;
                    this.L$0 = qVar;
                    this.L$1 = gVar;
                    this.L$2 = aVar;
                    this.label = 1;
                    if (aVar.mo242938a(new C69472a(gVar), this) == a) {
                        return a;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelCoroutine<kotlin.Any>");
                }
            } else if (i == 1) {
                Flow aVar2 = (Flow) this.L$2;
                ChannelCoroutine gVar2 = (ChannelCoroutine) this.L$1;
                ProducerScope qVar2 = (ProducerScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", mo239173f = "Combine.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0}, mo239175l = {146}, mo239176m = "invokeSuspend", mo239177n = {"$this$coroutineScope", "size", "channels", "latestValues", "isClosed", "nonClosed", "remainingNulls"}, mo239178s = {"L$0", "I$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    /* renamed from: kotlinx.coroutines.flow.internal.f$b */
    public static final class C69473b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0 $arrayFactory;
        final /* synthetic */ Flow[] $flows;
        final /* synthetic */ FlowCollector $this_combineInternal;
        final /* synthetic */ Function3 $transform;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69473b(FlowCollector bVar, Flow[] aVarArr, Function0 function0, Function3 oVar, Continuation cVar) {
            super(2, cVar);
            this.$this_combineInternal = bVar;
            this.$flows = aVarArr;
            this.$arrayFactory = function0;
            this.$transform = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            C69473b bVar = new C69473b(this.$this_combineInternal, this.$flows, this.$arrayFactory, this.$transform, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C69473b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "R", "T", "value", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/CombineKt$combineInternal$2$1$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.internal.f$b$a */
        public static final class C69474a extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
            final /* synthetic */ ReceiveChannel[] $channels$inlined;
            final /* synthetic */ int $i;
            final /* synthetic */ Boolean[] $isClosed$inlined;
            final /* synthetic */ Object[] $latestValues$inlined;
            final /* synthetic */ Ref.IntRef $nonClosed$inlined;
            final /* synthetic */ Ref.IntRef $remainingNulls$inlined;
            final /* synthetic */ int $size$inlined;
            Object L$0;
            Object L$1;
            int label;
            private Object p$0;
            final /* synthetic */ C69473b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69474a(int i, Continuation cVar, C69473b bVar, int i2, Boolean[] boolArr, ReceiveChannel[] sVarArr, Object[] objArr, Ref.IntRef intRef, Ref.IntRef intRef2) {
                super(2, cVar);
                this.$i = i;
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
                C69474a aVar = new C69474a(this.$i, cVar, this.this$0, this.$size$inlined, this.$isClosed$inlined, this.$channels$inlined, this.$latestValues$inlined, this.$remainingNulls$inlined, this.$nonClosed$inlined);
                aVar.p$0 = obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
                return ((C69474a) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    Object obj2 = this.p$0;
                    if (this.$latestValues$inlined[this.$i] == null) {
                        Ref.IntRef intRef = this.$remainingNulls$inlined;
                        intRef.element--;
                        int i2 = intRef.element;
                    }
                    this.$latestValues$inlined[this.$i] = obj2;
                    if (this.$remainingNulls$inlined.element != 0) {
                        return Unit.INSTANCE;
                    }
                    Object[] objArr = (Object[]) this.this$0.$arrayFactory.invoke();
                    int i3 = this.$size$inlined;
                    for (int i4 = 0; i4 < i3; i4++) {
                        Symbol abVar = C69480o.f173673a;
                        Object obj3 = this.$latestValues$inlined[i4];
                        if (obj3 == abVar) {
                            obj3 = null;
                        }
                        objArr[i4] = obj3;
                    }
                    Function3 oVar = this.this$0.$transform;
                    FlowCollector bVar = this.this$0.$this_combineInternal;
                    if (objArr != null) {
                        this.L$0 = obj2;
                        this.L$1 = objArr;
                        this.label = 1;
                        if (oVar.invoke(bVar, objArr, this) == a) {
                            return a;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else if (i == 1) {
                    Object[] objArr2 = (Object[]) this.L$1;
                    C69097g.m265891a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0167  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x016d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
            // Method dump skipped, instructions count: 388
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C69470f.C69473b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2", mo239173f = "Combine.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0}, mo239175l = {146}, mo239176m = "invokeSuspend", mo239177n = {"$this$coroutineScope", "firstChannel", "secondChannel", "firstValue", "secondValue", "firstIsClosed", "secondIsClosed"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
    /* renamed from: kotlinx.coroutines.flow.internal.f$c */
    public static final class C69475c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow $first;
        final /* synthetic */ Flow $second;
        final /* synthetic */ FlowCollector $this_combineTransformInternal;
        final /* synthetic */ Function4 $transform;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69475c(FlowCollector bVar, Flow aVar, Flow aVar2, Function4 pVar, Continuation cVar) {
            super(2, cVar);
            this.$this_combineTransformInternal = bVar;
            this.$first = aVar;
            this.$second = aVar2;
            this.$transform = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            C69475c cVar2 = new C69475c(this.$this_combineTransformInternal, this.$first, this.$second, this.$transform, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C69475c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/CombineKt$combineTransformInternal$2$1$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.internal.f$c$a */
        public static final class C69476a extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
            final /* synthetic */ ReceiveChannel $firstChannel$inlined;
            final /* synthetic */ Ref.BooleanRef $firstIsClosed$inlined;
            final /* synthetic */ Ref.ObjectRef $firstValue$inlined;
            final /* synthetic */ ReceiveChannel $secondChannel$inlined;
            final /* synthetic */ Ref.BooleanRef $secondIsClosed$inlined;
            final /* synthetic */ Ref.ObjectRef $secondValue$inlined;
            Object L$0;
            int label;
            private Object p$0;
            final /* synthetic */ C69475c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69476a(Continuation cVar, C69475c cVar2, Ref.BooleanRef booleanRef, ReceiveChannel sVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.BooleanRef booleanRef2, ReceiveChannel sVar2) {
                super(2, cVar);
                this.this$0 = cVar2;
                this.$firstIsClosed$inlined = booleanRef;
                this.$firstChannel$inlined = sVar;
                this.$firstValue$inlined = objectRef;
                this.$secondValue$inlined = objectRef2;
                this.$secondIsClosed$inlined = booleanRef2;
                this.$secondChannel$inlined = sVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                C69476a aVar = new C69476a(cVar, this.this$0, this.$firstIsClosed$inlined, this.$firstChannel$inlined, this.$firstValue$inlined, this.$secondValue$inlined, this.$secondIsClosed$inlined, this.$secondChannel$inlined);
                aVar.p$0 = obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
                return ((C69476a) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    T t = (T) this.p$0;
                    this.$firstValue$inlined.element = t;
                    if (this.$secondValue$inlined.element != null) {
                        Function4 pVar = this.this$0.$transform;
                        FlowCollector bVar = this.this$0.$this_combineTransformInternal;
                        Symbol a2 = C69470f.m266893a();
                        T t2 = this.$firstValue$inlined.element;
                        T t3 = null;
                        if (t2 == a2) {
                            t2 = null;
                        }
                        Symbol a3 = C69470f.m266893a();
                        T t4 = this.$secondValue$inlined.element;
                        if (t4 != a3) {
                            t3 = t4;
                        }
                        this.L$0 = t;
                        this.label = 1;
                        if (pVar.invoke(bVar, t2, t3, this) == a) {
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

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/CombineKt$combineTransformInternal$2$1$4"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.internal.f$c$b */
        public static final class C69477b extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
            final /* synthetic */ ReceiveChannel $firstChannel$inlined;
            final /* synthetic */ Ref.BooleanRef $firstIsClosed$inlined;
            final /* synthetic */ Ref.ObjectRef $firstValue$inlined;
            final /* synthetic */ ReceiveChannel $secondChannel$inlined;
            final /* synthetic */ Ref.BooleanRef $secondIsClosed$inlined;
            final /* synthetic */ Ref.ObjectRef $secondValue$inlined;
            Object L$0;
            int label;
            private Object p$0;
            final /* synthetic */ C69475c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69477b(Continuation cVar, C69475c cVar2, Ref.BooleanRef booleanRef, ReceiveChannel sVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.BooleanRef booleanRef2, ReceiveChannel sVar2) {
                super(2, cVar);
                this.this$0 = cVar2;
                this.$firstIsClosed$inlined = booleanRef;
                this.$firstChannel$inlined = sVar;
                this.$firstValue$inlined = objectRef;
                this.$secondValue$inlined = objectRef2;
                this.$secondIsClosed$inlined = booleanRef2;
                this.$secondChannel$inlined = sVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                C69477b bVar = new C69477b(cVar, this.this$0, this.$firstIsClosed$inlined, this.$firstChannel$inlined, this.$firstValue$inlined, this.$secondValue$inlined, this.$secondIsClosed$inlined, this.$secondChannel$inlined);
                bVar.p$0 = obj;
                return bVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
                return ((C69477b) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    T t = (T) this.p$0;
                    this.$secondValue$inlined.element = t;
                    if (this.$firstValue$inlined.element != null) {
                        Function4 pVar = this.this$0.$transform;
                        FlowCollector bVar = this.this$0.$this_combineTransformInternal;
                        Symbol a2 = C69470f.m266893a();
                        T t2 = this.$firstValue$inlined.element;
                        T t3 = null;
                        if (t2 == a2) {
                            t2 = null;
                        }
                        Symbol a3 = C69470f.m266893a();
                        T t4 = this.$secondValue$inlined.element;
                        if (t4 != a3) {
                            t3 = t4;
                        }
                        this.L$0 = t;
                        this.label = 1;
                        if (pVar.invoke(bVar, t2, t3, this) == a) {
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

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(1:(2:3|41)(2:4|5))(1:6)|7|(13:13|14|15|16|17|18|(1:20)(4:21|22|23|24)|25|(1:27)(1:28)|35|(1:37)|(1:39)(16:40|41|7|(1:9)|13|14|15|16|17|18|(0)(0)|25|(0)(0)|35|(0)|(0))|39)(2:11|12)|9|13|14|15|16|17|18|(0)(0)|25|(0)(0)|35|(0)|(0)(0)|39) */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0132, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0134, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0136, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0137, code lost:
            r3 = r6;
            r19 = r7;
            r20 = r8;
            r21 = r9;
            r22 = r10;
            r23 = r11;
            r24 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0144, code lost:
            r18 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0146, code lost:
            r3.mo243120b(r0);
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00cd A[Catch:{ all -> 0x0134 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00d0 A[Catch:{ all -> 0x0134 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0110 A[Catch:{ all -> 0x0132 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0111 A[Catch:{ all -> 0x0132 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0153  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0158 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0159  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
            // Method dump skipped, instructions count: 362
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C69470f.C69475c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final ReceiveChannel<Object> m266892a(CoroutineScope ahVar, Flow<?> aVar) {
        return C69382o.m266746a(ahVar, (CoroutineContext) null, 0, new C69471a(aVar, null), 3, (Object) null);
    }

    /* renamed from: a */
    public static final <R, T> Object m266891a(FlowCollector<? super R> bVar, Flow<? extends T>[] aVarArr, Function0<T[]> function0, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> oVar, Continuation<? super Unit> cVar) {
        Object a = C69364ai.m266264a(new C69473b(bVar, aVarArr, function0, oVar, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }
}
