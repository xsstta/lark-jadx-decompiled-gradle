package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C69121n;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.C69558af;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b2\u0006\u0010\n\u001a\u0002H\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u000eH\u0000\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"withContextUndispatched", "T", "V", "newContext", "Lkotlin/coroutines/CoroutineContext;", "countOrElement", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "value", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asChannelFlow", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/Flow;", "withUndispatchedContextCollector", "Lkotlinx/coroutines/flow/FlowCollector;", "emitContext", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.b */
public final class C69462b {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000©\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b¸\u0006\r"}, d2 = {"kotlin/coroutines/ContinuationKt$Continuation$1", "Lkotlin/coroutines/Continuation;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "kotlin-stdlib", "kotlinx/coroutines/flow/internal/ChannelFlowKt$$special$$inlined$Continuation$1", "kotlinx/coroutines/flow/internal/ChannelFlowKt$$special$$inlined$withCoroutineContext$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.internal.b$a */
    public static final class C69463a implements Continuation<T> {

        /* renamed from: a */
        final /* synthetic */ CoroutineContext f173649a;

        /* renamed from: b */
        final /* synthetic */ Continuation f173650b;

        /* renamed from: c */
        final /* synthetic */ CoroutineContext f173651c;

        /* renamed from: d */
        final /* synthetic */ Object f173652d;

        /* renamed from: e */
        final /* synthetic */ Function2 f173653e;

        /* renamed from: f */
        final /* synthetic */ Object f173654f;

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.f173649a;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            this.f173650b.resumeWith(obj);
        }

        public C69463a(CoroutineContext fVar, Continuation cVar, CoroutineContext fVar2, Object obj, Function2 kVar, Object obj2) {
            this.f173649a = fVar;
            this.f173650b = cVar;
            this.f173651c = fVar2;
            this.f173652d = obj;
            this.f173653e = kVar;
            this.f173654f = obj2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.b<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> FlowCollector<T> m266880a(FlowCollector<? super T> bVar, CoroutineContext fVar) {
        if (!(bVar instanceof SendingCollector) && !(bVar instanceof NopCollector)) {
            return new UndispatchedContextCollector(bVar, fVar);
        }
        return bVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static final /* synthetic */ <T, V> Object m266878a(CoroutineContext fVar, Object obj, Function2<? super V, ? super Continuation<? super T>, ? extends Object> kVar, V v, Continuation<? super T> cVar) {
        Object a = C69558af.m266979a(fVar, obj);
        try {
            C69463a aVar = new C69463a(fVar, cVar, fVar, obj, kVar, v);
            if (kVar != null) {
                Object invoke = ((Function2) C69121n.m265985b(kVar, 2)).invoke(v, aVar);
                C69558af.m266980b(fVar, a);
                if (invoke == C69086a.m265828a()) {
                    C69091e.m265847c(cVar);
                }
                return invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            C69558af.m266980b(fVar, a);
            throw th;
        }
    }

    /* renamed from: a */
    static /* synthetic */ Object m266879a(CoroutineContext fVar, Object obj, Function2 kVar, Object obj2, Continuation cVar, int i, Object obj3) {
        if ((i & 2) != 0) {
            obj = C69558af.m266978a(fVar);
        }
        return m266878a(fVar, obj, kVar, obj2, cVar);
    }
}
