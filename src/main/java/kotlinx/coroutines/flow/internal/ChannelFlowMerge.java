package kotlinx.coroutines.flow.internal;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.C69581g;
import kotlinx.coroutines.sync.Semaphore;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B5\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0014J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "concurrency", "", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/coroutines/CoroutineContext;I)V", "additionalToStringProps", "", "collectTo", "", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.c */
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {

    /* renamed from: c */
    private final Flow<Flow<T>> f173655c;

    /* renamed from: d */
    private final int f173656d;

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: b */
    public String mo242947b() {
        return "concurrency=" + this.f173656d + ", ";
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: a */
    public ReceiveChannel<T> mo242946a(CoroutineScope ahVar) {
        return C69478i.m266896a(ahVar, this.f173647a, this.f173648b, mo242945a());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.internal.c$a */
    public static final class C69464a implements FlowCollector<Flow<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ Job f173657a;

        /* renamed from: b */
        final /* synthetic */ Semaphore f173658b;

        /* renamed from: c */
        final /* synthetic */ ProducerScope f173659c;

        /* renamed from: d */
        final /* synthetic */ SendingCollector f173660d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/ChannelFlowMerge$collectTo$2$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.internal.c$a$a */
        static final class C69465a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow $inner;
            Object L$0;
            int label;
            private CoroutineScope p$;
            final /* synthetic */ C69464a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69465a(Flow aVar, Continuation cVar, C69464a aVar2) {
                super(2, cVar);
                this.$inner = aVar;
                this.this$0 = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                C69465a aVar = new C69465a(this.$inner, cVar, this.this$0);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                return ((C69465a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    this.L$0 = this.p$;
                    this.label = 1;
                    if (this.$inner.mo242938a(this.this$0.f173660d, this) == a) {
                        return a;
                    }
                } else if (i == 1) {
                    CoroutineScope ahVar = (CoroutineScope) this.L$0;
                    try {
                        C69097g.m265891a(obj);
                    } catch (Throwable th) {
                        this.this$0.f173658b.mo243130a();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.this$0.f173658b.mo243130a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
            /*
            // Method dump skipped, instructions count: 125
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowMerge.C69464a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }

        public C69464a(Job btVar, Semaphore eVar, ProducerScope qVar, SendingCollector rVar) {
            this.f173657a = btVar;
            this.f173658b = eVar;
            this.f173659c = qVar;
            this.f173660d = rVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: a */
    public Object mo242944a(ProducerScope<? super T> qVar, Continuation<? super Unit> cVar) {
        Object a = this.f173655c.mo242938a(new C69464a((Job) cVar.getContext().get(Job.f173460b), C69581g.m267307a(this.f173656d, 0, 2, null), qVar, new SendingCollector(qVar)), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }
}
