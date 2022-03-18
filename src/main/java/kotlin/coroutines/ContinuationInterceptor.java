package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.coroutines.d */
public interface ContinuationInterceptor extends CoroutineContext.Element {

    /* renamed from: b */
    public static final Key f173125b = Key.f173126a;

    /* renamed from: a */
    <T> Continuation<T> mo239151a(Continuation<? super T> cVar);

    /* renamed from: b */
    void mo239152b(Continuation<?> cVar);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.coroutines.d$b */
    public static final class Key implements CoroutineContext.Key<ContinuationInterceptor> {

        /* renamed from: a */
        static final /* synthetic */ Key f173126a = new Key();

        private Key() {
        }
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.coroutines.d$a */
    public static final class C69077a {
        /* renamed from: a */
        public static <E extends CoroutineContext.Element> E m265811a(ContinuationInterceptor dVar, CoroutineContext.Key<E> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "key");
            if (cVar instanceof AbstractCoroutineContextKey) {
                AbstractCoroutineContextKey bVar = (AbstractCoroutineContextKey) cVar;
                if (!bVar.mo239148a(dVar.getKey())) {
                    return null;
                }
                E e = (E) bVar.mo239147a(dVar);
                if (!(e instanceof CoroutineContext.Element)) {
                    return null;
                }
                return e;
            } else if (ContinuationInterceptor.f173125b != cVar) {
                return null;
            } else {
                if (dVar != null) {
                    return dVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }
        }

        /* renamed from: b */
        public static CoroutineContext m265812b(ContinuationInterceptor dVar, CoroutineContext.Key<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "key");
            if (cVar instanceof AbstractCoroutineContextKey) {
                AbstractCoroutineContextKey bVar = (AbstractCoroutineContextKey) cVar;
                boolean a = bVar.mo239148a(dVar.getKey());
                CoroutineContext fVar = dVar;
                if (a) {
                    CoroutineContext.Element a2 = bVar.mo239147a(dVar);
                    fVar = dVar;
                    if (a2 != null) {
                        fVar = EmptyCoroutineContext.INSTANCE;
                    }
                }
                return fVar;
            }
            CoroutineContext fVar2 = dVar;
            if (ContinuationInterceptor.f173125b == cVar) {
                fVar2 = EmptyCoroutineContext.INSTANCE;
            }
            return fVar2;
        }
    }
}
