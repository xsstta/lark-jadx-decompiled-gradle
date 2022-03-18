package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.internal.C69099c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", "step", "", "(CCI)V", "first", "getFirst", "()C", "last", "getLast", "getStep", "()I", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/CharIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.ranges.a */
public class CharProgression implements Iterable<Character>, KMappedMarker {

    /* renamed from: a */
    public static final Companion f173223a = new Companion(null);

    /* renamed from: b */
    private final char f173224b;

    /* renamed from: c */
    private final char f173225c;

    /* renamed from: d */
    private final int f173226d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/CharProgression;", "rangeStart", "", "rangeEnd", "step", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.ranges.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CharProgression mo239372a(char c, char c2, int i) {
            return new CharProgression(c, c2, i);
        }
    }

    /* renamed from: a */
    public final char mo239363a() {
        return this.f173224b;
    }

    /* renamed from: b */
    public final char mo239364b() {
        return this.f173225c;
    }

    /* renamed from: c */
    public final int mo239365c() {
        return this.f173226d;
    }

    /* renamed from: d */
    public CharIterator iterator() {
        return new CharProgressionIterator(this.f173224b, this.f173225c, this.f173226d);
    }

    /* renamed from: e */
    public boolean mo239367e() {
        if (this.f173226d > 0) {
            if (this.f173224b > this.f173225c) {
                return true;
            }
        } else if (this.f173224b < this.f173225c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (mo239367e()) {
            return -1;
        }
        return (((this.f173224b * 31) + this.f173225c) * 31) + this.f173226d;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f173226d > 0) {
            sb = new StringBuilder();
            sb.append(this.f173224b);
            sb.append("..");
            sb.append(this.f173225c);
            sb.append(" step ");
            i = this.f173226d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f173224b);
            sb.append(" downTo ");
            sb.append(this.f173225c);
            sb.append(" step ");
            i = -this.f173226d;
        }
        sb.append(i);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof CharProgression) {
            if (!mo239367e() || !((CharProgression) obj).mo239367e()) {
                CharProgression aVar = (CharProgression) obj;
                if (!(this.f173224b == aVar.f173224b && this.f173225c == aVar.f173225c && this.f173226d == aVar.f173226d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public CharProgression(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i != Integer.MIN_VALUE) {
            this.f173224b = c;
            this.f173225c = (char) C69099c.m265899a((int) c, (int) c2, i);
            this.f173226d = i;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
