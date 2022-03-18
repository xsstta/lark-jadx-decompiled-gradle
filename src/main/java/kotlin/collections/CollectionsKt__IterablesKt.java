package kotlin.collections;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a \u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a,\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a\u001d\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0002¢\u0006\u0002\b\u0013\u001a@\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u00100\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0016*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00160\u00150\u0001¨\u0006\u0017"}, d2 = {"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", "default", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "convertToSetForSetOperation", "", "convertToSetForSetOperationWith", ShareHitPoint.f121868c, "flatten", "", "safeToConvertToSet", "", "safeToConvertToSet$CollectionsKt__IterablesKt", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, mo238835k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.collections.CollectionsKt__IterablesKt$a */
    public static final class C69032a implements Iterable<T>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ Function0 f173053a;

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return (Iterator) this.f173053a.invoke();
        }

        public C69032a(Function0 function0) {
            this.f173053a = function0;
        }
    }

    private static final <T> Iterable<T> Iterable(Function0<? extends Iterator<? extends T>> function0) {
        return new C69032a(function0);
    }

    private static final <T> boolean safeToConvertToSet$CollectionsKt__IterablesKt(Collection<? extends T> collection) {
        if (collection.size() <= 2 || !(collection instanceof ArrayList)) {
            return false;
        }
        return true;
    }

    public static final <T> Integer collectionSizeOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "$this$collectionSizeOrNull");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static final <T> Collection<T> convertToSetForSetOperation(Iterable<? extends T> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "$this$convertToSetForSetOperation");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return CollectionsKt.toHashSet(iterable);
        }
        Collection<T> collection = (Collection) iterable;
        if (safeToConvertToSet$CollectionsKt__IterablesKt(collection)) {
            return CollectionsKt.toHashSet(iterable);
        }
        return collection;
    }

    public static final <T> List<T> flatten(Iterable<? extends Iterable<? extends T>> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "$this$flatten");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "$this$unzip");
        int collectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator<? extends Pair<? extends T, ? extends R>> it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }

    public static final <T> int collectionSizeOrDefault(Iterable<? extends T> iterable, int i) {
        Intrinsics.checkParameterIsNotNull(iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    public static final <T> Collection<T> convertToSetForSetOperationWith(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Intrinsics.checkParameterIsNotNull(iterable, "$this$convertToSetForSetOperationWith");
        Intrinsics.checkParameterIsNotNull(iterable2, ShareHitPoint.f121868c);
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return CollectionsKt.toHashSet(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        if (safeToConvertToSet$CollectionsKt__IterablesKt(collection)) {
            return CollectionsKt.toHashSet(iterable);
        }
        return collection;
    }
}
