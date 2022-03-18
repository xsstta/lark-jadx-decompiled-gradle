package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.zip.ZipException;

public class X7875_NewUnix implements Serializable, Cloneable, AbstractC69778r {
    private static final ZipShort HEADER_ID = new ZipShort(30837);
    private static final BigInteger ONE_THOUSAND = BigInteger.valueOf(1000);
    private static final ZipShort ZERO = new ZipShort(0);
    private static final long serialVersionUID = 1;
    private BigInteger gid;
    private BigInteger uid;
    private int version = 1;

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        return new byte[0];
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        return ZERO;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    private void reset() {
        BigInteger bigInteger = ONE_THOUSAND;
        this.uid = bigInteger;
        this.gid = bigInteger;
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public long getGID() {
        return AbstractC69779s.m267784a(this.gid);
    }

    public long getUID() {
        return AbstractC69779s.m267784a(this.uid);
    }

    public X7875_NewUnix() {
        reset();
    }

    public int hashCode() {
        return ((this.version * -1234567) ^ Integer.rotateLeft(this.uid.hashCode(), 16)) ^ this.gid.hashCode();
    }

    public String toString() {
        return "0x7875 Zip Extra Field: UID=" + this.uid + " GID=" + this.gid;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        int i;
        byte[] trimLeadingZeroesForceMinLength = trimLeadingZeroesForceMinLength(this.uid.toByteArray());
        int i2 = 0;
        if (trimLeadingZeroesForceMinLength == null) {
            i = 0;
        } else {
            i = trimLeadingZeroesForceMinLength.length;
        }
        byte[] trimLeadingZeroesForceMinLength2 = trimLeadingZeroesForceMinLength(this.gid.toByteArray());
        if (trimLeadingZeroesForceMinLength2 != null) {
            i2 = trimLeadingZeroesForceMinLength2.length;
        }
        return new ZipShort(i + 3 + i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        int i;
        int i2;
        byte[] byteArray = this.uid.toByteArray();
        byte[] byteArray2 = this.gid.toByteArray();
        byte[] trimLeadingZeroesForceMinLength = trimLeadingZeroesForceMinLength(byteArray);
        if (trimLeadingZeroesForceMinLength != null) {
            i = trimLeadingZeroesForceMinLength.length;
        } else {
            i = 0;
        }
        byte[] trimLeadingZeroesForceMinLength2 = trimLeadingZeroesForceMinLength(byteArray2);
        if (trimLeadingZeroesForceMinLength2 != null) {
            i2 = trimLeadingZeroesForceMinLength2.length;
        } else {
            i2 = 0;
        }
        byte[] bArr = new byte[(i + 3 + i2)];
        if (trimLeadingZeroesForceMinLength != null) {
            AbstractC69779s.m267786a(trimLeadingZeroesForceMinLength);
        }
        if (trimLeadingZeroesForceMinLength2 != null) {
            AbstractC69779s.m267786a(trimLeadingZeroesForceMinLength2);
        }
        bArr[0] = AbstractC69779s.m267787b(this.version);
        bArr[1] = AbstractC69779s.m267787b(i);
        if (trimLeadingZeroesForceMinLength != null) {
            System.arraycopy(trimLeadingZeroesForceMinLength, 0, bArr, 2, i);
        }
        int i3 = 2 + i;
        int i4 = i3 + 1;
        bArr[i3] = AbstractC69779s.m267787b(i2);
        if (trimLeadingZeroesForceMinLength2 != null) {
            System.arraycopy(trimLeadingZeroesForceMinLength2, 0, bArr, i4, i2);
        }
        return bArr;
    }

    public void setGID(long j) {
        this.gid = AbstractC69779s.m267785a(j);
    }

    public void setUID(long j) {
        this.uid = AbstractC69779s.m267785a(j);
    }

    static byte[] trimLeadingZeroesForceMinLength(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length && bArr[i] == 0) {
            i2++;
            i++;
        }
        int max = Math.max(1, bArr.length - i2);
        byte[] bArr2 = new byte[max];
        int length2 = max - (bArr.length - i2);
        System.arraycopy(bArr, i2, bArr2, length2, max - length2);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof X7875_NewUnix)) {
            return false;
        }
        X7875_NewUnix x7875_NewUnix = (X7875_NewUnix) obj;
        if (this.version != x7875_NewUnix.version || !this.uid.equals(x7875_NewUnix.uid) || !this.gid.equals(x7875_NewUnix.gid)) {
            return false;
        }
        return true;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        reset();
        int i3 = i + 1;
        this.version = AbstractC69779s.m267782a(bArr[i]);
        int i4 = i3 + 1;
        int a = AbstractC69779s.m267782a(bArr[i3]);
        byte[] bArr2 = new byte[a];
        System.arraycopy(bArr, i4, bArr2, 0, a);
        int i5 = i4 + a;
        this.uid = new BigInteger(1, AbstractC69779s.m267786a(bArr2));
        int i6 = i5 + 1;
        int a2 = AbstractC69779s.m267782a(bArr[i5]);
        byte[] bArr3 = new byte[a2];
        System.arraycopy(bArr, i6, bArr3, 0, a2);
        this.gid = new BigInteger(1, AbstractC69779s.m267786a(bArr3));
    }
}
