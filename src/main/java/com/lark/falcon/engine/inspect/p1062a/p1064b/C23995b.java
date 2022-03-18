package com.lark.falcon.engine.inspect.p1062a.p1064b;

/* renamed from: com.lark.falcon.engine.inspect.a.b.b */
class C23995b {
    /* renamed from: a */
    public static C23994a m87729a(String str) {
        return m87726a((byte) 1, C24001h.m87740a(str));
    }

    /* renamed from: a */
    private static C23994a m87726a(byte b, byte[] bArr) {
        return m87727a(b, bArr, bArr.length);
    }

    /* renamed from: a */
    public static C23994a m87728a(int i, String str) {
        byte[] bArr;
        int i2;
        if (str != null) {
            bArr = C24001h.m87740a(str);
            i2 = bArr.length + 2;
        } else {
            bArr = null;
            i2 = 2;
        }
        byte[] bArr2 = new byte[i2];
        bArr2[0] = (byte) ((i >> 8) & 255);
        bArr2[1] = (byte) (i & 255);
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        }
        return m87726a((byte) 8, bArr2);
    }

    /* renamed from: a */
    public static C23994a m87730a(byte[] bArr, int i) {
        return m87727a((byte) 10, bArr, i);
    }

    /* renamed from: a */
    private static C23994a m87727a(byte b, byte[] bArr, int i) {
        C23994a aVar = new C23994a();
        aVar.f59351a = true;
        aVar.f59356f = false;
        aVar.f59355e = b;
        aVar.f59357g = (long) i;
        aVar.f59359i = bArr;
        return aVar;
    }
}
