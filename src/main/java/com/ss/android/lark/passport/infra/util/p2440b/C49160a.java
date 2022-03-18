package com.ss.android.lark.passport.infra.util.p2440b;

import android.text.TextUtils;
import android.util.Base64;
import com.ss.android.lark.log.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.lark.passport.infra.util.b.a */
public final class C49160a {

    /* renamed from: a */
    private static final char[] f123443a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m193854a(String str) {
        return m193855a(str, (String) null);
    }

    /* renamed from: a */
    public static String m193856a(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: b */
    private static String m193859b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(m193853a(b, f123443a));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m193857b(String str) {
        if (str == null) {
            return "null";
        }
        if (TextUtils.isEmpty(str)) {
            return "empty";
        }
        if (str.length() <= 24) {
            return "less 24";
        }
        String substring = str.substring(0, 12);
        String substring2 = str.substring(str.length() - 12);
        String replaceAll = str.substring(12, str.length() - 12).replaceAll("[\\s\\S]", "*");
        return substring + replaceAll + substring2;
    }

    /* renamed from: b */
    public static String m193858b(String str, String str2) throws Exception {
        return C49161b.m193860a(str, str2);
    }

    /* renamed from: a */
    private static String m193853a(byte b, char[] cArr) {
        return new String(new char[]{cArr[(b >>> 4) & 15], cArr[b & 15]});
    }

    /* renamed from: a */
    public static String m193855a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str + str2;
        }
        try {
            return m193859b(MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            Log.m165383e("encrypt", e.toString());
            return "";
        }
    }
}
