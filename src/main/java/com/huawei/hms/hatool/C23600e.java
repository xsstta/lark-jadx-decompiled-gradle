package com.huawei.hms.hatool;

import com.huawei.secure.android.common.p1021a.p1026d.C23809b;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.huawei.hms.hatool.e */
public class C23600e {
    /* renamed from: a */
    public static String m85678a(String str, String str2) {
        try {
            return m85679a(str, str2.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            C23625y.m85977c("hmsSdk", "Unsupported encoding exception,utf-8");
            return "";
        }
    }

    /* renamed from: a */
    public static String m85679a(String str, byte[] bArr) {
        String str2;
        if (bArr == null || bArr.length == 0) {
            C23625y.m85982f("hmsSdk", "encrypt: content is empty or null");
            return "";
        }
        try {
            return C23809b.m87022a(m85681a(bArr, m85680a(C23809b.m87023a(str))));
        } catch (NoSuchAlgorithmException unused) {
            str2 = "encrypt(): getInstance - No such algorithm,transformation";
            C23625y.m85982f("hmsSdk", str2);
            return "";
        } catch (InvalidKeySpecException unused2) {
            str2 = "encrypt(): Invalid key specification";
            C23625y.m85982f("hmsSdk", str2);
            return "";
        }
    }

    /* renamed from: a */
    public static PublicKey m85680a(byte[] bArr) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
    }

    /* renamed from: a */
    public static byte[] m85681a(byte[] bArr, PublicKey publicKey) {
        String str;
        if (publicKey != null) {
            try {
                Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-1ANDMGF1PADDING");
                instance.init(1, publicKey);
                return instance.doFinal(bArr);
            } catch (UnsupportedEncodingException unused) {
                str = "rsaEncrypt(): getBytes - Unsupported coding format!";
                C23625y.m85982f("hmsSdk", str);
                return new byte[0];
            } catch (NoSuchAlgorithmException unused2) {
                str = "rsaEncrypt(): getInstance - No such algorithm,transformation";
                C23625y.m85982f("hmsSdk", str);
                return new byte[0];
            } catch (InvalidKeyException unused3) {
                str = "rsaEncrypt(): init - Invalid key!";
                C23625y.m85982f("hmsSdk", str);
                return new byte[0];
            } catch (NoSuchPaddingException unused4) {
                str = "rsaEncrypt():  No such filling parameters ";
                C23625y.m85982f("hmsSdk", str);
                return new byte[0];
            } catch (BadPaddingException unused5) {
                str = "rsaEncrypt():False filling parameters!";
                C23625y.m85982f("hmsSdk", str);
                return new byte[0];
            } catch (IllegalBlockSizeException unused6) {
                str = "rsaEncrypt(): doFinal - The provided block is not filled with";
                C23625y.m85982f("hmsSdk", str);
                return new byte[0];
            }
        } else {
            throw new UnsupportedEncodingException("The loaded public key is null");
        }
    }
}
