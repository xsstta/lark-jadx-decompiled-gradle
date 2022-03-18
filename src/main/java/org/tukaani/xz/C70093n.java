package org.tukaani.xz;

import java.io.InputStream;

/* renamed from: org.tukaani.xz.n */
class C70093n extends AbstractC70092m implements AbstractC70090k {

    /* renamed from: a */
    private int f175172a;

    C70093n(byte[] bArr) throws UnsupportedOptionsException {
        if (bArr.length != 1 || (bArr[0] & 255) > 37) {
            throw new UnsupportedOptionsException("Unsupported LZMA2 properties");
        }
        int i = (bArr[0] & 1) | 2;
        this.f175172a = i;
        this.f175172a = i << ((bArr[0] >>> 1) + 11);
    }

    @Override // org.tukaani.xz.AbstractC70090k
    /* renamed from: a */
    public InputStream mo246731a(InputStream inputStream, C70046a aVar) {
        return new C70094o(inputStream, this.f175172a, null, aVar);
    }

    @Override // org.tukaani.xz.AbstractC70090k
    /* renamed from: d */
    public int mo246732d() {
        return C70094o.m268852a(this.f175172a);
    }
}
