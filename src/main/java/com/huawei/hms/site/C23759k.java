package com.huawei.hms.site;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: com.huawei.hms.site.k */
public final class C23759k {

    /* renamed from: a */
    public static final String f58831a;

    /* renamed from: a */
    public static void m86927a() {
    }

    static {
        SecureRandom secureRandom;
        if (Build.VERSION.SDK_INT < 26) {
            C23762n.m86944c(C23761m.m86931a("SecureRandomFactory"), "Android API 26 use SecureRandom", false);
            secureRandom = new SecureRandom();
        } else {
            try {
                secureRandom = SecureRandom.getInstanceStrong();
            } catch (NoSuchAlgorithmException unused) {
                C23761m.m86935b("SecureRandomFactory", "getInstanceStrong  NoSuchAlgorithmException");
                secureRandom = new SecureRandom();
            }
        }
        byte[] bArr = new byte[16];
        secureRandom.nextBytes(bArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        f58831a = sb.toString();
    }
}
