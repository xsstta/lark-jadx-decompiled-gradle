package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.C69480o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001aM\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012$\b\u0004\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\b\u001aM\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012$\b\u0004\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0007*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\u001ab\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u000123\b\u0004\u0010\u000e\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001ah\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\u00020\u000125\b\u0004\u0010\u000e\u001a/\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\n0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001aH\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a~\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0017\u001a\u0002H\n2H\b\u0001\u0010\u0018\u001aB\b\u0001\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001an\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012F\u0010\u0018\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001f0\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"filter", "Lkotlinx/coroutines/flow/Flow;", "T", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "filterIsInstance", "R", "filterNot", "filterNotNull", "map", "transform", "Lkotlin/ParameterName;", "name", "value", "mapNotNull", "onEach", "action", "", "scan", "initial", "operation", "Lkotlin/Function3;", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "scanReduce", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "withIndex", "Lkotlin/collections/IndexedValue;", "kotlinx-coroutines-core"}, mo238835k = 5, mv = {1, 1, 16}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.m */
final /* synthetic */ class C69505m {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__MergeKt$unsafeTransform$$inlined$unsafeFlow$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$a */
    public static final class C69506a implements Flow<R> {

        /* renamed from: a */
        final /* synthetic */ Flow f173710a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173711b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector bVar, Continuation cVar) {
            Object a = this.f173710a.mo242938a(new FlowCollector<T>() {
                /* class kotlinx.coroutines.flow.C69505m.C69506a.C695071 */

                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(Object obj, Continuation cVar) {
                    Object emit = bVar.emit(this.f173711b.invoke(obj, cVar), cVar);
                    if (emit == C69086a.m265828a()) {
                        return emit;
                    }
                    return Unit.INSTANCE;
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__MergeKt$unsafeTransform$$inlined$unsafeFlow$2"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$b */
    public static final class C69508b implements Flow<R> {

        /* renamed from: a */
        final /* synthetic */ Flow f173714a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173715b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector bVar, Continuation cVar) {
            Object a = this.f173714a.mo242938a(new FlowCollector<T>() {
                /* class kotlinx.coroutines.flow.C69505m.C69508b.C695091 */

                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(Object obj, Continuation cVar) {
                    Object emit = bVar.emit(this.f173715b.invoke(obj, cVar), cVar);
                    if (emit == C69086a.m265828a()) {
                        return emit;
                    }
                    return Unit.INSTANCE;
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$c */
    public static final class C69510c implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173718a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173719b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector bVar, Continuation cVar) {
            Object a = this.f173718a.mo242938a(new FlowCollector<T>() {
                /* class kotlinx.coroutines.flow.C69505m.C69510c.C695111 */

                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(Object obj, Continuation cVar) {
                    FlowCollector bVar = bVar;
                    if (!((Boolean) this.f173719b.invoke(obj, cVar)).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    Object emit = bVar.emit(obj, cVar);
                    if (emit == C69086a.m265828a()) {
                        return emit;
                    }
                    return Unit.INSTANCE;
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$3"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$d */
    public static final class C69512d implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173722a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173723b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector bVar, Continuation cVar) {
            Object a = this.f173722a.mo242938a(new FlowCollector<T>() {
                /* class kotlinx.coroutines.flow.C69505m.C69512d.C695131 */

                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(Object obj, Continuation cVar) {
                    FlowCollector bVar = bVar;
                    if (!((Boolean) this.f173723b.invoke(obj, cVar)).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    Object emit = bVar.emit(obj, cVar);
                    if (emit == C69086a.m265828a()) {
                        return emit;
                    }
                    return Unit.INSTANCE;
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$3", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$2"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$e */
    public static final class C69514e implements Flow<Object> {

        /* renamed from: a */
        final /* synthetic */ Flow f173726a;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.b, kotlin.coroutines.c] */
        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector<? super Object> bVar, Continuation cVar) {
            Flow aVar = this.f173726a;
            Intrinsics.needClassReification();
            Object a = aVar.mo242938a(new FlowCollector<Object>() {
                /* class kotlinx.coroutines.flow.C69505m.C69514e.C695151 */

                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(Object obj, Continuation cVar) {
                    FlowCollector bVar = bVar;
                    Intrinsics.reifiedOperationMarker(3, "R");
                    if (!C69089a.m265837a(obj instanceof Object).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    Object emit = bVar.emit(obj, cVar);
                    if (emit == C69086a.m265828a()) {
                        return emit;
                    }
                    return Unit.INSTANCE;
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$2"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$f */
    public static final class C69516f implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173729a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173730b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector bVar, Continuation cVar) {
            Object a = this.f173729a.mo242938a(new FlowCollector<T>() {
                /* class kotlinx.coroutines.flow.C69505m.C69516f.C695171 */

                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(Object obj, Continuation cVar) {
                    FlowCollector bVar = bVar;
                    if (((Boolean) this.f173730b.invoke(obj, cVar)).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    Object emit = bVar.emit(obj, cVar);
                    if (emit == C69086a.m265828a()) {
                        return emit;
                    }
                    return Unit.INSTANCE;
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$g */
    public static final class C69518g implements Flow<R> {

        /* renamed from: a */
        final /* synthetic */ Flow f173733a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173734b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector bVar, Continuation cVar) {
            Object a = this.f173733a.mo242938a(new FlowCollector<T>() {
                /* class kotlinx.coroutines.flow.C69505m.C69518g.C695191 */

                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(Object obj, Continuation cVar) {
                    Object emit = bVar.emit(this.f173734b.invoke(obj, cVar), cVar);
                    if (emit == C69086a.m265828a()) {
                        return emit;
                    }
                    return Unit.INSTANCE;
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$6"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$h */
    public static final class C69520h implements Flow<R> {

        /* renamed from: a */
        final /* synthetic */ Flow f173737a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173738b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector bVar, Continuation cVar) {
            Object a = this.f173737a.mo242938a(new FlowCollector<T>() {
                /* class kotlinx.coroutines.flow.C69505m.C69520h.C695211 */

                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(Object obj, Continuation cVar) {
                    FlowCollector bVar = bVar;
                    Object invoke = this.f173738b.invoke(obj, cVar);
                    if (invoke != null) {
                        Object emit = bVar.emit(invoke, cVar);
                        if (emit == C69086a.m265828a()) {
                            return emit;
                        }
                        return Unit.INSTANCE;
                    } else if (invoke == C69086a.m265828a()) {
                        return invoke;
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$7"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$i */
    public static final class C69522i implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173741a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173742b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector bVar, Continuation cVar) {
            Object a = this.f173741a.mo242938a(new FlowCollector<T>() {
                /* class kotlinx.coroutines.flow.C69505m.C69522i.C695231 */

                /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5 A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                    /*
                    // Method dump skipped, instructions count: 169
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69505m.C69522i.C695231.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$k */
    public static final class C69526k implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173751a;

        /* renamed from: b */
        final /* synthetic */ Function3 f173752b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(FlowCollector bVar, Continuation cVar) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) C69480o.f173673a;
            Object a = this.f173751a.mo242938a(new C69527a(bVar, objectRef, this), cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$10"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.m$k$a */
        public static final class C69527a implements FlowCollector<T> {

            /* renamed from: a */
            final /* synthetic */ FlowCollector f173753a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f173754b;

            /* renamed from: c */
            final /* synthetic */ C69526k f173755c;

            /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                /*
                // Method dump skipped, instructions count: 168
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69505m.C69526k.C69527a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }

            public C69527a(FlowCollector bVar, Ref.ObjectRef objectRef, C69526k kVar) {
                this.f173753a = bVar;
                this.f173754b = objectRef;
                this.f173755c = kVar;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.m$j */
    public static final class C69524j implements Flow<R> {

        /* renamed from: a */
        final /* synthetic */ Flow f173745a;

        /* renamed from: b */
        final /* synthetic */ Object f173746b;

        /* renamed from: c */
        final /* synthetic */ Function3 f173747c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$9"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.m$j$a */
        public static final class C69525a implements FlowCollector<T> {

            /* renamed from: a */
            final /* synthetic */ FlowCollector f173748a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f173749b;

            /* renamed from: c */
            final /* synthetic */ C69524j f173750c;

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0097 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                /*
                // Method dump skipped, instructions count: 155
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69505m.C69524j.C69525a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }

            public C69525a(FlowCollector bVar, Ref.ObjectRef objectRef, C69524j jVar) {
                this.f173748a = bVar;
                this.f173749b = objectRef;
                this.f173750c = jVar;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo242938a(kotlinx.coroutines.flow.FlowCollector r10, kotlin.coroutines.Continuation r11) {
            /*
            // Method dump skipped, instructions count: 176
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69505m.C69524j.mo242938a(kotlinx.coroutines.flow.b, kotlin.coroutines.c):java.lang.Object");
        }
    }
}
