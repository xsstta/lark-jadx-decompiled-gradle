package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import org.apache.commons.compress.p3493a.C69748c;

public final class ZipShort implements Serializable, Cloneable {
    public static final ZipShort ZERO = new ZipShort(0);
    private static final long serialVersionUID = 1;
    private final int value;

    public int getValue() {
        return this.value;
    }

    public int hashCode() {
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
        byte[] bArr = new byte[2];
        C69748c.m267715a(bArr, (long) this.value, 0, 2);
        return bArr;
    }

    public String toString() {
        return "ZipShort value: " + this.value;
    }

    public ZipShort(int i) {
        this.value = i;
    }

    public static byte[] getBytes(int i) {
        byte[] bArr = new byte[2];
        putShort(i, bArr, 0);
        return bArr;
    }

    public static int getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }

    public ZipShort(byte[] bArr) {
        this(bArr, 0);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ZipShort) || this.value != ((ZipShort) obj).getValue()) {
            return false;
        }
        return true;
    }

    public static int getValue(byte[] bArr, int i) {
        return (int) C69748c.m267712a(bArr, i, 2);
    }

    public ZipShort(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public static void putShort(int i, byte[] bArr, int i2) {
        C69748c.m267715a(bArr, (long) i, i2, 2);
    }
}
