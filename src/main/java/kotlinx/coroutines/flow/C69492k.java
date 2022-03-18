package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001aH\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a+\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a$\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001aH\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"drop", "Lkotlinx/coroutines/flow/Flow;", "T", "count", "", "dropWhile", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "emitAbort", "", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "emitAbort$FlowKt__LimitKt", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "take", "takeWhile", "kotlinx-coroutines-core"}, mo238835k = 5, mv = {1, 1, 16}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.k */
final /* synthetic */ class C69492k {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, d2 = {"emitAbort", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__LimitKt", mo239173f = "Limit.kt", mo239174i = {0, 0}, mo239175l = {67}, mo239176m = "emitAbort$FlowKt__LimitKt", mo239177n = {"$this$emitAbort", "value"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.k$b */
    public static final class C69495b extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C69495b(Continuation cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C69492k.m266907a(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.k$d */
    public static final class C69498d implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173697a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173698b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__LimitKt$$special$$inlined$collect$4"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.k$d$a */
        public static final class C69499a implements FlowCollector<T> {

            /* renamed from: a */
            final /* synthetic */ FlowCollector f173699a;

            /* renamed from: b */
            final /* synthetic */ C69498d f173700b;

            public C69499a(FlowCollector bVar, C69498d dVar) {
                this.f173699a = bVar;
                this.f173700b = dVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                // Method dump skipped, instructions count: 150
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69492k.C69498d.C69499a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo242938a(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69492k.C69498d.mo242938a(kotlinx.coroutines.flow.b, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.k$a */
    public static final class C69493a implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173687a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173688b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(FlowCollector bVar, Continuation cVar) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            Object a = this.f173687a.mo242938a(new C69494a(bVar, booleanRef, this), cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__LimitKt$$special$$inlined$collect$2"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.k$a$a */
        public static final class C69494a implements FlowCollector<T> {

            /* renamed from: a */
            final /* synthetic */ FlowCollector f173689a;

            /* renamed from: b */
            final /* synthetic */ Ref.BooleanRef f173690b;

            /* renamed from: c */
            final /* synthetic */ C69493a f173691c;

            /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                /*
                // Method dump skipped, instructions count: 173
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69492k.C69493a.C69494a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }

            public C69494a(FlowCollector bVar, Ref.BooleanRef booleanRef, C69493a aVar) {
                this.f173689a = bVar;
                this.f173690b = booleanRef;
                this.f173691c = aVar;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.k$c */
    public static final class C69496c implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173692a;

        /* renamed from: b */
        final /* synthetic */ int f173693b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__LimitKt$$special$$inlined$collect$3"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.k$c$a */
        public static final class C69497a implements FlowCollector<T> {

            /* renamed from: a */
            final /* synthetic */ FlowCollector f173694a;

            /* renamed from: b */
            final /* synthetic */ Ref.IntRef f173695b;

            /* renamed from: c */
            final /* synthetic */ C69496c f173696c;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object obj, Continuation cVar) {
                Ref.IntRef intRef = this.f173695b;
                intRef.element++;
                if (intRef.element < this.f173696c.f173693b) {
                    Object emit = this.f173694a.emit(obj, cVar);
                    if (emit == C69086a.m265828a()) {
                        return emit;
                    }
                    return Unit.INSTANCE;
                }
                Object a = C69492k.m266907a(this.f173694a, obj, cVar);
                if (a == C69086a.m265828a()) {
                    return a;
                }
                return Unit.INSTANCE;
            }

            public C69497a(FlowCollector bVar, Ref.IntRef intRef, C69496c cVar) {
                this.f173694a = bVar;
                this.f173695b = intRef;
                this.f173696c = cVar;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo242938a(kotlinx.coroutines.flow.FlowCollector r7, kotlin.coroutines.Continuation r8) {
            /*
            // Method dump skipped, instructions count: 125
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69492k.C69496c.mo242938a(kotlinx.coroutines.flow.b, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ <T> java.lang.Object m266907a(kotlinx.coroutines.flow.FlowCollector<? super T> r4, T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C69492k.C69495b
            if (r0 == 0) goto L_0x0014
            r0 = r6
            kotlinx.coroutines.flow.k$b r0 = (kotlinx.coroutines.flow.C69492k.C69495b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.flow.k$b r0 = new kotlinx.coroutines.flow.k$b
            r0.<init>(r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r3) goto L_0x002e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002e:
            java.lang.Object r4 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.b r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.C69097g.m265891a(r6)
            goto L_0x0048
        L_0x0038:
            kotlin.C69097g.m265891a(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69492k.m266907a(kotlinx.coroutines.flow.b, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
