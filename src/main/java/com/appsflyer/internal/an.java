package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class an extends FilterInputStream {

    /* renamed from: Ι */
    private static final short f6891 = ((short) ((int) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d))));

    /* renamed from: ı */
    private byte[] f6892 = new byte[8];

    /* renamed from: Ɩ */
    private int f6893 = Integer.MAX_VALUE;

    /* renamed from: ǃ */
    private byte[] f6894 = new byte[8];

    /* renamed from: ɩ */
    private byte[] f6895 = new byte[8];

    /* renamed from: ɪ */
    private int f6896;

    /* renamed from: ɹ */
    private int f6897;

    /* renamed from: ɾ */
    private int f6898;

    /* renamed from: ι */
    private int f6899 = 8;

    /* renamed from: І */
    private int f6900 = 8;

    /* renamed from: і */
    private int f6901;

    /* renamed from: Ӏ */
    private int f6902;

    /* renamed from: ӏ */
    private int f6903;

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        m8889();
        return this.f6900 - this.f6899;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        m8889();
        int i = this.f6899;
        if (i >= this.f6900) {
            return -1;
        }
        byte[] bArr = this.f6892;
        this.f6899 = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: ǃ */
    private int m8889() throws IOException {
        if (this.f6893 == Integer.MAX_VALUE) {
            this.f6893 = ((FilterInputStream) this).in.read();
        }
        int i = 8;
        if (this.f6899 == 8) {
            byte[] bArr = this.f6892;
            int i2 = this.f6893;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.f6892, i3, 8 - i3);
                    if (read <= 0) {
                        break;
                    }
                    i3 += read;
                } while (i3 < 8);
                if (i3 >= 8) {
                    m8890();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.f6893 = read2;
                    this.f6899 = 0;
                    if (read2 < 0) {
                        i = 8 - (this.f6892[7] & 255);
                    }
                    this.f6900 = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.f6900;
    }

    /* renamed from: ɩ */
    private void m8890() {
        if (this.f6901 == 3) {
            byte[] bArr = this.f6892;
            System.arraycopy(bArr, 0, this.f6895, 0, bArr.length);
        }
        byte[] bArr2 = this.f6892;
        int i = ((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.f6902;
            if (i3 >= i4) {
                break;
            }
            short s = f6891;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.f6898)) ^ ((i >>> 5) + this.f6903);
            i -= (((i2 << 4) + this.f6897) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.f6896);
            i3++;
        }
        byte[] bArr3 = this.f6892;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.f6901 == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.f6892;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.f6894[i5]);
            }
            byte[] bArr5 = this.f6895;
            System.arraycopy(bArr5, 0, this.f6894, 0, bArr5.length);
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
            m8889();
            int i5 = this.f6899;
            if (i5 < this.f6900) {
                byte[] bArr2 = this.f6892;
                this.f6899 = i5 + 1;
                bArr[i4] = bArr2[i5];
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    public an(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(inputStream);
        this.f6902 = Math.min(Math.max(i2, 5), 16);
        this.f6901 = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.f6894, 0, 8);
        }
        long j = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i == 0) {
            this.f6897 = (int) j;
            long j2 = j >> 3;
            short s = f6891;
            this.f6896 = (int) ((((long) s) * j2) >> 32);
            this.f6898 = (int) (j >> 32);
            this.f6903 = (int) (j2 + ((long) s));
            return;
        }
        int i4 = (int) j;
        this.f6897 = i4;
        this.f6896 = i4 * i;
        this.f6898 = i4 ^ i;
        this.f6903 = (int) (j >> 32);
    }
}
