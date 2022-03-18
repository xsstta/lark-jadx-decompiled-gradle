package org.apache.commons.compress.archivers.zip;

/* renamed from: org.apache.commons.compress.archivers.zip.j */
public class C69770j implements AbstractC69778r {

    /* renamed from: a */
    private ZipShort f174286a;

    /* renamed from: b */
    private byte[] f174287b;

    /* renamed from: c */
    private byte[] f174288c;

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getHeaderId() {
        return this.f174286a;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        return AbstractC69779s.m267788b(this.f174287b);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        byte[] bArr = this.f174288c;
        if (bArr != null) {
            return AbstractC69779s.m267788b(bArr);
        }
        return getLocalFileDataData();
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        byte[] bArr = this.f174288c;
        if (bArr != null) {
            return new ZipShort(bArr.length);
        }
        return getLocalFileDataLength();
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        int i;
        byte[] bArr = this.f174287b;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        return new ZipShort(i);
    }

    /* renamed from: a */
    public void mo244806a(ZipShort zipShort) {
        this.f174286a = zipShort;
    }

    /* renamed from: a */
    public void mo244807a(byte[] bArr) {
        this.f174287b = AbstractC69779s.m267788b(bArr);
    }

    /* renamed from: b */
    public void mo244808b(byte[] bArr) {
        this.f174288c = AbstractC69779s.m267788b(bArr);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        mo244807a(bArr2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        mo244808b(bArr2);
        if (this.f174287b == null) {
            mo244807a(bArr2);
        }
    }
}
