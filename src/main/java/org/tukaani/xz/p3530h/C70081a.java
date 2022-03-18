package org.tukaani.xz.p3530h;

/* renamed from: org.tukaani.xz.h.a */
public final class C70081a implements AbstractC70086f {

    /* renamed from: a */
    private final boolean f175152a;

    /* renamed from: b */
    private int f175153b;

    public C70081a(boolean z, int i) {
        this.f175152a = z;
        this.f175153b = i + 8;
    }

    @Override // org.tukaani.xz.p3530h.AbstractC70086f
    /* renamed from: a */
    public int mo246787a(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4 + 3] & 255) == 235) {
                int i5 = i4 + 2;
                int i6 = i4 + 1;
                int i7 = ((((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8)) | (bArr[i4] & 255)) << 2;
                int i8 = (this.f175152a ? i7 + ((this.f175153b + i4) - i) : i7 - ((this.f175153b + i4) - i)) >>> 2;
                bArr[i5] = (byte) (i8 >>> 16);
                bArr[i6] = (byte) (i8 >>> 8);
                bArr[i4] = (byte) i8;
            }
            i4 += 4;
        }
        int i9 = i4 - i;
        this.f175153b += i9;
        return i9;
    }
}
