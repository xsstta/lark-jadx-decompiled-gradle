package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"iterator", "", "T", "Ljava/util/Enumeration;", "kotlin-stdlib"}, mo238835k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.o */
class C69052o extends CollectionsKt__IterablesKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlin/collections/CollectionsKt__IteratorsJVMKt$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.collections.o$a */
    public static final class C69053a implements Iterator<T>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ Enumeration f173088a;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            return this.f173088a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.f173088a.nextElement();
        }

        C69053a(Enumeration<T> enumeration) {
            this.f173088a = enumeration;
        }
    }

    public static final <T> Iterator<T> iterator(Enumeration<T> enumeration) {
        Intrinsics.checkParameterIsNotNull(enumeration, "$this$iterator");
        return new C69053a(enumeration);
    }
}
