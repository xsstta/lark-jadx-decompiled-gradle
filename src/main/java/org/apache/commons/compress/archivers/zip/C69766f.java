package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* renamed from: org.apache.commons.compress.archivers.zip.f */
public class C69766f implements AbstractC69778r {

    /* renamed from: a */
    public static final ZipShort f174277a = new ZipShort(41246);

    /* renamed from: b */
    private short f174278b;

    /* renamed from: c */
    private boolean f174279c;

    /* renamed from: d */
    private int f174280d;

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getHeaderId() {
        return f174277a;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        return new ZipShort(2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(this.f174280d + 2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        short s;
        short s2 = this.f174278b;
        if (this.f174279c) {
            s = 32768;
        } else {
            s = 0;
        }
        return ZipShort.getBytes(s2 | s);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        short s;
        byte[] bArr = new byte[(this.f174280d + 2)];
        short s2 = this.f174278b;
        if (this.f174279c) {
            s = 32768;
        } else {
            s = 0;
        }
        ZipShort.putShort(s2 | s, bArr, 0);
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromCentralDirectoryData(bArr, i, i2);
        this.f174280d = i2 - 2;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        boolean z;
        if (i2 >= 2) {
            int value = ZipShort.getValue(bArr, i);
            this.f174278b = (short) (value & 32767);
            if ((value & 32768) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f174279c = z;
            return;
        }
        throw new ZipException("Too short content for ResourceAlignmentExtraField (0xa11e): " + i2);
    }
}
