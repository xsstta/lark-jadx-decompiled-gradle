package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/ThreadContextElement;", "S", "Lkotlin/coroutines/CoroutineContext$Element;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.cs */
public interface ThreadContextElement<S> extends CoroutineContext.Element {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.cs$a */
    public static final class C69385a {
        /* renamed from: a */
        public static <S, R> R m266798a(ThreadContextElement<S> csVar, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> kVar) {
            return (R) CoroutineContext.Element.C69085a.m265820a(csVar, r, kVar);
        }

        /* renamed from: a */
        public static <S, E extends CoroutineContext.Element> E m266799a(ThreadContextElement<S> csVar, CoroutineContext.Key<E> cVar) {
            return (E) CoroutineContext.Element.C69085a.m265821a(csVar, cVar);
        }

        /* renamed from: a */
        public static <S> CoroutineContext m266800a(ThreadContextElement<S> csVar, CoroutineContext fVar) {
            return CoroutineContext.Element.C69085a.m265822a(csVar, fVar);
        }

        /* renamed from: b */
        public static <S> CoroutineContext m266801b(ThreadContextElement<S> csVar, CoroutineContext.Key<?> cVar) {
            return CoroutineContext.Element.C69085a.m265823b(csVar, cVar);
        }
    }

    /* renamed from: a */
    void mo242645a(CoroutineContext fVar, S s);

    /* renamed from: b */
    S mo242647b(CoroutineContext fVar);
}
