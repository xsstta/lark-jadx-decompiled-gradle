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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.C69558af;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R/\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nX\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "emitContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "countOrElement", "", "emitRef", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function2;", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.s */
public final class UndispatchedContextCollector<T> implements FlowCollector<T> {

    /* renamed from: a */
    private final Object f173678a;

    /* renamed from: b */
    private final Function2<T, Continuation<? super Unit>, Object> f173679b;

    /* renamed from: c */
    private final CoroutineContext f173680c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", mo239173f = "ChannelFlow.kt", mo239174i = {0}, mo239175l = {178}, mo239176m = "invokeSuspend", mo239177n = {"it"}, mo239178s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.internal.s$a */
    static final class C69486a extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
        final /* synthetic */ FlowCollector $downstream;
        Object L$0;
        int label;
        private Object p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69486a(FlowCollector bVar, Continuation cVar) {
            super(2, cVar);
            this.$downstream = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            C69486a aVar = new C69486a(this.$downstream, cVar);
            aVar.p$0 = obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> cVar) {
            return ((C69486a) create(obj, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: kotlinx.coroutines.flow.b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                Object obj2 = this.p$0;
                FlowCollector bVar = this.$downstream;
                this.L$0 = obj2;
                this.label = 1;
                if (bVar.emit(obj2, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public UndispatchedContextCollector(FlowCollector<? super T> bVar, CoroutineContext fVar) {
        this.f173680c = fVar;
        this.f173678a = C69558af.m266978a(fVar);
        this.f173679b = new C69486a(bVar, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> cVar) {
        Object a = C69462b.m266878a(this.f173680c, this.f173678a, this.f173679b, t, cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }
}
