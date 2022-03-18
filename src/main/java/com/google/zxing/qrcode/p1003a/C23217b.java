package com.google.zxing.qrcode.p1003a;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.zxing.qrcode.a.b */
public final class C23217b {

    /* renamed from: a */
    private final byte[][] f57261a;

    /* renamed from: b */
    private final int f57262b;

    /* renamed from: c */
    private final int f57263c;

    /* renamed from: a */
    public int mo80528a() {
        return this.f57263c;
    }

    /* renamed from: b */
    public int mo80532b() {
        return this.f57262b;
    }

    /* renamed from: c */
    public byte[][] mo80533c() {
        return this.f57261a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f57262b * 2 * this.f57263c) + 2);
        for (int i = 0; i < this.f57263c; i++) {
            byte[] bArr = this.f57261a[i];
            for (int i2 = 0; i2 < this.f57262b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo80529a(byte b) {
        for (byte[] bArr : this.f57261a) {
            Arrays.fill(bArr, b);
        }
    }

    /* renamed from: a */
    public byte mo80527a(int i, int i2) {
        return this.f57261a[i2][i];
    }

    public C23217b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f57261a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f57262b = i;
        this.f57263c = i2;
    }

    /* renamed from: a */
    public void mo80530a(int i, int i2, int i3) {
        this.f57261a[i2][i] = (byte) i3;
    }

    /* renamed from: a */
    public void mo80531a(int i, int i2, boolean z) {
        this.f57261a[i2][i] = z ? (byte) 1 : 0;
    }
}
