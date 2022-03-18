package com.huawei.secure.android.common.ssl.p1027a;

import com.huawei.secure.android.common.ssl.p1028b.C23821f;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: com.huawei.secure.android.common.ssl.a.a */
public class C23812a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            C23821f.m87074a("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            C23814c.m87043a(str, x509Certificate, true);
            return true;
        } catch (SSLException e) {
            C23821f.m87078d("", "SSLException : " + e.getMessage());
            return false;
        }
    }
}
