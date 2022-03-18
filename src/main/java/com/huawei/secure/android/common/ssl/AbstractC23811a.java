package com.huawei.secure.android.common.ssl;

import android.os.Build;
import com.huawei.secure.android.common.ssl.p1028b.C23821f;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* renamed from: com.huawei.secure.android.common.ssl.a */
public abstract class AbstractC23811a {

    /* renamed from: a */
    private static final String[] f58983a = {"TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"};

    /* renamed from: b */
    private static final String[] f58984b = {"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"};

    /* renamed from: c */
    private static final String[] f58985c = {"TLS_RSA", "CBC", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    /* renamed from: a */
    public static SSLContext m87027a() throws NoSuchAlgorithmException {
        if (Build.VERSION.SDK_INT >= 29) {
            return SSLContext.getInstance("TLSv1.3");
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return SSLContext.getInstance("TLSv1.2");
        }
        return SSLContext.getInstance("TLS");
    }

    /* renamed from: a */
    public static void m87028a(SSLSocket sSLSocket) {
        if (sSLSocket != null && !m87030b(sSLSocket)) {
            m87032c(sSLSocket);
        }
    }

    /* renamed from: c */
    public static boolean m87032c(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return m87031b(sSLSocket, f58985c);
    }

    /* renamed from: b */
    public static boolean m87030b(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 19) {
            return m87029a(sSLSocket, f58984b);
        }
        return m87029a(sSLSocket, f58983a);
    }

    /* renamed from: d */
    public static void m87034d(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
            }
            if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT < 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
            } else if (Build.VERSION.SDK_INT < 16) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1"});
            }
        }
    }

    /* renamed from: c */
    public static boolean m87033c(SSLSocket sSLSocket, String[] strArr) {
        if (!(sSLSocket == null || strArr == null)) {
            try {
                sSLSocket.setEnabledProtocols(strArr);
                return true;
            } catch (Exception e) {
                C23821f.m87078d("SSLUtil", "setEnabledProtocols: exception : " + e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m87029a(SSLSocket sSLSocket, String[] strArr) {
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

    /* renamed from: b */
    public static boolean m87031b(SSLSocket sSLSocket, String[] strArr) {
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
}
