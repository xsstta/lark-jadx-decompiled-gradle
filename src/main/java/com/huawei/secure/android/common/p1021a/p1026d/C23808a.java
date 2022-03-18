package com.huawei.secure.android.common.p1021a.p1026d;

import android.os.Build;
import com.huawei.hms.feature.dynamic.DynamicModule;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

/* renamed from: com.huawei.secure.android.common.a.d.a */
public class C23808a {

    /* renamed from: a */
    private static boolean f58981a = false;

    /* renamed from: b */
    private static boolean f58982b = true;

    /* renamed from: a */
    private static boolean m87017a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static SecureRandom m87020b() {
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            AESEngine aESEngine = new AESEngine();
            byte[] bArr = new byte[32];
            instanceStrong.nextBytes(bArr);
            return new SP800SecureRandomBuilder(instanceStrong, true).setEntropyBitsRequired(384).buildCTR(aESEngine, (int) DynamicModule.f58006b, bArr, false);
        } catch (NoSuchAlgorithmException unused) {
            C23810c.m87026b("EncryptUtil", "NoSuchAlgorithmException");
            return new SecureRandom();
        } catch (Throwable th) {
            if (f58982b) {
                C23810c.m87026b("EncryptUtil", "exception : " + th.getMessage() + " , you should implementation bcprov-jdk15on library");
                f58982b = false;
            }
            return new SecureRandom();
        }
    }

    /* renamed from: b */
    public static String m87019b(int i) {
        return C23809b.m87022a(m87018a(i));
    }

    /* renamed from: c */
    private static byte[] m87021c(int i) {
        C23810c.m87025a("EncryptUtil", "generateSecureRandomNew ");
        SecureRandom b = m87020b();
        if (b == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        b.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m87018a(int i) {
        if (f58981a && m87017a()) {
            return m87021c(i);
        }
        try {
            byte[] bArr = new byte[i];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        } catch (Exception e) {
            C23810c.m87026b("EncryptUtil", "generate secure random error" + e.getMessage());
            return new byte[0];
        }
    }
}
