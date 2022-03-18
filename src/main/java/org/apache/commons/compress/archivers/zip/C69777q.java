package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* renamed from: org.apache.commons.compress.archivers.zip.q */
public class C69777q implements AbstractC69778r {

    /* renamed from: a */
    static final ZipShort f174312a = new ZipShort(1);

    /* renamed from: b */
    private static final byte[] f174313b = new byte[0];

    /* renamed from: c */
    private ZipEightByteInteger f174314c;

    /* renamed from: d */
    private ZipEightByteInteger f174315d;

    /* renamed from: e */
    private ZipEightByteInteger f174316e;

    /* renamed from: f */
    private ZipLong f174317f;

    /* renamed from: g */
    private byte[] f174318g;

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getHeaderId() {
        return f174312a;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        int i;
        if (this.f174314c != null) {
            i = 16;
        } else {
            i = 0;
        }
        return new ZipShort(i);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        byte[] bArr = new byte[getCentralDirectoryLength().getValue()];
        int a = m267781a(bArr);
        ZipEightByteInteger zipEightByteInteger = this.f174316e;
        if (zipEightByteInteger != null) {
            System.arraycopy(zipEightByteInteger.getBytes(), 0, bArr, a, 8);
            a += 8;
        }
        ZipLong zipLong = this.f174317f;
        if (zipLong != null) {
            System.arraycopy(zipLong.getBytes(), 0, bArr, a, 4);
        }
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        int i;
        int i2;
        int i3 = 8;
        int i4 = 0;
        if (this.f174314c != null) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f174315d != null) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        int i5 = i + i2;
        if (this.f174316e == null) {
            i3 = 0;
        }
        int i6 = i5 + i3;
        if (this.f174317f != null) {
            i4 = 4;
        }
        return new ZipShort(i6 + i4);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        ZipEightByteInteger zipEightByteInteger = this.f174314c;
        if (zipEightByteInteger == null && this.f174315d == null) {
            return f174313b;
        }
        if (zipEightByteInteger == null || this.f174315d == null) {
            throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file header.");
        }
        byte[] bArr = new byte[16];
        m267781a(bArr);
        return bArr;
    }

    /* renamed from: a */
    private int m267781a(byte[] bArr) {
        int i;
        ZipEightByteInteger zipEightByteInteger = this.f174314c;
        if (zipEightByteInteger != null) {
            System.arraycopy(zipEightByteInteger.getBytes(), 0, bArr, 0, 8);
            i = 8;
        } else {
            i = 0;
        }
        ZipEightByteInteger zipEightByteInteger2 = this.f174315d;
        if (zipEightByteInteger2 == null) {
            return i;
        }
        System.arraycopy(zipEightByteInteger2.getBytes(), 0, bArr, i, 8);
        return i + 8;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        byte[] bArr2 = new byte[i2];
        this.f174318g = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        if (i2 >= 28) {
            parseFromLocalFileData(bArr, i, i2);
        } else if (i2 == 24) {
            this.f174314c = new ZipEightByteInteger(bArr, i);
            int i3 = i + 8;
            this.f174315d = new ZipEightByteInteger(bArr, i3);
            this.f174316e = new ZipEightByteInteger(bArr, i3 + 8);
        } else if (i2 % 8 == 4) {
            this.f174317f = new ZipLong(bArr, (i + i2) - 4);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            if (i2 >= 16) {
                this.f174314c = new ZipEightByteInteger(bArr, i);
                int i3 = i + 8;
                this.f174315d = new ZipEightByteInteger(bArr, i3);
                int i4 = i3 + 8;
                int i5 = i2 - 16;
                if (i5 >= 8) {
                    this.f174316e = new ZipEightByteInteger(bArr, i4);
                    i4 += 8;
                    i5 -= 8;
                }
                if (i5 >= 4) {
                    this.f174317f = new ZipLong(bArr, i4);
                    return;
                }
                return;
            }
            throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
        }
    }
}
