package kotlin.comparisons;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u0002H\u00010\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u0003B\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlin/comparisons/ReversedComparator;", "T", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Ljava/util/Comparator;)V", "getComparator", "()Ljava/util/Comparator;", "compare", "", AbstractC60044a.f149675a, C63954b.f161494a, "(Ljava/lang/Object;Ljava/lang/Object;)I", "reversed", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.comparisons.e */
final class ReversedComparator<T> implements Comparator<T> {

    /* renamed from: a */
    private final Comparator<T> f173122a;

    /* renamed from: a */
    public final Comparator<T> mo239131a() {
        return this.f173122a;
    }

    @Override // java.util.Comparator
    public final Comparator<T> reversed() {
        return this.f173122a;
    }

    public ReversedComparator(Comparator<T> comparator) {
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        this.f173122a = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        return this.f173122a.compare(t2, t);
    }
}
