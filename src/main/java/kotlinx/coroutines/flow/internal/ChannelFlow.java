package kotlinx.coroutines.flow.internal;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.al;
import kotlinx.coroutines.channels.C69382o;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.C69403c;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001f\u0010\u001b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\nH¤@ø\u0001\u0000¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H$J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010%\u001a\u00020\u0014H\u0016R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R9\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t8@X\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", "T", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "(Lkotlin/coroutines/CoroutineContext;I)V", "collectToFun", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "getCollectToFun$kotlinx_coroutines_core", "()Lkotlin/jvm/functions/Function2;", "produceCapacity", "getProduceCapacity", "()I", "additionalToStringProps", "", "broadcastImpl", "Lkotlinx/coroutines/channels/BroadcastChannel;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "start", "Lkotlinx/coroutines/CoroutineStart;", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "fuse", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "toString", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.a */
public abstract class ChannelFlow<T> implements FusibleFlow<T> {

    /* renamed from: a */
    public final CoroutineContext f173647a;

    /* renamed from: b */
    public final int f173648b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo242944a(ProducerScope<? super T> qVar, Continuation<? super Unit> cVar);

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo242938a(FlowCollector<? super T> bVar, Continuation<? super Unit> cVar) {
        return m266871a(this, bVar, cVar);
    }

    /* renamed from: b */
    public String mo242947b() {
        return "";
    }

    /* renamed from: c */
    private final int m266872c() {
        int i = this.f173648b;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: a */
    public final Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> mo242945a() {
        return new C69461b(this, null);
    }

    public String toString() {
        return al.m266275b(this) + '[' + mo242947b() + "context=" + this.f173647a + ", capacity=" + this.f173648b + ']';
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", mo239173f = "ChannelFlow.kt", mo239174i = {0}, mo239175l = {101}, mo239176m = "invokeSuspend", mo239177n = {"$this$coroutineScope"}, mo239178s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.internal.a$a */
    public static final class C69460a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FlowCollector $collector;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ ChannelFlow this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69460a(ChannelFlow aVar, FlowCollector bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$collector = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            C69460a aVar = new C69460a(this.this$0, this.$collector, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C69460a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                FlowCollector bVar = this.$collector;
                ReceiveChannel<T> a2 = this.this$0.mo242946a(ahVar);
                this.L$0 = ahVar;
                this.label = 1;
                if (C69403c.m266839a(bVar, a2, this) == a) {
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

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlinx/coroutines/channels/ProducerScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", mo239173f = "ChannelFlow.kt", mo239174i = {0}, mo239175l = {53}, mo239176m = "invokeSuspend", mo239177n = {"it"}, mo239178s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.internal.a$b */
    public static final class C69461b extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private ProducerScope p$0;
        final /* synthetic */ ChannelFlow this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69461b(ChannelFlow aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            C69461b bVar = new C69461b(this.this$0, cVar);
            bVar.p$0 = (ProducerScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
            return ((C69461b) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                ProducerScope<? super T> qVar = this.p$0;
                ChannelFlow aVar = this.this$0;
                this.L$0 = qVar;
                this.label = 1;
                if (aVar.mo242944a(qVar, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                ProducerScope qVar2 = (ProducerScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public ReceiveChannel<T> mo242946a(CoroutineScope ahVar) {
        return C69382o.m266748a(ahVar, this.f173647a, m266872c(), CoroutineStart.ATOMIC, null, mo242945a(), 8, null);
    }

    /* renamed from: a */
    static /* synthetic */ Object m266871a(ChannelFlow aVar, FlowCollector bVar, Continuation cVar) {
        Object a = C69364ai.m266264a(new C69460a(aVar, bVar, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }
}
