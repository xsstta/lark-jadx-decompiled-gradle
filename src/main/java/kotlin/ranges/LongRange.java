package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(JJ)V", "getEndInclusive", "()Ljava/lang/Long;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.ranges.n */
public final class LongRange extends LongProgression implements ClosedRange<Long> {

    /* renamed from: b */
    public static final LongRange f173257b = new LongRange(1, 0);

    /* renamed from: c */
    public static final Companion f173258c = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/LongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/LongRange;", "getEMPTY", "()Lkotlin/ranges/LongRange;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.ranges.n$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final LongRange mo239428a() {
            return LongRange.f173257b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.LongProgression
    /* renamed from: e */
    public boolean mo239418e() {
        if (mo239414a() > mo239415b()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Long mo239377g() {
        return Long.valueOf(mo239414a());
    }

    /* renamed from: h */
    public Long mo239379i() {
        return Long.valueOf(mo239415b());
    }

    @Override // kotlin.ranges.LongProgression
    public String toString() {
        return mo239414a() + ".." + mo239415b();
    }

    @Override // kotlin.ranges.LongProgression
    public int hashCode() {
        if (mo239418e()) {
            return -1;
        }
        return (int) ((((long) 31) * (mo239414a() ^ (mo239414a() >>> 32))) + (mo239415b() ^ (mo239415b() >>> 32)));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedRange
    /* renamed from: a */
    public /* synthetic */ boolean mo239375a(Long l) {
        return mo239425a(l.longValue());
    }

    /* renamed from: a */
    public boolean mo239425a(long j) {
        if (mo239414a() > j || j > mo239415b()) {
            return false;
        }
        return true;
    }

    @Override // kotlin.ranges.LongProgression
    public boolean equals(Object obj) {
        if (obj instanceof LongRange) {
            if (!mo239418e() || !((LongRange) obj).mo239418e()) {
                LongRange nVar = (LongRange) obj;
                if (!(mo239414a() == nVar.mo239414a() && mo239415b() == nVar.mo239415b())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public LongRange(long j, long j2) {
        super(j, j2, 1);
    }
}
