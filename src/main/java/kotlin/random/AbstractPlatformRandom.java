package kotlin.random;

import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lkotlin/random/AbstractPlatformRandom;", "Lkotlin/random/Random;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "nextDouble", "", "nextFloat", "", "nextInt", "until", "nextLong", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.d.a */
public abstract class AbstractPlatformRandom extends Random {
    /* renamed from: a */
    public abstract Random mo239190a();

    @Override // kotlin.random.Random
    /* renamed from: b */
    public int mo239191b() {
        return mo239190a().nextInt();
    }

    @Override // kotlin.random.Random
    /* renamed from: c */
    public long mo239193c() {
        return mo239190a().nextLong();
    }

    @Override // kotlin.random.Random
    /* renamed from: d */
    public double mo239194d() {
        return mo239190a().nextDouble();
    }

    @Override // kotlin.random.Random
    /* renamed from: a */
    public int mo239189a(int i) {
        return C69094e.m265881a(mo239190a().nextInt(), i);
    }

    @Override // kotlin.random.Random
    /* renamed from: b */
    public int mo239192b(int i) {
        return mo239190a().nextInt(i);
    }
}
