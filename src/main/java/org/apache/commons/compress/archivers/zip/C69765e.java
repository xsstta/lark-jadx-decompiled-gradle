package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* renamed from: org.apache.commons.compress.archivers.zip.e */
public final class C69765e implements AbstractC69778r {

    /* renamed from: a */
    private static final ZipShort f174273a = new ZipShort(51966);

    /* renamed from: b */
    private static final ZipShort f174274b = new ZipShort(0);

    /* renamed from: c */
    private static final byte[] f174275c = new byte[0];

    /* renamed from: d */
    private static final C69765e f174276d = new C69765e();

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        return f174275c;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        return f174274b;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getHeaderId() {
        return f174273a;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        return f174275c;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        return f174274b;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }
}
