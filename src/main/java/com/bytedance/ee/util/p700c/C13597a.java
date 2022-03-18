package com.bytedance.ee.util.p700c;

import android.util.Base64;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.bytedance.ee.util.c.a */
public final class C13597a {
    /* renamed from: b */
    private static void m55184b(char[] cArr) {
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = 0;
        }
    }

    /* renamed from: a */
    public static SecretKey m55180a(char[] cArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) ((i << 3) & (i << 1));
        }
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, bArr, 1000, DynamicModule.f58006b);
        m55184b(cArr);
        try {
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(pBEKeySpec).getEncoded(), "AES");
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            C13479a.m54759a("AESUtils", "getKey error ", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m55178a(String str, SecretKey secretKey) {
        return Base64.encodeToString(m55185c(str, secretKey), 0);
    }

    /* renamed from: b */
    public static String m55183b(String str, SecretKey secretKey) {
        return m55179a(Base64.decode(str, 0), secretKey);
    }

    /* renamed from: a */
    public static String m55179a(byte[] bArr, SecretKey secretKey) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKey, new IvParameterSpec(new byte[instance.getBlockSize()]));
            return new String(instance.doFinal(bArr), StandardCharsets.UTF_8);
        } catch (Exception e) {
            C13479a.m54759a("AESUtils", "decrypt error ", e);
            return "";
        }
    }

    /* renamed from: c */
    public static byte[] m55185c(String str, SecretKey secretKey) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKey, new IvParameterSpec(new byte[instance.getBlockSize()]));
            return instance.doFinal(str.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            C13479a.m54759a("AESUtils", "encrypt error ", e);
            return new byte[0];
        }
    }

    /* renamed from: d */
    public static String m55186d(String str, SecretKey secretKey) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKey, new IvParameterSpec(new byte[instance.getBlockSize()]));
            return Base64.encodeToString(instance.doFinal(str.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            C13479a.m54759a("AESUtils", "encrypt error ", e);
            return null;
        }
    }

    /* renamed from: e */
    public static String m55187e(String str, SecretKey secretKey) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKey, new IvParameterSpec(new byte[instance.getBlockSize()]));
            return new String(instance.doFinal(Base64.decode(str, 0)), "UTF-8");
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            C13479a.m54759a("AESUtils", "decrypt error ", e);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m55181a(byte[] bArr, String str) {
        try {
            byte[] bArr2 = new byte[32];
            System.arraycopy(MessageDigest.getInstance("SHA-256").digest(str.getBytes()), 0, bArr2, 0, 32);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            int length = bArr.length - 16;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr, 16, bArr4, 0, length);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr4);
        } catch (Exception e) {
            C13479a.m54759a("AESUtils", "decryptByCBC error:", e);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m55182a(byte[] bArr, String str, String str2) {
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, new SecretKeySpec(Base64.decode(str, 0), "AES"), new GCMParameterSpec(SmActions.ACTION_ONTHECALL_EXIT, Base64.decode(str2, 0)));
            return instance.doFinal(bArr);
        } catch (Exception e) {
            C13479a.m54759a("AESUtils", "decrypt error ", e);
            return null;
        }
    }
}
