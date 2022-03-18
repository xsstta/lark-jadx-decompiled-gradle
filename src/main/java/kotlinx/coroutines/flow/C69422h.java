package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.C69480o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aT\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000126\u0010\u0003\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u001a6\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000b0\r\u001az\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000b0\r28\b\u0004\u0010\u0003\u001a2\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\b¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"distinctUntilChanged", "Lkotlinx/coroutines/flow/Flow;", "T", "areEquivalent", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "distinctUntilChangedBy", "K", "keySelector", "Lkotlin/Function1;", "distinctUntilChangedBy$FlowKt__DistinctKt", "kotlinx-coroutines-core"}, mo238835k = 5, mv = {1, 1, 16}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.h */
final /* synthetic */ class C69422h {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.h$a */
    public static final class C69423a implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173571a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173572b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector bVar, Continuation cVar) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) C69480o.f173673a;
            Object a = this.f173571a.mo242938a(new FlowCollector<T>() {
                /* class kotlinx.coroutines.flow.C69422h.C69423a.C694241 */

                /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Object */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                    // Method dump skipped, instructions count: 123
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69422h.C69423a.C694241.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$2"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.h$b */
    public static final class C69425b implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173576a;

        /* renamed from: b */
        final /* synthetic */ Function1 f173577b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(final FlowCollector bVar, Continuation cVar) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) C69480o.f173673a;
            Object a = this.f173576a.mo242938a(new FlowCollector<T>() {
                /* class kotlinx.coroutines.flow.C69422h.C69425b.C694261 */

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                    // Method dump skipped, instructions count: 129
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69422h.C69425b.C694261.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }, cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.h$c */
    public static final class C69427c implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173581a;

        /* renamed from: b */
        final /* synthetic */ Function1 f173582b;

        /* renamed from: c */
        final /* synthetic */ Function2 f173583c;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(FlowCollector bVar, Continuation cVar) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) C69480o.f173673a;
            Object a = this.f173581a.mo242938a(new C69428a(bVar, objectRef, this), cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__DistinctKt$$special$$inlined$collect$1"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.h$c$a */
        public static final class C69428a implements FlowCollector<T> {

            /* renamed from: a */
            final /* synthetic */ FlowCollector f173584a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f173585b;

            /* renamed from: c */
            final /* synthetic */ C69427c f173586c;

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                // Method dump skipped, instructions count: 131
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69422h.C69427c.C69428a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }

            public C69428a(FlowCollector bVar, Ref.ObjectRef objectRef, C69427c cVar) {
                this.f173584a = bVar;
                this.f173585b = objectRef;
                this.f173586c = cVar;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.h$d */
    public static final class C69429d implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173587a;

        /* renamed from: b */
        final /* synthetic */ Function1 f173588b;

        /* renamed from: c */
        final /* synthetic */ Function2 f173589c;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(FlowCollector bVar, Continuation cVar) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) C69480o.f173673a;
            Object a = this.f173587a.mo242938a(new C69430a(bVar, objectRef, this), cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__DistinctKt$$special$$inlined$collect$2"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.h$d$a */
        public static final class C69430a implements FlowCollector<T> {

            /* renamed from: a */
            final /* synthetic */ FlowCollector f173590a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f173591b;

            /* renamed from: c */
            final /* synthetic */ C69429d f173592c;

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                // Method dump skipped, instructions count: 131
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69422h.C69429d.C69430a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }

            public C69430a(FlowCollector bVar, Ref.ObjectRef objectRef, C69429d dVar) {
                this.f173590a = bVar;
                this.f173591b = objectRef;
                this.f173592c = dVar;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.h$e */
    public static final class C69431e implements Flow<T> {

        /* renamed from: a */
        final /* synthetic */ Flow f173593a;

        /* renamed from: b */
        final /* synthetic */ Function1 f173594b;

        /* renamed from: c */
        final /* synthetic */ Function2 f173595c;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(FlowCollector bVar, Continuation cVar) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) C69480o.f173673a;
            Object a = this.f173593a.mo242938a(new C69432a(bVar, objectRef, this), cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__DistinctKt$$special$$inlined$collect$3"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlinx.coroutines.flow.h$e$a */
        public static final class C69432a implements FlowCollector<T> {

            /* renamed from: a */
            final /* synthetic */ FlowCollector f173596a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f173597b;

            /* renamed from: c */
            final /* synthetic */ C69431e f173598c;

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                // Method dump skipped, instructions count: 131
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C69422h.C69431e.C69432a.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }

            public C69432a(FlowCollector bVar, Ref.ObjectRef objectRef, C69431e eVar) {
                this.f173596a = bVar;
                this.f173597b = objectRef;
                this.f173598c = eVar;
            }
        }
    }
}
