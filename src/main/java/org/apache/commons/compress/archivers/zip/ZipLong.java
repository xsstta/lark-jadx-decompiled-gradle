package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import org.apache.commons.compress.p3493a.C69748c;

public final class ZipLong implements Serializable, Cloneable {
    public static final ZipLong AED_SIG = new ZipLong(134630224L);
    public static final ZipLong CFH_SIG = new ZipLong(33639248L);
    public static final ZipLong DD_SIG = new ZipLong(134695760L);
    public static final ZipLong LFH_SIG = new ZipLong(67324752L);
    public static final ZipLong SINGLE_SEGMENT_SPLIT_MARKER = new ZipLong(808471376L);
    static final ZipLong ZIP64_MAGIC = new ZipLong(4294967295L);
    private static final long serialVersionUID = 1;
    private final long value;

    public int getIntValue() {
        return (int) this.value;
    }

    public int hashCode() {
        return (int) this.value;
    }

    public long getValue() {
        return this.value;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public byte[] getBytes() {
        return getBytes(this.value);
    }

    public String toString() {
        return "ZipLong value: " + this.value;
    }

    public ZipLong(int i) {
        this.value = (long) i;
    }

    public static byte[] getBytes(long j) {
        byte[] bArr = new byte[4];
        putLong(j, bArr, 0);
        return bArr;
    }

    public static long getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }

    public ZipLong(long j) {
        this.value = j;
    }

    public ZipLong(byte[] bArr) {
        this(bArr, 0);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ZipLong) || this.value != ((ZipLong) obj).getValue()) {
            return false;
        }
        return true;
    }

    public static long getValue(byte[] bArr, int i) {
        return C69748c.m267712a(bArr, i, 4);
    }

    public void putLong(byte[] bArr, int i) {
        putLong(this.value, bArr, i);
    }

    public ZipLong(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public static void putLong(long j, byte[] bArr, int i) {
        C69748c.m267715a(bArr, j, i, 4);
    }
}
