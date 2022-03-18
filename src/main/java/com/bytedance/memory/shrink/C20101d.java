package com.bytedance.memory.shrink;

import java.util.Arrays;

/* renamed from: com.bytedance.memory.shrink.d */
public final class C20101d {

    /* renamed from: a */
    private final byte[] f49076a;

    /* renamed from: a */
    public byte[] mo68195a() {
        return this.f49076a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f49076a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        for (byte b : this.f49076a) {
            sb.append(Integer.toHexString(b & 255));
        }
        return sb.toString();
    }

    public C20101d(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.f49076a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C20101d)) {
            return false;
        }
        return Arrays.equals(this.f49076a, ((C20101d) obj).f49076a);
    }
}
