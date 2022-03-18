package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: kotlinx.coroutines.e */
public final class C69388e {
    /* renamed from: a */
    public static final <T> T m266827a(CoroutineContext fVar, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> kVar) {
        return (T) C69389f.m266834a(fVar, kVar);
    }

    /* renamed from: a */
    public static final <T> Object m266829a(CoroutineContext fVar, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> kVar, Continuation<? super T> cVar) {
        return C69553g.m266942a(fVar, kVar, cVar);
    }

    /* renamed from: a */
    public static final <T> Deferred<T> m266830a(CoroutineScope ahVar, CoroutineContext fVar, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> kVar) {
        return C69553g.m266945b(ahVar, fVar, coroutineStart, kVar);
    }

    /* renamed from: b */
    public static final Job m266832b(CoroutineScope ahVar, CoroutineContext fVar, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> kVar) {
        return C69553g.m266943a(ahVar, fVar, coroutineStart, kVar);
    }
}
