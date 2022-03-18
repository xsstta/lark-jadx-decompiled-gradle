package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.zip.PKWareExtraHeader;

/* renamed from: org.apache.commons.compress.archivers.zip.o */
public class C69775o extends PKWareExtraHeader {

    /* renamed from: a */
    private int f174299a;

    /* renamed from: b */
    private PKWareExtraHeader.EncryptionAlgorithm f174300b;

    /* renamed from: c */
    private int f174301c;

    /* renamed from: d */
    private int f174302d;

    /* renamed from: e */
    private long f174303e;

    /* renamed from: f */
    private PKWareExtraHeader.HashAlgorithm f174304f;

    /* renamed from: g */
    private int f174305g;

    /* renamed from: h */
    private byte[] f174306h;

    /* renamed from: i */
    private byte[] f174307i;

    /* renamed from: j */
    private byte[] f174308j;

    /* renamed from: k */
    private byte[] f174309k;

    /* renamed from: l */
    private byte[] f174310l;

    /* renamed from: m */
    private byte[] f174311m;

    public C69775o() {
        super(new ZipShort(23));
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r, org.apache.commons.compress.archivers.zip.PKWareExtraHeader
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        super.parseFromCentralDirectoryData(bArr, i, i2);
        mo244815a(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r, org.apache.commons.compress.archivers.zip.PKWareExtraHeader
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        super.parseFromLocalFileData(bArr, i, i2);
        mo244816b(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo244815a(byte[] bArr, int i, int i2) {
        this.f174299a = ZipShort.getValue(bArr, i);
        this.f174300b = PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 2));
        this.f174301c = ZipShort.getValue(bArr, i + 4);
        this.f174302d = ZipShort.getValue(bArr, i + 6);
        long value = ZipLong.getValue(bArr, i + 8);
        this.f174303e = value;
        if (value > 0) {
            this.f174304f = PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 12));
            this.f174305g = ZipShort.getValue(bArr, i + 14);
            for (long j = 0; j < this.f174303e; j++) {
                for (int i3 = 0; i3 < this.f174305g; i3++) {
                }
            }
        }
    }

    /* renamed from: b */
    public void mo244816b(byte[] bArr, int i, int i2) {
        int value = ZipShort.getValue(bArr, i);
        byte[] bArr2 = new byte[value];
        this.f174306h = bArr2;
        System.arraycopy(bArr, i + 4, bArr2, 0, value);
        int i3 = i + value;
        this.f174299a = ZipShort.getValue(bArr, i3 + 6);
        this.f174300b = PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i3 + 8));
        this.f174301c = ZipShort.getValue(bArr, i3 + 10);
        this.f174302d = ZipShort.getValue(bArr, i3 + 12);
        int value2 = ZipShort.getValue(bArr, i3 + 14);
        byte[] bArr3 = new byte[value2];
        this.f174307i = bArr3;
        int i4 = i3 + 16;
        System.arraycopy(bArr, i4, bArr3, 0, value2);
        this.f174303e = ZipLong.getValue(bArr, i4 + value2);
        System.out.println("rcount: " + this.f174303e);
        if (this.f174303e == 0) {
            int value3 = ZipShort.getValue(bArr, i3 + 20 + value2);
            int i5 = value3 - 4;
            byte[] bArr4 = new byte[i5];
            this.f174310l = bArr4;
            this.f174311m = new byte[4];
            int i6 = i3 + 22 + value2;
            System.arraycopy(bArr, i6, bArr4, 0, i5);
            System.arraycopy(bArr, (i6 + value3) - 4, this.f174311m, 0, 4);
            return;
        }
        this.f174304f = PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i3 + 20 + value2));
        int i7 = i3 + 22 + value2;
        this.f174305g = ZipShort.getValue(bArr, i7);
        int i8 = i3 + 24 + value2;
        int value4 = ZipShort.getValue(bArr, i8);
        int i9 = this.f174305g;
        byte[] bArr5 = new byte[i9];
        this.f174308j = bArr5;
        this.f174309k = new byte[(value4 - i9)];
        System.arraycopy(bArr, i8, bArr5, 0, i9);
        int i10 = this.f174305g;
        System.arraycopy(bArr, i8 + i10, this.f174309k, 0, value4 - i10);
        int value5 = ZipShort.getValue(bArr, i3 + 26 + value2 + value4);
        int i11 = value5 - 4;
        byte[] bArr6 = new byte[i11];
        this.f174310l = bArr6;
        this.f174311m = new byte[4];
        int i12 = i7 + value4;
        System.arraycopy(bArr, i12, bArr6, 0, i11);
        System.arraycopy(bArr, (i12 + value5) - 4, this.f174311m, 0, 4);
    }
}
