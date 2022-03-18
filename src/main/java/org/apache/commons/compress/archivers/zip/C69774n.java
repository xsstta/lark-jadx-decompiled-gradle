package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.zip.PKWareExtraHeader;

/* renamed from: org.apache.commons.compress.archivers.zip.n */
public class C69774n extends PKWareExtraHeader {

    /* renamed from: a */
    private int f174297a;

    /* renamed from: b */
    private PKWareExtraHeader.HashAlgorithm f174298b;

    public C69774n() {
        super(new ZipShort(22));
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r, org.apache.commons.compress.archivers.zip.PKWareExtraHeader
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        this.f174297a = ZipShort.getValue(bArr, i);
        this.f174298b = PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 2));
    }
}
