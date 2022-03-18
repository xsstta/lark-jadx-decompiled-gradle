package org.tukaani.xz.p3525c;

/* renamed from: org.tukaani.xz.c.b */
public class C70058b extends AbstractC70057a {
    public C70058b(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo246733a(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            bArr[i] = (byte) (bArr[i] + this.f175084b[(this.f175083a + this.f175085c) & 255]);
            byte[] bArr2 = this.f175084b;
            int i4 = this.f175085c;
            this.f175085c = i4 - 1;
            bArr2[i4 & 255] = bArr[i];
            i++;
        }
    }
}
