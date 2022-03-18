package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.ah */
public class C2014ah extends FilterInputStream {

    /* renamed from: ı */
    private byte[] f6868;

    /* renamed from: Ɩ */
    private int f6869;

    /* renamed from: ǃ */
    private byte[] f6870;

    /* renamed from: ɩ */
    private byte[] f6871;

    /* renamed from: ɹ */
    private int[] f6872;

    /* renamed from: Ι */
    private ak f6873;

    /* renamed from: ι */
    private final int f6874;

    /* renamed from: І */
    private int f6875;

    /* renamed from: і */
    private int f6876;

    /* renamed from: Ӏ */
    private int f6877 = Integer.MAX_VALUE;

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        m8872();
        return this.f6875 - this.f6876;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        m8872();
        int i = this.f6876;
        if (i >= this.f6875) {
            return -1;
        }
        byte[] bArr = this.f6871;
        this.f6876 = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: Ι */
    private int m8872() throws IOException {
        if (this.f6877 == Integer.MAX_VALUE) {
            this.f6877 = ((FilterInputStream) this).in.read();
        }
        int i = 8;
        if (this.f6876 == 8) {
            byte[] bArr = this.f6871;
            int i2 = this.f6877;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.f6871, i3, 8 - i3);
                    if (read <= 0) {
                        break;
                    }
                    i3 += read;
                } while (i3 < 8);
                if (i3 >= 8) {
                    m8871();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.f6877 = read2;
                    this.f6876 = 0;
                    if (read2 < 0) {
                        i = 8 - (this.f6871[7] & 255);
                    }
                    this.f6875 = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.f6875;
    }

    /* renamed from: ı */
    private void m8871() {
        if (this.f6869 == 2) {
            byte[] bArr = this.f6871;
            System.arraycopy(bArr, 0, this.f6870, 0, bArr.length);
        }
        byte[] bArr2 = this.f6871;
        C2013ag.m8869(((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255), (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.f6874, this.f6873.f6890, this.f6873.f6889, this.f6872);
        int[] iArr = this.f6872;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.f6871;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.f6869 == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.f6871;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.f6868[i3]);
            }
            byte[] bArr5 = this.f6870;
            System.arraycopy(bArr5, 0, this.f6868, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m8872();
            int i5 = this.f6876;
            if (i5 < this.f6875) {
                byte[] bArr2 = this.f6871;
                this.f6876 = i5 + 1;
                bArr[i4] = bArr2[i5];
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    public C2014ah(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(inputStream);
        int min = Math.min(Math.max(i, 3), 16);
        this.f6874 = min;
        this.f6871 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f6868 = bArr2;
        this.f6870 = new byte[8];
        this.f6872 = new int[2];
        this.f6876 = 8;
        this.f6875 = 8;
        this.f6869 = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.f6873 = new ak(iArr, min, true, z);
    }
}
