package com.bytedance.ee.util.p700c;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.security.MessageDigest;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;

/* renamed from: com.bytedance.ee.util.c.b */
public class C13598b {

    /* renamed from: a */
    public static final Pattern f35750a = Pattern.compile("(doc|sht|bmn|wik|dox|box|bas|sld|fld|isv|img)(cn|us)[A-Za-z0-9]{17}");

    /* renamed from: b */
    private static SecretKey f35751b;

    /* renamed from: c */
    private static final char[] f35752c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m55194a() {
        if (f35751b == null) {
            f35751b = C13597a.m55180a(new char[]{'$', '5', '2', '*', 'y', 'l', 'q'});
        }
    }

    /* renamed from: a */
    private static String m55192a(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return m55193a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static String m55191a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return f35750a.matcher(str).replaceAll("token is sensitive **** ");
    }

    /* renamed from: e */
    public static String m55198e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        m55194a();
        return C13597a.m55178a(str, f35751b);
    }

    /* renamed from: f */
    public static String m55199f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        m55194a();
        return C13597a.m55183b(str, f35751b);
    }

    /* renamed from: a */
    public static String m55188a(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m55197d(String str) {
        if (str == null) {
            return "null";
        }
        if ("".equals(str)) {
            return str;
        }
        return m55196c("08a441" + m55195b(str + "42b91e"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048 A[SYNTHETIC, Splitter:B:28:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0053 A[SYNTHETIC, Splitter:B:34:0x0053] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m55189a(java.io.File r7) {
        /*
            java.lang.String r0 = "md5Hex(): "
            java.lang.String r1 = "EncriptUtils"
            r2 = 0
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x003e }
            if (r3 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003e }
            r4.<init>(r7)     // Catch:{ Exception -> 0x003e }
            r7 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r7]     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
        L_0x0017:
            r5 = 0
            int r6 = r4.read(r2, r5, r7)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            if (r6 <= 0) goto L_0x0022
            r3.update(r2, r5, r6)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            goto L_0x0017
        L_0x0022:
            r4.close()     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            byte[] r7 = r3.digest()     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            java.lang.String r7 = m55192a(r7)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            r4.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r2 = move-exception
            com.bytedance.ee.log.C13479a.m54759a(r1, r0, r2)
        L_0x0035:
            return r7
        L_0x0036:
            r7 = move-exception
            r2 = r4
            goto L_0x0051
        L_0x0039:
            r7 = move-exception
            r2 = r4
            goto L_0x003f
        L_0x003c:
            r7 = move-exception
            goto L_0x0051
        L_0x003e:
            r7 = move-exception
        L_0x003f:
            java.lang.String r3 = "md5Hex(): failed"
            com.bytedance.ee.log.C13479a.m54759a(r1, r3, r7)     // Catch:{ all -> 0x003c }
            java.lang.String r7 = ""
            if (r2 == 0) goto L_0x0050
            r2.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r2 = move-exception
            com.bytedance.ee.log.C13479a.m54759a(r1, r0, r2)
        L_0x0050:
            return r7
        L_0x0051:
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r2 = move-exception
            com.bytedance.ee.log.C13479a.m54759a(r1, r0, r2)
        L_0x005b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.util.p700c.C13598b.m55189a(java.io.File):java.lang.String");
    }

    /* renamed from: b */
    public static String m55195b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            String str2 = "";
            for (int i = 0; i < digest.length; i++) {
                str2 = str2 + Integer.toHexString((digest[i] & 255) | -256).substring(6);
            }
            return str2;
        } catch (Exception e) {
            C13479a.m54759a("EncriptUtils", "transformMD5 ", e);
            return null;
        }
    }

    /* renamed from: c */
    public static String m55196c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bytes);
            byte[] digest = instance.digest();
            String str2 = "";
            for (int i = 0; i < digest.length; i++) {
                str2 = str2 + Integer.toHexString((digest[i] & 255) | -256).substring(6);
            }
            return str2;
        } catch (Exception e) {
            C13479a.m54759a("EncriptUtils", "transformSHA1 ", e);
            return null;
        }
    }

    /* renamed from: g */
    public static String m55200g(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.length() >= 6) {
                    String substring = str.substring(0, 3);
                    String substring2 = str.substring(str.length() - 3, str.length());
                    StringBuilder sb = new StringBuilder("*");
                    for (int i = 0; i < str.length() - 6; i++) {
                        sb.append("*");
                    }
                    return substring + sb.toString() + substring2;
                }
            }
            return "";
        } catch (Throwable th) {
            C13479a.m54761a("EncriptUtils", th);
            return "";
        }
    }

    /* renamed from: a */
    public static String m55190a(Object obj) {
        if (obj == null) {
            return "null";
        }
        String obj2 = obj.toString();
        if ("".equals(obj2)) {
            return obj2;
        }
        try {
            Matcher matcher = f35750a.matcher(obj2);
            while (matcher.find()) {
                String group = matcher.group();
                obj2 = obj2.replaceAll(group, m55197d(group));
            }
        } catch (Exception e) {
            C13479a.m54758a("EncriptUtils", "handleEncription exception:" + e);
        }
        return obj2;
    }

    /* renamed from: a */
    private static String m55193a(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 * 2;
        char[] cArr = new char[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i5 + i] & 255;
            int i7 = i4 + 1;
            char[] cArr2 = f35752c;
            cArr[i4] = cArr2[i6 >> 4];
            i4 = i7 + 1;
            cArr[i7] = cArr2[i6 & 15];
        }
        return new String(cArr, 0, i3);
    }
}
