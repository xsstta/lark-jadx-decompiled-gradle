package com.bytedance.ee.bear.facade.glide.p383a.p385b;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.b.e */
public class C7753e {
    /* renamed from: a */
    public byte[] mo30375a(int i, String str, String str2, byte[] bArr) {
        AbstractC7751c cVar;
        if (i == 1) {
            cVar = new C7750b();
        } else if (i == 2) {
            cVar = new C7749a();
        } else if (i == 3) {
            cVar = new C7752d();
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return bArr;
        }
        return cVar.mo30374a(str, str2, bArr);
    }
}
