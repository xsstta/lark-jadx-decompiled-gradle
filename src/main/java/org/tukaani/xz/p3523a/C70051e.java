package org.tukaani.xz.p3523a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: org.tukaani.xz.a.e */
public class C70051e extends AbstractC70049c {

    /* renamed from: c */
    private final MessageDigest f175077c = MessageDigest.getInstance("SHA-256");

    public C70051e() throws NoSuchAlgorithmException {
        this.f175075a = 32;
        this.f175076b = "SHA-256";
    }

    @Override // org.tukaani.xz.p3523a.AbstractC70049c
    /* renamed from: a */
    public void mo246723a(byte[] bArr, int i, int i2) {
        this.f175077c.update(bArr, i, i2);
    }

    @Override // org.tukaani.xz.p3523a.AbstractC70049c
    /* renamed from: a */
    public byte[] mo246724a() {
        byte[] digest = this.f175077c.digest();
        this.f175077c.reset();
        return digest;
    }
}
