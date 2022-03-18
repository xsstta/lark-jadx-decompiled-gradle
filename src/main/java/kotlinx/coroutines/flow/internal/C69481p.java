package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C69117h;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\">\u0010\u0000\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"emitFun", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/coroutines/Continuation;", "", "emitFun$annotations", "()V", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.p */
public final class C69481p {

    /* renamed from: a */
    public static final Function3<FlowCollector<Object>, Object, Continuation<? super Unit>, Object> f173675a = ((Function3) C69121n.m265985b(new C69482a(), 3));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0017\u0010\u0005\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "p1", "Lkotlinx/coroutines/flow/FlowCollector;", "", "p2", "Lkotlin/ParameterName;", "name", "value", "invoke", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.internal.p$a */
    static final /* synthetic */ class C69482a extends FunctionReference implements Function3<FlowCollector<? super Object>, Object, Continuation<? super Unit>, Object> {
        C69482a() {
            super(3);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "emit";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(FlowCollector.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;";
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Object> bVar, Object obj, Continuation<? super Unit> cVar) {
            return invoke((FlowCollector<Object>) bVar, obj, cVar);
        }

        public final Object invoke(FlowCollector<Object> bVar, Object obj, Continuation<? super Unit> cVar) {
            C69117h.m265970a(0);
            Object emit = bVar.emit(obj, cVar);
            C69117h.m265970a(2);
            C69117h.m265970a(1);
            return emit;
        }
    }
}
