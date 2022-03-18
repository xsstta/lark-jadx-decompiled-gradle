package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0005\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"unsafeFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "checkContext", "Lkotlinx/coroutines/flow/internal/SafeCollector;", "currentContext", "Lkotlin/coroutines/CoroutineContext;", "transitiveCoroutineParent", "Lkotlinx/coroutines/Job;", "collectJob", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.q */
public final class C69483q {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.internal.q$b */
    public static final class C69485b implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Function2 f173676a;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(FlowCollector<? super T> bVar, Continuation<? super Unit> cVar) {
            Object invoke = this.f173676a.invoke(bVar, cVar);
            if (invoke == C69086a.m265828a()) {
                return invoke;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final Job m266899a(Job btVar, Job btVar2) {
        while (btVar != null) {
            if (btVar == btVar2 || !(btVar instanceof ScopeCoroutine)) {
                return btVar;
            }
            btVar = ((ScopeCoroutine) btVar).mo243051q();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "count", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.internal.q$a */
    public static final class C69484a extends Lambda implements Function2<Integer, CoroutineContext.Element, Integer> {
        final /* synthetic */ SafeCollector $this_checkContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69484a(SafeCollector safeCollector) {
            super(2);
            this.$this_checkContext = safeCollector;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element bVar) {
            return Integer.valueOf(invoke(num.intValue(), bVar));
        }

        public final int invoke(int i, CoroutineContext.Element bVar) {
            CoroutineContext.Key<?> key = bVar.getKey();
            CoroutineContext.Element bVar2 = this.$this_checkContext.collectContext.get(key);
            if (key == Job.f173460b) {
                Job btVar = (Job) bVar2;
                if (bVar != null) {
                    Job a = C69483q.m266899a((Job) bVar, btVar);
                    if (a != btVar) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n" + "\t\tChild of " + a + ", expected child of " + btVar + ".\n" + "\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n" + "\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    } else if (btVar == null) {
                        return i;
                    } else {
                        return i + 1;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Job");
                }
            } else if (bVar != bVar2) {
                return Integer.MIN_VALUE;
            } else {
                return i + 1;
            }
        }
    }

    /* renamed from: a */
    public static final void m266900a(SafeCollector<?> safeCollector, CoroutineContext fVar) {
        if (((Number) fVar.fold(0, new C69484a(safeCollector))).intValue() != safeCollector.collectContextSize) {
            throw new IllegalStateException(("Flow invariant is violated:\n" + "\t\tFlow was collected in " + safeCollector.collectContext + ",\n" + "\t\tbut emission happened in " + fVar + ".\n" + "\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }
}
