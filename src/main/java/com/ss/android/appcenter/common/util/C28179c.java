package com.ss.android.appcenter.common.util;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.ss.android.appcenter.common.util.c */
public class C28179c {
    /* renamed from: a */
    public static String m103226a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return m103229c("08a441" + m103228b(str + "42b91e"));
    }

    /* renamed from: b */
    public static String m103228b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return m103227a(MessageDigest.getInstance("MD5").digest(str.getBytes(Charset.forName("UTF-8"))));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static String m103229c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(str.getBytes(Charset.forName("UTF-8")));
            return m103227a(instance.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static String m103227a(byte[] bArr) {
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
