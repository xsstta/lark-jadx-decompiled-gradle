package com.huawei.updatesdk.p1029a.p1030a.p1035c;

import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.huawei.updatesdk.a.a.c.g */
public abstract class AbstractC23841g {
    /* renamed from: a */
    public static String m87138a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("~", "%7E");
        } catch (UnsupportedEncodingException e) {
            C23834a.m87117a("StringUtils", "encode2utf8 error", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m87139a(byte[] bArr) {
        String str;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            StringBuilder sb = new StringBuilder((int) DynamicModule.f58006b);
            byte[] digest = instance.digest();
            for (byte b : digest) {
                sb.append(String.format(Locale.ENGLISH, "%02X", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            str = "sha256EncryptStr error:NoSuchAlgorithmException";
            C23834a.m87118b("StringUtils", str);
            return null;
        } catch (IllegalFormatException unused2) {
            str = "sha256EncryptStr error:IllegalFormatException";
            C23834a.m87118b("StringUtils", str);
            return null;
        } catch (Exception unused3) {
            str = "sha256EncryptStr error:Exception";
            C23834a.m87118b("StringUtils", str);
            return null;
        }
    }

    /* renamed from: b */
    public static String m87140b(String str) {
        String e = m87143e(str);
        if (e == null) {
            return null;
        }
        return e.toLowerCase(Locale.getDefault());
    }

    /* renamed from: c */
    public static byte[] m87141c(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4);
            if (digit > 127) {
                digit -= 256;
            }
            bArr[i] = Byte.valueOf(String.valueOf(digit)).byteValue();
        }
        return bArr;
    }

    /* renamed from: d */
    public static boolean m87142d(String str) {
        return str != null && str.trim().startsWith("{") && str.trim().endsWith("}");
    }

    /* renamed from: e */
    public static String m87143e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m87139a(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            C23834a.m87118b("StringUtils", "can not getBytes");
            return null;
        }
    }
}
