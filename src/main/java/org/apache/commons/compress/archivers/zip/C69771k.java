package org.apache.commons.compress.archivers.zip;

import java.util.Date;
import java.util.zip.ZipException;

/* renamed from: org.apache.commons.compress.archivers.zip.k */
public class C69771k implements AbstractC69778r {

    /* renamed from: a */
    private static final ZipShort f174289a = new ZipShort(10);

    /* renamed from: b */
    private static final ZipShort f174290b = new ZipShort(1);

    /* renamed from: c */
    private static final ZipShort f174291c = new ZipShort(24);

    /* renamed from: d */
    private ZipEightByteInteger f174292d = ZipEightByteInteger.ZERO;

    /* renamed from: e */
    private ZipEightByteInteger f174293e = ZipEightByteInteger.ZERO;

    /* renamed from: f */
    private ZipEightByteInteger f174294f = ZipEightByteInteger.ZERO;

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getHeaderId() {
        return f174289a;
    }

    /* renamed from: a */
    public Date mo244809a() {
        return m267773a(this.f174292d);
    }

    /* renamed from: b */
    public Date mo244810b() {
        return m267773a(this.f174293e);
    }

    /* renamed from: c */
    public Date mo244811c() {
        return m267773a(this.f174294f);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        return getLocalFileDataData();
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        return getLocalFileDataLength();
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(32);
    }

    /* renamed from: d */
    private void m267775d() {
        this.f174292d = ZipEightByteInteger.ZERO;
        this.f174293e = ZipEightByteInteger.ZERO;
        this.f174294f = ZipEightByteInteger.ZERO;
    }

    public int hashCode() {
        ZipEightByteInteger zipEightByteInteger = this.f174292d;
        int i = -123;
        if (zipEightByteInteger != null) {
            i = -123 ^ zipEightByteInteger.hashCode();
        }
        ZipEightByteInteger zipEightByteInteger2 = this.f174293e;
        if (zipEightByteInteger2 != null) {
            i ^= Integer.rotateLeft(zipEightByteInteger2.hashCode(), 11);
        }
        ZipEightByteInteger zipEightByteInteger3 = this.f174294f;
        if (zipEightByteInteger3 != null) {
            return i ^ Integer.rotateLeft(zipEightByteInteger3.hashCode(), 22);
        }
        return i;
    }

    public String toString() {
        return "0x000A Zip Extra Field:" + " Modify:[" + mo244809a() + "] " + " Access:[" + mo244810b() + "] " + " Create:[" + mo244811c() + "] ";
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        byte[] bArr = new byte[getLocalFileDataLength().getValue()];
        System.arraycopy(f174290b.getBytes(), 0, bArr, 4, 2);
        System.arraycopy(f174291c.getBytes(), 0, bArr, 6, 2);
        System.arraycopy(this.f174292d.getBytes(), 0, bArr, 8, 8);
        System.arraycopy(this.f174293e.getBytes(), 0, bArr, 16, 8);
        System.arraycopy(this.f174294f.getBytes(), 0, bArr, 24, 8);
        return bArr;
    }

    /* renamed from: a */
    private static Date m267773a(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null || ZipEightByteInteger.ZERO.equals(zipEightByteInteger)) {
            return null;
        }
        return new Date((zipEightByteInteger.getLongValue() - 116444736000000000L) / 10000);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C69771k)) {
            return false;
        }
        C69771k kVar = (C69771k) obj;
        ZipEightByteInteger zipEightByteInteger = this.f174292d;
        ZipEightByteInteger zipEightByteInteger2 = kVar.f174292d;
        if (zipEightByteInteger != zipEightByteInteger2 && (zipEightByteInteger == null || !zipEightByteInteger.equals(zipEightByteInteger2))) {
            return false;
        }
        ZipEightByteInteger zipEightByteInteger3 = this.f174293e;
        ZipEightByteInteger zipEightByteInteger4 = kVar.f174293e;
        if (zipEightByteInteger3 != zipEightByteInteger4 && (zipEightByteInteger3 == null || !zipEightByteInteger3.equals(zipEightByteInteger4))) {
            return false;
        }
        ZipEightByteInteger zipEightByteInteger5 = this.f174294f;
        ZipEightByteInteger zipEightByteInteger6 = kVar.f174294f;
        if (zipEightByteInteger5 == zipEightByteInteger6 || (zipEightByteInteger5 != null && zipEightByteInteger5.equals(zipEightByteInteger6))) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        m267775d();
        parseFromLocalFileData(bArr, i, i2);
    }

    /* renamed from: a */
    private void m267774a(byte[] bArr, int i, int i2) {
        if (i2 >= 26) {
            if (f174291c.equals(new ZipShort(bArr, i))) {
                int i3 = i + 2;
                this.f174292d = new ZipEightByteInteger(bArr, i3);
                int i4 = i3 + 8;
                this.f174293e = new ZipEightByteInteger(bArr, i4);
                this.f174294f = new ZipEightByteInteger(bArr, i4 + 8);
            }
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        int i3 = i2 + i;
        int i4 = i + 4;
        while (i4 + 4 <= i3) {
            ZipShort zipShort = new ZipShort(bArr, i4);
            int i5 = i4 + 2;
            if (zipShort.equals(f174290b)) {
                m267774a(bArr, i5, i3 - i5);
                return;
            }
            i4 = i5 + new ZipShort(bArr, i5).getValue() + 2;
        }
    }
}
