package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.coroutines.f */
public interface CoroutineContext {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.coroutines.f$c */
    public interface Key<E extends Element> {
    }

    <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> kVar);

    <E extends Element> E get(Key<E> cVar);

    CoroutineContext minusKey(Key<?> cVar);

    CoroutineContext plus(CoroutineContext fVar);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.coroutines.f$b */
    public interface Element extends CoroutineContext {
        @Override // kotlin.coroutines.CoroutineContext
        <E extends Element> E get(Key<E> cVar);

        Key<?> getKey();

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: kotlin.coroutines.f$b$a */
        public static final class C69085a {
            /* renamed from: a */
            public static CoroutineContext m265822a(Element bVar, CoroutineContext fVar) {
                Intrinsics.checkParameterIsNotNull(fVar, "context");
                return C69083a.m265819a(bVar, fVar);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.f$b */
            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public static <E extends Element> E m265821a(Element bVar, Key<E> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "key");
                if (!Intrinsics.areEqual(bVar.getKey(), cVar)) {
                    return null;
                }
                if (bVar != 0) {
                    return bVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }

            /* renamed from: b */
            public static CoroutineContext m265823b(Element bVar, Key<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "key");
                boolean areEqual = Intrinsics.areEqual(bVar.getKey(), cVar);
                CoroutineContext fVar = bVar;
                if (areEqual) {
                    fVar = EmptyCoroutineContext.INSTANCE;
                }
                return fVar;
            }

            /* renamed from: a */
            public static <R> R m265820a(Element bVar, R r, Function2<? super R, ? super Element, ? extends R> kVar) {
                Intrinsics.checkParameterIsNotNull(kVar, "operation");
                return (R) kVar.invoke(r, bVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.coroutines.f$a */
    public static final class C69083a {
        /* renamed from: a */
        public static CoroutineContext m265819a(CoroutineContext fVar, CoroutineContext fVar2) {
            Intrinsics.checkParameterIsNotNull(fVar2, "context");
            if (fVar2 == EmptyCoroutineContext.INSTANCE) {
                return fVar;
            }
            return (CoroutineContext) fVar2.fold(fVar, C69084a.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: kotlin.coroutines.f$a$a */
        public static final class C69084a extends Lambda implements Function2<CoroutineContext, Element, CoroutineContext> {
            public static final C69084a INSTANCE = new C69084a();

            C69084a() {
                super(2);
            }

            public final CoroutineContext invoke(CoroutineContext fVar, Element bVar) {
                CombinedContext combinedContext;
                Intrinsics.checkParameterIsNotNull(fVar, "acc");
                Intrinsics.checkParameterIsNotNull(bVar, "element");
                CoroutineContext minusKey = fVar.minusKey(bVar.getKey());
                if (minusKey == EmptyCoroutineContext.INSTANCE) {
                    return bVar;
                }
                ContinuationInterceptor dVar = (ContinuationInterceptor) minusKey.get(ContinuationInterceptor.f173125b);
                if (dVar == null) {
                    combinedContext = new CombinedContext(minusKey, bVar);
                } else {
                    CoroutineContext minusKey2 = minusKey.minusKey(ContinuationInterceptor.f173125b);
                    if (minusKey2 == EmptyCoroutineContext.INSTANCE) {
                        combinedContext = new CombinedContext(bVar, dVar);
                    } else {
                        combinedContext = new CombinedContext(new CombinedContext(minusKey2, bVar), dVar);
                    }
                }
                return combinedContext;
            }
        }
    }
}
