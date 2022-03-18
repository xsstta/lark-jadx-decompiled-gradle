package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aE\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00010\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aK\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001ay\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\r\u001a\u0002H\f2H\b\u0004\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fHHø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001as\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u0016\"\b\b\u0001\u0010\u0001*\u0002H\u0016*\b\u0012\u0004\u0012\u0002H\u00010\u00022F\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a!\u0010\u0019\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a'\u0010\u001a\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00010\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"first", "T", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "acc", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reduce", "S", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "single", "singleOrNull", "kotlinx-coroutines-core"}, mo238835k = 5, mv = {1, 1, 16}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.p */
final /* synthetic */ class C69547p {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.p$c */
    public static final class C69550c implements FlowCollector<T> {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f173794a;

        /* renamed from: b */
        final /* synthetic */ Function3 f173795b;

        public C69550c(Ref.ObjectRef objectRef, Function3 oVar) {
            this.f173794a = objectRef;
            this.f173795b = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
            /*
            // Method dump skipped, instructions count: 103
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69547p.C69550c.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.p$a */
    public static final class C69548a implements FlowCollector<T> {

        /* renamed from: a */
        final /* synthetic */ Function2 f173790a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f173791b;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
            /*
            // Method dump skipped, instructions count: 115
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69547p.C69548a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.p$b */
    public static final class C69549b implements FlowCollector<T> {

        /* renamed from: a */
        final /* synthetic */ Function2 f173792a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f173793b;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
            /*
            // Method dump skipped, instructions count: 115
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69547p.C69549b.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.p$d */
    public static final class C69551d implements FlowCollector<T> {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f173796a;

        /* renamed from: b */
        final /* synthetic */ Function3 f173797b;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
            /*
            // Method dump skipped, instructions count: 103
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69547p.C69551d.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.p$e */
    public static final class C69552e implements FlowCollector<T> {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f173798a;

        /* renamed from: b */
        final /* synthetic */ Function3 f173799b;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
            /*
            // Method dump skipped, instructions count: 112
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69547p.C69552e.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.lang.Object m266941a(kotlinx.coroutines.flow.Flow<? extends T> r4, R r5, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super R> r7) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69547p.m266941a(kotlinx.coroutines.flow.a, java.lang.Object, kotlin.jvm.functions.o, kotlin.coroutines.c):java.lang.Object");
    }
}
