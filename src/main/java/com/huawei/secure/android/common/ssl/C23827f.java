package com.huawei.secure.android.common.ssl;

import com.huawei.secure.android.common.ssl.p1028b.AbstractC23820e;
import com.huawei.secure.android.common.ssl.p1028b.C23821f;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.huawei.secure.android.common.ssl.f */
public class C23827f implements X509TrustManager {

    /* renamed from: b */
    private static final String f59027b = "f";

    /* renamed from: a */
    protected List<X509TrustManager> f59028a = new ArrayList();

    /* renamed from: c */
    private X509Certificate[] f59029c;

    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            for (X509TrustManager x509TrustManager : this.f59028a) {
                arrayList.addAll(Arrays.asList(x509TrustManager.getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            String str = f59027b;
            C23821f.m87078d(str, "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }

    /* renamed from: a */
    public void mo85549a(X509Certificate[] x509CertificateArr) {
        this.f59029c = x509CertificateArr;
    }

    public C23827f(InputStream inputStream, String str) throws IllegalArgumentException {
        m87095a(inputStream, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        C23821f.m87076b(f59027b, "checkClientTrusted: ");
        for (X509TrustManager x509TrustManager : this.f59028a) {
            try {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                String str2 = f59027b;
                C23821f.m87078d(str2, "checkServerTrusted CertificateException" + e.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    /* renamed from: a */
    private void m87095a(InputStream inputStream, String str) {
        if (inputStream == null || str == null) {
            throw new IllegalArgumentException("inputstream or trustPwd is null");
        }
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            KeyStore instance2 = KeyStore.getInstance("bks");
            instance2.load(inputStream, str.toCharArray());
            instance.init(instance2);
            TrustManager[] trustManagers = instance.getTrustManagers();
            for (int i = 0; i < trustManagers.length; i++) {
                if (trustManagers[i] instanceof X509TrustManager) {
                    this.f59028a.add((X509TrustManager) trustManagers[i]);
                }
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            String str2 = f59027b;
            C23821f.m87078d(str2, "loadInputStream: exception : " + e.getMessage());
        } catch (Throwable th) {
            AbstractC23820e.m87071a(inputStream);
            throw th;
        }
        AbstractC23820e.m87071a(inputStream);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        mo85549a(x509CertificateArr);
        C23821f.m87076b(f59027b, "checkServerTrusted begin ,server ca chain size is : " + x509CertificateArr.length + " ,auth type is : " + str);
        for (X509Certificate x509Certificate : x509CertificateArr) {
            String str2 = f59027b;
            C23821f.m87074a(str2, "server ca chain: getSubjectDN is :" + x509Certificate.getSubjectDN() + " , getIssuerDN :" + x509Certificate.getIssuerDN());
            StringBuilder sb = new StringBuilder();
            sb.append("server ca chain is :");
            sb.append(x509Certificate);
            C23821f.m87074a(str2, sb.toString());
        }
        int size = this.f59028a.size();
        for (int i = 0; i < size; i++) {
            try {
                String str3 = f59027b;
                C23821f.m87076b(str3, "check server i : " + i);
                X509TrustManager x509TrustManager = this.f59028a.get(i);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    C23821f.m87076b(str3, "client root ca size is : " + acceptedIssuers.length);
                    for (int i2 = 0; i2 < acceptedIssuers.length; i2++) {
                        C23821f.m87074a(f59027b, "client root ca getIssuerDN :" + acceptedIssuers[i2].getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                C23821f.m87076b(f59027b, "checkServerTrusted succeed ,root ca issuer is : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e) {
                String str4 = f59027b;
                C23821f.m87078d(str4, "checkServerTrusted error :" + e.getMessage() + " , time : " + i);
                if (i == size - 1) {
                    if (x509CertificateArr != null && x509CertificateArr.length > 0) {
                        C23821f.m87078d(str4, "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e;
                }
            }
        }
    }
}
