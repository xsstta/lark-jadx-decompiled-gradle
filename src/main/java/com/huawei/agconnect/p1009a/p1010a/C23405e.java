package com.huawei.agconnect.p1009a.p1010a;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Objects;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.huawei.agconnect.a.a.e */
public class C23405e {
    /* renamed from: a */
    public static SecretKey m84939a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws NoSuchAlgorithmException, InvalidKeySpecException {
        if (bArr.length == 16 && bArr2.length == 16 && bArr3.length == 16) {
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(C23403c.m84934a(m84942a(bArr, bArr2, bArr3)).toCharArray(), bArr4, 5000, SmActions.ACTION_ONTHECALL_EXIT)).getEncoded(), "AES");
        }
        throw new IllegalArgumentException("invalid data for generating the key.");
    }

    /* renamed from: a */
    private static byte[] m84940a(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "bytes must not be null.");
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i < 0) {
                bArr[i2] = (byte) (bArr[i2] << (-i));
            } else {
                bArr[i2] = (byte) (bArr[i2] >> i);
            }
        }
        return bArr;
    }

    /* renamed from: a */
    private static byte[] m84941a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException("left or right must not be null.");
        } else if (bArr.length == bArr2.length) {
            byte[] bArr3 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
            return bArr3;
        } else {
            throw new IllegalArgumentException("left and right must be the same length.");
        }
    }

    /* renamed from: a */
    public static byte[] m84942a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return m84941a(m84940a(m84941a(m84940a(bArr, -4), bArr2), 6), bArr3);
    }
}
