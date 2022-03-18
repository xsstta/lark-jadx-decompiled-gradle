package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.internal.C69099c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.ranges.i */
public class IntProgression implements Iterable<Integer>, KMappedMarker {

    /* renamed from: a */
    public static final Companion f173239a = new Companion(null);

    /* renamed from: b */
    private final int f173240b;

    /* renamed from: c */
    private final int f173241c;

    /* renamed from: d */
    private final int f173242d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.ranges.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final IntProgression mo239408a(int i, int i2, int i3) {
            return new IntProgression(i, i2, i3);
        }
    }

    /* renamed from: a */
    public final int mo239399a() {
        return this.f173240b;
    }

    /* renamed from: b */
    public final int mo239400b() {
        return this.f173241c;
    }

    /* renamed from: c */
    public final int mo239401c() {
        return this.f173242d;
    }

    /* renamed from: d */
    public IntIterator iterator() {
        return new IntProgressionIterator(this.f173240b, this.f173241c, this.f173242d);
    }

    /* renamed from: e */
    public boolean mo239403e() {
        if (this.f173242d > 0) {
            if (this.f173240b > this.f173241c) {
                return true;
            }
        } else if (this.f173240b < this.f173241c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (mo239403e()) {
            return -1;
        }
        return (((this.f173240b * 31) + this.f173241c) * 31) + this.f173242d;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f173242d > 0) {
            sb = new StringBuilder();
            sb.append(this.f173240b);
            sb.append("..");
            sb.append(this.f173241c);
            sb.append(" step ");
            i = this.f173242d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f173240b);
            sb.append(" downTo ");
            sb.append(this.f173241c);
            sb.append(" step ");
            i = -this.f173242d;
        }
        sb.append(i);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof IntProgression) {
            if (!mo239403e() || !((IntProgression) obj).mo239403e()) {
                IntProgression iVar = (IntProgression) obj;
                if (!(this.f173240b == iVar.f173240b && this.f173241c == iVar.f173241c && this.f173242d == iVar.f173242d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public IntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f173240b = i;
            this.f173241c = C69099c.m265899a(i, i2, i3);
            this.f173242d = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
