package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ThreadContextElement;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0004¢\u0006\u0002\n\u0000\" \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"ZERO", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "restoreState", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.af */
public final class C69558af {

    /* renamed from: a */
    private static final Symbol f173809a = new Symbol("ZERO");

    /* renamed from: b */
    private static final Function2<Object, CoroutineContext.Element, Object> f173810b = C69559a.INSTANCE;

    /* renamed from: c */
    private static final Function2<ThreadContextElement<?>, CoroutineContext.Element, ThreadContextElement<?>> f173811c = C69560b.INSTANCE;

    /* renamed from: d */
    private static final Function2<ThreadState, CoroutineContext.Element, ThreadState> f173812d = C69562d.INSTANCE;

    /* renamed from: e */
    private static final Function2<ThreadState, CoroutineContext.Element, ThreadState> f173813e = C69561c.INSTANCE;

    /* renamed from: a */
    public static final Object m266978a(CoroutineContext fVar) {
        Object fold = fVar.fold(0, f173810b);
        if (fold == null) {
            Intrinsics.throwNpe();
        }
        return fold;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "", "countOrElement", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.internal.af$a */
    static final class C69559a extends Lambda implements Function2<Object, CoroutineContext.Element, Object> {
        public static final C69559a INSTANCE = new C69559a();

        C69559a() {
            super(2);
        }

        public final Object invoke(Object obj, CoroutineContext.Element bVar) {
            int i;
            if (!(bVar instanceof ThreadContextElement)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            if (i == 0) {
                return bVar;
            }
            return Integer.valueOf(i + 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/ThreadContextElement;", "found", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.internal.af$b */
    static final class C69560b extends Lambda implements Function2<ThreadContextElement<?>, CoroutineContext.Element, ThreadContextElement<?>> {
        public static final C69560b INSTANCE = new C69560b();

        C69560b() {
            super(2);
        }

        public final ThreadContextElement<?> invoke(ThreadContextElement<?> csVar, CoroutineContext.Element bVar) {
            if (csVar != null) {
                return csVar;
            }
            if (!(bVar instanceof ThreadContextElement)) {
                bVar = null;
            }
            return (ThreadContextElement) bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/internal/ThreadState;", "state", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.internal.af$c */
    static final class C69561c extends Lambda implements Function2<ThreadState, CoroutineContext.Element, ThreadState> {
        public static final C69561c INSTANCE = new C69561c();

        C69561c() {
            super(2);
        }

        public final ThreadState invoke(ThreadState aiVar, CoroutineContext.Element bVar) {
            if (bVar instanceof ThreadContextElement) {
                ((ThreadContextElement) bVar).mo242645a(aiVar.mo242978c(), aiVar.mo242975a());
            }
            return aiVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/internal/ThreadState;", "state", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.internal.af$d */
    static final class C69562d extends Lambda implements Function2<ThreadState, CoroutineContext.Element, ThreadState> {
        public static final C69562d INSTANCE = new C69562d();

        C69562d() {
            super(2);
        }

        public final ThreadState invoke(ThreadState aiVar, CoroutineContext.Element bVar) {
            if (bVar instanceof ThreadContextElement) {
                aiVar.mo242976a(((ThreadContextElement) bVar).mo242647b(aiVar.mo242978c()));
            }
            return aiVar;
        }
    }

    /* renamed from: a */
    public static final Object m266979a(CoroutineContext fVar, Object obj) {
        if (obj == null) {
            obj = m266978a(fVar);
        }
        if (obj == 0) {
            return f173809a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new ThreadState(fVar, ((Number) obj).intValue()), f173812d);
        }
        if (obj != null) {
            return ((ThreadContextElement) obj).mo242647b(fVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    /* renamed from: b */
    public static final void m266980b(CoroutineContext fVar, Object obj) {
        if (obj != f173809a) {
            if (obj instanceof ThreadState) {
                ((ThreadState) obj).mo242977b();
                fVar.fold(obj, f173813e);
                return;
            }
            Object fold = fVar.fold(null, f173811c);
            if (fold != null) {
                ((ThreadContextElement) fold).mo242645a(fVar, obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }
}
