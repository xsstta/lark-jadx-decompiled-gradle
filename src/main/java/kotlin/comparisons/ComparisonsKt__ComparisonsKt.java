package kotlin.comparisons;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001aY\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\t\u001aW\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001a;\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001aW\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001a-\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u000f\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0010\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0011\u001a>\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b¢\u0006\u0002\u0010\u0013\u001aY\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0014\u001aZ\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022 \u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001a&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a-\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\b\u001a@\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a-\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\b\u001a@\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a0\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\u001aO\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0004\u001aO\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001ak\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001aO\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001ak\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001am\u0010!\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u000328\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000e0#H\b\u001aO\u0010&\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0004¨\u0006'"}, d2 = {"compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", AbstractC60044a.f149675a, C63954b.f161494a, "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thenDescending", "kotlin-stdlib"}, mo238835k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/comparisons/ComparisonsKt")
class ComparisonsKt__ComparisonsKt {
    public static final <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        NaturalOrderComparator cVar = NaturalOrderComparator.f173120a;
        if (cVar != null) {
            return cVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    }

    private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst() {
        return ComparisonsKt.nullsFirst(ComparisonsKt.naturalOrder());
    }

    private static final <T extends Comparable<? super T>> Comparator<T> nullsLast() {
        return ComparisonsKt.nullsLast(ComparisonsKt.naturalOrder());
    }

    public static final <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        ReverseOrderComparator dVar = ReverseOrderComparator.f173121a;
        if (dVar != null) {
            return dVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    }

    private static final <T> Comparator<T> compareBy(Function1<? super T, ? extends Comparable<?>> function1) {
        return new C69060b(function1);
    }

    private static final <T> Comparator<T> compareByDescending(Function1<? super T, ? extends Comparable<?>> function1) {
        return new C69062d(function1);
    }

    public static final <T> Comparator<T> nullsFirst(Comparator<? super T> comparator) {
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return new C69064f(comparator);
    }

    public static final <T> Comparator<T> nullsLast(Comparator<? super T> comparator) {
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return new C69065g(comparator);
    }

