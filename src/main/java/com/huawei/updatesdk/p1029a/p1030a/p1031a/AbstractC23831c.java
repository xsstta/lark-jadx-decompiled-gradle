package com.huawei.updatesdk.p1029a.p1030a.p1031a;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* renamed from: com.huawei.updatesdk.a.a.a.c */
public abstract class AbstractC23831c {

    /* renamed from: a */
    private static final String[] f59035a = {"TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"};

    /* renamed from: b */
    private static final String[] f59036b = {"TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"};

    /* renamed from: c */
    private static final String[] f59037c = {"TLS_RSA", "CBC", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    /* renamed from: a */
    public static SSLContext m87108a() throws NoSuchAlgorithmException {
        int i = Build.VERSION.SDK_INT;
        return SSLContext.getInstance(i >= 29 ? "TLSv1.3" : i >= 16 ? "TLSv1.2" : "TLS");
    }

    /* renamed from: a */
    private static void m87109a(SSLSocket sSLSocket) {
        if (sSLSocket != null && !m87114d(sSLSocket)) {
            m87110a(sSLSocket, f59037c);
        }
    }

    /* renamed from: a */
    private static void m87110a(SSLSocket sSLSocket, String[] strArr) {
        boolean z;
        if (!(sSLSocket == null || strArr == null)) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            for (String str : enabledCipherSuites) {
                String upperCase = str.toUpperCase(Locale.ENGLISH);
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (upperCase.contains(strArr[i].toUpperCase(Locale.ENGLISH))) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
    }

    /* renamed from: b */
    private static void m87111b(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 16 && i < 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
            } else if (Build.VERSION.SDK_INT < 16) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1"});
            }
        }
    }

    /* renamed from: b */
    private static boolean m87112b(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        List asList = Arrays.asList(strArr);
        for (String str : enabledCipherSuites) {
            if (asList.contains(str.toUpperCase(Locale.ENGLISH))) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }

    /* renamed from: c */
    public static void m87113c(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            m87111b(sSLSocket);
            m87109a(sSLSocket);
        }
    }

    /* renamed from: d */
    private static boolean m87114d(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return Build.VERSION.SDK_INT > 19 ? m87112b(sSLSocket, f59036b) : m87112b(sSLSocket, f59035a);
    }
}
