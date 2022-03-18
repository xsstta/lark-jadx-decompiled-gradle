package org.tukaani.xz;

import java.io.InputStream;
import org.tukaani.xz.p3530h.AbstractC70086f;
import org.tukaani.xz.p3530h.C70081a;
import org.tukaani.xz.p3530h.C70082b;
import org.tukaani.xz.p3530h.C70083c;
import org.tukaani.xz.p3530h.C70084d;
import org.tukaani.xz.p3530h.C70085e;
import org.tukaani.xz.p3530h.C70087g;

/* renamed from: org.tukaani.xz.c */
class C70056c extends AbstractC70052b implements AbstractC70090k {

    /* renamed from: a */
    static final /* synthetic */ boolean f175080a = true;

    /* renamed from: b */
    private final long f175081b;

    /* renamed from: c */
    private final int f175082c;

    C70056c(long j, byte[] bArr) throws UnsupportedOptionsException {
        if (f175080a || m268757a(j)) {
            this.f175081b = j;
            if (bArr.length == 0) {
                this.f175082c = 0;
            } else if (bArr.length == 4) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    i |= (bArr[i2] & 255) << (i2 * 8);
                }
                this.f175082c = i;
            } else {
                throw new UnsupportedOptionsException("Unsupported BCJ filter properties");
            }
        } else {
            throw new AssertionError();
        }
    }

    @Override // org.tukaani.xz.AbstractC70090k
    /* renamed from: a */
    public InputStream mo246731a(InputStream inputStream, C70046a aVar) {
        AbstractC70086f fVar;
        long j = this.f175081b;
        if (j == 4) {
            fVar = new C70087g(false, this.f175082c);
        } else if (j == 5) {
            fVar = new C70084d(false, this.f175082c);
        } else if (j == 6) {
            fVar = new C70083c(false, this.f175082c);
        } else if (j == 7) {
            fVar = new C70081a(false, this.f175082c);
        } else if (j == 8) {
            fVar = new C70082b(false, this.f175082c);
        } else if (j == 9) {
            fVar = new C70085e(false, this.f175082c);
        } else if (f175080a) {
            fVar = null;
        } else {
            throw new AssertionError();
        }
        return new C70097r(inputStream, fVar);
    }

    @Override // org.tukaani.xz.AbstractC70090k
    /* renamed from: d */
    public int mo246732d() {
        return C70097r.m268864a();
    }
}
