package com.huawei.hms.hatool;

public class o0 {

    /* renamed from: a */
    public byte[] f58301a = null;

    /* renamed from: b */
    public int f58302b = 0;

    public o0(int i) {
        this.f58301a = new byte[i];
    }

    /* renamed from: a */
    public void mo83133a(byte[] bArr, int i) {
        if (i > 0) {
            byte[] bArr2 = this.f58301a;
            int length = bArr2.length;
            int i2 = this.f58302b;
            if (length - i2 >= i) {
                System.arraycopy(bArr, 0, bArr2, i2, i);
            } else {
                byte[] bArr3 = new byte[((bArr2.length + i) << 1)];
                System.arraycopy(bArr2, 0, bArr3, 0, i2);
                System.arraycopy(bArr, 0, bArr3, this.f58302b, i);
                this.f58301a = bArr3;
            }
            this.f58302b += i;
        }
    }

    /* renamed from: a */
    public byte[] mo83134a() {
        int i = this.f58302b;
        if (i <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f58301a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: b */
    public int mo83135b() {
        return this.f58302b;
    }
}
