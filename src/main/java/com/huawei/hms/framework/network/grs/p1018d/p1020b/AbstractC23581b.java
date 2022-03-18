package com.huawei.hms.framework.network.grs.p1018d.p1020b;

import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* renamed from: com.huawei.hms.framework.network.grs.d.b.b */
public abstract class AbstractC23581b {

    /* renamed from: a */
    private static final String[] f58147a = {"TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"};

    /* renamed from: b */
    private static final String[] f58148b = {"TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"};

    /* renamed from: c */
    private static final String[] f58149c = {"TLS_RSA", "CBC", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    /* renamed from: a */
    public static SSLContext m85550a() {
        int i = Build.VERSION.SDK_INT;
        return SSLContext.getInstance(i >= 29 ? "TLSv1.3" : i >= 16 ? "TLSv1.2" : "TLS");
    }

    /* renamed from: a */
    public static boolean m85551a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return m85552a(sSLSocket, f58149c);
    }

    /* renamed from: a */
    public static boolean m85552a(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        int length = enabledCipherSuites.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            String str = enabledCipherSuites[i];
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z = false;
                    break;
                } else if (upperCase.contains(strArr[i2].toUpperCase(Locale.ENGLISH))) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                arrayList.add(str);
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }

    /* renamed from: b */
    public static void m85553b(SSLSocket sSLSocket) {
        if (sSLSocket != null && !m85557e(sSLSocket)) {
            m85551a(sSLSocket);
        }
    }

    /* renamed from: b */
    public static boolean m85554b(SSLSocket sSLSocket, String[] strArr) {
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
    public static void m85555c(SSLSocket sSLSocket) {
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

    /* renamed from: d */
    public static void m85556d(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            m85555c(sSLSocket);
            m85553b(sSLSocket);
        }
    }

    /* renamed from: e */
    public static boolean m85557e(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return Build.VERSION.SDK_INT > 19 ? m85554b(sSLSocket, f58148b) : m85554b(sSLSocket, f58147a);
    }
}
