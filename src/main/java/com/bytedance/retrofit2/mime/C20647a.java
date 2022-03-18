package com.bytedance.retrofit2.mime;

import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: com.bytedance.retrofit2.mime.a */
public class C20647a {

    /* renamed from: a */
    private static final char[] f50374a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static String m75076a(byte[] bArr) {
        try {
            return new String(m75077a(MessageDigest.getInstance("MD5").digest(bArr), f50374a));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m75075a(InputStream inputStream) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            int read = inputStream.read(bArr, 0, 1024);
            while (read > -1) {
                instance.update(bArr, 0, read);
                read = inputStream.read(bArr, 0, 1024);
            }
            return new String(m75077a(instance.digest(), f50374a));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static char[] m75077a(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }
}
