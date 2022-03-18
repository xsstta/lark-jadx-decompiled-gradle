package com.bytedance.ee.falcon.loader;

/* renamed from: com.bytedance.ee.falcon.loader.b */
public class C12703b {

    /* renamed from: a */
    private final AbstractC12702a f34000a;

    C12703b(AbstractC12702a aVar) {
        this.f34000a = aVar;
    }

    /* renamed from: b */
    private String[] m52572b(String str) {
        return str.split(",");
    }

    /* renamed from: c */
    private byte[] m52573c(String str) {
        return this.f34000a.mo48093a(str);
    }

    /* renamed from: a */
    public byte[] mo48094a(String str) {
        byte[] bArr = null;
        for (String str2 : m52572b(str)) {
            bArr = m52571a(bArr, m52573c(str2));
        }
        return bArr;
    }

    /* renamed from: a */
    private byte[] m52571a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null) {
            return bArr;
        }
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }
}
