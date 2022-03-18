package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0012\u0004\u0012\u0002H\u00030\u0004B8\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0002\b\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", "B", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "baseKey", "safeCast", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V", "topmostKey", "isSubKey", "", "key", "isSubKey$kotlin_stdlib", "tryCast", "tryCast$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.coroutines.b */
public abstract class AbstractCoroutineContextKey<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.Key<E> {

    /* renamed from: a */
    private final CoroutineContext.Key<?> f173123a;

    /* renamed from: b */
    private final Function1<CoroutineContext.Element, E> f173124b;

    /* renamed from: a */
    public final E mo239147a(CoroutineContext.Element bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "element");
        return this.f173124b.invoke(bVar);
    }

    /* renamed from: a */
    public final boolean mo239148a(CoroutineContext.Key<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        if (cVar == this || this.f173123a == cVar) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: kotlin.coroutines.f$c<?> */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1<kotlin.coroutines.f$b, E extends B>, kotlin.jvm.functions.Function1<? super kotlin.coroutines.f$b, ? extends E extends B>, java.lang.Object] */
    public AbstractCoroutineContextKey(CoroutineContext.Key<B> cVar, Function1<? super CoroutineContext.Element, ? extends E> function1) {
        Intrinsics.checkParameterIsNotNull(cVar, "baseKey");
        Intrinsics.checkParameterIsNotNull(function1, "safeCast");
        this.f173124b = function1;
        this.f173123a = cVar instanceof AbstractCoroutineContextKey ? (CoroutineContext.Key<B>) ((AbstractCoroutineContextKey) cVar).f173123a : cVar;
    }
}
