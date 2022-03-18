package org.tukaani.xz.p3523a;

import java.security.NoSuchAlgorithmException;
import org.tukaani.xz.UnsupportedOptionsException;

/* renamed from: org.tukaani.xz.a.c */
public abstract class AbstractC70049c {

    /* renamed from: a */
    int f175075a;

    /* renamed from: b */
    String f175076b;

    /* renamed from: a */
    public static AbstractC70049c m268747a(int i) throws UnsupportedOptionsException {
        if (i == 0) {
            return new C70050d();
        }
        if (i == 1) {
            return new C70047a();
        }
        if (i == 4) {
            return new C70048b();
        }
        if (i == 10) {
            try {
                return new C70051e();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        throw new UnsupportedOptionsException("Unsupported Check ID " + i);
    }

    /* renamed from: a */
    public void mo246725a(byte[] bArr) {
        mo246723a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public abstract void mo246723a(byte[] bArr, int i, int i2);

    /* renamed from: a */
    public abstract byte[] mo246724a();

    /* renamed from: b */
    public int mo246726b() {
        return this.f175075a;
    }

    /* renamed from: c */
    public String mo246727c() {
        return this.f175076b;
    }
}