    public static final <T> Comparator<T> compareBy(Function1<? super T, ? extends Comparable<?>>... function1Arr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(function1Arr, "selectors");
        if (function1Arr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C69059a(function1Arr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final <T> Comparator<T> reversed(Comparator<T> comparator) {
        Intrinsics.checkParameterIsNotNull(comparator, "$this$reversed");
        if (comparator instanceof ReversedComparator) {
            return ((ReversedComparator) comparator).mo239131a();
        }
        if (Intrinsics.areEqual(comparator, NaturalOrderComparator.f173120a)) {
            ReverseOrderComparator dVar = ReverseOrderComparator.f173121a;
            if (dVar != null) {
                return dVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        } else if (!Intrinsics.areEqual(comparator, ReverseOrderComparator.f173121a)) {
            return new ReversedComparator(comparator);
        } else {
            NaturalOrderComparator cVar = NaturalOrderComparator.f173120a;
            if (cVar != null) {
                return cVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$a */
    static final class C69059a<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Function1[] f173095a;

        C69059a(Function1[] function1Arr) {
            this.f173095a = function1Arr;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValuesByImpl$ComparisonsKt__ComparisonsKt(t, t2, this.f173095a);
        }
    }

    private static final <T, K> Comparator<T> compareBy(Comparator<? super K> comparator, Function1<? super T, ? extends K> function1) {
        return new C69061c(comparator, function1);
    }

    private static final <T, K> Comparator<T> compareByDescending(Comparator<? super K> comparator, Function1<? super T, ? extends K> function1) {
        return new C69063e(comparator, function1);
    }

    private static final <T> Comparator<T> thenComparator(Comparator<T> comparator, Function2<? super T, ? super T, Integer> kVar) {
        return new C69071m(comparator, kVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$h */
    static final class C69066h<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173104a;

        /* renamed from: b */
        final /* synthetic */ Comparator f173105b;

        C69066h(Comparator comparator, Comparator comparator2) {
            this.f173104a = comparator;
            this.f173105b = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f173104a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return this.f173105b.compare(t, t2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$n */
    static final class C69072n<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173118a;

        /* renamed from: b */
        final /* synthetic */ Comparator f173119b;

        C69072n(Comparator comparator, Comparator comparator2) {
            this.f173118a = comparator;
            this.f173119b = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f173118a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return this.f173119b.compare(t2, t);
        }
    }

    private static final <T> Comparator<T> thenBy(Comparator<T> comparator, Function1<? super T, ? extends Comparable<?>> function1) {
        return new C69067i(comparator, function1);
    }

    private static final <T> Comparator<T> thenByDescending(Comparator<T> comparator, Function1<? super T, ? extends Comparable<?>> function1) {
        return new C69069k(comparator, function1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$b */
    public static final class C69060b<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Function1 f173096a;

        public C69060b(Function1 function1) {
            this.f173096a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues((Comparable) this.f173096a.invoke(t), (Comparable) this.f173096a.invoke(t2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$c */
    public static final class C69061c<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173097a;

        /* renamed from: b */
        final /* synthetic */ Function1 f173098b;

        public C69061c(Comparator comparator, Function1 function1) {
            this.f173097a = comparator;
            this.f173098b = function1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Comparator */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return this.f173097a.compare(this.f173098b.invoke(t), this.f173098b.invoke(t2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$d */
    public static final class C69062d<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Function1 f173099a;

        public C69062d(Function1 function1) {
            this.f173099a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues((Comparable) this.f173099a.invoke(t2), (Comparable) this.f173099a.invoke(t));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$e */
    public static final class C69063e<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173100a;

        /* renamed from: b */
        final /* synthetic */ Function1 f173101b;

        public C69063e(Comparator comparator, Function1 function1) {
            this.f173100a = comparator;
            this.f173101b = function1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Comparator */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return this.f173100a.compare(this.f173101b.invoke(t2), this.f173101b.invoke(t));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "", AbstractC60044a.f149675a, C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$f */
    static final class C69064f<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173102a;

        C69064f(Comparator comparator) {
            this.f173102a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return -1;
            }
            if (t2 == null) {
                return 1;
            }
            return this.f173102a.compare(t, t2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "", AbstractC60044a.f149675a, C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$g */
    static final class C69065g<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173103a;

        C69065g(Comparator comparator) {
            this.f173103a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return 1;
            }
            if (t2 == null) {
                return -1;
            }
            return this.f173103a.compare(t, t2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$i */
    public static final class C69067i<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173106a;

        /* renamed from: b */
        final /* synthetic */ Function1 f173107b;

        public C69067i(Comparator comparator, Function1 function1) {
            this.f173106a = comparator;
            this.f173107b = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f173106a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return ComparisonsKt.compareValues((Comparable) this.f173107b.invoke(t), (Comparable) this.f173107b.invoke(t2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$j */
    public static final class C69068j<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173108a;

        /* renamed from: b */
        final /* synthetic */ Comparator f173109b;

        /* renamed from: c */
        final /* synthetic */ Function1 f173110c;

        public C69068j(Comparator comparator, Comparator comparator2, Function1 function1) {
            this.f173108a = comparator;
            this.f173109b = comparator2;
            this.f173110c = function1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.Comparator */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f173108a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return this.f173109b.compare(this.f173110c.invoke(t), this.f173110c.invoke(t2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$k */
    public static final class C69069k<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173111a;

        /* renamed from: b */
        final /* synthetic */ Function1 f173112b;

        public C69069k(Comparator comparator, Function1 function1) {
            this.f173111a = comparator;
            this.f173112b = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f173111a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return ComparisonsKt.compareValues((Comparable) this.f173112b.invoke(t2), (Comparable) this.f173112b.invoke(t));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$l */
    public static final class C69070l<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173113a;

        /* renamed from: b */
        final /* synthetic */ Comparator f173114b;

        /* renamed from: c */
        final /* synthetic */ Function1 f173115c;

        public C69070l(Comparator comparator, Comparator comparator2, Function1 function1) {
            this.f173113a = comparator;
            this.f173114b = comparator2;
            this.f173115c = function1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.Comparator */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f173113a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return this.f173114b.compare(this.f173115c.invoke(t2), this.f173115c.invoke(t));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$m */
    public static final class C69071m<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f173116a;

        /* renamed from: b */
        final /* synthetic */ Function2 f173117b;

        public C69071m(Comparator comparator, Function2 kVar) {
            this.f173116a = comparator;
            this.f173117b = kVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f173116a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return ((Number) this.f173117b.invoke(t, t2)).intValue();
        }
    }

    public static final <T extends Comparable<?>> int compareValues(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final <T> Comparator<T> then(Comparator<T> comparator, Comparator<? super T> comparator2) {
        Intrinsics.checkParameterIsNotNull(comparator, "$this$then");
        Intrinsics.checkParameterIsNotNull(comparator2, "comparator");
        return new C69066h(comparator, comparator2);
    }

    public static final <T> Comparator<T> thenDescending(Comparator<T> comparator, Comparator<? super T> comparator2) {
        Intrinsics.checkParameterIsNotNull(comparator, "$this$thenDescending");
        Intrinsics.checkParameterIsNotNull(comparator2, "comparator");
        return new C69072n(comparator, comparator2);
    }

    private static final <T, K> Comparator<T> thenBy(Comparator<T> comparator, Comparator<? super K> comparator2, Function1<? super T, ? extends K> function1) {
        return new C69068j(comparator, comparator2, function1);
    }

    private static final <T, K> Comparator<T> thenByDescending(Comparator<T> comparator, Comparator<? super K> comparator2, Function1<? super T, ? extends K> function1) {
        return new C69070l(comparator, comparator2, function1);
    }

    private static final <T> int compareValuesBy(T t, T t2, Function1<? super T, ? extends Comparable<?>> function1) {
        return ComparisonsKt.compareValues((Comparable) function1.invoke(t), (Comparable) function1.invoke(t2));
    }

    public static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T t, T t2, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int compareValues = ComparisonsKt.compareValues((Comparable) function1.invoke(t), (Comparable) function1.invoke(t2));
            if (compareValues != 0) {
                return compareValues;
            }
        }
        return 0;
    }

    public static final <T> int compareValuesBy(T t, T t2, Function1<? super T, ? extends Comparable<?>>... function1Arr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(function1Arr, "selectors");
        if (function1Arr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return compareValuesByImpl$ComparisonsKt__ComparisonsKt(t, t2, function1Arr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final <T, K> int compareValuesBy(T t, T t2, Comparator<? super K> comparator, Function1<? super T, ? extends K> function1) {
        return comparator.compare((Object) function1.invoke(t), (Object) function1.invoke(t2));
    }
}
