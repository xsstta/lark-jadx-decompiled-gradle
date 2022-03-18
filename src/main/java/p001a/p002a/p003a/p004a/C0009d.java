package p001a.p002a.p003a.p004a;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: a.a.a.a.d */
public final class C0009d implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
