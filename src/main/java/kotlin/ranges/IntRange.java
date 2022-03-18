package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.ranges.k */
public final class IntRange extends IntProgression implements ClosedRange<Integer> {

    /* renamed from: b */
    public static final IntRange f173247b = new IntRange(1, 0);

    /* renamed from: c */
    public static final Companion f173248c = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/IntRange;", "getEMPTY", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.ranges.k$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final IntRange mo239413a() {
            return IntRange.f173247b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.ranges.IntProgression, kotlin.ranges.ClosedRange
    /* renamed from: e */
    public boolean mo239403e() {
        if (mo239399a() > mo239400b()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Integer mo239377g() {
        return Integer.valueOf(mo239399a());
    }

    /* renamed from: h */
    public Integer mo239379i() {
        return Integer.valueOf(mo239400b());
    }

    @Override // kotlin.ranges.IntProgression
    public int hashCode() {
        if (mo239403e()) {
            return -1;
        }
        return (mo239399a() * 31) + mo239400b();
    }

    @Override // kotlin.ranges.IntProgression
    public String toString() {
        return mo239399a() + ".." + mo239400b();
    }

    /* renamed from: a */
    public boolean mo239410a(int i) {
        if (mo239399a() > i || i > mo239400b()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedRange
    /* renamed from: a */
    public /* synthetic */ boolean mo239375a(Integer num) {
        return mo239410a(num.intValue());
    }

    @Override // kotlin.ranges.IntProgression
    public boolean equals(Object obj) {
        if (obj instanceof IntRange) {
            if (!mo239403e() || !((IntRange) obj).mo239403e()) {
                IntRange kVar = (IntRange) obj;
                if (!(mo239399a() == kVar.mo239399a() && mo239400b() == kVar.mo239400b())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public IntRange(int i, int i2) {
        super(i, i2, 1);
    }
}
