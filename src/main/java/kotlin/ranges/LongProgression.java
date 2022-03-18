package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.LongIterator;
import kotlin.internal.C69099c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.ranges.l */
public class LongProgression implements Iterable<Long>, KMappedMarker {

    /* renamed from: a */
    public static final Companion f173249a = new Companion(null);

    /* renamed from: b */
    private final long f173250b;

    /* renamed from: c */
    private final long f173251c;

    /* renamed from: d */
    private final long f173252d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.ranges.l$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LongProgression mo239423a(long j, long j2, long j3) {
            return new LongProgression(j, j2, j3);
        }
    }

    /* renamed from: a */
    public final long mo239414a() {
        return this.f173250b;
    }

    /* renamed from: b */
    public final long mo239415b() {
        return this.f173251c;
    }

    /* renamed from: c */
    public final long mo239416c() {
        return this.f173252d;
    }

    /* renamed from: d */
    public LongIterator iterator() {
        return new LongProgressionIterator(this.f173250b, this.f173251c, this.f173252d);
    }

    /* renamed from: e */
    public boolean mo239418e() {
        int i = (this.f173252d > 0 ? 1 : (this.f173252d == 0 ? 0 : -1));
        long j = this.f173250b;
        long j2 = this.f173251c;
        if (i > 0) {
            if (j > j2) {
                return true;
            }
        } else if (j < j2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (mo239418e()) {
            return -1;
        }
        long j = (long) 31;
        long j2 = this.f173250b;
        long j3 = this.f173251c;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.f173252d;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        StringBuilder sb;
        long j;
        if (this.f173252d > 0) {
            sb.append(this.f173250b);
            sb.append("..");
            sb.append(this.f173251c);
            sb.append(" step ");
            j = this.f173252d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f173250b);
            sb.append(" downTo ");
            sb.append(this.f173251c);
            sb.append(" step ");
            j = -this.f173252d;
        }
        sb.append(j);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongProgression) {
            if (!mo239418e() || !((LongProgression) obj).mo239418e()) {
                LongProgression lVar = (LongProgression) obj;
                if (!(this.f173250b == lVar.f173250b && this.f173251c == lVar.f173251c && this.f173252d == lVar.f173252d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public LongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f173250b = j;
            this.f173251c = C69099c.m265901a(j, j2, j3);
            this.f173252d = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
