package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\u00028\u0000X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00028\u0000X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Lkotlin/ranges/ComparableRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "start", "endInclusive", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "getEndInclusive", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getStart", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.ranges.h */
class ComparableRange<T extends Comparable<? super T>> implements ClosedRange<T> {

    /* renamed from: a */
    private final T f173237a;

    /* renamed from: b */
    private final T f173238b;

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: g */
    public T mo239377g() {
        return this.f173237a;
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: i */
    public T mo239379i() {
        return this.f173238b;
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: e */
    public boolean mo239367e() {
        return ClosedRange.C69124a.m266040a(this);
    }

    public int hashCode() {
        if (mo239367e()) {
            return -1;
        }
        return (mo239377g().hashCode() * 31) + mo239379i().hashCode();
    }

    public String toString() {
        return mo239377g() + ".." + mo239379i();
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: a */
    public boolean mo239375a(T t) {
        Intrinsics.checkParameterIsNotNull(t, "value");
        return ClosedRange.C69124a.m266041a(this, t);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComparableRange) {
            if (!mo239367e() || !((ComparableRange) obj).mo239367e()) {
                ComparableRange hVar = (ComparableRange) obj;
                if (!Intrinsics.areEqual(mo239377g(), hVar.mo239377g()) || !Intrinsics.areEqual(mo239379i(), hVar.mo239379i())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public ComparableRange(T t, T t2) {
        Intrinsics.checkParameterIsNotNull(t, "start");
        Intrinsics.checkParameterIsNotNull(t2, "endInclusive");
        this.f173237a = t;
        this.f173238b = t2;
    }
}
