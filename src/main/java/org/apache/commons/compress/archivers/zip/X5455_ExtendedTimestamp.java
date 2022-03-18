package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.util.Date;
import java.util.zip.ZipException;

public class X5455_ExtendedTimestamp implements Serializable, Cloneable, AbstractC69778r {
    private static final ZipShort HEADER_ID = new ZipShort(21589);
    private static final long serialVersionUID = 1;
    private ZipLong accessTime;
    private boolean bit0_modifyTimePresent;
    private boolean bit1_accessTimePresent;
    private boolean bit2_createTimePresent;
    private ZipLong createTime;
    private byte flags;
    private ZipLong modifyTime;

    public ZipLong getAccessTime() {
        return this.accessTime;
    }

    public ZipLong getCreateTime() {
        return this.createTime;
    }

    public byte getFlags() {
        return this.flags;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    public ZipLong getModifyTime() {
        return this.modifyTime;
    }

    public boolean isBit0_modifyTimePresent() {
        return this.bit0_modifyTimePresent;
    }

    public boolean isBit1_accessTimePresent() {
        return this.bit1_accessTimePresent;
    }

    public boolean isBit2_createTimePresent() {
        return this.bit2_createTimePresent;
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Date getAccessJavaTime() {
        return zipLongToDate(this.accessTime);
    }

    public Date getCreateJavaTime() {
        return zipLongToDate(this.createTime);
    }

    public Date getModifyJavaTime() {
        return zipLongToDate(this.modifyTime);
    }

    private void reset() {
        setFlags((byte) 0);
        this.modifyTime = null;
        this.accessTime = null;
        this.createTime = null;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        int i;
        if (this.bit0_modifyTimePresent) {
            i = 4;
        } else {
            i = 0;
        }
        return new ZipShort(i + 1);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        int value = getCentralDirectoryLength().getValue();
        byte[] bArr = new byte[value];
        System.arraycopy(getLocalFileDataData(), 0, bArr, 0, value);
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        int i;
        int i2;
        int i3 = 4;
        if (this.bit0_modifyTimePresent) {
            i = 4;
        } else {
            i = 0;
        }
        int i4 = i + 1;
        if (!this.bit1_accessTimePresent || this.accessTime == null) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        int i5 = i4 + i2;
        if (!this.bit2_createTimePresent || this.createTime == null) {
            i3 = 0;
        }
        return new ZipShort(i5 + i3);
    }

    public int hashCode() {
        int i = (this.flags & 7) * -123;
        ZipLong zipLong = this.modifyTime;
        if (zipLong != null) {
            i ^= zipLong.hashCode();
        }
        ZipLong zipLong2 = this.accessTime;
        if (zipLong2 != null) {
            i ^= Integer.rotateLeft(zipLong2.hashCode(), 11);
        }
        ZipLong zipLong3 = this.createTime;
        if (zipLong3 != null) {
            return i ^ Integer.rotateLeft(zipLong3.hashCode(), 22);
        }
        return i;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        ZipLong zipLong;
        ZipLong zipLong2;
        byte[] bArr = new byte[getLocalFileDataLength().getValue()];
        bArr[0] = 0;
        int i = 1;
        if (this.bit0_modifyTimePresent) {
            bArr[0] = (byte) (bArr[0] | 1);
            System.arraycopy(this.modifyTime.getBytes(), 0, bArr, 1, 4);
            i = 5;
        }
        if (this.bit1_accessTimePresent && (zipLong2 = this.accessTime) != null) {
            bArr[0] = (byte) (bArr[0] | 2);
            System.arraycopy(zipLong2.getBytes(), 0, bArr, i, 4);
            i += 4;
        }
        if (this.bit2_createTimePresent && (zipLong = this.createTime) != null) {
            bArr[0] = (byte) (bArr[0] | 4);
            System.arraycopy(zipLong.getBytes(), 0, bArr, i, 4);
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("0x5455 Zip Extra Field: Flags=");
        sb.append(Integer.toBinaryString(AbstractC69779s.m267787b(this.flags)));
        sb.append(" ");
        if (this.bit0_modifyTimePresent && this.modifyTime != null) {
            Date modifyJavaTime = getModifyJavaTime();
            sb.append(" Modify:[");
            sb.append(modifyJavaTime);
            sb.append("] ");
        }
        if (this.bit1_accessTimePresent && this.accessTime != null) {
            Date accessJavaTime = getAccessJavaTime();
            sb.append(" Access:[");
            sb.append(accessJavaTime);
            sb.append("] ");
        }
        if (this.bit2_createTimePresent && this.createTime != null) {
            Date createJavaTime = getCreateJavaTime();
            sb.append(" Create:[");
            sb.append(createJavaTime);
            sb.append("] ");
        }
        return sb.toString();
    }

    public void setAccessJavaTime(Date date) {
        setAccessTime(dateToZipLong(date));
    }

    public void setCreateJavaTime(Date date) {
        setCreateTime(dateToZipLong(date));
    }

    public void setModifyJavaTime(Date date) {
        setModifyTime(dateToZipLong(date));
    }

    private static ZipLong dateToZipLong(Date date) {
        if (date == null) {
            return null;
        }
        return unixTimeToZipLong(date.getTime() / 1000);
    }

    private static Date zipLongToDate(ZipLong zipLong) {
        if (zipLong != null) {
            return new Date(((long) zipLong.getIntValue()) * 1000);
        }
        return null;
    }

    public void setAccessTime(ZipLong zipLong) {
        boolean z;
        int i;
        if (zipLong != null) {
            z = true;
        } else {
            z = false;
        }
        this.bit1_accessTimePresent = z;
        byte b = this.flags;
        if (zipLong != null) {
            i = b | 2;
        } else {
            i = b & -3;
        }
        this.flags = (byte) i;
        this.accessTime = zipLong;
    }

    public void setCreateTime(ZipLong zipLong) {
        boolean z;
        int i;
        if (zipLong != null) {
            z = true;
        } else {
            z = false;
        }
        this.bit2_createTimePresent = z;
        byte b = this.flags;
        if (zipLong != null) {
            i = b | 4;
        } else {
            i = b & -5;
        }
        this.flags = (byte) i;
        this.createTime = zipLong;
    }

    public void setFlags(byte b) {
        boolean z;
        boolean z2;
        this.flags = b;
        boolean z3 = false;
        if ((b & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.bit0_modifyTimePresent = z;
        if ((b & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.bit1_accessTimePresent = z2;
        if ((b & 4) == 4) {
            z3 = true;
        }
        this.bit2_createTimePresent = z3;
    }

    public void setModifyTime(ZipLong zipLong) {
        boolean z;
        int i;
        if (zipLong != null) {
            z = true;
        } else {
            z = false;
        }
        this.bit0_modifyTimePresent = z;
        if (zipLong != null) {
            i = 1 | this.flags;
        } else {
            i = this.flags & -2;
        }
        this.flags = (byte) i;
        this.modifyTime = zipLong;
    }

    private static ZipLong unixTimeToZipLong(long j) {
        if (j >= -2147483648L && j <= 2147483647L) {
            return new ZipLong(j);
        }
        throw new IllegalArgumentException("X5455 timestamps must fit in a signed 32 bit integer: " + j);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof X5455_ExtendedTimestamp)) {
            return false;
        }
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = (X5455_ExtendedTimestamp) obj;
        if ((this.flags & 7) != (x5455_ExtendedTimestamp.flags & 7)) {
            return false;
        }
        ZipLong zipLong = this.modifyTime;
        ZipLong zipLong2 = x5455_ExtendedTimestamp.modifyTime;
        if (zipLong != zipLong2 && (zipLong == null || !zipLong.equals(zipLong2))) {
            return false;
        }
        ZipLong zipLong3 = this.accessTime;
        ZipLong zipLong4 = x5455_ExtendedTimestamp.accessTime;
        if (zipLong3 != zipLong4 && (zipLong3 == null || !zipLong3.equals(zipLong4))) {
            return false;
        }
        ZipLong zipLong5 = this.createTime;
        ZipLong zipLong6 = x5455_ExtendedTimestamp.createTime;
        if (zipLong5 == zipLong6 || (zipLong5 != null && zipLong5.equals(zipLong6))) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        reset();
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        int i3;
        reset();
        int i4 = i2 + i;
        int i5 = i + 1;
        setFlags(bArr[i]);
        if (this.bit0_modifyTimePresent) {
            this.modifyTime = new ZipLong(bArr, i5);
            i5 += 4;
        }
        if (this.bit1_accessTimePresent && (i3 = i5 + 4) <= i4) {
            this.accessTime = new ZipLong(bArr, i5);
            i5 = i3;
        }
        if (this.bit2_createTimePresent && i5 + 4 <= i4) {
            this.createTime = new ZipLong(bArr, i5);
        }
    }
}
