package kotlinx.coroutines.flow.internal;

import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.bw;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J'\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J%\u0010\u0016\u001a\u0004\u0018\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0018H\u0002J\"\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180 H\u0016ø\u0001\u0000¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\fH\u0016R\u0010\u0010\u0005\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0000X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "collector", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "collectContextSize", "", "completion", "Lkotlin/coroutines/Continuation;", "", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEmissionContext", "checkContext", "currentContext", "previousContext", "value", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uCont", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "exceptionTransparencyViolated", ApiHandler.API_CALLBACK_EXCEPTION, "Lkotlinx/coroutines/flow/internal/DownstreamExceptionElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
public final class SafeCollector<T> extends ContinuationImpl implements FlowCollector<T> {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final FlowCollector<T> collector;
    private Continuation<? super Unit> completion;
    private CoroutineContext lastEmissionContext;

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        CoroutineContext context;
        Continuation<? super Unit> cVar = this.completion;
        if (cVar == null || (context = cVar.getContext()) == null) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Throwable r0 = Result.m271572exceptionOrNullimpl(obj);
        if (r0 != null) {
            this.lastEmissionContext = new DownstreamExceptionElement(r0);
        }
        Continuation<? super Unit> cVar = this.completion;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return C69086a.m265828a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "count", "<anonymous parameter 1>", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.internal.SafeCollector$a */
    static final class C69459a extends Lambda implements Function2<Integer, CoroutineContext.Element, Integer> {
        public static final C69459a INSTANCE = new C69459a();

        C69459a() {
            super(2);
        }

        public final int invoke(int i, CoroutineContext.Element bVar) {
            return i + 1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element bVar) {
            return Integer.valueOf(invoke(num.intValue(), bVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.flow.b<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(FlowCollector<? super T> bVar, CoroutineContext fVar) {
        super(NoOpContinuation.f173670a, EmptyCoroutineContext.INSTANCE);
        this.collector = bVar;
        this.collectContext = fVar;
        this.collectContextSize = ((Number) fVar.fold(0, C69459a.INSTANCE)).intValue();
    }

    private final Object emit(Continuation<? super Unit> cVar, T t) {
        CoroutineContext context = cVar.getContext();
        bw.m266407a(context);
        CoroutineContext fVar = this.lastEmissionContext;
        if (fVar != context) {
            checkContext(context, fVar, t);
        }
        this.completion = cVar;
        Function3<FlowCollector<Object>, Object, Continuation<? super Unit>, Object> oVar = C69481p.f173675a;
        FlowCollector<T> bVar = this.collector;
        if (bVar != null) {
            return oVar.invoke(bVar, t, this);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
    }

    private final void exceptionTransparencyViolated(DownstreamExceptionElement gVar, Object obj) {
        throw new IllegalStateException(StringsKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + gVar.f173668a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> cVar) {
        try {
            Object emit = emit(cVar, (Object) t);
            if (emit == C69086a.m265828a()) {
                C69091e.m265847c(cVar);
            }
            if (emit == C69086a.m265828a()) {
                return emit;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new DownstreamExceptionElement(th);
            throw th;
        }
    }

    private final void checkContext(CoroutineContext fVar, CoroutineContext fVar2, T t) {
        if (fVar2 instanceof DownstreamExceptionElement) {
            exceptionTransparencyViolated((DownstreamExceptionElement) fVar2, t);
        }
        C69483q.m266900a((SafeCollector<?>) this, fVar);
        this.lastEmissionContext = fVar;
    }
}
