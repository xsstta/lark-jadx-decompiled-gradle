package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.zip.PKWareExtraHeader;

/* renamed from: org.apache.commons.compress.archivers.zip.m */
public class C69773m extends PKWareExtraHeader {

    /* renamed from: a */
    private int f174295a;

    /* renamed from: b */
    private PKWareExtraHeader.HashAlgorithm f174296b;

    public C69773m() {
        super(new ZipShort(21));
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r, org.apache.commons.compress.archivers.zip.PKWareExtraHeader
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        super.parseFromCentralDirectoryData(bArr, i, i2);
        this.f174295a = ZipShort.getValue(bArr, i);
        this.f174296b = PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 2));
    }
}
