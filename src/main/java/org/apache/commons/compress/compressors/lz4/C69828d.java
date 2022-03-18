package org.apache.commons.compress.compressors.lz4;

import java.util.zip.Checksum;
import org.apache.commons.compress.p3493a.C69748c;

/* renamed from: org.apache.commons.compress.compressors.lz4.d */
public class C69828d implements Checksum {

    /* renamed from: a */
    private final byte[] f174518a;

    /* renamed from: b */
    private final int[] f174519b;

    /* renamed from: c */
    private final byte[] f174520c;

    /* renamed from: d */
    private final int f174521d;

    /* renamed from: e */
    private int f174522e;

    /* renamed from: f */
    private int f174523f;

    public C69828d() {
        this(0);
    }

    public void reset() {
        m267970a();
        this.f174522e = 0;
        this.f174523f = 0;
    }

    /* renamed from: a */
    private void m267970a() {
        int[] iArr = this.f174519b;
        int i = this.f174521d;
        iArr[0] = (i - 1640531535) - 2048144777;
        iArr[1] = -2048144777 + i;
        iArr[2] = i;
        iArr[3] = i - -1640531535;
    }

    public long getValue() {
        int i;
        int i2 = 0;
        if (this.f174522e > 16) {
            i = Integer.rotateLeft(this.f174519b[0], 1) + Integer.rotateLeft(this.f174519b[1], 7) + Integer.rotateLeft(this.f174519b[2], 12) + Integer.rotateLeft(this.f174519b[3], 18);
        } else {
            i = this.f174519b[2] + 374761393;
        }
        int i3 = i + this.f174522e;
        int i4 = this.f174523f - 4;
        while (i2 <= i4) {
            i3 = Integer.rotateLeft(i3 + (m267969a(this.f174520c, i2) * -1028477379), 17) * 668265263;
            i2 += 4;
        }
        while (i2 < this.f174523f) {
            i3 = Integer.rotateLeft(i3 + ((this.f174520c[i2] & 255) * 374761393), 11) * -1640531535;
            i2++;
        }
        int i5 = (i3 ^ (i3 >>> 15)) * -2048144777;
        int i6 = (i5 ^ (i5 >>> 13)) * -1028477379;
        return ((long) (i6 ^ (i6 >>> 16))) & 4294967295L;
    }

    public void update(int i) {
        byte[] bArr = this.f174518a;
        bArr[0] = (byte) (i & 255);
        update(bArr, 0, 1);
    }

    public C69828d(int i) {
        this.f174518a = new byte[1];
        this.f174519b = new int[4];
        this.f174520c = new byte[16];
        this.f174521d = i;
        m267970a();
    }

    /* renamed from: a */
    private static int m267969a(byte[] bArr, int i) {
        return (int) (C69748c.m267712a(bArr, i, 4) & 4294967295L);
    }

    /* renamed from: b */
    private void m267971b(byte[] bArr, int i) {
        int[] iArr = this.f174519b;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int[] iArr2 = this.f174519b;
        iArr2[0] = Integer.rotateLeft(i2 + (m267969a(bArr, i) * -2048144777), 13) * -1640531535;
        iArr2[1] = Integer.rotateLeft(i3 + (m267969a(bArr, i + 4) * -2048144777), 13) * -1640531535;
        iArr2[2] = Integer.rotateLeft(i4 + (m267969a(bArr, i + 8) * -2048144777), 13) * -1640531535;
        iArr2[3] = Integer.rotateLeft(i5 + (m267969a(bArr, i + 12) * -2048144777), 13) * -1640531535;
        this.f174523f = 0;
    }

    public void update(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            this.f174522e += i2;
            int i3 = i + i2;
            int i4 = this.f174523f;
            if (i4 + i2 < 16) {
                System.arraycopy(bArr, i, this.f174520c, i4, i2);
                this.f174523f += i2;
                return;
            }
            if (i4 > 0) {
                int i5 = 16 - i4;
                System.arraycopy(bArr, i, this.f174520c, i4, i5);
                m267971b(this.f174520c, 0);
                i += i5;
            }
            int i6 = i3 - 16;
            while (i <= i6) {
                m267971b(bArr, i);
                i += 16;
            }
            if (i < i3) {
                int i7 = i3 - i;
                this.f174523f = i7;
                System.arraycopy(bArr, i, this.f174520c, 0, i7);
            }
        }
    }
}
