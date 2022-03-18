package com.ss.android.lark.browser.biz.messenger.jsapi.p1419a;

import android.content.Context;
import android.util.Base64;
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

/* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.a.b */
public class C29838b {

    /* renamed from: a */
    static PublicKey f74567a;

    /* renamed from: a */
    private static PublicKey m110316a(Context context) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        if (f74567a == null) {
            f74567a = m110319b(context);
        }
        return f74567a;
    }

    /* renamed from: b */
    private static PublicKey m110319b(Context context) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] b = m110320b(context, "miniapp_public1024.der");
        if (b == null) {
            return null;
        }
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(b));
    }

    /* renamed from: a */
    public static byte[] m110317a(Context context, String str) {
        try {
            return m110318a(m110316a(context), str.getBytes());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024 A[SYNTHETIC, Splitter:B:15:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002b A[SYNTHETIC, Splitter:B:22:0x002b] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m110320b(android.content.Context r1, java.lang.String r2) {
        /*
            r0 = 0
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            int r2 = r1.available()     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            r1.read(r2)     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            return r2
        L_0x001c:
            r2 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x001f:
            goto L_0x0029
        L_0x0021:
            r2 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ Exception -> 0x0027 }
        L_0x0027:
            throw r2
        L_0x0028:
            r1 = r0
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.browser.biz.messenger.jsapi.p1419a.C29838b.m110320b(android.content.Context, java.lang.String):byte[]");
    }

    /* renamed from: a */
    private static byte[] m110318a(PublicKey publicKey, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(1, publicKey);
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    public static String m110315a(String str, String str2, String str3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str2.getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return new String(instance.doFinal(Base64.decode(str3, 0)));
        } catch (Exception unused) {
            return null;
        }
    }
}
