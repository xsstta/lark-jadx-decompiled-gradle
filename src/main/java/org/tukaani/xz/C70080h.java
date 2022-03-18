package org.tukaani.xz;

import java.io.InputStream;

/* renamed from: org.tukaani.xz.h */
class C70080h extends AbstractC70075g implements AbstractC70090k {

    /* renamed from: a */
    private final int f175151a;

    C70080h(byte[] bArr) throws UnsupportedOptionsException {
        if (bArr.length == 1) {
            this.f175151a = (bArr[0] & 255) + 1;
            return;
        }
        throw new UnsupportedOptionsException("Unsupported Delta filter properties");
    }

    @Override // org.tukaani.xz.AbstractC70090k
    /* renamed from: a */
    public InputStream mo246731a(InputStream inputStream, C70046a aVar) {
        return new C70088i(inputStream, this.f175151a);
    }

    @Override // org.tukaani.xz.AbstractC70090k
    /* renamed from: d */
    public int mo246732d() {
        return 1;
    }
}
