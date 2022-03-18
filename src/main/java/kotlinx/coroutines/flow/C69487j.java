package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.internal.C69554aa;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ah\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012B\u0010\u0003\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\b\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\b\u0019\u001aB\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001dH\u0007\u001a>\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001dH\u0007\u001ac\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020!23\b\u0002\u0010\u001c\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\"ø\u0001\u0000¢\u0006\u0002\u0010#\u001a}\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012W\u0010\u001c\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0%¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010'*\\\b\u0007\u0010(\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001d2\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001dB6\b)\u0012\n\b*\u0012\u0006\b\n0+8,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u001c\b/\u0012\u0018\b\u000bB\u0014\b0\u0012\u0006\b1\u0012\u0002\b\f\u0012\b\b2\u0012\u0004\b\b(3\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"catch", "Lkotlinx/coroutines/flow/Flow;", "T", "action", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "catchImpl", "collector", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCancellationCause", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "isCancellationCause$FlowKt__ErrorsKt", "isSameExceptionAs", "other", "isSameExceptionAs$FlowKt__ErrorsKt", "onErrorCollect", "fallback", "predicate", "Lkotlin/Function1;", "retry", "retries", "", "", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "retryWhen", "Lkotlin/Function4;", "attempt", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "ExceptionPredicate", "Lkotlin/Deprecated;", "level", "Lkotlin/DeprecationLevel;", "ERROR", "message", "Use (Throwable) -> Boolean functional type", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "expression", "(Throwable) -> Boolean", "kotlinx-coroutines-core"}, mo238835k = 5, mv = {1, 1, 16}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.j */
public final /* synthetic */ class C69487j {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H@"}, d2 = {"catchImpl", "", "T", "Lkotlinx/coroutines/flow/Flow;", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", mo239173f = "Errors.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {229}, mo239176m = "catchImpl", mo239177n = {"$this$catchImpl", "collector", "fromDownstream", "$this$collect$iv"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.flow.j$c */
    static final class C69490c extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C69490c(Continuation cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C69403c.m266838a((Flow) null, (FlowCollector) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.j$b */
    public static final class C69489b implements FlowCollector<T> {

        /* renamed from: a */
        final /* synthetic */ FlowCollector f173683a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f173684b;

        public C69489b(FlowCollector bVar, Ref.ObjectRef objectRef) {
            this.f173683a = bVar;
            this.f173684b = objectRef;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1
                if (r0 == 0) goto L_0x0014
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L_0x0014
                int r6 = r0.label
                int r6 = r6 - r2
                r0.label = r6
                goto L_0x0019
            L_0x0014:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1
                r0.<init>(r4, r6)
            L_0x0019:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 != r3) goto L_0x0038
                java.lang.Object r5 = r0.L$3
                java.lang.Object r5 = r0.L$2
                kotlin.coroutines.c r5 = (kotlin.coroutines.Continuation) r5
                java.lang.Object r5 = r0.L$1
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.j$b r5 = (kotlinx.coroutines.flow.C69487j.C69489b) r5
                kotlin.C69097g.m265891a(r6)     // Catch:{ all -> 0x0036 }
                goto L_0x0059
            L_0x0036:
                r6 = move-exception
                goto L_0x005e
            L_0x0038:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0040:
                kotlin.C69097g.m265891a(r6)
                r6 = r0
                kotlin.coroutines.c r6 = (kotlin.coroutines.Continuation) r6
                kotlinx.coroutines.flow.b r2 = r4.f173683a     // Catch:{ all -> 0x005c }
                r0.L$0 = r4     // Catch:{ all -> 0x005c }
                r0.L$1 = r5     // Catch:{ all -> 0x005c }
                r0.L$2 = r6     // Catch:{ all -> 0x005c }
                r0.L$3 = r5     // Catch:{ all -> 0x005c }
                r0.label = r3     // Catch:{ all -> 0x005c }
                java.lang.Object r5 = r2.emit(r5, r0)     // Catch:{ all -> 0x005c }
                if (r5 != r1) goto L_0x0059
                return r1
            L_0x0059:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L_0x005c:
                r6 = move-exception
                r5 = r4
            L_0x005e:
                kotlin.jvm.internal.Ref$ObjectRef r5 = r5.f173684b
                r5.element = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69487j.C69489b.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* renamed from: a */
    private static final boolean m266904a(Throwable th, CoroutineContext fVar) {
        Job btVar = (Job) fVar.get(Job.f173460b);
        if (btVar == null || !btVar.mo242736i()) {
            return false;
        }
        return m266903a(th, btVar.mo242737j());
    }

    /* renamed from: a */
    private static final boolean m266903a(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (ak.m266271c()) {
                th2 = C69554aa.m266961b(th2);
            }
            if (ak.m266271c()) {
                th = C69554aa.m266961b(th);
            }
            if (Intrinsics.areEqual(th2, th)) {
                return true;
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.j$a */
    public static final class C69488a implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173681a;

        /* renamed from: b */
        final /* synthetic */ Function3 f173682b;

        /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo242938a(kotlinx.coroutines.flow.FlowCollector r8, kotlin.coroutines.Continuation r9) {
            /*
            // Method dump skipped, instructions count: 148
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69487j.C69488a.mo242938a(kotlinx.coroutines.flow.b, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.j$d */
    public static final class C69491d implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173685a;

        /* renamed from: b */
        final /* synthetic */ Function4 f173686b;

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo242938a(kotlinx.coroutines.flow.FlowCollector r13, kotlin.coroutines.Continuation r14) {
            /*
            // Method dump skipped, instructions count: 210
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69487j.C69491d.mo242938a(kotlinx.coroutines.flow.b, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m266902a(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlin.coroutines.Continuation<? super java.lang.Throwable> r7) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69487j.m266902a(kotlinx.coroutines.flow.a, kotlinx.coroutines.flow.b, kotlin.coroutines.c):java.lang.Object");
    }
}
