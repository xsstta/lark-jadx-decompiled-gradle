package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/DownstreamExceptionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "e", "", "(Ljava/lang/Throwable;)V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Key", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.flow.internal.g */
public final class DownstreamExceptionElement implements CoroutineContext.Element {

    /* renamed from: b */
    public static final Key f173667b = new Key(null);

    /* renamed from: a */
    public final Throwable f173668a;

    /* renamed from: c */
    private final CoroutineContext.Key<?> f173669c = f173667b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/internal/DownstreamExceptionElement$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/flow/internal/DownstreamExceptionElement;", "()V", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.internal.g$a */
    public static final class Key implements CoroutineContext.Key<DownstreamExceptionElement> {
        private Key() {
        }

        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return this.f173669c;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> cVar) {
        return (E) CoroutineContext.Element.C69085a.m265821a(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> cVar) {
        return CoroutineContext.Element.C69085a.m265823b(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext fVar) {
        return CoroutineContext.Element.C69085a.m265822a(this, fVar);
    }

    public DownstreamExceptionElement(Throwable th) {
        this.f173668a = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> kVar) {
        return (R) CoroutineContext.Element.C69085a.m265820a(this, r, kVar);
    }
}
