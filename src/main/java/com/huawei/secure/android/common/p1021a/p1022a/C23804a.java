package com.huawei.secure.android.common.p1021a.p1022a;

import com.huawei.secure.android.common.p1021a.p1026d.C23808a;
import com.huawei.secure.android.common.p1021a.p1026d.C23810c;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.huawei.secure.android.common.a.a.a */
public final class C23804a {

    /* renamed from: a */
    private static final String f58976a = "a";

    private C23804a() {
    }

    /* renamed from: a */
    public static byte[] m87002a(byte[] bArr, byte[] bArr2) {
        byte[] a = C23808a.m87018a(16);
        return m87004b(a, m87003a(bArr, bArr2, a));
    }

    /* renamed from: b */
    private static byte[] m87004b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* renamed from: a */
    public static byte[] m87003a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length < 16 || bArr3 == null || bArr3.length < 16) {
            C23810c.m87026b(f58976a, "cbc encrypt param is not right");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e) {
            String str = f58976a;
            C23810c.m87026b(str, "NoSuchAlgorithmException: " + e.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e2) {
            String str2 = f58976a;
            C23810c.m87026b(str2, "NoSuchPaddingException: " + e2.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e3) {
            String str3 = f58976a;
            C23810c.m87026b(str3, "InvalidKeyException: " + e3.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e4) {
            String str4 = f58976a;
            C23810c.m87026b(str4, "InvalidAlgorithmParameterException: " + e4.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e5) {
            String str5 = f58976a;
            C23810c.m87026b(str5, "IllegalBlockSizeException: " + e5.getMessage());
            return new byte[0];
        } catch (BadPaddingException e6) {
            String str6 = f58976a;
            C23810c.m87026b(str6, "BadPaddingException: " + e6.getMessage());
            return new byte[0];
        }
    }

    /* renamed from: b */
    public static byte[] m87005b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length < 16 || bArr3 == null || bArr3.length < 16) {
            C23810c.m87026b(f58976a, "cbc decrypt param is not right");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e) {
            String str = f58976a;
            C23810c.m87026b(str, "NoSuchAlgorithmException: " + e.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e2) {
            String str2 = f58976a;
            C23810c.m87026b(str2, "NoSuchPaddingException: " + e2.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e3) {
            String str3 = f58976a;
            C23810c.m87026b(str3, "InvalidKeyException: " + e3.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e4) {
            String str4 = f58976a;
            C23810c.m87026b(str4, "InvalidAlgorithmParameterException: " + e4.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e5) {
            String str5 = f58976a;
            C23810c.m87026b(str5, "IllegalBlockSizeException: " + e5.getMessage());
            return new byte[0];
        } catch (BadPaddingException e6) {
            String str6 = f58976a;
            C23810c.m87026b(str6, "BadPaddingException: " + e6.getMessage());
            return new byte[0];
        }
    }
}
