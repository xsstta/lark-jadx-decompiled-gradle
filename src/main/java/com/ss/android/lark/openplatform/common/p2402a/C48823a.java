package com.ss.android.lark.openplatform.common.p2402a;

import android.content.Context;
import android.util.Base64;
import com.ss.android.lark.sdk.C53241h;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.android.lark.openplatform.common.a.a */
public class C48823a {

    /* renamed from: a */
    private static PublicKey f122638a;

    /* renamed from: a */
    private static PublicKey m192358a(Context context) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        if (f122638a == null) {
            f122638a = m192361b(context);
        }
        return f122638a;
    }

    /* renamed from: b */
    private static PublicKey m192361b(Context context) throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] decode = Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDTb2DxxIj17sf2H/hr6ZSNxsaaFjgCMHZOSZsvAaZpl+9hHd76ex1nVCpZXbjIsYHfJzYLVDlRZYXcHA3yOhneyJbCkO4e05t+5j/lXWQY09gkp9w3pGIWOCzfr8zY/5CA3ThIbNBKFQZTnX8nQIhaTf+unJDe6Nkq3Tau6cz75QIDAQAB", 2);
        if (decode != null) {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        }
        C53241h.m205894a("OpenPlatform-RSAUtil", "readPublicKey fail. filename: miniapp_public1024.der");
        return null;
    }

    /* renamed from: a */
    public static byte[] m192359a(Context context, String str) {
        try {
            return m192360a(m192358a(context), str.getBytes());
        } catch (Exception e) {
            C53241h.m205895a("OpenPlatform-RSAUtil", "encryptContent fail. PublicKey error: ", e);
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m192360a(PublicKey publicKey, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(1, publicKey);
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    public static String m192357a(String str, String str2, String str3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str2.getBytes(StandardCharsets.UTF_8));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return new String(instance.doFinal(Base64.decode(str3, 0)));
        } catch (Exception e) {
            C53241h.m205895a("OpenPlatform-RSAUtil", "AESDecrypt", e);
            return null;
        }
    }
}
