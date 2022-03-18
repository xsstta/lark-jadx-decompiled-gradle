package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* renamed from: org.apache.commons.compress.archivers.zip.a */
public abstract class AbstractC69760a implements AbstractC69778r {

    /* renamed from: a */
    private long f174254a;

    /* renamed from: b */
    private byte[] f174255b;

    /* renamed from: c */
    private byte[] f174256c;

    protected AbstractC69760a() {
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        return getCentralDirectoryData();
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        return getCentralDirectoryLength();
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        if (this.f174256c == null) {
            m267754a();
        }
        byte[] bArr = this.f174256c;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        int i;
        if (this.f174256c == null) {
            m267754a();
        }
        byte[] bArr = this.f174256c;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        return new ZipShort(i);
    }

    /* renamed from: a */
    private void m267754a() {
        byte[] bArr = this.f174255b;
        if (bArr != null) {
            byte[] bArr2 = new byte[(bArr.length + 5)];
            this.f174256c = bArr2;
            bArr2[0] = 1;
            System.arraycopy(ZipLong.getBytes(this.f174254a), 0, this.f174256c, 1, 4);
            byte[] bArr3 = this.f174255b;
            System.arraycopy(bArr3, 0, this.f174256c, 5, bArr3.length);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 >= 5) {
            byte b = bArr[i];
            if (b == 1) {
                this.f174254a = ZipLong.getValue(bArr, i + 1);
                int i3 = i2 - 5;
                byte[] bArr2 = new byte[i3];
                this.f174255b = bArr2;
                System.arraycopy(bArr, i + 5, bArr2, 0, i3);
                this.f174256c = null;
                return;
            }
            throw new ZipException("Unsupported version [" + ((int) b) + "] for UniCode path extra data.");
        }
        throw new ZipException("UniCode path extra data must have at least 5 bytes.");
    }
}
