package com.huawei.secure.android.common.p1021a.p1023b;

import com.huawei.secure.android.common.p1021a.p1026d.C23810c;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* renamed from: com.huawei.secure.android.common.a.b.a */
public abstract class AbstractC23805a {

    /* renamed from: a */
    private static final String f58977a = "a";

    /* renamed from: a */
    public static byte[] m87006a(char[] cArr, byte[] bArr, int i, int i2) {
        return m87007a(cArr, bArr, i, i2, false);
    }

    /* renamed from: a */
    private static byte[] m87007a(char[] cArr, byte[] bArr, int i, int i2, boolean z) {
        SecretKeyFactory secretKeyFactory;
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, bArr, i, i2);
            if (z) {
                secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            } else {
                secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            }
            return secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            String str = f58977a;
            C23810c.m87026b(str, "pbkdf exception : " + e.getMessage());
            return new byte[0];
        }
    }
}
