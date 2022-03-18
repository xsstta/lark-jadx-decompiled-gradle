package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C69115b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C69294l;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* renamed from: kotlin.collections.l */
class C69048l extends C69046k {
    /* renamed from: b */
    public static final <T> boolean m265767b(T[] tArr, T t) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$contains");
        return C69043h.m265770c(tArr, t) >= 0;
    }

    /* renamed from: a */
    public static final boolean m265750a(int[] iArr, int i) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$contains");
        return C69043h.m265769c(iArr, i) >= 0;
    }

    /* renamed from: a */
    public static final boolean m265751a(boolean[] zArr, boolean z) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$contains");
        return C69043h.m265755b(zArr, z) >= 0;
    }

    /* renamed from: a */
    public static final boolean m265749a(char[] cArr, char c) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$contains");
        return C69043h.m265753b(cArr, c) >= 0;
    }

    /* renamed from: b */
    public static final <T> List<T> m265763b(T[] tArr, int i) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$takeLast");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt.emptyList();
        } else {
            int length = tArr.length;
            if (i >= length) {
                return C69043h.m265786k(tArr);
            }
            if (i == 1) {
                return CollectionsKt.listOf(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(tArr[i2]);
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static final List<Boolean> m265748a(boolean[] zArr, int i) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$takeLast");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt.emptyList();
        } else {
            int length = zArr.length;
            if (i >= length) {
                return C69043h.m265747a(zArr);
            }
            if (i == 1) {
                return CollectionsKt.listOf(Boolean.valueOf(zArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(Boolean.valueOf(zArr[i2]));
            }
            return arrayList;
        }
    }

    /* renamed from: b */
    public static final <T> T[] m265768b(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$sortedArrayWith");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkExpressionValueIsNotNull(tArr2, "java.util.Arrays.copyOf(this, size)");
        C69043h.m265720a((Object[]) tArr2, (Comparator) comparator);
        return tArr2;
    }

    /* renamed from: a */
    public static final int[] m265752a(Integer[] numArr) {
        Intrinsics.checkParameterIsNotNull(numArr, "$this$toIntArray");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: a */
    public static final List<Short> m265746a(short[] sArr) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$toList");
        int length = sArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length != 1) {
            return C69043h.m265765b(sArr);
        }
        return CollectionsKt.listOf(Short.valueOf(sArr[0]));
    }

    /* renamed from: a */
    public static final List<Long> m265744a(long[] jArr) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$toList");
        int length = jArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length != 1) {
            return C69043h.m265762b(jArr);
        }
        return CollectionsKt.listOf(Long.valueOf(jArr[0]));
    }

    /* renamed from: b */
    public static final List<Float> m265761b(float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$toList");
        int length = fArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length != 1) {
            return C69043h.m265773c(fArr);
        }
        return CollectionsKt.listOf(Float.valueOf(fArr[0]));
    }

    /* renamed from: a */
    public static final List<Double> m265743a(double[] dArr) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$toList");
        int length = dArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length != 1) {
            return C69043h.m265760b(dArr);
        }
        return CollectionsKt.listOf(Double.valueOf(dArr[0]));
    }

    /* renamed from: a */
    public static final List<Boolean> m265747a(boolean[] zArr) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$toList");
        int length = zArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length != 1) {
            return C69043h.m265766b(zArr);
        }
        return CollectionsKt.listOf(Boolean.valueOf(zArr[0]));
    }

    /* renamed from: b */
    public static final List<Short> m265765b(short[] sArr) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List<Long> m265762b(long[] jArr) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List<Boolean> m265766b(boolean[] zArr) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final <T, R> List<R> m265745a(T[] tArr, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$map");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(function1.invoke(t));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final <T, R> List<Pair<T, R>> m265764b(T[] tArr, R[] rArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$zip");
        Intrinsics.checkParameterIsNotNull(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(TuplesKt.to(tArr[i], rArr[i]));
        }
        return arrayList;
    }

    /* renamed from: kotlin.collections.l$a */
    public static final class C69049a implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f173087a;

        @Override // kotlin.sequences.Sequence
        /* renamed from: a */
        public Iterator<T> mo4717a() {
            return C69115b.m265959a(this.f173087a);
        }

        public C69049a(Object[] objArr) {
            this.f173087a = objArr;
        }
    }

    /* renamed from: kotlin.collections.l$b */
    static final class C69050b extends Lambda implements Function0<Iterator<? extends T>> {
        final /* synthetic */ Object[] $this_withIndex;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69050b(Object[] objArr) {
            super(0);
            this.$this_withIndex = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<T> invoke() {
            return C69115b.m265959a(this.$this_withIndex);
        }
    }

    /* renamed from: a */
    public static final int m265736a(float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$lastIndex");
        return fArr.length - 1;
    }

    /* renamed from: b */
    public static final int m265754b(int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$lastIndex");
        return iArr.length - 1;
    }

    /* renamed from: g */
    public static final <T> T m265782g(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: i */
    public static final <T> int m265784i(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    /* renamed from: o */
    public static final <T> List<T> m265790o(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$distinct");
        return CollectionsKt.toList(C69043h.m265791p(tArr));
    }

    /* renamed from: e */
    public static final <T> T m265780e(T[] tArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(tArr, "$this$last");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[C69043h.m265784i(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: h */
    public static final <T> List<T> m265783h(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$filterNotNull");
        return (List) C69043h.m265741a((Object[]) tArr, (Collection) new ArrayList());
    }

    /* renamed from: j */
    public static final <T> HashSet<T> m265785j(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$toHashSet");
        return (HashSet) C69043h.m265757b((Object[]) tArr, (Collection) new HashSet(MapsKt.mapCapacity(tArr.length)));
    }

    /* renamed from: k */
    public static final <T> List<T> m265786k(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length != 1) {
            return C69043h.m265787l(tArr);
        }
        return CollectionsKt.listOf(tArr[0]);
    }

    /* renamed from: l */
    public static final <T> List<T> m265787l(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$toMutableList");
        return new ArrayList(CollectionsKt.asCollection(tArr));
    }

    /* renamed from: n */
    public static final <T> Iterable<IndexedValue<T>> m265789n(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$withIndex");
        return new IndexingIterable(new C69050b(tArr));
    }

    /* renamed from: p */
    public static final <T> Set<T> m265791p(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$toMutableSet");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(tArr.length));
        for (T t : tArr) {
            linkedHashSet.add(t);
        }
        return linkedHashSet;
    }

    /* renamed from: q */
    public static final <T> Sequence<T> m265792q(T[] tArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(tArr, "$this$asSequence");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C69294l.m266114a();
        }
        return new C69049a(tArr);
    }

    /* renamed from: a */
    public static final char m265735a(char[] cArr) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: d */
    public static final Float m265777d(float[] fArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(fArr, "$this$min");
        int i = 1;
        if (fArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        float f = fArr[0];
        if (Float.isNaN(f)) {
            return Float.valueOf(f);
        }
        int a = C69043h.m265736a(fArr);
        if (1 <= a) {
            while (true) {
                float f2 = fArr[i];
                if (!Float.isNaN(f2)) {
                    if (f > f2) {
                        f = f2;
                    }
                    if (i == a) {
                        break;
                    }
                    i++;
                } else {
                    return Float.valueOf(f2);
                }
            }
        }
        return Float.valueOf(f);
    }

    /* renamed from: f */
    public static final <T> T m265781f(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$single");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: m */
    public static final <T> Set<T> m265788m(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            return am.m265687a();
        }
        if (length != 1) {
            return (Set) C69043h.m265757b((Object[]) tArr, (Collection) new LinkedHashSet(MapsKt.mapCapacity(tArr.length)));
        }
        return am.m265686a((Object) tArr[0]);
    }

    /* renamed from: c */
    public static final <T> T m265771c(T[] tArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(tArr, "$this$first");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: d */
    public static final <T> T m265778d(T[] tArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(tArr, "$this$firstOrNull");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public static final List<Character> m265772c(char[] cArr) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final List<Integer> m265779d(int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List<Byte> m265758b(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final List<Float> m265773c(float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List<Character> m265759b(char[] cArr) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$toList");
        int length = cArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length != 1) {
            return C69043h.m265772c(cArr);
        }
        return CollectionsKt.listOf(Character.valueOf(cArr[0]));
    }

    /* renamed from: c */
    public static final List<Integer> m265774c(int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$toList");
        int length = iArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length != 1) {
            return C69043h.m265779d(iArr);
        }
        return CollectionsKt.listOf(Integer.valueOf(iArr[0]));
    }

    /* renamed from: a */
    public static final List<Byte> m265742a(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$toList");
        int length = bArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length != 1) {
            return C69043h.m265758b(bArr);
        }
        return CollectionsKt.listOf(Byte.valueOf(bArr[0]));
    }

    /* renamed from: b */
    public static final List<Double> m265760b(double[] dArr) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final <T> T m265738a(T[] tArr, int i) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$getOrNull");
        if (i < 0 || i > C69043h.m265784i(tArr)) {
            return null;
        }
        return tArr[i];
    }

    /* renamed from: b */
    public static final int m265753b(char[] cArr, char c) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$indexOf");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static final int m265769c(int[] iArr, int i) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$indexOf");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static final int m265776d(int[] iArr, int i) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$lastIndexOf");
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (i == iArr[length]) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final int m265755b(boolean[] zArr, boolean z) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$indexOf");
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (z == zArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static final <T> int m265770c(T[] tArr, T t) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (Intrinsics.areEqual((Object) t, (Object) tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public static final Integer m265756b(int[] iArr, int i) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$getOrNull");
        if (i < 0 || i > C69043h.m265754b(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* renamed from: b */
    public static final <T, C extends Collection<? super T>> C m265757b(T[] tArr, C c) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$toCollection");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m265741a(T[] tArr, C c) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$filterNotNullTo");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: c */
    public static final <T> List<T> m265775c(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$sortedWith");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return C69043h.m265716a(C69043h.m265768b((Object[]) tArr, (Comparator) comparator));
    }

    /* renamed from: a */
    public static final <T> String m265739a(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$joinToString");
        Intrinsics.checkParameterIsNotNull(charSequence, "separator");
        Intrinsics.checkParameterIsNotNull(charSequence2, "prefix");
        Intrinsics.checkParameterIsNotNull(charSequence3, "postfix");
        Intrinsics.checkParameterIsNotNull(charSequence4, "truncated");
        String sb = ((StringBuilder) C69043h.m265737a(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
        Intrinsics.checkExpressionValueIsNotNull(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m265737a(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$joinTo");
        Intrinsics.checkParameterIsNotNull(a, "buffer");
        Intrinsics.checkParameterIsNotNull(charSequence, "separator");
        Intrinsics.checkParameterIsNotNull(charSequence2, "prefix");
        Intrinsics.checkParameterIsNotNull(charSequence3, "postfix");
        Intrinsics.checkParameterIsNotNull(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            StringsKt.appendElement(a, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ String m265740a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        int i3;
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return C69043h.m265739a(objArr, charSequence, charSequence2, charSequence3, i3, charSequence4, function1);
    }
}
