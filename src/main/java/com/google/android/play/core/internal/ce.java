package com.google.android.play.core.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* access modifiers changed from: package-private */
public final class ce extends cf {

    /* renamed from: a */
    private final byte[] f56055a;

    public ce(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f56055a = bArr;
    }

    @Override // java.security.cert.Certificate, com.google.android.play.core.internal.cf
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f56055a;
    }
}
