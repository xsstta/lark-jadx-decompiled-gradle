package org.tukaani.xz.p3530h;

/* renamed from: org.tukaani.xz.h.d */
public final class C70084d implements AbstractC70086f {

    /* renamed from: a */
    private final boolean f175159a;

    /* renamed from: b */
    private int f175160b;

    public C70084d(boolean z, int i) {
        this.f175159a = z;
        this.f175160b = i;
    }

    @Override // org.tukaani.xz.p3530h.AbstractC70086f
    /* renamed from: a */
    public int mo246787a(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4] & 252) == 72) {
                int i5 = i4 + 3;
                if ((bArr[i5] & 3) == 1) {
                    int i6 = i4 + 1;
                    int i7 = i4 + 2;
                    int i8 = ((bArr[i4] & 3) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i5] & 252);
                    int i9 = this.f175159a ? i8 + ((this.f175160b + i4) - i) : i8 - ((this.f175160b + i4) - i);
                    bArr[i4] = (byte) (72 | ((i9 >>> 24) & 3));
                    bArr[i6] = (byte) (i9 >>> 16);
                    bArr[i7] = (byte) (i9 >>> 8);
                    bArr[i5] = (byte) ((bArr[i5] & 3) | i9);
                }
            }
            i4 += 4;
        }
        int i10 = i4 - i;
        this.f175160b += i10;
        return i10;
    }
}
