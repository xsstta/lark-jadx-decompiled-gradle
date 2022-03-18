package com.google.zxing.common.reedsolomon;

import com.huawei.hms.feature.dynamic.DynamicModule;

/* renamed from: com.google.zxing.common.reedsolomon.a */
public final class C23212a {

    /* renamed from: a */
    public static final C23212a f57240a = new C23212a(4201, 4096, 1);

    /* renamed from: b */
    public static final C23212a f57241b = new C23212a(1033, 1024, 1);

    /* renamed from: c */
    public static final C23212a f57242c;

    /* renamed from: d */
    public static final C23212a f57243d = new C23212a(19, 16, 1);

    /* renamed from: e */
    public static final C23212a f57244e = new C23212a(285, DynamicModule.f58006b, 0);

    /* renamed from: f */
    public static final C23212a f57245f;

    /* renamed from: g */
    public static final C23212a f57246g;

    /* renamed from: h */
    public static final C23212a f57247h;

    /* renamed from: i */
    private final int[] f57248i;

    /* renamed from: j */
    private final int[] f57249j;

    /* renamed from: k */
    private final C23213b f57250k;

    /* renamed from: l */
    private final C23213b f57251l;

    /* renamed from: m */
    private final int f57252m;

    /* renamed from: n */
    private final int f57253n;

    /* renamed from: o */
    private final int f57254o;

    /* renamed from: b */
    static int m84061b(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C23213b mo80507a() {
        return this.f57250k;
    }

    /* renamed from: b */
    public int mo80509b() {
        return this.f57254o;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f57253n) + ',' + this.f57252m + ')';
    }

    static {
        C23212a aVar = new C23212a(67, 64, 1);
        f57242c = aVar;
        C23212a aVar2 = new C23212a(301, DynamicModule.f58006b, 1);
        f57245f = aVar2;
        f57246g = aVar2;
        f57247h = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo80506a(int i) {
        return this.f57248i[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo80510b(int i) {
        if (i != 0) {
            return this.f57249j[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo80511c(int i) {
        if (i != 0) {
            return this.f57248i[(this.f57252m - this.f57249j[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C23213b mo80508a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f57250k;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C23213b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo80512c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f57248i;
        int[] iArr2 = this.f57249j;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f57252m - 1)];
    }

    public C23212a(int i, int i2, int i3) {
        this.f57253n = i;
        this.f57252m = i2;
        this.f57254o = i3;
        this.f57248i = new int[i2];
        this.f57249j = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f57248i[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f57249j[this.f57248i[i6]] = i6;
        }
        this.f57250k = new C23213b(this, new int[]{0});
        this.f57251l = new C23213b(this, new int[]{1});
    }
}
