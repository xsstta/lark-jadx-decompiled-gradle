package com.tt.miniapp.util;

import android.content.Context;
import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.p3371e.C67509b;
import java.io.IOException;
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
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.util.v */
public class C67064v {

    /* renamed from: com.tt.miniapp.util.v$a */
    public static class C67065a {

        /* renamed from: a */
        public PublicKey f169043a;
    }

    /* renamed from: a */
    private static PublicKey m261369a(Context context) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        C67065a aVar = ContextSingletonInstance.getInstance().rsaInstance;
        if (aVar.f169043a == null) {
            aVar.f169043a = m261372b(context);
        }
        return aVar.f169043a;
    }

    /* renamed from: b */
    private static PublicKey m261372b(Context context) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDTb2DxxIj17sf2H/hr6ZSNxsaaFjgCMHZOSZsvAaZpl+9hHd76ex1nVCpZXbjIsYHfJzYLVDlRZYXcHA3yOhneyJbCkO4e05t+5j/lXWQY09gkp9w3pGIWOCzfr8zY/5CA3ThIbNBKFQZTnX8nQIhaTf+unJDe6Nkq3Tau6cz75QIDAQAB", 2)));
    }

    /* renamed from: a */
    private static byte[] m261371a(PublicKey publicKey, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(1, publicKey);
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    public static String m261367a(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
        instance.init(1, secretKeySpec);
        return new String(Base64.encode(instance.doFinal(str2.getBytes("UTF-8")), 0));
    }

    /* renamed from: a */
    public static String m261368a(String str, String str2, String str3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str2.getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return new String(instance.doFinal(Base64.decode(str3, 0)));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_RSAUtil", "AESDecrypt ", e);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m261370a(Context context, String str, IAppContext iAppContext) {
        Exception e;
        try {
            try {
                return m261371a(m261369a(context), str.getBytes());
            } catch (Exception e2) {
                e = e2;
                AppBrandLogger.m52829e("tma_RSAUtil", "encryptContent fail. PublicKey: ", null, " error: ", e);
                C67509b.m262587a("mp_start_error", 1025, (JSONObject) null, iAppContext);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            AppBrandLogger.m52829e("tma_RSAUtil", "encryptContent fail. PublicKey: ", null, " error: ", e);
            C67509b.m262587a("mp_start_error", 1025, (JSONObject) null, iAppContext);
            return null;
        }
    }
}
