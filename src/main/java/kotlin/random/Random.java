package kotlin.random;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.internal.C69098b;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b'\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0019"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Companion", "Default", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.d.d */
public abstract class Random {

    /* renamed from: a */
    public static final Random f173146a = C69098b.f173160a.mo239206a();

    /* renamed from: b */
    public static final Companion f173147b = Companion.f173149d;

    /* renamed from: c */
    public static final Default f173148c = new Default(null);

    /* renamed from: a */
    public abstract int mo239189a(int i);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lkotlin/random/Random$Companion;", "Lkotlin/random/Random;", "()V", "nextBits", "", "bitCount", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use Default companion object instead")
    /* renamed from: kotlin.d.d$a */
    public static final class Companion extends Random {

        /* renamed from: d */
        public static final Companion f173149d = new Companion();

        private Companion() {
        }

        @Override // kotlin.random.Random
        /* renamed from: a */
        public int mo239189a(int i) {
            return Random.f173148c.mo239189a(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "()V", "Companion", "Lkotlin/random/Random$Companion;", "Companion$annotations", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.d.d$b */
    public static final class Default extends Random {
        private Default() {
        }

        @Override // kotlin.random.Random
        /* renamed from: b */
        public int mo239191b() {
            return Random.f173146a.mo239191b();
        }

        @Override // kotlin.random.Random
        /* renamed from: c */
        public long mo239193c() {
            return Random.f173146a.mo239193c();
        }

        @Override // kotlin.random.Random
        /* renamed from: d */
        public double mo239194d() {
            return Random.f173146a.mo239194d();
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // kotlin.random.Random
        /* renamed from: a */
        public int mo239189a(int i) {
            return Random.f173146a.mo239189a(i);
        }

        @Override // kotlin.random.Random
        /* renamed from: b */
        public int mo239192b(int i) {
            return Random.f173146a.mo239192b(i);
        }

        @Override // kotlin.random.Random
        /* renamed from: a */
        public int mo239195a(int i, int i2) {
            return Random.f173146a.mo239195a(i, i2);
        }

        @Override // kotlin.random.Random
        /* renamed from: a */
        public long mo239196a(long j, long j2) {
            return Random.f173146a.mo239196a(j, j2);
        }
    }

    /* renamed from: b */
    public int mo239191b() {
        return mo239189a(32);
    }

    /* renamed from: c */
    public long mo239193c() {
        return (((long) mo239191b()) << 32) + ((long) mo239191b());
    }

    /* renamed from: d */
    public double mo239194d() {
        return C69093c.m265864a(mo239189a(26), mo239189a(27));
    }

    /* renamed from: b */
    public int mo239192b(int i) {
        return mo239195a(0, i);
    }

    /* renamed from: a */
    public int mo239195a(int i, int i2) {
        int i3;
        int b;
        int i4;
        C69094e.m265887b(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i3 = mo239189a(C69094e.m265880a(i5));
            } else {
                do {
                    b = mo239191b() >>> 1;
                    i4 = b % i5;
                } while ((b - i4) + (i5 - 1) < 0);
                i3 = i4;
            }
            return i + i3;
        }
        while (true) {
            int b2 = mo239191b();
            if (i <= b2 && i2 > b2) {
                return b2;
            }
        }
    }

    /* renamed from: a */
    public long mo239196a(long j, long j2) {
        long j3;
        long c;
        long j4;
        int b;
        C69094e.m265886a(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    b = mo239189a(C69094e.m265880a(i));
                } else if (i2 == 1) {
                    b = mo239191b();
                } else {
                    j3 = (((long) mo239189a(C69094e.m265880a(i2))) << 32) + ((long) mo239191b());
                }
                j3 = ((long) b) & 4294967295L;
            } else {
                do {
                    c = mo239193c() >>> 1;
                    j4 = c % j5;
                } while ((c - j4) + (j5 - 1) < 0);
                j3 = j4;
            }
            return j + j3;
        }
        while (true) {
            long c2 = mo239193c();
            if (j <= c2 && j2 > c2) {
                return c2;
            }
        }
    }
}
