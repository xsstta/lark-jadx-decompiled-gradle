package com.tt.miniapp.util;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.tt.miniapp.util.k */
public class C67044k {
    /* renamed from: a */
    public static String m261292a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return m261295c("08a441" + m261294b(str + "42b91e"));
    }

    /* renamed from: b */
    public static String m261294b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return m261293a(MessageDigest.getInstance("MD5").digest(str.getBytes(Charset.forName("UTF-8"))));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static String m261295c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(str.getBytes(Charset.forName("UTF-8")));
            return m261293a(instance.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static String m261293a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] >>> 4) & 15];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return new String(cArr2);
    }
}
