package kotlinx.coroutines.flow.internal;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J'\u0010\u0014\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;I)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectWithContextUndispatched", "newContext", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowCollect", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.d */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* renamed from: c */
    public final Flow<S> f173661c;

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: a */
    public Object mo242944a(ProducerScope<? super T> qVar, Continuation<? super Unit> cVar) {
        return m266884a(this, qVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo242938a(FlowCollector<? super T> bVar, Continuation<? super Unit> cVar) {
        return m266885a((ChannelFlowOperator) this, (FlowCollector) bVar, (Continuation) cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo242950b(FlowCollector<? super T> bVar, Continuation<? super Unit> cVar);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.f173661c + " -> " + super.toString();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "S", "T", "it", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", mo239173f = "ChannelFlow.kt", mo239174i = {0}, mo239175l = {SmActions.ACTION_CALLING_ENTRY}, mo239176m = "invokeSuspend", mo239177n = {"it"}, mo239178s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.internal.d$a */
    public static final class C69466a extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private FlowCollector p$0;
        final /* synthetic */ ChannelFlowOperator this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69466a(ChannelFlowOperator dVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            C69466a aVar = new C69466a(this.this$0, cVar);
            aVar.p$0 = (FlowCollector) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
            return ((C69466a) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                FlowCollector<? super T> bVar = this.p$0;
                ChannelFlowOperator dVar = this.this$0;
                this.L$0 = bVar;
                this.label = 1;
                if (dVar.mo242950b(bVar, this) == a) {
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

    /* renamed from: a */
    static /* synthetic */ Object m266884a(ChannelFlowOperator dVar, ProducerScope qVar, Continuation cVar) {
        Object b = dVar.mo242950b(new SendingCollector(qVar), cVar);
        if (b == C69086a.m265828a()) {
            return b;
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo242949a(FlowCollector<? super T> bVar, CoroutineContext fVar, Continuation<? super Unit> cVar) {
        Object a = C69462b.m266879a(fVar, null, new C69466a(this, null), C69462b.m266880a(bVar, cVar.getContext()), cVar, 2, null);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    static /* synthetic */ Object m266885a(ChannelFlowOperator dVar, FlowCollector bVar, Continuation cVar) {
        if (dVar.f173648b == -3) {
            CoroutineContext context = cVar.getContext();
            CoroutineContext plus = context.plus(dVar.f173647a);
            if (Intrinsics.areEqual(plus, context)) {
                Object b = dVar.mo242950b(bVar, cVar);
                if (b == C69086a.m265828a()) {
                    return b;
                }
                return Unit.INSTANCE;
            } else if (Intrinsics.areEqual((ContinuationInterceptor) plus.get(ContinuationInterceptor.f173125b), (ContinuationInterceptor) context.get(ContinuationInterceptor.f173125b))) {
                Object a = dVar.mo242949a(bVar, plus, cVar);
                if (a == C69086a.m265828a()) {
                    return a;
                }
                return Unit.INSTANCE;
            }
        }
        Object a2 = super.mo242938a(bVar, cVar);
        if (a2 == C69086a.m265828a()) {
            return a2;
        }
        return Unit.INSTANCE;
    }
}
