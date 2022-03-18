package kotlin.random;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B7\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "seed1", "", "seed2", "(II)V", "x", "y", "z", "w", "v", "addend", "(IIIIII)V", "nextBits", "bitCount", "nextInt", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.d.f */
public final class XorWowRandom extends Random {

    /* renamed from: d */
    private int f173150d;

    /* renamed from: e */
    private int f173151e;

    /* renamed from: f */
    private int f173152f;

    /* renamed from: g */
    private int f173153g;

    /* renamed from: h */
    private int f173154h;

    /* renamed from: i */
    private int f173155i;

    @Override // kotlin.random.Random
    /* renamed from: b */
    public int mo239191b() {
        int i = this.f173150d;
        int i2 = i ^ (i >>> 2);
        this.f173150d = this.f173151e;
        this.f173151e = this.f173152f;
        this.f173152f = this.f173153g;
        int i3 = this.f173154h;
        this.f173153g = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f173154h = i4;
        int i5 = this.f173155i + 362437;
        this.f173155i = i5;
        return i4 + i5;
    }

    @Override // kotlin.random.Random
    /* renamed from: a */
    public int mo239189a(int i) {
        return C69094e.m265881a(mo239191b(), i);
    }

    public XorWowRandom(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }

    public XorWowRandom(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        this.f173150d = i;
        this.f173151e = i2;
        this.f173152f = i3;
        this.f173153g = i4;
        this.f173154h = i5;
        this.f173155i = i6;
        int i7 = i | i2 | i3 | i4 | i5;
        if (i7 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i8 = 0; i8 < 64; i8++) {
                mo239191b();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }
}
