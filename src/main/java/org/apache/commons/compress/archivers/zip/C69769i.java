package org.apache.commons.compress.archivers.zip;

/* renamed from: org.apache.commons.compress.archivers.zip.i */
public final class C69769i implements AbstractC69778r {

    /* renamed from: a */
    private static final ZipShort f174283a = new ZipShort(44225);

    /* renamed from: b */
    private byte[] f174284b;

    /* renamed from: c */
    private byte[] f174285c;

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getHeaderId() {
        return f174283a;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        return AbstractC69779s.m267788b(this.f174284b);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        byte[] bArr = this.f174285c;
        if (bArr == null) {
            return getLocalFileDataData();
        }
        return AbstractC69779s.m267788b(bArr);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        int i;
        byte[] bArr = this.f174284b;
        if (bArr == null) {
            i = 0;
        } else {
            i = bArr.length;
        }
        return new ZipShort(i);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        byte[] bArr = this.f174285c;
        if (bArr == null) {
            return getLocalFileDataLength();
        }
        return new ZipShort(bArr.length);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f174285c = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        if (this.f174284b == null) {
            parseFromLocalFileData(bArr, i, i2);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f174284b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
