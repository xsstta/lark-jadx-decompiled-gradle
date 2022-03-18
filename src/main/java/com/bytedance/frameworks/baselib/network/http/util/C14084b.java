package com.bytedance.frameworks.baselib.network.http.util;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.b */
public final class C14084b {

    /* renamed from: a */
    private byte[] f37015a;

    /* renamed from: b */
    private int f37016b;

    /* renamed from: a */
    public byte[] mo51811a() {
        int i = this.f37016b;
        byte[] bArr = new byte[i];
        if (i > 0) {
            System.arraycopy(this.f37015a, 0, bArr, 0, i);
        }
        return bArr;
    }

    public C14084b(int i) {
        if (i >= 0) {
            this.f37015a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: a */
    private void m57023a(int i) {
        byte[] bArr = new byte[Math.max(this.f37015a.length << 1, i)];
        System.arraycopy(this.f37015a, 0, bArr, 0, this.f37016b);
        this.f37015a = bArr;
    }

    /* renamed from: a */
    public void mo51810a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr != null) {
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                int i4 = this.f37016b + i2;
                if (i4 > this.f37015a.length) {
                    m57023a(i4);
                }
                System.arraycopy(bArr, i, this.f37015a, this.f37016b, i2);
                this.f37016b = i4;
            }
        }
    }
}
