package com.huawei.updatesdk.p1029a.p1030a.p1035c;

import java.io.UnsupportedEncodingException;

/* renamed from: com.huawei.updatesdk.a.a.c.b */
public class C23836b {

    /* renamed from: a */
    private byte[] f59042a;

    /* renamed from: b */
    private int f59043b;

    /* renamed from: c */
    private int f59044c;

    public C23836b() {
        this.f59042a = null;
        this.f59043b = 1024;
        this.f59044c = 0;
        this.f59042a = new byte[1024];
    }

    /* renamed from: a */
    public static String m87123a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return String.valueOf(cArr2);
    }

    /* renamed from: a */
    public String mo85569a() {
        int i = this.f59044c;
        if (i <= 0) {
            return null;
        }
        try {
            return new String(this.f59042a, 0, i, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo85570a(byte[] bArr, int i) {
        if (i > 0) {
            byte[] bArr2 = this.f59042a;
            int length = bArr2.length;
            int i2 = this.f59044c;
            if (length - i2 >= i) {
                System.arraycopy(bArr, 0, bArr2, i2, i);
            } else {
                byte[] bArr3 = new byte[((bArr2.length + i) << 1)];
                System.arraycopy(bArr2, 0, bArr3, 0, i2);
                System.arraycopy(bArr, 0, bArr3, this.f59044c, i);
                this.f59042a = bArr3;
            }
            this.f59044c += i;
        }
    }
}
