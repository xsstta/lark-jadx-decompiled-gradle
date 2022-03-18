package kotlin.p3469d;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0013H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0000¨\u0006\u0016"}, d2 = {"Random", "Lkotlin/random/Random;", "seed", "", "", "boundsErrorMessage", "", "from", "", "until", "checkRangeBounds", "", "", "fastLog2", "value", "nextInt", "range", "Lkotlin/ranges/IntRange;", "nextLong", "Lkotlin/ranges/LongRange;", "takeUpperBits", "bitCount", "kotlin-stdlib"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlin.d.e */
public final class C69094e {
    /* renamed from: a */
    public static final int m265881a(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    /* renamed from: a */
    public static final int m265880a(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: a */
    public static final Random m265885a(long j) {
        return new XorWowRandom((int) j, (int) (j >> 32));
    }

    /* renamed from: b */
    public static final void m265887b(int i, int i2) {
        boolean z;
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(m265884a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: a */
    public static final String m265884a(Object obj, Object obj2) {
        Intrinsics.checkParameterIsNotNull(obj, "from");
        Intrinsics.checkParameterIsNotNull(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* renamed from: a */
    public static final int m265882a(Random dVar, IntRange kVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$nextInt");
        Intrinsics.checkParameterIsNotNull(kVar, "range");
        if (kVar.mo239403e()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + kVar);
        } else if (kVar.mo239400b() < Integer.MAX_VALUE) {
            return dVar.mo239195a(kVar.mo239399a(), kVar.mo239400b() + 1);
        } else {
            if (kVar.mo239399a() > Integer.MIN_VALUE) {
                return dVar.mo239195a(kVar.mo239399a() - 1, kVar.mo239400b()) + 1;
            }
            return dVar.mo239191b();
        }
    }

    /* renamed from: a */
    public static final long m265883a(Random dVar, LongRange nVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$nextLong");
        Intrinsics.checkParameterIsNotNull(nVar, "range");
        if (nVar.mo239418e()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + nVar);
        } else if (nVar.mo239415b() < Long.MAX_VALUE) {
            return dVar.mo239196a(nVar.mo239414a(), nVar.mo239415b() + 1);
        } else {
            if (nVar.mo239414a() > Long.MIN_VALUE) {
                return dVar.mo239196a(nVar.mo239414a() - 1, nVar.mo239415b()) + 1;
            }
            return dVar.mo239193c();
        }
    }

    /* renamed from: a */
    public static final void m265886a(long j, long j2) {
        boolean z;
        if (j2 > j) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(m265884a(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }
}
