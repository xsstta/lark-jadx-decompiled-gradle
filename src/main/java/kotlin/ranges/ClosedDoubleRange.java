package kotlin.ranges;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "(DD)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Double;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", AbstractC60044a.f149675a, C63954b.f161494a, "toString", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.ranges.d */
final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {

    /* renamed from: a */
    private final double f173233a;

    /* renamed from: b */
    private final double f173234b;

    /* renamed from: a */
    public boolean mo239383a(double d, double d2) {
        return d <= d2;
    }

    /* renamed from: a */
    public Double mo239377g() {
        return Double.valueOf(this.f173233a);
    }

    /* renamed from: b */
    public Double mo239379i() {
        return Double.valueOf(this.f173234b);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    /* renamed from: e */
    public boolean mo239367e() {
        if (this.f173233a > this.f173234b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (mo239367e()) {
            return -1;
        }
        return (Double.valueOf(this.f173233a).hashCode() * 31) + Double.valueOf(this.f173234b).hashCode();
    }

    public String toString() {
        return this.f173233a + ".." + this.f173234b;
    }

    /* renamed from: a */
    public boolean mo239382a(double d) {
        if (d < this.f173233a || d > this.f173234b) {
            return false;
        }
        return true;
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: a */
    public /* synthetic */ boolean mo239375a(Comparable comparable) {
        return mo239382a(((Number) comparable).doubleValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClosedDoubleRange) {
            if (!mo239367e() || !((ClosedDoubleRange) obj).mo239367e()) {
                ClosedDoubleRange dVar = (ClosedDoubleRange) obj;
                if (!(this.f173233a == dVar.f173233a && this.f173234b == dVar.f173234b)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public ClosedDoubleRange(double d, double d2) {
        this.f173233a = d;
        this.f173234b = d2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable, java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    /* renamed from: a */
    public /* synthetic */ boolean mo239384a(Double d, Double d2) {
        return mo239383a(d.doubleValue(), d2.doubleValue());
    }
}
